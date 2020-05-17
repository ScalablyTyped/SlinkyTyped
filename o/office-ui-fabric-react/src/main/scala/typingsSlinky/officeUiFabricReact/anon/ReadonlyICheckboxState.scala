package typingsSlinky.officeUiFabricReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<office-ui-fabric-react.office-ui-fabric-react/lib/components/Checkbox/Checkbox.base.ICheckboxState> */
@js.native
trait ReadonlyICheckboxState extends js.Object {
  val isChecked: js.UndefOr[Boolean] = js.native
  val isIndeterminate: js.UndefOr[Boolean] = js.native
}

object ReadonlyICheckboxState {
  @scala.inline
  def apply(): ReadonlyICheckboxState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyICheckboxState]
  }
  @scala.inline
  implicit class ReadonlyICheckboxStateOps[Self <: ReadonlyICheckboxState] (val x: Self) extends AnyVal {
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

