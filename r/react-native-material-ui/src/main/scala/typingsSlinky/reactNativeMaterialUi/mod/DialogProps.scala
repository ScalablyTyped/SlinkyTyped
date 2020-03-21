package typingsSlinky.reactNativeMaterialUi.mod

import slinky.core.facade.ReactElement
import typingsSlinky.reactNativeMaterialUi.AnonContainerViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogProps extends js.Object {
  var children: ReactElement | js.Array[ReactElement]
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var style: js.UndefOr[AnonContainerViewStyle] = js.undefined
}

object DialogProps {
  @scala.inline
  def apply(
    children: ReactElement | js.Array[ReactElement],
    onPress: () => Unit = null,
    style: AnonContainerViewStyle = null
  ): DialogProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogProps]
  }
}

