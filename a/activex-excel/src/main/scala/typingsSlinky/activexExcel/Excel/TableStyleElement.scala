package typingsSlinky.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableStyleElement extends StObject {
  
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  
  def Borders(Index: XlBordersIndex): Border = js.native
  @JSName("Borders")
  val Borders_Original: Borders = js.native
  
  def Clear(): Unit = js.native
  
  val Creator: XlCreator = js.native
  
  @JSName("Excel.TableStyleElement_typekey")
  var ExcelDotTableStyleElement_typekey: TableStyleElement = js.native
  
  val Font: typingsSlinky.activexExcel.Excel.Font = js.native
  
  val HasFormat: Boolean = js.native
  
  val Interior: typingsSlinky.activexExcel.Excel.Interior = js.native
  
  val Parent: js.Any = js.native
  
  var StripeSize: Double = js.native
}
