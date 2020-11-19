package typingsSlinky.officeJs.global.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Specifies whether the series are by rows or by columns. On Desktop, the "auto" option will inspect the source data shape to automatically guess whether the data is by rows or columns; in Excel on the web, "auto" will simply default to "columns".
  *
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.ChartSeriesBy")
@js.native
object ChartSeriesBy extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsSlinky.officeJs.Excel.ChartSeriesBy with String] = js.native
  
  /* "Auto" */ val auto: typingsSlinky.officeJs.Excel.ChartSeriesBy.auto with String = js.native
  
  /* "Columns" */ val columns: typingsSlinky.officeJs.Excel.ChartSeriesBy.columns with String = js.native
  
  /* "Rows" */ val rows: typingsSlinky.officeJs.Excel.ChartSeriesBy.rows with String = js.native
}
