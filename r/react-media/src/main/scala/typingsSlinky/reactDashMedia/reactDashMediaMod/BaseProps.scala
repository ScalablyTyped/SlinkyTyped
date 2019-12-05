package typingsSlinky.reactDashMedia.reactDashMediaMod

import org.scalajs.dom.raw.Window
import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseProps extends js.Object {
  var render: js.UndefOr[js.Function0[TagMod[Any]]] = js.undefined
  var targetWindow: js.UndefOr[Window] = js.undefined
}

object BaseProps {
  @scala.inline
  def apply(render: () => TagMod[Any] = null, targetWindow: Window = null): BaseProps = {
    val __obj = js.Dynamic.literal()
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction0(render))
    if (targetWindow != null) __obj.updateDynamic("targetWindow")(targetWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseProps]
  }
}

