package typingsSlinky.geolib.anon

import typingsSlinky.geolib.typesMod.GeolibInputLatitude
import typingsSlinky.geolib.typesMod.GeolibLatitudeInputValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Lat extends GeolibInputLatitude {
  
  var lat: GeolibLatitudeInputValue = js.native
}
object Lat {
  
  @scala.inline
  def apply(lat: GeolibLatitudeInputValue): Lat = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lat]
  }
  
  @scala.inline
  implicit class LatMutableBuilder[Self <: Lat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLat(value: GeolibLatitudeInputValue): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
  }
}
