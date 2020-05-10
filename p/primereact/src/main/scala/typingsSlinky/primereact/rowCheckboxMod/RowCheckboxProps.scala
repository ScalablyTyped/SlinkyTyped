package typingsSlinky.primereact.rowCheckboxMod

import typingsSlinky.primereact.AnonCheckedData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowCheckboxProps extends js.Object {
  var onClick: js.UndefOr[js.Function1[/* e */ AnonCheckedData, Unit]] = js.native
  var rowData: js.UndefOr[js.Object] = js.native
}

object RowCheckboxProps {
  @scala.inline
  def apply(): RowCheckboxProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowCheckboxProps]
  }
  @scala.inline
  implicit class RowCheckboxPropsOps[Self <: RowCheckboxProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnClick(value: /* e */ AnonCheckedData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withRowData(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowData")(js.undefined)
        ret
    }
  }
  
}

