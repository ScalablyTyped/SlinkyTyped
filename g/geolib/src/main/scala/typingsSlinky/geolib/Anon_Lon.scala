package typingsSlinky.geolib

import typingsSlinky.geolib.esTypesMod.GeolibInputLongitude
import typingsSlinky.geolib.esTypesMod.GeolibLongitudeInputValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Lon extends GeolibInputLongitude {
  var lon: GeolibLongitudeInputValue
}

object Anon_Lon {
  @scala.inline
  def apply(lon: GeolibLongitudeInputValue): Anon_Lon = {
    val __obj = js.Dynamic.literal(lon = lon.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Lon]
  }
}

