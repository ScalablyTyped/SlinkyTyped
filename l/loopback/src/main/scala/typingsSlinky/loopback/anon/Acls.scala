package typingsSlinky.loopback.anon

import typingsSlinky.loopback.loopbackStrings.DENY
import typingsSlinky.loopback.mod.ACL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Acls extends js.Object {
  var acls: js.Array[ACL] = js.native
  var defaultPermission: DENY = js.native
  var http: Path = js.native
}

object Acls {
  @scala.inline
  def apply(acls: js.Array[ACL], defaultPermission: DENY, http: Path): Acls = {
    val __obj = js.Dynamic.literal(acls = acls.asInstanceOf[js.Any], defaultPermission = defaultPermission.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any])
    __obj.asInstanceOf[Acls]
  }
  @scala.inline
  implicit class AclsOps[Self <: Acls] (val x: Self) extends AnyVal {
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
    def withDefaultPermission(value: DENY): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPermission")(value.asInstanceOf[js.Any])
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

