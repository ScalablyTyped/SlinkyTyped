package typingsSlinky.googleMapReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Coords extends StObject {
  
  var coords: typingsSlinky.googleMapReact.mod.Coords = js.native
}
object Coords {
  
  @scala.inline
  def apply(coords: typingsSlinky.googleMapReact.mod.Coords): Coords = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coords]
  }
  
  @scala.inline
  implicit class CoordsMutableBuilder[Self <: Coords] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoords(value: typingsSlinky.googleMapReact.mod.Coords): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
  }
}
