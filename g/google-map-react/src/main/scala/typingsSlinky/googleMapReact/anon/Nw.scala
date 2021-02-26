package typingsSlinky.googleMapReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Nw extends StObject {
  
  var nw: typingsSlinky.googleMapReact.mod.Coords = js.native
  
  var se: typingsSlinky.googleMapReact.mod.Coords = js.native
}
object Nw {
  
  @scala.inline
  def apply(nw: typingsSlinky.googleMapReact.mod.Coords, se: typingsSlinky.googleMapReact.mod.Coords): Nw = {
    val __obj = js.Dynamic.literal(nw = nw.asInstanceOf[js.Any], se = se.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nw]
  }
  
  @scala.inline
  implicit class NwMutableBuilder[Self <: Nw] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNw(value: typingsSlinky.googleMapReact.mod.Coords): Self = StObject.set(x, "nw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSe(value: typingsSlinky.googleMapReact.mod.Coords): Self = StObject.set(x, "se", value.asInstanceOf[js.Any])
  }
}
