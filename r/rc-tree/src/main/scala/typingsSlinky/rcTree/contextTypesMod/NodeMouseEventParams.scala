package typingsSlinky.rcTree.contextTypesMod

import slinky.web.SyntheticMouseEvent
import typingsSlinky.rcTree.interfaceMod.EventDataNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeMouseEventParams[T] extends js.Object {
  
  var event: SyntheticMouseEvent[T] = js.native
  
  var node: EventDataNode = js.native
}
object NodeMouseEventParams {
  
  @scala.inline
  def apply[T](event: SyntheticMouseEvent[T], node: EventDataNode): NodeMouseEventParams[T] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeMouseEventParams[T]]
  }
  
  @scala.inline
  implicit class NodeMouseEventParamsOps[Self <: NodeMouseEventParams[_], T] (val x: Self with NodeMouseEventParams[T]) extends AnyVal {
    
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
    def setEvent(value: SyntheticMouseEvent[T]): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: EventDataNode): Self = this.set("node", value.asInstanceOf[js.Any])
  }
}
