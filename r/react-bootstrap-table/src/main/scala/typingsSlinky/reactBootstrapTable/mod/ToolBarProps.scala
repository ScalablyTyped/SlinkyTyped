package typingsSlinky.reactBootstrapTable.mod

import typingsSlinky.reactBootstrapTable.AnonCloseInsertModal
import typingsSlinky.reactBootstrapTable.ButtonGroupPropssearchPan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolBarProps extends js.Object {
  /**
  	 * Rendered components to use in the toolbar.
  	 */
  var components: ButtonGroupPropssearchPan = js.native
  /**
  	 * Event callbacks to use with a custom toolbar.
  	 */
  var event: AnonCloseInsertModal = js.native
}

object ToolBarProps {
  @scala.inline
  def apply(components: ButtonGroupPropssearchPan, event: AnonCloseInsertModal): ToolBarProps = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolBarProps]
  }
  @scala.inline
  implicit class ToolBarPropsOps[Self <: ToolBarProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponents(value: ButtonGroupPropssearchPan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("components")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvent(value: AnonCloseInsertModal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

