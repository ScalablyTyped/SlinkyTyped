package typingsSlinky.maximMazurokGapiClientProdTtSasportal.gapi.client.prodTtSasportal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SasPortalInstallationParams extends StObject {
  
  /**
    * Boresight direction of the horizontal plane of the antenna in degrees with respect to true north. The value of this parameter is an integer with a value between 0 and 359 inclusive.
    * A value of 0 degrees means true north; a value of 90 degrees means east. This parameter is optional for Category A devices and conditional for Category B devices.
    */
  var antennaAzimuth: js.UndefOr[Double] = js.native
  
  /**
    * 3-dB antenna beamwidth of the antenna in the horizontal-plane in degrees. This parameter is an unsigned integer having a value between 0 and 360 (degrees) inclusive; it is optional
    * for Category A devices and conditional for Category B devices.
    */
  var antennaBeamwidth: js.UndefOr[Double] = js.native
  
  /**
    * Antenna downtilt in degrees and is an integer with a value between -90 and +90 inclusive; a negative value means the antenna is tilted up (above horizontal). This parameter is
    * optional for Category A devices and conditional for Category B devices.
    */
  var antennaDowntilt: js.UndefOr[Double] = js.native
  
  /** Peak antenna gain in dBi. This parameter is an integer with a value between -127 and +128 (dBi) inclusive. */
  var antennaGain: js.UndefOr[Double] = js.native
  
  /** If an external antenna is used, the antenna model is optionally provided in this field. The string has a maximum length of 128 octets. */
  var antennaModel: js.UndefOr[String] = js.native
  
  /** If present, this parameter specifies whether the CBSD is a CPE-CBSD or not. */
  var cpeCbsdIndication: js.UndefOr[Boolean] = js.native
  
  /**
    * This parameter is the maximum device EIRP in units of dBm/10MHz and is an integer with a value between -127 and +47 (dBm/10 MHz) inclusive. If not included, SAS interprets it as
    * maximum allowable EIRP in units of dBm/10MHz for device category.
    */
  var eirpCapability: js.UndefOr[Double] = js.native
  
  /**
    * Device antenna height in meters. When the heightType parameter value is "AGL", the antenna height should be given relative to ground level. When the heightType parameter value is
    * "AMSL", it is given with respect to WGS84 datum.
    */
  var height: js.UndefOr[Double] = js.native
  
  /** Specifies how the height is measured. */
  var heightType: js.UndefOr[String] = js.native
  
  /**
    * A positive number in meters to indicate accuracy of the device antenna horizontal location. This optional parameter should only be present if its value is less than the FCC
    * requirement of 50 meters.
    */
  var horizontalAccuracy: js.UndefOr[Double] = js.native
  
  /** Whether the device antenna is indoor or not. True: indoor. False: outdoor. */
  var indoorDeployment: js.UndefOr[Boolean] = js.native
  
  /**
    * Latitude of the device antenna location in degrees relative to the WGS 84 datum. The allowed range is from -90.000000 to +90.000000. Positive values represent latitudes north of the
    * equator; negative values south of the equator.
    */
  var latitude: js.UndefOr[Double] = js.native
  
  /**
    * Longitude of the device antenna location. in degrees relative to the WGS 84 datum. The allowed range is from -180.000000 to +180.000000. Positive values represent longitudes east of
    * the prime meridian; negative values west of the prime meridian.
    */
  var longitude: js.UndefOr[Double] = js.native
  
  /**
    * A positive number in meters to indicate accuracy of the device antenna vertical location. This optional parameter should only be present if its value is less than the FCC
    * requirement of 3 meters.
    */
  var verticalAccuracy: js.UndefOr[Double] = js.native
}
object SasPortalInstallationParams {
  
  @scala.inline
  def apply(): SasPortalInstallationParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalInstallationParams]
  }
  
  @scala.inline
  implicit class SasPortalInstallationParamsMutableBuilder[Self <: SasPortalInstallationParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAntennaAzimuth(value: Double): Self = StObject.set(x, "antennaAzimuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAntennaAzimuthUndefined: Self = StObject.set(x, "antennaAzimuth", js.undefined)
    
    @scala.inline
    def setAntennaBeamwidth(value: Double): Self = StObject.set(x, "antennaBeamwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAntennaBeamwidthUndefined: Self = StObject.set(x, "antennaBeamwidth", js.undefined)
    
    @scala.inline
    def setAntennaDowntilt(value: Double): Self = StObject.set(x, "antennaDowntilt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAntennaDowntiltUndefined: Self = StObject.set(x, "antennaDowntilt", js.undefined)
    
    @scala.inline
    def setAntennaGain(value: Double): Self = StObject.set(x, "antennaGain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAntennaGainUndefined: Self = StObject.set(x, "antennaGain", js.undefined)
    
    @scala.inline
    def setAntennaModel(value: String): Self = StObject.set(x, "antennaModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAntennaModelUndefined: Self = StObject.set(x, "antennaModel", js.undefined)
    
    @scala.inline
    def setCpeCbsdIndication(value: Boolean): Self = StObject.set(x, "cpeCbsdIndication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpeCbsdIndicationUndefined: Self = StObject.set(x, "cpeCbsdIndication", js.undefined)
    
    @scala.inline
    def setEirpCapability(value: Double): Self = StObject.set(x, "eirpCapability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEirpCapabilityUndefined: Self = StObject.set(x, "eirpCapability", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightType(value: String): Self = StObject.set(x, "heightType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightTypeUndefined: Self = StObject.set(x, "heightType", js.undefined)
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHorizontalAccuracy(value: Double): Self = StObject.set(x, "horizontalAccuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalAccuracyUndefined: Self = StObject.set(x, "horizontalAccuracy", js.undefined)
    
    @scala.inline
    def setIndoorDeployment(value: Boolean): Self = StObject.set(x, "indoorDeployment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndoorDeploymentUndefined: Self = StObject.set(x, "indoorDeployment", js.undefined)
    
    @scala.inline
    def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
    
    @scala.inline
    def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
    
    @scala.inline
    def setVerticalAccuracy(value: Double): Self = StObject.set(x, "verticalAccuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalAccuracyUndefined: Self = StObject.set(x, "verticalAccuracy", js.undefined)
  }
}
