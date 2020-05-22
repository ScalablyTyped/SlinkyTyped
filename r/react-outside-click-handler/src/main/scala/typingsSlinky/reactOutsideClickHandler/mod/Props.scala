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
    onOutsideClick: SyntheticMouseEvent[HTMLElement] => Unit,
    children: TagMod[Any] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    display: block | flex | `inline` | `inline-block` | contents = null,
    useCapture: js.UndefOr[Boolean] = js.undefined
  ): Props = {
    val __obj = js.Dynamic.literal(onOutsideClick = js.Any.fromFunction1(onOutsideClick))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (!js.isUndefined(useCapture)) __obj.updateDynamic("useCapture")(useCapture.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

