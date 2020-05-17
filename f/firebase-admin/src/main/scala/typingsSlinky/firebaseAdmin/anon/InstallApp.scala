package typingsSlinky.firebaseAdmin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstallApp extends js.Object {
  /**
    * Whether to install the Android app if the device supports it and the app is
    * not already installed.
    */
  var installApp: js.UndefOr[Boolean] = js.native
  /**
    * The Android minimum version if available. If the installed app is an older
    * version, the user is taken to the GOogle Play Store to upgrade the app.
    */
  var minimumVersion: js.UndefOr[String] = js.native
  /**
    * Defines the required Android package name of the app where the link should be
    * handled if the Android app is installed.
    */
  var packageName: String = js.native
}

object InstallApp {
  @scala.inline
  def apply(packageName: String): InstallApp = {
    val __obj = js.Dynamic.literal(packageName = packageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallApp]
  }
  @scala.inline
  implicit class InstallAppOps[Self <: InstallApp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPackageName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstallApp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installApp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstallApp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installApp")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumVersion")(js.undefined)
        ret
    }
  }
  
}

