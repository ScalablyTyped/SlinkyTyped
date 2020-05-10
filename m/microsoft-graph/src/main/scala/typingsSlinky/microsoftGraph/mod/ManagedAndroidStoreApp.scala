package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedAndroidStoreApp extends ManagedApp {
  // The Android AppStoreUrl.
  var appStoreUrl: js.UndefOr[String] = js.native
  // The value for the minimum supported operating system.
  var minimumSupportedOperatingSystem: js.UndefOr[AndroidMinimumOperatingSystem] = js.native
  // The app's package ID.
  var packageId: js.UndefOr[String] = js.native
}

object ManagedAndroidStoreApp {
  @scala.inline
  def apply(): ManagedAndroidStoreApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedAndroidStoreApp]
  }
  @scala.inline
  implicit class ManagedAndroidStoreAppOps[Self <: ManagedAndroidStoreApp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppStoreUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appStoreUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppStoreUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appStoreUrl")(js.undefined)
        ret
    }
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
  }
  
}

