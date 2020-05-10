package typingsSlinky.reactNativeFbsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoginResult extends js.Object {
  var declinedPermissions: js.UndefOr[js.Array[Permissions]] = js.native
  var error: js.Any = js.native
  var grantedPermissions: js.UndefOr[js.Array[Permissions]] = js.native
  var isCancelled: Boolean = js.native
}

object LoginResult {
  @scala.inline
  def apply(error: js.Any, isCancelled: Boolean): LoginResult = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], isCancelled = isCancelled.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginResult]
  }
  @scala.inline
  implicit class LoginResultOps[Self <: LoginResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCancelled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCancelled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeclinedPermissions(value: js.Array[Permissions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declinedPermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeclinedPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declinedPermissions")(js.undefined)
        ret
    }
    @scala.inline
    def withGrantedPermissions(value: js.Array[Permissions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grantedPermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrantedPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grantedPermissions")(js.undefined)
        ret
    }
  }
  
}

