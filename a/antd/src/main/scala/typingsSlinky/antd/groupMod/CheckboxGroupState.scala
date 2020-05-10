package typingsSlinky.antd.groupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckboxGroupState extends js.Object {
  var registeredValues: js.Array[CheckboxValueType] = js.native
  var value: js.Array[CheckboxValueType] = js.native
}

object CheckboxGroupState {
  @scala.inline
  def apply(registeredValues: js.Array[CheckboxValueType], value: js.Array[CheckboxValueType]): CheckboxGroupState = {
    val __obj = js.Dynamic.literal(registeredValues = registeredValues.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxGroupState]
  }
  @scala.inline
  implicit class CheckboxGroupStateOps[Self <: CheckboxGroupState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegisteredValues(value: js.Array[CheckboxValueType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registeredValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Array[CheckboxValueType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

