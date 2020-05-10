package typingsSlinky.bingmaps.Microsoft.Maps.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGeocodeLocation extends js.Object {
  /** The latitude of the location. */
  var latitude: Double = js.native
  /** The longitude of the location. */
  var longitude: Double = js.native
  /** The name of this geocode location match. */
  var name: String = js.native
  /** 
  		 * The precision of this geocode location match. 
  		 * Possible Values: Interpolated, InterpolatedOffset, Rooftop, Parcel
  		 */
  var precision: String = js.native
}

object IGeocodeLocation {
  @scala.inline
  def apply(latitude: Double, longitude: Double, name: String, precision: String): IGeocodeLocation = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], precision = precision.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeocodeLocation]
  }
  @scala.inline
  implicit class IGeocodeLocationOps[Self <: IGeocodeLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrecision(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

