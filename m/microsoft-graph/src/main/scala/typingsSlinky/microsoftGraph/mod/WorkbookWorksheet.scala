package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChartsVarargs(value: WorkbookChart*): Self = this.set("charts", js.Array(value :_*))
    
    @scala.inline
    def setCharts(value: js.Array[WorkbookChart]): Self = this.set("charts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCharts: Self = this.set("charts", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNamesVarargs(value: WorkbookNamedItem*): Self = this.set("names", js.Array(value :_*))
    
    @scala.inline
    def setNames(value: js.Array[WorkbookNamedItem]): Self = this.set("names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNames: Self = this.set("names", js.undefined)
    
    @scala.inline
    def setPivotTablesVarargs(value: WorkbookPivotTable*): Self = this.set("pivotTables", js.Array(value :_*))
    
    @scala.inline
    def setPivotTables(value: js.Array[WorkbookPivotTable]): Self = this.set("pivotTables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePivotTables: Self = this.set("pivotTables", js.undefined)
    
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setProtection(value: WorkbookWorksheetProtection): Self = this.set("protection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtection: Self = this.set("protection", js.undefined)
    
    @scala.inline
    def setTablesVarargs(value: WorkbookTable*): Self = this.set("tables", js.Array(value :_*))
    
    @scala.inline
    def setTables(value: js.Array[WorkbookTable]): Self = this.set("tables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTables: Self = this.set("tables", js.undefined)
    
    @scala.inline
    def setVisibility(value: String): Self = this.set("visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
  }
}
