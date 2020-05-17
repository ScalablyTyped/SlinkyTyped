package typingsSlinky.keycloakConnect.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Roles extends js.Object {
  var roles: js.UndefOr[js.Array[String]] = js.native
}

object Roles {
  @scala.inline
  def apply(): Roles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Roles]
  }
  @scala.inline
  implicit class RolesOps[Self <: Roles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roles")(js.undefined)
        ret
    }
  }
  
}

