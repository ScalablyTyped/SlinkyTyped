package typingsSlinky.cathoQuantum.tagMod

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.cathoQuantum.AnonColorsComponentsSpacing
import typingsSlinky.cathoQuantum.cathoQuantumStrings.error
import typingsSlinky.cathoQuantum.cathoQuantumStrings.large
import typingsSlinky.cathoQuantum.cathoQuantumStrings.medium
import typingsSlinky.cathoQuantum.cathoQuantumStrings.neutral
import typingsSlinky.cathoQuantum.cathoQuantumStrings.primary
import typingsSlinky.cathoQuantum.cathoQuantumStrings.small
import typingsSlinky.cathoQuantum.cathoQuantumStrings.success
import typingsSlinky.cathoQuantum.cathoQuantumStrings.warning
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagProps extends js.Object {
  var bold: js.UndefOr[Boolean] = js.undefined
  var inverted: js.UndefOr[Boolean] = js.undefined
  var onClose: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
  var size: js.UndefOr[small | medium | large] = js.undefined
  var skin: js.UndefOr[neutral | primary | success | warning | error] = js.undefined
  var stroked: js.UndefOr[Boolean] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var theme: js.UndefOr[AnonColorsComponentsSpacing] = js.undefined
}

object TagProps {
  @scala.inline
  def apply(
    bold: js.UndefOr[Boolean] = js.undefined,
    inverted: js.UndefOr[Boolean] = js.undefined,
    onClose: SyntheticMouseEvent[HTMLButtonElement] => Unit = null,
    size: small | medium | large = null,
    skin: neutral | primary | success | warning | error = null,
    stroked: js.UndefOr[Boolean] = js.undefined,
    text: String = null,
    theme: AnonColorsComponentsSpacing = null
  ): TagProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold.asInstanceOf[js.Any])
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (skin != null) __obj.updateDynamic("skin")(skin.asInstanceOf[js.Any])
    if (!js.isUndefined(stroked)) __obj.updateDynamic("stroked")(stroked.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagProps]
  }
}

