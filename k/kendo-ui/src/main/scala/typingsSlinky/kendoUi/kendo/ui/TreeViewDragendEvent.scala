package typingsSlinky.kendoUi.kendo.ui

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeViewDragendEvent extends TreeViewEvent {
  var destinationNode: js.UndefOr[Element] = js.native
  var dropPosition: js.UndefOr[String] = js.native
  var sourceNode: js.UndefOr[Element] = js.native
}

object TreeViewDragendEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: TreeView): TreeViewDragendEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeViewDragendEvent]
  }
  @scala.inline
  implicit class TreeViewDragendEventOps[Self <: TreeViewDragendEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinationNode(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationNode")(js.undefined)
        ret
    }
    @scala.inline
    def withDropPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceNode(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceNode")(js.undefined)
        ret
    }
  }
  
}

