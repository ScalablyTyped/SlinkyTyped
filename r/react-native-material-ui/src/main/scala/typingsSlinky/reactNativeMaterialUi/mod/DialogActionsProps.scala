package typingsSlinky.reactNativeMaterialUi.mod

import slinky.core.facade.ReactElement
import typingsSlinky.reactNativeMaterialUi.AnonActionsContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogActionsProps extends js.Object {
  var children: ReactElement
  var style: js.UndefOr[AnonActionsContainer] = js.undefined
}

object DialogActionsProps {
  @scala.inline
  def apply(children: ReactElement, style: AnonActionsContainer = null): DialogActionsProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogActionsProps]
  }
}

