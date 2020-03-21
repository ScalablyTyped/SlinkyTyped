package typingsSlinky.reactNativeMaterialUi.mod

import slinky.core.facade.ReactElement
import typingsSlinky.reactNativeMaterialUi.AnonContentContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogContentProps extends js.Object {
  var children: ReactElement
  var style: js.UndefOr[AnonContentContainer] = js.undefined
}

object DialogContentProps {
  @scala.inline
  def apply(children: ReactElement, style: AnonContentContainer = null): DialogContentProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogContentProps]
  }
}

