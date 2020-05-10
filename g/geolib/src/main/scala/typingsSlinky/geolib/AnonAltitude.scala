package typingsSlinky.geolib

import typingsSlinky.geolib.typesMod.AltitudeKeys
import typingsSlinky.geolib.typesMod.LatitudeKeys
import typingsSlinky.geolib.typesMod.LongitudeKeys
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAltitude extends js.Object {
  var altitude: js.Array[AltitudeKeys] = js.native
  var latitude: js.Array[LatitudeKeys] = js.native
  var longitude: js.Array[LongitudeKeys] = js.native
}

object AnonAltitude {
  @scala.inline
  def apply(
    altitude: js.Array[AltitudeKeys],
    latitude: js.Array[LatitudeKeys],
    longitude: js.Array[LongitudeKeys]
  ): AnonAltitude = {
    val __obj = js.Dynamic.literal(altitude = altitude.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAltitude]
  }
  @scala.inline
  implicit class AnonAltitudeOps[Self <: AnonAltitude] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAltitude(value: js.Array[AltitudeKeys]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatitude(value: js.Array[LatitudeKeys]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongitude(value: js.Array[LongitudeKeys]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longitude")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

