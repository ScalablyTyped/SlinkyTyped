package typingsSlinky.gapiClientSpectrum.gapi.client.spectrum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PawsGetSpectrumBatchRequest extends js.Object {
  /** Depending on device type and regulatory domain, antenna characteristics may be required. */
  var antenna: js.UndefOr[AntennaCharacteristics] = js.native
  /**
    * The master device may include its device capabilities to limit the available-spectrum batch response to the spectrum that is compatible with its
    * capabilities. The database should not return spectrum that is incompatible with the specified capabilities.
    */
  var capabilities: js.UndefOr[DeviceCapabilities] = js.native
  /**
    * When the available spectrum request is made on behalf of a specific device (a master or slave device), device descriptor information for the device on
    * whose behalf the request is made is required (in such cases, the requestType parameter must be empty). When a requestType value is specified, device
    * descriptor information may be optional or required according to the rules of the applicable regulatory domain.
    */
  var deviceDesc: js.UndefOr[DeviceDescriptor] = js.native
  /**
    * A geolocation list is required. This allows a device to specify its current location plus additional anticipated locations when allowed by the
    * regulatory domain. At least one location must be included. Geolocation must be given as the location of the radiation center of the device's antenna.
    * If a location specifies a region, rather than a point, the database may return an UNIMPLEMENTED error if it does not support query by region.
    *
    * There is no upper limit on the number of locations included in a available spectrum batch request, but the database may restrict the number of
    * locations it supports by returning a response with fewer locations than specified in the batch request. Note that geolocations must be those of the
    * master device (a device with geolocation capability that makes an available spectrum batch request), whether the master device is making the request on
    * its own behalf or on behalf of a slave device (one without geolocation capability).
    */
  var locations: js.UndefOr[js.Array[GeoLocation]] = js.native
  /**
    * When an available spectrum batch request is made by the master device (a device with geolocation capability) on behalf of a slave device (a device
    * without geolocation capability), the rules of the applicable regulatory domain may require the master device to provide its own device descriptor
    * information (in addition to device descriptor information for the slave device in a separate parameter).
    */
  var masterDeviceDesc: js.UndefOr[DeviceDescriptor] = js.native
  /**
    * Depending on device type and regulatory domain, device owner information may be included in an available spectrum batch request. This allows the device
    * to register and get spectrum-availability information in a single request.
    */
  var owner: js.UndefOr[DeviceOwner] = js.native
  /**
    * The request type parameter is an optional parameter that can be used to modify an available spectrum batch request, but its use depends on applicable
    * regulatory rules. For example, It may be used to request generic slave device parameters without having to specify the device descriptor for a specific
    * device. When the requestType parameter is missing, the request is for a specific device (master or slave), and the device descriptor parameter for the
    * device on whose behalf the batch request is made is required.
    */
  var requestType: js.UndefOr[String] = js.native
  /**
    * The message type (e.g., INIT_REQ, AVAIL_SPECTRUM_REQ, ...).
    *
    * Required field.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The PAWS version. Must be exactly 1.0.
    *
    * Required field.
    */
  var version: js.UndefOr[String] = js.native
}

object PawsGetSpectrumBatchRequest {
  @scala.inline
  def apply(): PawsGetSpectrumBatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PawsGetSpectrumBatchRequest]
  }
  @scala.inline
  implicit class PawsGetSpectrumBatchRequestOps[Self <: PawsGetSpectrumBatchRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAntenna(value: AntennaCharacteristics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("antenna")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAntenna: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("antenna")(js.undefined)
        ret
    }
    @scala.inline
    def withCapabilities(value: DeviceCapabilities): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapabilities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capabilities")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceDesc(value: DeviceDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceDesc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceDesc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceDesc")(js.undefined)
        ret
    }
    @scala.inline
    def withLocations(value: js.Array[GeoLocation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locations")(js.undefined)
        ret
    }
    @scala.inline
    def withMasterDeviceDesc(value: DeviceDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterDeviceDesc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasterDeviceDesc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterDeviceDesc")(js.undefined)
        ret
    }
    @scala.inline
    def withOwner(value: DeviceOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestType")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

