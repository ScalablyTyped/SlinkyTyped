package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedIOSLobApp extends ManagedMobileLobApp {
  // The iOS architecture for which this app can run on.
  var applicableDeviceType: js.UndefOr[IosDeviceType] = js.native
  // The build number of managed iOS Line of Business (LoB) app.
  var buildNumber: js.UndefOr[String] = js.native
  // The Identity Name.
  var bundleId: js.UndefOr[String] = js.native
  // The expiration time.
  var expirationDateTime: js.UndefOr[String] = js.native
  // The value for the minimum applicable operating system.
  var minimumSupportedOperatingSystem: js.UndefOr[IosMinimumOperatingSystem] = js.native
  // The version number of managed iOS Line of Business (LoB) app.
  var versionNumber: js.UndefOr[String] = js.native
}

object ManagedIOSLobApp {
  @scala.inline
  def apply(): ManagedIOSLobApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedIOSLobApp]
  }
  @scala.inline
  implicit class ManagedIOSLobAppOps[Self <: ManagedIOSLobApp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withBuildNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuildNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildNumber")(js.undefined)
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
    def withExpirationDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpirationDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationDateTime")(js.undefined)
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
    @scala.inline
    def withVersionNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionNumber")(js.undefined)
        ret
    }
  }
  
}

