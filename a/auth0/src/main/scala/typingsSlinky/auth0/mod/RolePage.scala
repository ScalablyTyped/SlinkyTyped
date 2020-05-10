package typingsSlinky.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RolePage extends Page {
  var roles: js.Array[Role] = js.native
}

object RolePage {
  @scala.inline
  def apply(length: Double, limit: Double, roles: js.Array[Role], start: Double, total: Double): RolePage = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[RolePage]
  }
  @scala.inline
  implicit class RolePageOps[Self <: RolePage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoles(value: js.Array[Role]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roles")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

