package typingsSlinky.microsoftLiveConnect.Microsoft.Live

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents location information.
  */
@js.native
trait ILocation extends js.Object {
  /**
    * The altitude portion of the location, expressed as positive (above)
    * or negative (below) values relative to sea level, in units of
    * measurement as determined by the camera.
    */
  var altitude: Double = js.native
  /**
    * The latitude portion of the location, expressed as positive (north)
    * or negative (south) degrees relative to the equator.
    */
  var latitude: Double = js.native
  /**
    * The longitude portion of the location expressed as positive (east) or
    * negative (west) degrees relative to the Prime Meridian.
    */
  var longitude: Double = js.native
}

object ILocation {
  @scala.inline
  def apply(altitude: Double, latitude: Double, longitude: Double): ILocation = {
    val __obj = js.Dynamic.literal(altitude = altitude.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILocation]
  }
  @scala.inline
  implicit class ILocationOps[Self <: ILocation] (val x: Self) extends AnyVal {
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

