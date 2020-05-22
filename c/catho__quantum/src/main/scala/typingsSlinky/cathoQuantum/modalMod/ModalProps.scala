package typingsSlinky.cathoQuantum.modalMod

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import typingsSlinky.cathoQuantum.anon.BreakpointsColors
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalProps extends js.Object {
  var children: js.UndefOr[js.Array[TagMod[Any]] | TagMod[Any]] = js.undefined
  var closeButtonAriaLabel: js.UndefOr[String] = js.undefined
  var onClose: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
  var theme: js.UndefOr[BreakpointsColors] = js.undefined
}

object ModalProps {
  @scala.inline
  def apply(
    children: js.Array[TagMod[Any]] | TagMod[Any] = null,
    closeButtonAriaLabel: String = null,
    onClose: SyntheticMouseEvent[HTMLButtonElement] => Unit = null,
    theme: BreakpointsColors = null
  ): ModalProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (closeButtonAriaLabel != null) __obj.updateDynamic("closeButtonAriaLabel")(closeButtonAriaLabel.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalProps]
  }
}

