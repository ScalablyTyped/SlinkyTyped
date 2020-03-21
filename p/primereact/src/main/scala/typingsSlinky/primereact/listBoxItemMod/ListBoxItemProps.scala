package typingsSlinky.primereact.listBoxItemMod

import slinky.core.facade.ReactElement
import typingsSlinky.primereact.AnonOptionOriginalEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBoxItemProps extends js.Object {
  var onClick: js.UndefOr[js.Function1[/* e */ AnonOptionOriginalEvent, Unit]] = js.undefined
  var onTouchEnd: js.UndefOr[js.Function1[/* e */ AnonOptionOriginalEvent, Unit]] = js.undefined
  var option: js.UndefOr[js.Any] = js.undefined
  var selected: js.UndefOr[Boolean] = js.undefined
  var template: js.UndefOr[js.Function1[/* item */ js.Any, js.UndefOr[ReactElement]]] = js.undefined
}

object ListBoxItemProps {
  @scala.inline
  def apply(
    onClick: /* e */ AnonOptionOriginalEvent => Unit = null,
    onTouchEnd: /* e */ AnonOptionOriginalEvent => Unit = null,
    option: js.Any = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    template: /* item */ js.Any => js.UndefOr[ReactElement] = null
  ): ListBoxItemProps = {
    val __obj = js.Dynamic.literal()
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (option != null) __obj.updateDynamic("option")(option.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(js.Any.fromFunction1(template))
    __obj.asInstanceOf[ListBoxItemProps]
  }
}

