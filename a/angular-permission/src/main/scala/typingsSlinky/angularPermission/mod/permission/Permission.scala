package typingsSlinky.angularPermission.mod.permission

import typingsSlinky.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Permission extends js.Object {
  var permissionName: String = js.native
  var validationFunction: js.UndefOr[PermissionValidationFunction] = js.native
  def validatePermission(): IPromise[_] = js.native
}

object Permission {
  @scala.inline
  def apply(permissionName: String, validatePermission: () => IPromise[_]): Permission = {
    val __obj = js.Dynamic.literal(permissionName = permissionName.asInstanceOf[js.Any], validatePermission = js.Any.fromFunction0(validatePermission))
    __obj.asInstanceOf[Permission]
  }
  @scala.inline
  implicit class PermissionOps[Self <: Permission] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPermissionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidatePermission(value: () => IPromise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validatePermission")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withValidationFunction(
      value: (/* permissionName */ js.UndefOr[String], /* transitionProperties */ js.UndefOr[TransitionProperties]) => Boolean | IPromise[js.Any]
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

