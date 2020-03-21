package typingsSlinky.reactNativeMaterialUi.mod

import slinky.core.facade.ReactElement
import typingsSlinky.reactNativeMaterialUi.AnonContainerViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerProps extends js.Object {
  var children: ReactElement
  var style: js.UndefOr[AnonContainerViewStyle] = js.undefined
}

object DrawerProps {
  @scala.inline
  def apply(children: ReactElement, style: AnonContainerViewStyle = null): DrawerProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerProps]
  }
}

