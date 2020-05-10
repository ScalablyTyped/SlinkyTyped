package typingsSlinky.atom.toolBarMod

import org.scalajs.dom.raw.HTMLHRElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolBarSpacerView extends js.Object {
  var element: HTMLHRElement = js.native
  var group: String = js.native
  var priority: Double = js.native
  def destroy(): Unit = js.native
}

object ToolBarSpacerView {
  @scala.inline
  def apply(destroy: () => Unit, element: HTMLHRElement, group: String, priority: Double): ToolBarSpacerView = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), element = element.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolBarSpacerView]
  }
  @scala.inline
  implicit class ToolBarSpacerViewOps[Self <: ToolBarSpacerView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withElement(value: HTMLHRElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

