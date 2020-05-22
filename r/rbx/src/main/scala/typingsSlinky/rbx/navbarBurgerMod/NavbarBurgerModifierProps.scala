package typingsSlinky.rbx.navbarBurgerMod

import org.scalajs.dom.raw.Element
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavbarBurgerModifierProps extends js.Object {
  var onClick: js.UndefOr[MouseEventHandler[Element]] = js.undefined
}

object NavbarBurgerModifierProps {
  @scala.inline
  def apply(onClick: SyntheticMouseEvent[Element] => Unit = null): NavbarBurgerModifierProps = {
    val __obj = js.Dynamic.literal()
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    __obj.asInstanceOf[NavbarBurgerModifierProps]
  }
}

