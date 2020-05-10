package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileAttachment extends Attachment {
  // The base64-encoded contents of the file.
  var contentBytes: js.UndefOr[Double] = js.native
  // The ID of the attachment in the Exchange store.
  var contentId: js.UndefOr[String] = js.native
  // Do not use this property as it is not supported.
  var contentLocation: js.UndefOr[String] = js.native
}

object FileAttachment {
  @scala.inline
  def apply(): FileAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileAttachment]
  }
  @scala.inline
  implicit class FileAttachmentOps[Self <: FileAttachment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withContentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentId")(js.undefined)
        ret
    }
    @scala.inline
    def withContentLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentLocation")(js.undefined)
        ret
    }
  }
  
}

