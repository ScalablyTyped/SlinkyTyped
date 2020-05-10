package typingsSlinky.leadfoot.leadfoot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * An object that describes a geographical location.
	 */
@js.native
trait Geolocation extends js.Object {
  /**
  		 * Altitude in meters above the WGS84 ellipsoid.
  		 */
  var altitude: Double = js.native
  /**
  		 * Latitude in WGS84 decimal coordinate system.
  		 */
  var latitude: Double = js.native
  /**
  		 * Longitude in WGS84 decimal coordinate system.
  		 */
  var longitude: Double = js.native
}

object Geolocation {
  @scala.inline
  def apply(altitude: Double, latitude: Double, longitude: Double): Geolocation = {
    val __obj = js.Dynamic.literal(altitude = altitude.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geolocation]
  }
  @scala.inline
  implicit class GeolocationOps[Self <: Geolocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAltitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longitude")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

