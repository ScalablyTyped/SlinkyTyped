package typingsSlinky.firebaseAuthTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstallApp extends js.Object {
  var installApp: js.UndefOr[Boolean] = js.native
  var minimumVersion: js.UndefOr[String] = js.native
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

