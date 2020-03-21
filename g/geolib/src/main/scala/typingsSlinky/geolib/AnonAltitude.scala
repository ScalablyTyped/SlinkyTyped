package typingsSlinky.geolib

import typingsSlinky.geolib.typesMod.AltitudeKeys
import typingsSlinky.geolib.typesMod.LatitudeKeys
import typingsSlinky.geolib.typesMod.LongitudeKeys
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAltitude extends js.Object {
  var altitude: js.Array[AltitudeKeys]
  var latitude: js.Array[LatitudeKeys]
  var longitude: js.Array[LongitudeKeys]
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
}

