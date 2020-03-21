package typingsSlinky.reactOutsideClickHandler.mod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import typingsSlinky.reactOutsideClickHandler.reactOutsideClickHandlerStrings.`inline-block`
import typingsSlinky.reactOutsideClickHandler.reactOutsideClickHandlerStrings.`inline`
import typingsSlinky.reactOutsideClickHandler.reactOutsideClickHandlerStrings.block
import typingsSlinky.reactOutsideClickHandler.reactOutsideClickHandlerStrings.contents
import typingsSlinky.reactOutsideClickHandler.reactOutsideClickHandlerStrings.flex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<react-outside-click-handler.react-outside-click-handler.DefaultProps> */
trait Props extends js.Object {
  var children: TagMod[Any]
  var disabled: js.UndefOr[Boolean] = js.undefined
  var display: js.UndefOr[block | flex | `inline` | `inline-block` | contents] = js.undefined
  var useCapture: js.UndefOr[Boolean] = js.undefined
  def onOutsideClick(e: SyntheticMouseEvent[HTMLElement]): Unit
}

object Props {
  @scala.inline
  def apply(
    children: TagMod[Any],
    onOutsideClick: SyntheticMouseEvent[HTMLElement] => Unit,
    disabled: js.UndefOr[Boolean] = js.undefined,
    display: block | flex | `inline` | `inline-block` | contents = null,
    useCapture: js.UndefOr[Boolean] = js.undefined
  ): Props = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], onOutsideClick = js.Any.fromFunction1(onOutsideClick))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (!js.isUndefined(useCapture)) __obj.updateDynamic("useCapture")(useCapture.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

