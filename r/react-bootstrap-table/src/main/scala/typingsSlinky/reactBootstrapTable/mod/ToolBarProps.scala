package typingsSlinky.reactBootstrapTable.mod

import typingsSlinky.reactBootstrapTable.anon.ButtonGroupPropssearchPan
import typingsSlinky.reactBootstrapTable.anon.CloseInsertModal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolBarProps extends js.Object {
  /**
    * Rendered components to use in the toolbar.
    */
  var components: ButtonGroupPropssearchPan
  /**
    * Event callbacks to use with a custom toolbar.
    */
  var event: CloseInsertModal
}

object ToolBarProps {
  @scala.inline
  def apply(components: ButtonGroupPropssearchPan, event: CloseInsertModal): ToolBarProps = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolBarProps]
  }
}

