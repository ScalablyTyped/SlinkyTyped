package typingsSlinky.rcTree.anon

import org.scalajs.dom.raw.Element
import slinky.web.SyntheticMouseEvent
import typingsSlinky.rcTree.interfaceMod.EventDataNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventNode extends StObject {
  
  var event: SyntheticMouseEvent[Element] = js.native
  
  var node: EventDataNode = js.native
}
object EventNode {
  
  @scala.inline
  def apply(event: SyntheticMouseEvent[Element], node: EventDataNode): EventNode = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventNode]
  }
  
  @scala.inline
  implicit class EventNodeMutableBuilder[Self <: EventNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: SyntheticMouseEvent[Element]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: EventDataNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
