package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotLine extends js.Object {
  
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  
  val Creator: XlCreator = js.native
  
  @JSName("Excel.PivotLine_typekey")
  var ExcelDotPivotLine_typekey: PivotLine = js.native
  
  val LineType: XlPivotLineType = js.native
  
  val Parent: js.Any = js.native
  
  def PivotLineCells(Index: Double): PivotCell = js.native
  @JSName("PivotLineCells")
  val PivotLineCells_Original: PivotLineCells = js.native
  
  val Position: Double = js.native
}
