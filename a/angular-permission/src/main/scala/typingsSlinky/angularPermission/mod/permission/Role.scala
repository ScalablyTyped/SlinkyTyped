package typingsSlinky.angularPermission.mod.permission

import typingsSlinky.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Role extends js.Object {
  var permissionNames: js.Array[String] = js.native
  var roleName: String = js.native
  var validationFunction: js.UndefOr[RoleValidationFunction] = js.native
  def validateRole(): IPromise[_] = js.native
}

object Role {
  @scala.inline
  def apply(permissionNames: js.Array[String], roleName: String, validateRole: () => IPromise[_]): Role = {
    val __obj = js.Dynamic.literal(permissionNames = permissionNames.asInstanceOf[js.Any], roleName = roleName.asInstanceOf[js.Any], validateRole = js.Any.fromFunction0(validateRole))
    __obj.asInstanceOf[Role]
  }
  @scala.inline
  implicit class RoleOps[Self <: Role] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPermissionNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissionNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidateRole(value: () => IPromise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateRole")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withValidationFunction(
      value: (/* roleName */ js.UndefOr[String], /* transitionProperties */ js.UndefOr[TransitionProperties]) => Boolean | IPromise[js.Any]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationFunction")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutValidationFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationFunction")(js.undefined)
        ret
    }
  }
  
}

