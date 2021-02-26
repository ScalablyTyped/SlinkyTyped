package typingsSlinky.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedIOSLobApp extends ManagedMobileLobApp {
  
  // The iOS architecture for which this app can run on.
  var applicableDeviceType: js.UndefOr[IosDeviceType] = js.native
  
  // The build number of managed iOS Line of Business (LoB) app.
  var buildNumber: js.UndefOr[NullableOption[String]] = js.native
  
  // The Identity Name.
  var bundleId: js.UndefOr[NullableOption[String]] = js.native
  
  // The expiration time.
  var expirationDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // The value for the minimum applicable operating system.
  var minimumSupportedOperatingSystem: js.UndefOr[NullableOption[IosMinimumOperatingSystem]] = js.native
  
  // The version number of managed iOS Line of Business (LoB) app.
  var versionNumber: js.UndefOr[NullableOption[String]] = js.native
}
object ManagedIOSLobApp {
  
  @scala.inline
  def apply(): ManagedIOSLobApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedIOSLobApp]
  }
  
  @scala.inline
  implicit class ManagedIOSLobAppMutableBuilder[Self <: ManagedIOSLobApp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicableDeviceType(value: IosDeviceType): Self = StObject.set(x, "applicableDeviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicableDeviceTypeUndefined: Self = StObject.set(x, "applicableDeviceType", js.undefined)
    
    @scala.inline
    def setBuildNumber(value: NullableOption[String]): Self = StObject.set(x, "buildNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildNumberNull: Self = StObject.set(x, "buildNumber", null)
    
    @scala.inline
    def setBuildNumberUndefined: Self = StObject.set(x, "buildNumber", js.undefined)
    
    @scala.inline
    def setBundleId(value: NullableOption[String]): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBundleIdNull: Self = StObject.set(x, "bundleId", null)
    
    @scala.inline
    def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
    
    @scala.inline
    def setExpirationDateTime(value: NullableOption[String]): Self = StObject.set(x, "expirationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationDateTimeNull: Self = StObject.set(x, "expirationDateTime", null)
    
    @scala.inline
    def setExpirationDateTimeUndefined: Self = StObject.set(x, "expirationDateTime", js.undefined)
    
    @scala.inline
    def setMinimumSupportedOperatingSystem(value: NullableOption[IosMinimumOperatingSystem]): Self = StObject.set(x, "minimumSupportedOperatingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumSupportedOperatingSystemNull: Self = StObject.set(x, "minimumSupportedOperatingSystem", null)
    
    @scala.inline
    def setMinimumSupportedOperatingSystemUndefined: Self = StObject.set(x, "minimumSupportedOperatingSystem", js.undefined)
    
    @scala.inline
    def setVersionNumber(value: NullableOption[String]): Self = StObject.set(x, "versionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionNumberNull: Self = StObject.set(x, "versionNumber", null)
    
    @scala.inline
    def setVersionNumberUndefined: Self = StObject.set(x, "versionNumber", js.undefined)
  }
}
