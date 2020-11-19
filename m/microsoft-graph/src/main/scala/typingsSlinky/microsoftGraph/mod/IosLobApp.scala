package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IosLobApp extends MobileLobApp {
  
  // The iOS architecture for which this app can run on.
  var applicableDeviceType: js.UndefOr[IosDeviceType] = js.native
  
  // The build number of iOS Line of Business (LoB) app.
  var buildNumber: js.UndefOr[String] = js.native
  
  // The Identity Name.
  var bundleId: js.UndefOr[String] = js.native
  
  // The expiration time.
  var expirationDateTime: js.UndefOr[String] = js.native
  
  // The value for the minimum applicable operating system.
  var minimumSupportedOperatingSystem: js.UndefOr[IosMinimumOperatingSystem] = js.native
  
  // The version number of iOS Line of Business (LoB) app.
  var versionNumber: js.UndefOr[String] = js.native
}
object IosLobApp {
  
  @scala.inline
  def apply(): IosLobApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosLobApp]
  }
  
  @scala.inline
  implicit class IosLobAppOps[Self <: IosLobApp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApplicableDeviceType(value: IosDeviceType): Self = this.set("applicableDeviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicableDeviceType: Self = this.set("applicableDeviceType", js.undefined)
    
    @scala.inline
    def setBuildNumber(value: String): Self = this.set("buildNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuildNumber: Self = this.set("buildNumber", js.undefined)
    
    @scala.inline
    def setBundleId(value: String): Self = this.set("bundleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBundleId: Self = this.set("bundleId", js.undefined)
    
    @scala.inline
    def setExpirationDateTime(value: String): Self = this.set("expirationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpirationDateTime: Self = this.set("expirationDateTime", js.undefined)
    
    @scala.inline
    def setMinimumSupportedOperatingSystem(value: IosMinimumOperatingSystem): Self = this.set("minimumSupportedOperatingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumSupportedOperatingSystem: Self = this.set("minimumSupportedOperatingSystem", js.undefined)
    
    @scala.inline
    def setVersionNumber(value: String): Self = this.set("versionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionNumber: Self = this.set("versionNumber", js.undefined)
  }
}
