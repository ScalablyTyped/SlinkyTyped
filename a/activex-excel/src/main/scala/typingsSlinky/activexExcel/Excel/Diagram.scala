package typingsSlinky.activexExcel.Excel

import typingsSlinky.activexOffice.Office.MsoDiagramType
import typingsSlinky.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Diagram extends js.Object {
  
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  
  var AutoFormat: MsoTriState = js.native
  
  var AutoLayout: MsoTriState = js.native
  
  def Convert(Type: MsoDiagramType): Unit = js.native
  
  val Creator: XlCreator = js.native
  
  @JSName("Excel.Diagram_typekey")
  var ExcelDotDiagram_typekey: Diagram = js.native
  
  def FitText(): Unit = js.native
  
  def Nodes(Index: js.Any): DiagramNode = js.native
  @JSName("Nodes")
  val Nodes_Original: DiagramNodes = js.native
  
  val Parent: js.Any = js.native
  
  var Reverse: MsoTriState = js.native
  
  val Type: MsoDiagramType = js.native
}
