package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The absolute geographic location
  */
@js.native
trait LocationPosition extends BackboneElement {
  /**
    * Contains extended information for property 'altitude'.
    */
  var _altitude: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'latitude'.
    */
  var _latitude: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'longitude'.
    */
  var _longitude: js.UndefOr[Element] = js.native
  /**
    * Altitude with WGS84 datum
    */
  var altitude: js.UndefOr[decimal] = js.native
  /**
    * Latitude with WGS84 datum
    */
  var latitude: decimal = js.native
  /**
    * Longitude with WGS84 datum
    */
  var longitude: decimal = js.native
}

object LocationPosition {
  @scala.inline
  def apply(latitude: decimal, longitude: decimal): LocationPosition = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationPosition]
  }
  @scala.inline
  implicit class LocationPositionOps[Self <: LocationPosition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLatitude(value: decimal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongitude(value: decimal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_altitude(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_altitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_altitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_altitude")(js.undefined)
        ret
    }
    @scala.inline
    def with_latitude(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_latitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_latitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_latitude")(js.undefined)
        ret
    }
    @scala.inline
    def with_longitude(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_longitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_longitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_longitude")(js.undefined)
        ret
    }
    @scala.inline
    def withAltitude(value: decimal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altitude")(js.undefined)
        ret
    }
  }
  
}

