package typingsSlinky.rbx.dropdownItemMod

import org.scalajs.dom.raw.Element
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownItemModifierProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[Element]] = js.undefined
}

object DropdownItemModifierProps {
  @scala.inline
  def apply(active: js.UndefOr[Boolean] = js.undefined, onClick: SyntheticMouseEvent[Element] => Unit = null): DropdownItemModifierProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    __obj.asInstanceOf[DropdownItemModifierProps]
  }
}

