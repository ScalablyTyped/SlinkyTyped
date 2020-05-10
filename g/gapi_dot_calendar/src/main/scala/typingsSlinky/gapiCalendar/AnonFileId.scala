package typingsSlinky.gapiCalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFileId extends js.Object {
  var fileId: String = js.native
  var fileUrl: String = js.native
  var iconLink: String = js.native
  var mimeType: String = js.native
  var title: String = js.native
}

object AnonFileId {
  @scala.inline
  def apply(fileId: String, fileUrl: String, iconLink: String, mimeType: String, title: String): AnonFileId = {
    val __obj = js.Dynamic.literal(fileId = fileId.asInstanceOf[js.Any], fileUrl = fileUrl.asInstanceOf[js.Any], iconLink = iconLink.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFileId]
  }
  @scala.inline
  implicit class AnonFileIdOps[Self <: AnonFileId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIconLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMimeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(value.asInstanceOf[js.Any])
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

