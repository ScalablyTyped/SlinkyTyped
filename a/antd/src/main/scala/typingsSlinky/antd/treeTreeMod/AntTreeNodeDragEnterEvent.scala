package typingsSlinky.antd.treeTreeMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.DragEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AntTreeNodeDragEnterEvent extends AntTreeNodeMouseEvent {
  var expandedKeys: js.Array[String] = js.native
}

object AntTreeNodeDragEnterEvent {
  @scala.inline
  def apply(
    event: DragEvent[HTMLElement],
    expandedKeys: js.Array[String],
    node: ReactComponentClass[AntTreeNodeProps]
  ): AntTreeNodeDragEnterEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[AntTreeNodeDragEnterEvent]
  }
  @scala.inline
  implicit class AntTreeNodeDragEnterEventOps[Self <: AntTreeNodeDragEnterEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpandedKeys(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedKeys")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

