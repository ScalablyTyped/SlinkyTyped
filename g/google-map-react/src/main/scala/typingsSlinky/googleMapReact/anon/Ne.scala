package typingsSlinky.googleMapReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ne extends StObject {
  
  @JSName("ne")
  var ne_FNe: typingsSlinky.googleMapReact.mod.Coords = js.native
  
  var sw: typingsSlinky.googleMapReact.mod.Coords = js.native
}
object Ne {
  
  @scala.inline
  def apply(ne_ : typingsSlinky.googleMapReact.mod.Coords, sw: typingsSlinky.googleMapReact.mod.Coords): Ne = {
    val __obj = js.Dynamic.literal(sw = sw.asInstanceOf[js.Any])
    __obj.updateDynamic("ne")(ne_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ne]
  }
  
  @scala.inline
  implicit class NeMutableBuilder[Self <: Ne] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNe_(value: typingsSlinky.googleMapReact.mod.Coords): Self = StObject.set(x, "ne", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSw(value: typingsSlinky.googleMapReact.mod.Coords): Self = StObject.set(x, "sw", value.asInstanceOf[js.Any])
  }
}
