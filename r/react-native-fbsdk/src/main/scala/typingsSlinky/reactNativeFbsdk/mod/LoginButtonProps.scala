package typingsSlinky.reactNativeFbsdk.mod

import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoginButtonProps extends js.Object {
  /**
    * The default audience to target when attempting a login.
    */
  var defaultAudience: js.UndefOr[DefaultAudience] = js.native
  /**
    * The behavior to use when attempting a login.
    * @platform android
    */
  var loginBehaviorAndroid: js.UndefOr[LoginBehaviorAndroid] = js.native
  /**
    * The behavior to use when attempting a login.
    * @platform ios
    */
  var loginBehaviorIOS: js.UndefOr[LoginBehaviorIOS] = js.native
  /**
    * The callback invoked upon error/completion of a login request.
    */
  var onLoginFinished: js.UndefOr[js.Function2[/* error */ js.Object, /* result */ LoginResult, Unit]] = js.native
  /**
    * The callback invoked upon completion of a logout request.
    */
  var onLogoutFinished: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Represents the permissions to request when the login button
    * is pressed.
    */
  var permissions: js.UndefOr[js.Array[Permissions]] = js.native
  /**
    * View style, if any.
    */
  var style: js.UndefOr[ViewStyle] = js.native
  /**
    * For iOS only, the desired tooltip behavior.
    * @platform ios
    */
  var tooltipBehaviorIOS: js.UndefOr[TooltipBehaviorIOS] = js.native
}

object LoginButtonProps {
  @scala.inline
  def apply(): LoginButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoginButtonProps]
  }
  @scala.inline
  implicit class LoginButtonPropsOps[Self <: LoginButtonProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultAudience(value: DefaultAudience): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultAudience")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultAudience: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultAudience")(js.undefined)
        ret
    }
    @scala.inline
    def withLoginBehaviorAndroid(value: LoginBehaviorAndroid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loginBehaviorAndroid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoginBehaviorAndroid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loginBehaviorAndroid")(js.undefined)
        ret
    }
    @scala.inline
    def withLoginBehaviorIOS(value: LoginBehaviorIOS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loginBehaviorIOS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoginBehaviorIOS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loginBehaviorIOS")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoginFinished(value: (/* error */ js.Object, /* result */ LoginResult) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoginFinished")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnLoginFinished: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoginFinished")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLogoutFinished(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLogoutFinished")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnLogoutFinished: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLogoutFinished")(js.undefined)
        ret
    }
    @scala.inline
    def withPermissions(value: js.Array[Permissions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipBehaviorIOS(value: TooltipBehaviorIOS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipBehaviorIOS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipBehaviorIOS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipBehaviorIOS")(js.undefined)
        ret
    }
  }
  
}

