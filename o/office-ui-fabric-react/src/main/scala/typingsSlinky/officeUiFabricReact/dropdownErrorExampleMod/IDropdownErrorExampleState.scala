package typingsSlinky.officeUiFabricReact.dropdownErrorExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDropdownErrorExampleState extends js.Object {
  var showError: Boolean = js.native
}

object IDropdownErrorExampleState {
  @scala.inline
  def apply(showError: Boolean): IDropdownErrorExampleState = {
    val __obj = js.Dynamic.literal(showError = showError.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDropdownErrorExampleState]
  }
  @scala.inline
  implicit class IDropdownErrorExampleStateOps[Self <: IDropdownErrorExampleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShowError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showError")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

