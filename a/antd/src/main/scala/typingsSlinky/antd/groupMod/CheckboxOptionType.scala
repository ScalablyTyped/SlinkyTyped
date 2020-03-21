package typingsSlinky.antd.groupMod

import slinky.core.TagMod
import typingsSlinky.antd.checkboxCheckboxMod.CheckboxChangeEvent
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxOptionType extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var label: TagMod[Any]
  var onChange: js.UndefOr[js.Function1[/* e */ CheckboxChangeEvent, Unit]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var value: CheckboxValueType
}

object CheckboxOptionType {
  @scala.inline
  def apply(
    label: TagMod[Any],
    value: CheckboxValueType,
    disabled: js.UndefOr[Boolean] = js.undefined,
    onChange: /* e */ CheckboxChangeEvent => Unit = null,
    style: CSSProperties = null
  ): CheckboxOptionType = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxOptionType]
  }
}

