package typingsSlinky.geolib.anon

import typingsSlinky.geolib.typesMod.GeolibInputLongitude
import typingsSlinky.geolib.typesMod.GeolibLongitudeInputValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LongitudeGeolibLongitudeInputValue extends GeolibInputLongitude {
  
  var longitude: GeolibLongitudeInputValue = js.native
}
object LongitudeGeolibLongitudeInputValue {
  
  @scala.inline
  def apply(longitude: GeolibLongitudeInputValue): LongitudeGeolibLongitudeInputValue = {
    val __obj = js.Dynamic.literal(longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[LongitudeGeolibLongitudeInputValue]
  }
  
  @scala.inline
  implicit class LongitudeGeolibLongitudeInputValueMutableBuilder[Self <: LongitudeGeolibLongitudeInputValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLongitude(value: GeolibLongitudeInputValue): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
  }
}
