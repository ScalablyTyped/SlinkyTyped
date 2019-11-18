package typingsSlinky.antd.esTreeTreeMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AntTreeNodeDragEnterEvent extends AntTreeNodeMouseEvent {
  var expandedKeys: js.Array[String]
}

object AntTreeNodeDragEnterEvent {
  @scala.inline
  def apply(
    event: SyntheticMouseEvent[HTMLElement],
    expandedKeys: js.Array[String],
    node: ReactComponentClass[AntTreeNodeProps]
  ): AntTreeNodeDragEnterEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AntTreeNodeDragEnterEvent]
  }
}

