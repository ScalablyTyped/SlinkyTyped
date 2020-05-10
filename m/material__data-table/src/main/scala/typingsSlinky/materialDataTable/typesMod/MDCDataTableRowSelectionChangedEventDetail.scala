package typingsSlinky.materialDataTable.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCDataTableRowSelectionChangedEventDetail extends js.Object {
  var rowId: String | Null = js.native
  var rowIndex: Double = js.native
  var selected: Boolean = js.native
}

object MDCDataTableRowSelectionChangedEventDetail {
  @scala.inline
  def apply(rowIndex: Double, selected: Boolean): MDCDataTableRowSelectionChangedEventDetail = {
    val __obj = js.Dynamic.literal(rowIndex = rowIndex.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[MDCDataTableRowSelectionChangedEventDetail]
  }
  @scala.inline
  implicit class MDCDataTableRowSelectionChangedEventDetailOps[Self <: MDCDataTableRowSelectionChangedEventDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRowIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowIdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowId")(null)
        ret
    }
  }
  
}

