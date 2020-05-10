package typingsSlinky.keycloakJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeycloakRoles extends js.Object {
  var roles: js.Array[String] = js.native
}

object KeycloakRoles {
  @scala.inline
  def apply(roles: js.Array[String]): KeycloakRoles = {
    val __obj = js.Dynamic.literal(roles = roles.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeycloakRoles]
  }
  @scala.inline
  implicit class KeycloakRolesOps[Self <: KeycloakRoles] (val x: Self) extends AnyVal {
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
  }
  
}

