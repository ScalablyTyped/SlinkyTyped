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
}

