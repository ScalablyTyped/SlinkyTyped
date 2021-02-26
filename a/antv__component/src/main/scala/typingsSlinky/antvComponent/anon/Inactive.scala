package typingsSlinky.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Inactive extends StObject {
  
  var active: NameStyle = js.native
  
  var inactive: MarkerStyleNameStyle = js.native
  
  var unchecked: MarkerStyle = js.native
}
object Inactive {
  
  @scala.inline
  def apply(active: NameStyle, inactive: MarkerStyleNameStyle, unchecked: MarkerStyle): Inactive = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], inactive = inactive.asInstanceOf[js.Any], unchecked = unchecked.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inactive]
  }
  
  @scala.inline
  implicit class InactiveMutableBuilder[Self <: Inactive] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: NameStyle): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInactive(value: MarkerStyleNameStyle): Self = StObject.set(x, "inactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnchecked(value: MarkerStyle): Self = StObject.set(x, "unchecked", value.asInstanceOf[js.Any])
  }
}
