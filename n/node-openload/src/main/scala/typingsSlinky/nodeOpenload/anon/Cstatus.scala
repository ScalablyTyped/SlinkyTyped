package typingsSlinky.nodeOpenload.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cstatus extends js.Object {
  var content_type: String = js.native
  var cstatus: String = js.native
  var download_count: String = js.native
  var folderid: String = js.native
  var link: String = js.native
  var linkextid: String = js.native
  var name: String = js.native
  var sha1: String = js.native
  var size: String = js.native
  var status: String = js.native
  var upload_at: String = js.native
}

object Cstatus {
  @scala.inline
  def apply(
    content_type: String,
    cstatus: String,
    download_count: String,
    folderid: String,
    link: String,
    linkextid: String,
    name: String,
    sha1: String,
    size: String,
    status: String,
    upload_at: String
  ): Cstatus = {
    val __obj = js.Dynamic.literal(content_type = content_type.asInstanceOf[js.Any], cstatus = cstatus.asInstanceOf[js.Any], download_count = download_count.asInstanceOf[js.Any], folderid = folderid.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], linkextid = linkextid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sha1 = sha1.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], upload_at = upload_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cstatus]
  }
  @scala.inline
  implicit class CstatusOps[Self <: Cstatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCstatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cstatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDownload_count(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("download_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFolderid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folderid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinkextid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkextid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSha1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpload_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upload_at")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

