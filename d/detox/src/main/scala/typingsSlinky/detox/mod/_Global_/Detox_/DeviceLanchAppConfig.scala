package typingsSlinky.detox.mod._Global_.Detox_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceLanchAppConfig extends js.Object {
  /**
    * Launch into a fresh installation
    * A flag that enables relaunching into a fresh installation of the app (it will uninstall and install the binary again), default is false.
    */
  var delete: js.UndefOr[Boolean] = js.native
  /**
    * Launch config for specifying the native language and locale
    */
  var languageAndLocale: js.UndefOr[LanguageAndLocale] = js.native
  /**
    * Detox can start the app with additional launch arguments
    * The added launchArgs will be passed through the launch command to the device and be accessible via [[NSProcessInfo processInfo] arguments]
    */
  var launchArgs: js.UndefOr[js.Any] = js.native
  /**
    * Restart the app
    * Terminate the app and launch it again. If set to false, the simulator will try to bring app from background, if the app isn't running, it will launch a new instance. default is false
    */
  var newInstance: js.UndefOr[Boolean] = js.native
  /**
    * Set runtime permissions
    * Grant or deny runtime permissions for your application.
    */
  var permissions: js.UndefOr[DevicePermissions] = js.native
  /**
    * Launch from URL
    * Mock opening the app from URL to test your app's deep link handling mechanism.
    */
  var url: js.UndefOr[js.Any] = js.native
  /**
    * Launch with user activity
    */
  var userActivity: js.UndefOr[js.Any] = js.native
  /**
    * Launch with user notifications
    */
  var userNotification: js.UndefOr[js.Any] = js.native
}

object DeviceLanchAppConfig {
  @scala.inline
  def apply(): DeviceLanchAppConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceLanchAppConfig]
  }
  @scala.inline
  implicit class DeviceLanchAppConfigOps[Self <: DeviceLanchAppConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguageAndLocale(value: LanguageAndLocale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageAndLocale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguageAndLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageAndLocale")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunchArgs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchArgs")(js.undefined)
        ret
    }
    @scala.inline
    def withNewInstance(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newInstance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewInstance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newInstance")(js.undefined)
        ret
    }
    @scala.inline
    def withPermissions(value: DevicePermissions): Self = {
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
    def withUrl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withUserActivity(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userActivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserActivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userActivity")(js.undefined)
        ret
    }
    @scala.inline
    def withUserNotification(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userNotification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserNotification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userNotification")(js.undefined)
        ret
    }
  }
  
}

