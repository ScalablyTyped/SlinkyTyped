package typingsSlinky.angularPermission

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.angular.mod.IPromise
import typingsSlinky.angularPermission.mod.permission.PermissionRedirectConfigation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExcept extends js.Object {
  var except: js.UndefOr[js.Function0[Unit] | String | js.Array[String] | IPromise[_]] = js.native
  var only: js.UndefOr[js.Function0[Unit] | String | js.Array[String] | IPromise[_]] = js.native
  var redirectTo: String | (js.Function0[PermissionRedirectConfigation | String]) | StringDictionary[PermissionRedirectConfigation] = js.native
}

object AnonExcept {
  @scala.inline
  def apply(
    redirectTo: String | (js.Function0[PermissionRedirectConfigation | String]) | StringDictionary[PermissionRedirectConfigation]
  ): AnonExcept = {
    val __obj = js.Dynamic.literal(redirectTo = redirectTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExcept]
  }
  @scala.inline
  implicit class AnonExceptOps[Self <: AnonExcept] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRedirectToFunction0(value: () => PermissionRedirectConfigation | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectTo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRedirectTo(
      value: String | (js.Function0[PermissionRedirectConfigation | String]) | StringDictionary[PermissionRedirectConfigation]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExceptFunction0(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("except")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExcept(value: js.Function0[Unit] | String | js.Array[String] | IPromise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("except")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcept: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("except")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlyFunction0(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("only")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnly(value: js.Function0[Unit] | String | js.Array[String] | IPromise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("only")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("only")(js.undefined)
        ret
    }
  }
  
}

