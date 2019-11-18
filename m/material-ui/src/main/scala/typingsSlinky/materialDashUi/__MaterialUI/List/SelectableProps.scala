package typingsSlinky.materialDashUi.__MaterialUI.List

import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectableProps extends js.Object {
  var onChange: js.UndefOr[js.Function2[/* e */ SyntheticEvent[Event, js.Object], /* value */ js.Any, Unit]] = js.undefined
  var selectedItemStyle: js.UndefOr[CSSProperties] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object SelectableProps {
  @scala.inline
  def apply(
    onChange: (/* e */ SyntheticEvent[Event, js.Object], /* value */ js.Any) => Unit = null,
    selectedItemStyle: CSSProperties = null,
    value: js.Any = null
  ): SelectableProps = {
    val __obj = js.Dynamic.literal()
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (selectedItemStyle != null) __obj.updateDynamic("selectedItemStyle")(selectedItemStyle.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectableProps]
  }
}

