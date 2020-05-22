package typingsSlinky.rbx.navbarLinkMod

import org.scalajs.dom.raw.Element
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavbarLinkModifierProps extends js.Object {
  var arrowless: js.UndefOr[Boolean] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[Element]] = js.undefined
}

object NavbarLinkModifierProps {
  @scala.inline
  def apply(
    arrowless: js.UndefOr[Boolean] = js.undefined,
    onClick: SyntheticMouseEvent[Element] => Unit = null
  ): NavbarLinkModifierProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arrowless)) __obj.updateDynamic("arrowless")(arrowless.get.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    __obj.asInstanceOf[NavbarLinkModifierProps]
  }
}

