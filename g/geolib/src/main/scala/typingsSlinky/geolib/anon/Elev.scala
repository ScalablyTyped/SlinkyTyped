package typingsSlinky.geolib.anon

import typingsSlinky.geolib.typesMod.GeolibAltitudeInputValue
import typingsSlinky.geolib.typesMod.GeolibInputAltitude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Elev extends GeolibInputAltitude {
  
  var elev: js.UndefOr[GeolibAltitudeInputValue] = js.native
}
object Elev {
  
  @scala.inline
  def apply(): Elev = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Elev]
  }
  
  @scala.inline
  implicit class ElevMutableBuilder[Self <: Elev] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElev(value: GeolibAltitudeInputValue): Self = StObject.set(x, "elev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElevUndefined: Self = StObject.set(x, "elev", js.undefined)
  }
}
