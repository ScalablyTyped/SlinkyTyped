package typingsSlinky.maximMazurokGapiClientSasportal.gapi.client.sasportal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SasPortalDeviceConfig extends StObject {
  
  /** Information about this device's air interface. */
  var airInterface: js.UndefOr[SasPortalDeviceAirInterface] = js.native
  
  /** The call sign of the device operator. */
  var callSign: js.UndefOr[String] = js.native
  
  /** FCC category of the device. */
  var category: js.UndefOr[String] = js.native
  
  /** Installation parameters for the device. */
  var installationParams: js.UndefOr[SasPortalInstallationParams] = js.native
  
  /** Output-only. Whether the configuration has been signed by a CPI. */
  var isSigned: js.UndefOr[Boolean] = js.native
  
  /** Measurement reporting capabilities of the device. */
  var measurementCapabilities: js.UndefOr[js.Array[String]] = js.native
  
  /** Information about this device model. */
  var model: js.UndefOr[SasPortalDeviceModel] = js.native
  
  /** State of the configuration. */
  var state: js.UndefOr[String] = js.native
  
  /** Output-only. The last time the device configuration was edited. */
  var updateTime: js.UndefOr[String] = js.native
  
  /** The identifier of a device user. */
  var userId: js.UndefOr[String] = js.native
}
object SasPortalDeviceConfig {
  
  @scala.inline
  def apply(): SasPortalDeviceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalDeviceConfig]
  }
  
  @scala.inline
  implicit class SasPortalDeviceConfigMutableBuilder[Self <: SasPortalDeviceConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAirInterface(value: SasPortalDeviceAirInterface): Self = StObject.set(x, "airInterface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAirInterfaceUndefined: Self = StObject.set(x, "airInterface", js.undefined)
    
    @scala.inline
    def setCallSign(value: String): Self = StObject.set(x, "callSign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallSignUndefined: Self = StObject.set(x, "callSign", js.undefined)
    
    @scala.inline
    def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setInstallationParams(value: SasPortalInstallationParams): Self = StObject.set(x, "installationParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallationParamsUndefined: Self = StObject.set(x, "installationParams", js.undefined)
    
    @scala.inline
    def setIsSigned(value: Boolean): Self = StObject.set(x, "isSigned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSignedUndefined: Self = StObject.set(x, "isSigned", js.undefined)
    
    @scala.inline
    def setMeasurementCapabilities(value: js.Array[String]): Self = StObject.set(x, "measurementCapabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasurementCapabilitiesUndefined: Self = StObject.set(x, "measurementCapabilities", js.undefined)
    
    @scala.inline
    def setMeasurementCapabilitiesVarargs(value: String*): Self = StObject.set(x, "measurementCapabilities", js.Array(value :_*))
    
    @scala.inline
    def setModel(value: SasPortalDeviceModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
