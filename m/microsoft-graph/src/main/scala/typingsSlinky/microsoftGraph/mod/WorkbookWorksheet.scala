package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkbookWorksheet extends Entity {
  // Returns collection of charts that are part of the worksheet. Read-only.
  var charts: js.UndefOr[js.Array[WorkbookChart]] = js.native
  // The display name of the worksheet.
  var name: js.UndefOr[String] = js.native
  // Returns collection of names that are associated with the worksheet. Read-only.
  var names: js.UndefOr[js.Array[WorkbookNamedItem]] = js.native
  // Collection of PivotTables that are part of the worksheet.
  var pivotTables: js.UndefOr[js.Array[WorkbookPivotTable]] = js.native
  // The zero-based position of the worksheet within the workbook.
  var position: js.UndefOr[Double] = js.native
  // Returns sheet protection object for a worksheet. Read-only.
  var protection: js.UndefOr[WorkbookWorksheetProtection] = js.native
  // Collection of tables that are part of the worksheet. Read-only.
  var tables: js.UndefOr[js.Array[WorkbookTable]] = js.native
  // The Visibility of the worksheet. The possible values are: Visible, Hidden, VeryHidden.
  var visibility: js.UndefOr[String] = js.native
}

object WorkbookWorksheet {
  @scala.inline
  def apply(): WorkbookWorksheet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookWorksheet]
  }
  @scala.inline
  implicit class WorkbookWorksheetOps[Self <: WorkbookWorksheet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCharts(value: js.Array[WorkbookChart]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCharts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charts")(js.undefined)
        ret
    }
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
    def withNames(value: js.Array[WorkbookNamedItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("names")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("names")(js.undefined)
        ret
    }
    @scala.inline
    def withPivotTables(value: js.Array[WorkbookPivotTable]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotTables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPivotTables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotTables")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withProtection(value: WorkbookWorksheetProtection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protection")(js.undefined)
        ret
    }
    @scala.inline
    def withTables(value: js.Array[WorkbookTable]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tables")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibility(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(js.undefined)
        ret
    }
  }
  
}

