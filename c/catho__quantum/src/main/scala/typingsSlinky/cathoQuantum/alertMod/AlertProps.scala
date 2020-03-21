package typingsSlinky.cathoQuantum.alertMod

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import typingsSlinky.cathoQuantum.AnonColors
import typingsSlinky.cathoQuantum.cathoQuantumStrings.error
import typingsSlinky.cathoQuantum.cathoQuantumStrings.neutral
import typingsSlinky.cathoQuantum.cathoQuantumStrings.primary
import typingsSlinky.cathoQuantum.cathoQuantumStrings.success
import typingsSlinky.cathoQuantum.cathoQuantumStrings.warning
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertProps extends js.Object {
  var children: TagMod[Any]
  var icon: js.UndefOr[String] = js.undefined
  var onClose: MouseEventHandler[HTMLButtonElement]
  var skin: js.UndefOr[primary | success | error | neutral | warning] = js.undefined
  var theme: js.UndefOr[AnonColors] = js.undefined
}

object AlertProps {
  @scala.inline
  def apply(
    children: TagMod[Any],
    onClose: SyntheticMouseEvent[HTMLButtonElement] => Unit,
    icon: String = null,
    skin: primary | success | error | neutral | warning = null,
    theme: AnonColors = null
  ): AlertProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], onClose = js.Any.fromFunction1(onClose))
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (skin != null) __obj.updateDynamic("skin")(skin.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertProps]
  }
}

