package typingsSlinky.reactNativeMaterialUi.mod

import slinky.core.facade.ReactElement
import typingsSlinky.reactNativeMaterialUi.AnonLabels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolBarRightElement extends js.Object {
  var actions: js.UndefOr[js.Array[ReactElement | String]] = js.undefined
  var menu: js.UndefOr[AnonLabels] = js.undefined
}

object ToolBarRightElement {
  @scala.inline
  def apply(actions: js.Array[ReactElement | String] = null, menu: AnonLabels = null): ToolBarRightElement = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (menu != null) __obj.updateDynamic("menu")(menu.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolBarRightElement]
  }
}

