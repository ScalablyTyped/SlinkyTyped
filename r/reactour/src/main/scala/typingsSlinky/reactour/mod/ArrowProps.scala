package typingsSlinky.reactour.mod

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrowProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var inverted: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[TagMod[Any]] = js.undefined
  var onClick: MouseEventHandler[HTMLButtonElement]
}

object ArrowProps {
  @scala.inline
  def apply(
    onClick: SyntheticMouseEvent[HTMLButtonElement] => Unit,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    inverted: js.UndefOr[Boolean] = js.undefined,
    label: TagMod[Any] = null
  ): ArrowProps = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrowProps]
  }
}

