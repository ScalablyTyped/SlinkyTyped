package typingsSlinky.officeJs.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A file or item attachment. Used when displaying a reply form.
  */
@js.native
trait ReplyFormAttachment extends js.Object {
  /**
    * Only used if type is set to file. If true, indicates that the attachment will be shown inline in the message body, and should not be 
    * displayed in the attachment list.
    */
  var inLine: js.UndefOr[Boolean] = js.native
  /**
    * Only used if type is set to item. The EWS item id of the attachment. This is a string up to 100 characters.
    */
  var itemId: js.UndefOr[String] = js.native
  /**
    * A string that contains the name of the attachment, up to 255 characters in length.
    */
  var name: String = js.native
  /**
    * Indicates the type of attachment. Must be file for a file attachment or item for an item attachment.
    */
  var `type`: String = js.native
  /**
    * Only used if type is set to file. The URI of the location for the file.
    */
  var url: js.UndefOr[String] = js.native
}

object ReplyFormAttachment {
  @scala.inline
  def apply(name: String, `type`: String): ReplyFormAttachment = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplyFormAttachment]
  }
  @scala.inline
  implicit class ReplyFormAttachmentOps[Self <: ReplyFormAttachment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInLine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inLine")(js.undefined)
        ret
    }
    @scala.inline
    def withItemId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemId")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

