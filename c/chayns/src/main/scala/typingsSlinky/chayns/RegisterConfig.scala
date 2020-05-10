package typingsSlinky.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Getting Started
  * chayns
  * interfaces
  */
// chayns.register()
@js.native
trait RegisterConfig extends js.Object {
  var appName: js.UndefOr[String] = js.native
  var autoResize: js.UndefOr[Boolean] = js.native
  var callbackPrefix: js.UndefOr[String] = js.native
  var cssPrefix: js.UndefOr[String] = js.native
  var initialHeight: js.UndefOr[Double] = js.native
  var strictMode: js.UndefOr[Boolean] = js.native
}

object RegisterConfig {
  @scala.inline
  def apply(): RegisterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterConfig]
  }
  @scala.inline
  implicit class RegisterConfigOps[Self <: RegisterConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appName")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoResize")(js.undefined)
        ret
    }
    @scala.inline
    def withCallbackPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallbackPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withCssPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withStrictMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrictMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictMode")(js.undefined)
        ret
    }
  }
  
}

