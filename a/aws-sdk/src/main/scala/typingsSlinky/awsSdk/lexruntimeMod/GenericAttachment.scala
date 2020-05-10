package typingsSlinky.awsSdk.lexruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenericAttachment extends js.Object {
  /**
    * The URL of an attachment to the response card.
    */
  var attachmentLinkUrl: js.UndefOr[StringUrlWithLength] = js.native
  /**
    * The list of options to show to the user.
    */
  var buttons: js.UndefOr[listOfButtons] = js.native
  /**
    * The URL of an image that is displayed to the user.
    */
  var imageUrl: js.UndefOr[StringUrlWithLength] = js.native
  /**
    * The subtitle shown below the title.
    */
  var subTitle: js.UndefOr[StringWithLength] = js.native
  /**
    * The title of the option.
    */
  var title: js.UndefOr[StringWithLength] = js.native
}

object GenericAttachment {
  @scala.inline
  def apply(): GenericAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenericAttachment]
  }
  @scala.inline
  implicit class GenericAttachmentOps[Self <: GenericAttachment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachmentLinkUrl(value: StringUrlWithLength): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachmentLinkUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachmentLinkUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachmentLinkUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withButtons(value: listOfButtons): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(js.undefined)
        ret
    }
    @scala.inline
    def withImageUrl(value: StringUrlWithLength): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withSubTitle(value: StringWithLength): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: StringWithLength): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

