package typingsSlinky.officeJs.Excel.Interfaces

import typingsSlinky.officeJs.Excel.SortField
import typingsSlinky.officeJs.Excel.SortMethod
import typingsSlinky.officeJs.officeJsStrings.PinYin
import typingsSlinky.officeJs.officeJsStrings.StrokeCount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `tableSort.toJSON()`. */
@js.native
trait TableSortData extends js.Object {
  /**
    *
    * Represents the current conditions used to last sort the table. Read-only.
    *
    * [Api set: ExcelApi 1.2]
    */
  var fields: js.UndefOr[js.Array[SortField]] = js.native
  /**
    *
    * Represents whether the casing impacted the last sort of the table. Read-only.
    *
    * [Api set: ExcelApi 1.2]
    */
  var matchCase: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents Chinese character ordering method last used to sort the table. Read-only.
    *
    * [Api set: ExcelApi 1.2]
    */
  var method: js.UndefOr[SortMethod | PinYin | StrokeCount] = js.native
}

object TableSortData {
  @scala.inline
  def apply(): TableSortData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableSortData]
  }
  @scala.inline
  implicit class TableSortDataOps[Self <: TableSortData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFields(value: js.Array[SortField]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchCase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchCase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchCase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchCase")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: SortMethod | PinYin | StrokeCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
  }
  
}

