package typingsSlinky.geolib.anon

import typingsSlinky.geolib.geolibNumbers.`1`
import typingsSlinky.geolib.geolibStrings.lat
import typingsSlinky.geolib.geolibStrings.latitude
import typingsSlinky.geolib.geolibStrings.lng
import typingsSlinky.geolib.geolibStrings.lon
import typingsSlinky.geolib.geolibStrings.longitude
import typingsSlinky.geolib.typesMod.AltitudeKeys
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AltitudeLatitude extends StObject {
  
  var altitude: js.UndefOr[AltitudeKeys] = js.native
  
  var latitude: js.UndefOr[lat | typingsSlinky.geolib.geolibStrings.latitude | `1`] = js.native
  
  var longitude: js.UndefOr[
    typingsSlinky.geolib.geolibNumbers.`0` | lng | lon | typingsSlinky.geolib.geolibStrings.longitude
  ] = js.native
}
object AltitudeLatitude {
  
  @scala.inline
  def apply(): AltitudeLatitude = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AltitudeLatitude]
  }
  
  @scala.inline
  implicit class AltitudeLatitudeMutableBuilder[Self <: AltitudeLatitude] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltitude(value: AltitudeKeys): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltitudeUndefined: Self = StObject.set(x, "altitude", js.undefined)
    
    @scala.inline
    def setLatitude(value: lat | latitude | `1`): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
    
    @scala.inline
    def setLongitude(value: typingsSlinky.geolib.geolibNumbers.`0` | lng | lon | longitude): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
  }
}
