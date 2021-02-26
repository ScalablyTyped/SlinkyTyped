package typingsSlinky.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IosDevice extends StObject {
  
  /** Required. The id of the iOS device to be used. Use the TestEnvironmentDiscoveryService to get supported options. */
  var iosModelId: js.UndefOr[String] = js.native
  
  /** Required. The id of the iOS major software version to be used. Use the TestEnvironmentDiscoveryService to get supported options. */
  var iosVersionId: js.UndefOr[String] = js.native
  
  /** Required. The locale the test device used for testing. Use the TestEnvironmentDiscoveryService to get supported options. */
  var locale: js.UndefOr[String] = js.native
  
  /** Required. How the device is oriented during the test. Use the TestEnvironmentDiscoveryService to get supported options. */
  var orientation: js.UndefOr[String] = js.native
}
object IosDevice {
  
  @scala.inline
  def apply(): IosDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosDevice]
  }
  
  @scala.inline
  implicit class IosDeviceMutableBuilder[Self <: IosDevice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIosModelId(value: String): Self = StObject.set(x, "iosModelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIosModelIdUndefined: Self = StObject.set(x, "iosModelId", js.undefined)
    
    @scala.inline
    def setIosVersionId(value: String): Self = StObject.set(x, "iosVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIosVersionIdUndefined: Self = StObject.set(x, "iosVersionId", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
  }
}
