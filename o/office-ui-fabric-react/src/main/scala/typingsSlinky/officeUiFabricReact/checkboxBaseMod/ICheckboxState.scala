package typingsSlinky.officeUiFabricReact.checkboxBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICheckboxState extends js.Object {
  /** Is true when Uncontrolled control is checked. */
  var isChecked: js.UndefOr[Boolean] = js.native
  var isIndeterminate: js.UndefOr[Boolean] = js.native
}

object ICheckboxState {
  @scala.inline
  def apply(): ICheckboxState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICheckboxState]
  }
  @scala.inline
  implicit class ICheckboxStateOps[Self <: ICheckboxState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsChecked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isChecked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsChecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isChecked")(js.undefined)
        ret
    }
    @scala.inline
    def withIsIndeterminate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIndeterminate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsIndeterminate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIndeterminate")(js.undefined)
        ret
    }
  }
  
}

