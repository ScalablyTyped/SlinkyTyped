package typingsSlinky.antd

import typingsSlinky.antd.esCheckboxGroupMod.CheckboxOptionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelValue extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var value: js.Array[String | Double | Boolean]
  def cancelValue(value: String): Unit
  def registerValue(value: String): Unit
  def toggleOption(option: CheckboxOptionType): Unit
}

object Anon_CancelValue {
  @scala.inline
  def apply(
    cancelValue: String => Unit,
    registerValue: String => Unit,
    toggleOption: CheckboxOptionType => Unit,
    value: js.Array[String | Double | Boolean],
    disabled: js.UndefOr[Boolean] = js.undefined,
    name: String = null
  ): Anon_CancelValue = {
    val __obj = js.Dynamic.literal(cancelValue = js.Any.fromFunction1(cancelValue), registerValue = js.Any.fromFunction1(registerValue), toggleOption = js.Any.fromFunction1(toggleOption), value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CancelValue]
  }
}

