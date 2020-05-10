package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Workbook extends Entity {
  var application: js.UndefOr[WorkbookApplication] = js.native
  var comments: js.UndefOr[js.Array[WorkbookComment]] = js.native
  var functions: js.UndefOr[WorkbookFunctions] = js.native
  // Represents a collection of workbook scoped named items (named ranges and constants). Read-only.
  var names: js.UndefOr[js.Array[WorkbookNamedItem]] = js.native
  // Represents a collection of tables associated with the workbook. Read-only.
  var tables: js.UndefOr[js.Array[WorkbookTable]] = js.native
  // Represents a collection of worksheets associated with the workbook. Read-only.
  var worksheets: js.UndefOr[js.Array[WorkbookWorksheet]] = js.native
}

object Workbook {
  @scala.inline
  def apply(): Workbook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Workbook]
  }
  @scala.inline
  implicit class WorkbookOps[Self <: Workbook] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: WorkbookApplication): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplication: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application")(js.undefined)
        ret
    }
    @scala.inline
    def withComments(value: js.Array[WorkbookComment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(js.undefined)
        ret
    }
    @scala.inline
    def withFunctions(value: WorkbookFunctions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunctions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functions")(js.undefined)
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
    def withWorksheets(value: js.Array[WorkbookWorksheet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worksheets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorksheets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worksheets")(js.undefined)
        ret
    }
  }
  
}

