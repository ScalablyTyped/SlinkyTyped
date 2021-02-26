package typingsSlinky.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedIOSStoreApp extends ManagedApp {
  
  // The Apple AppStoreUrl.
  var appStoreUrl: js.UndefOr[String] = js.native
  
  // The iOS architecture for which this app can run on.
  var applicableDeviceType: js.UndefOr[IosDeviceType] = js.native
  
  // The app's Bundle ID.
  var bundleId: js.UndefOr[NullableOption[String]] = js.native
  
  // The value for the minimum supported operating system.
  var minimumSupportedOperatingSystem: js.UndefOr[IosMinimumOperatingSystem] = js.native
}
object ManagedIOSStoreApp {
  
  @scala.inline
  def apply(): ManagedIOSStoreApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedIOSStoreApp]
  }
  
  @scala.inline
  implicit class ManagedIOSStoreAppMutableBuilder[Self <: ManagedIOSStoreApp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppStoreUrl(value: String): Self = StObject.set(x, "appStoreUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppStoreUrlUndefined: Self = StObject.set(x, "appStoreUrl", js.undefined)
    
    @scala.inline
    def setApplicableDeviceType(value: IosDeviceType): Self = StObject.set(x, "applicableDeviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicableDeviceTypeUndefined: Self = StObject.set(x, "applicableDeviceType", js.undefined)
    
    @scala.inline
    def setBundleId(value: NullableOption[String]): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBundleIdNull: Self = StObject.set(x, "bundleId", null)
    
    @scala.inline
    def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
    
    @scala.inline
    def setMinimumSupportedOperatingSystem(value: IosMinimumOperatingSystem): Self = StObject.set(x, "minimumSupportedOperatingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumSupportedOperatingSystemUndefined: Self = StObject.set(x, "minimumSupportedOperatingSystem", js.undefined)
  }
}
