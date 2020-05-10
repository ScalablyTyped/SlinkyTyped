package typingsSlinky.officeJsPreview.Excel.Interfaces

import typingsSlinky.officeJsPreview.Excel.Subtotals
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the PivotField object, for use in `pivotField.set({ ... })`. */
@js.native
trait PivotFieldUpdateData extends js.Object {
  /**
    *
    * Name of the PivotField.
    *
    * [Api set: ExcelApi 1.8]
    */
  var name: js.UndefOr[String] = js.native
  /**
    *
    * Determines whether to show all items of the PivotField.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showAllItems: js.UndefOr[Boolean] = js.native
  /**
    *
    * Subtotals of the PivotField.
    *
    * [Api set: ExcelApi 1.8]
    */
  var subtotals: js.UndefOr[Subtotals] = js.native
}

object PivotFieldUpdateData {
  @scala.inline
  def apply(): PivotFieldUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotFieldUpdateData]
  }
  @scala.inline
  implicit class PivotFieldUpdateDataOps[Self <: PivotFieldUpdateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withShowAllItems(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAllItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowAllItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAllItems")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtotals(value: Subtotals): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtotals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtotals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtotals")(js.undefined)
        ret
    }
  }
  
}

