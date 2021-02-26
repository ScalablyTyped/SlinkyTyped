package typingsSlinky.babylonjs

import org.scalajs.dom.raw.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XRAnchor extends StObject {
  
  var anchorSpace: EventTarget = js.native
  
  def delete(): Unit = js.native
}
object XRAnchor {
  
  @scala.inline
  def apply(anchorSpace: EventTarget, delete: () => Unit): XRAnchor = {
    val __obj = js.Dynamic.literal(anchorSpace = anchorSpace.asInstanceOf[js.Any], delete = js.Any.fromFunction0(delete))
    __obj.asInstanceOf[XRAnchor]
  }
  
  @scala.inline
  implicit class XRAnchorMutableBuilder[Self <: XRAnchor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchorSpace(value: EventTarget): Self = StObject.set(x, "anchorSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
  }
}
