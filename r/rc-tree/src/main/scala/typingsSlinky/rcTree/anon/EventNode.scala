package typingsSlinky.rcTree.anon

import org.scalajs.dom.raw.Element
import slinky.web.SyntheticMouseEvent
import typingsSlinky.rcTree.interfaceMod.EventDataNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventNode extends js.Object {
  
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
  implicit class EventNodeOps[Self <: EventNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEvent(value: SyntheticMouseEvent[Element]): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: EventDataNode): Self = this.set("node", value.asInstanceOf[js.Any])
  }
}
