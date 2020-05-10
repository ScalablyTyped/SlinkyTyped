package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AndroidStoreApp extends MobileApp {
  // The Android app store URL.
  var appStoreUrl: js.UndefOr[String] = js.native
  // The value for the minimum applicable operating system.
  var minimumSupportedOperatingSystem: js.UndefOr[AndroidMinimumOperatingSystem] = js.native
  // The package identifier.
  var packageId: js.UndefOr[String] = js.native
}

object AndroidStoreApp {
  @scala.inline
  def apply(): AndroidStoreApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidStoreApp]
  }
  @scala.inline
  implicit class AndroidStoreAppOps[Self <: AndroidStoreApp] (val x: Self) extends AnyVal {
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

