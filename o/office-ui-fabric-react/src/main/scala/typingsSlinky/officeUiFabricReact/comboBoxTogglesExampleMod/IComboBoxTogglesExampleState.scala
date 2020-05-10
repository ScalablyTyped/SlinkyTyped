package typingsSlinky.officeUiFabricReact.comboBoxTogglesExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IComboBoxTogglesExampleState extends js.Object {
  var allowFreeform: Boolean = js.native
  var autoComplete: Boolean = js.native
}

object IComboBoxTogglesExampleState {
  @scala.inline
  def apply(allowFreeform: Boolean, autoComplete: Boolean): IComboBoxTogglesExampleState = {
    val __obj = js.Dynamic.literal(allowFreeform = allowFreeform.asInstanceOf[js.Any], autoComplete = autoComplete.asInstanceOf[js.Any])
    __obj.asInstanceOf[IComboBoxTogglesExampleState]
  }
  @scala.inline
  implicit class IComboBoxTogglesExampleStateOps[Self <: IComboBoxTogglesExampleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowFreeform(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFreeform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoComplete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoComplete")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

