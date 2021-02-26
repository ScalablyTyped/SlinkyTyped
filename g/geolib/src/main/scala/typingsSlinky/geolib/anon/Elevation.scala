package typingsSlinky.geolib.anon

import typingsSlinky.geolib.typesMod.GeolibAltitudeInputValue
import typingsSlinky.geolib.typesMod.GeolibInputAltitude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Elevation extends GeolibInputAltitude {
  
  var elevation: js.UndefOr[GeolibAltitudeInputValue] = js.native
}
object Elevation {
  
  @scala.inline
  def apply(): Elevation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Elevation]
  }
  
  @scala.inline
  implicit class ElevationMutableBuilder[Self <: Elevation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElevation(value: GeolibAltitudeInputValue): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElevationUndefined: Self = StObject.set(x, "elevation", js.undefined)
  }
}
