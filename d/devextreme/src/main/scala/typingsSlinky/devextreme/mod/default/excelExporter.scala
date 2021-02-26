package typingsSlinky.devextreme.mod.default

import typingsSlinky.devextreme.mod.DevExpress.excelExporter.CellRange
import typingsSlinky.devextreme.mod.DevExpress.excelExporter.ExcelExportDataGridProps
import typingsSlinky.devextreme.mod.DevExpress.excelExporter.ExcelExportPivotGridProps
import typingsSlinky.devextreme.mod.global.JQueryPromise
import typingsSlinky.devextreme.mod.global.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object excelExporter {
  
  @JSImport("devextreme", "default.excelExporter.exportDataGrid")
  @js.native
  def exportDataGrid(options: ExcelExportDataGridProps): Promise[CellRange] with JQueryPromise[CellRange] = js.native
  
  @JSImport("devextreme", "default.excelExporter.exportPivotGrid")
  @js.native
  def exportPivotGrid(options: ExcelExportPivotGridProps): Promise[CellRange] with JQueryPromise[CellRange] = js.native
}
