package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IosStoreApp extends MobileApp {
  // The Apple App Store URL
  var appStoreUrl: js.UndefOr[String] = js.native
  // The iOS architecture for which this app can run on.
  var applicableDeviceType: js.UndefOr[IosDeviceType] = js.native
  // The Identity Name.
  var bundleId: js.UndefOr[String] = js.native
  // The value for the minimum applicable operating system.
  var minimumSupportedOperatingSystem: js.UndefOr[IosMinimumOperatingSystem] = js.native
}

object IosStoreApp {
  @scala.inline
  def apply(): IosStoreApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosStoreApp]
  }
  @scala.inline
  implicit class IosStoreAppOps[Self <: IosStoreApp] (val x: Self) extends AnyVal {
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
    def withApplicableDeviceType(value: IosDeviceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicableDeviceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicableDeviceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicableDeviceType")(js.undefined)
        ret
    }
    @scala.inline
    def withBundleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBundleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundleId")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumSupportedOperatingSystem(value: IosMinimumOperatingSystem): Self = {
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
  }
  
}

