package typingsSlinky.awsLambda.lexMod

import typingsSlinky.awsLambda.anon.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LexGenericAttachment extends js.Object {
  var attachmentLinkUrl: String = js.native
  var buttons: js.Array[Text] = js.native
  var imageUrl: String = js.native
  var subTitle: String = js.native
  var title: String = js.native
}

object LexGenericAttachment {
  @scala.inline
  def apply(
    attachmentLinkUrl: String,
    buttons: js.Array[Text],
    imageUrl: String,
    subTitle: String,
    title: String
  ): LexGenericAttachment = {
    val __obj = js.Dynamic.literal(attachmentLinkUrl = attachmentLinkUrl.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], imageUrl = imageUrl.asInstanceOf[js.Any], subTitle = subTitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexGenericAttachment]
  }
  @scala.inline
  implicit class LexGenericAttachmentOps[Self <: LexGenericAttachment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachmentLinkUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachmentLinkUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtons(value: js.Array[Text]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

