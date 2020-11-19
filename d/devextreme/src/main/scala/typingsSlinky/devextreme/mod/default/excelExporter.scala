package typingsSlinky.devextreme.mod.default

import typingsSlinky.devextreme.mod.DevExpress.excelExporter.CellRange
import typingsSlinky.devextreme.mod.DevExpress.excelExporter.ExportDataGridProps
import typingsSlinky.devextreme.mod.global.JQueryPromise
import typingsSlinky.devextreme.mod.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("devextreme", "excelExporter")
@js.native
object excelExporter extends js.Object {
  
  def exportDataGrid(options: ExportDataGridProps): Promise[CellRange] with JQueryPromise[CellRange] = js.native
}
