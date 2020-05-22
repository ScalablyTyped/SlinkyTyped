package typingsSlinky.geolib.anon

import typingsSlinky.geolib.typesMod.GeolibInputLatitude
import typingsSlinky.geolib.typesMod.GeolibLatitudeInputValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LatitudeGeolibLatitudeInputValue extends GeolibInputLatitude {
  var latitude: GeolibLatitudeInputValue
}

object LatitudeGeolibLatitudeInputValue {
  @scala.inline
  def apply(latitude: GeolibLatitudeInputValue): LatitudeGeolibLatitudeInputValue = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[LatitudeGeolibLatitudeInputValue]
  }
}

