package typingsSlinky.officeUiFabricReact.comboBoxBasicExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IComboBoxBasicExampleState extends js.Object {
  var dynamicErrorValue: Double | String = js.native
}

object IComboBoxBasicExampleState {
  @scala.inline
  def apply(dynamicErrorValue: Double | String): IComboBoxBasicExampleState = {
    val __obj = js.Dynamic.literal(dynamicErrorValue = dynamicErrorValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IComboBoxBasicExampleState]
  }
  @scala.inline
  implicit class IComboBoxBasicExampleStateOps[Self <: IComboBoxBasicExampleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDynamicErrorValue(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicErrorValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

