package typingsSlinky.geolib

import typingsSlinky.geolib.typesMod.GeolibInputLongitude
import typingsSlinky.geolib.typesMod.GeolibLongitudeInputValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLon extends GeolibInputLongitude {
  var lon: GeolibLongitudeInputValue
}

object AnonLon {
  @scala.inline
  def apply(lon: GeolibLongitudeInputValue): AnonLon = {
    val __obj = js.Dynamic.literal(lon = lon.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLon]
  }
}

