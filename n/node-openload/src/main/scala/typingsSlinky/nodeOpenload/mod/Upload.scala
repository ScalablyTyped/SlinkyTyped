package typingsSlinky.nodeOpenload.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Upload extends js.Object {
  var url: String = js.native
  var valid_until: String = js.native
}

object Upload {
  @scala.inline
  def apply(url: String, valid_until: String): Upload = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any], valid_until = valid_until.asInstanceOf[js.Any])
    __obj.asInstanceOf[Upload]
  }
  @scala.inline
  implicit class UploadOps[Self <: Upload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValid_until(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valid_until")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

