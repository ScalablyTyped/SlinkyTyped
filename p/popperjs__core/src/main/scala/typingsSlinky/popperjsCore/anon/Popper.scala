package typingsSlinky.popperjsCore.anon

import typingsSlinky.popperjsCore.typesMod.VisualViewport
import typingsSlinky.popperjsCore.typesMod.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Popper extends StObject {
  
  var popper: js.Array[org.scalajs.dom.raw.Element | Window | VisualViewport] = js.native
  
  var reference: js.Array[org.scalajs.dom.raw.Element | Window | VisualViewport] = js.native
}
object Popper {
  
  @scala.inline
  def apply(
    popper: js.Array[org.scalajs.dom.raw.Element | Window | VisualViewport],
    reference: js.Array[org.scalajs.dom.raw.Element | Window | VisualViewport]
  ): Popper = {
    val __obj = js.Dynamic.literal(popper = popper.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Popper]
  }
  
  @scala.inline
  implicit class PopperMutableBuilder[Self <: Popper] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPopper(value: js.Array[org.scalajs.dom.raw.Element | Window | VisualViewport]): Self = StObject.set(x, "popper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopperVarargs(value: (org.scalajs.dom.raw.Element | Window | VisualViewport)*): Self = StObject.set(x, "popper", js.Array(value :_*))
    
    @scala.inline
    def setReference(value: js.Array[org.scalajs.dom.raw.Element | Window | VisualViewport]): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceVarargs(value: (org.scalajs.dom.raw.Element | Window | VisualViewport)*): Self = StObject.set(x, "reference", js.Array(value :_*))
  }
}
