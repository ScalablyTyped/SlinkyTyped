package typingsSlinky.loopback.mod

import typingsSlinky.loopback.anon.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings extends js.Object {
  var acls: js.Array[ACL] = js.native
  var http: Path = js.native
}

object Settings {
  @scala.inline
  def apply(acls: js.Array[ACL], http: Path): Settings = {
    val __obj = js.Dynamic.literal(acls = acls.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcls(value: js.Array[ACL]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttp(value: Path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("http")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

