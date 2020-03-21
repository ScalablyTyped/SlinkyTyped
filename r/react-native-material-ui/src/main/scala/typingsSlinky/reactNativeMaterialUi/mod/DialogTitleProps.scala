package typingsSlinky.reactNativeMaterialUi.mod

import slinky.core.facade.ReactElement
import typingsSlinky.reactNativeMaterialUi.AnonTitleContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogTitleProps extends js.Object {
  var children: ReactElement
  var style: js.UndefOr[AnonTitleContainer] = js.undefined
}

object DialogTitleProps {
  @scala.inline
  def apply(children: ReactElement, style: AnonTitleContainer = null): DialogTitleProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogTitleProps]
  }
}

