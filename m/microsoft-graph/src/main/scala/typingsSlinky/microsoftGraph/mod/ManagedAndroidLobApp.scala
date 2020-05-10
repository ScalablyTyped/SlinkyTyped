package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedAndroidLobApp extends ManagedMobileLobApp {
  // The value for the minimum applicable operating system.
  var minimumSupportedOperatingSystem: js.UndefOr[AndroidMinimumOperatingSystem] = js.native
  // The package identifier.
  var packageId: js.UndefOr[String] = js.native
  // The version code of managed Android Line of Business (LoB) app.
  var versionCode: js.UndefOr[String] = js.native
  // The version name of managed Android Line of Business (LoB) app.
  var versionName: js.UndefOr[String] = js.native
}

object ManagedAndroidLobApp {
  @scala.inline
  def apply(): ManagedAndroidLobApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedAndroidLobApp]
  }
  @scala.inline
  implicit class ManagedAndroidLobAppOps[Self <: ManagedAndroidLobApp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMinimumSupportedOperatingSystem(value: AndroidMinimumOperatingSystem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumSupportedOperatingSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumSupportedOperatingSystem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumSupportedOperatingSystem")(js.undefined)
        ret
    }
    @scala.inline
    def withPackageId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPackageId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageId")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionCode")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionName")(js.undefined)
        ret
    }
  }
  
}

