package typingsSlinky.antd.treeTreeMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.DragEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AntTreeNodeMouseEvent extends js.Object {
  var event: DragEvent[HTMLElement]
  var node: ReactComponentClass[AntTreeNodeProps]
}

object AntTreeNodeMouseEvent {
  @scala.inline
  def apply(event: DragEvent[HTMLElement], node: ReactComponentClass[AntTreeNodeProps]): AntTreeNodeMouseEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[AntTreeNodeMouseEvent]
  }
  @scala.inline
  implicit class AntTreeNodeMouseEventOps[Self <: AntTreeNodeMouseEvent] (val x: Self) extends AnyVal {
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
    def setEvent(value: DragEvent[HTMLElement]): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode(value: ReactComponentClass[AntTreeNodeProps]): Self = this.set("node", value.asInstanceOf[js.Any])
  }
  
}

