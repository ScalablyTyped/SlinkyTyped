package typingsSlinky.reactOverlays.anon

import typingsSlinky.popperjsCore.typesMod.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Popper extends StObject {
  
  var placement: typingsSlinky.reactOverlays.esmUsePopperMod.Placement = js.native
  
  var popper: Rect = js.native
  
  var reference: Rect = js.native
}
object Popper {
  
  @scala.inline
  def apply(placement: typingsSlinky.reactOverlays.esmUsePopperMod.Placement, popper: Rect, reference: Rect): Popper = {
    val __obj = js.Dynamic.literal(placement = placement.asInstanceOf[js.Any], popper = popper.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Popper]
  }
  
  @scala.inline
  implicit class PopperMutableBuilder[Self <: Popper] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlacement(value: typingsSlinky.reactOverlays.esmUsePopperMod.Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopper(value: Rect): Self = StObject.set(x, "popper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReference(value: Rect): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
  }
}
