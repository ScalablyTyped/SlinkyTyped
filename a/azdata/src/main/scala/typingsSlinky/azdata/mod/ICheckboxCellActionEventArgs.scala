package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICheckboxCellActionEventArgs extends ICellActionEventArgs {
  var checked: Boolean = js.native
}

object ICheckboxCellActionEventArgs {
  @scala.inline
  def apply(checked: Boolean, column: Double, columnName: Double, row: Double): ICheckboxCellActionEventArgs = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], columnName = columnName.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICheckboxCellActionEventArgs]
  }
  @scala.inline
  implicit class ICheckboxCellActionEventArgsOps[Self <: ICheckboxCellActionEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChecked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

