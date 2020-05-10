package typingsSlinky.acl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AclSet extends js.Object {
  var allows: js.Array[AclAllow] = js.native
  var roles: strings = js.native
}

object AclSet {
  @scala.inline
  def apply(allows: js.Array[AclAllow], roles: strings): AclSet = {
    val __obj = js.Dynamic.literal(allows = allows.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any])
    __obj.asInstanceOf[AclSet]
  }
  @scala.inline
  implicit class AclSetOps[Self <: AclSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllows(value: js.Array[AclAllow]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoles(value: strings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roles")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

