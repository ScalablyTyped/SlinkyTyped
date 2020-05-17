package typingsSlinky.geolib.typesMod

import typingsSlinky.geolib.anon.Alt
import typingsSlinky.geolib.anon.AltitudeGeolibAltitudeInputValue
import typingsSlinky.geolib.anon.Elev
import typingsSlinky.geolib.anon.Elevation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.geolib.anon.Alt
  - typingsSlinky.geolib.anon.AltitudeGeolibAltitudeInputValue
  - typingsSlinky.geolib.anon.Elevation
  - typingsSlinky.geolib.anon.Elev
*/
trait GeolibInputAltitude extends js.Object

object GeolibInputAltitude {
  @scala.inline
  implicit def apply(value: Alt): GeolibInputAltitude = value.asInstanceOf[GeolibInputAltitude]
  @scala.inline
  implicit def apply(value: AltitudeGeolibAltitudeInputValue): GeolibInputAltitude = value.asInstanceOf[GeolibInputAltitude]
  @scala.inline
  implicit def apply(value: Elev): GeolibInputAltitude = value.asInstanceOf[GeolibInputAltitude]
  @scala.inline
  implicit def apply(value: Elevation): GeolibInputAltitude = value.asInstanceOf[GeolibInputAltitude]
}

