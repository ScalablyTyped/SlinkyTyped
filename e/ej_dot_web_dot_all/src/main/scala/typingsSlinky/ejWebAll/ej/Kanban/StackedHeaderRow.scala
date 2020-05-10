package typingsSlinky.ejWebAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackedHeaderRow extends js.Object {
  /** Gets or sets a value that indicates whether to add stacked header columns into the stacked header rows.
    * @Default {Array}
    */
  var stackedHeaderColumns: js.UndefOr[js.Array[StackedHeaderRowsStackedHeaderColumn]] = js.native
}

object StackedHeaderRow {
  @scala.inline
  def apply(): StackedHeaderRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackedHeaderRow]
  }
  @scala.inline
  implicit class StackedHeaderRowOps[Self <: StackedHeaderRow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStackedHeaderColumns(value: js.Array[StackedHeaderRowsStackedHeaderColumn]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackedHeaderColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackedHeaderColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackedHeaderColumns")(js.undefined)
        ret
    }
  }
  
}

