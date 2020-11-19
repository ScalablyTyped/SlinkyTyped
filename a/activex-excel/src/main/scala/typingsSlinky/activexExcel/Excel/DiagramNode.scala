package typingsSlinky.activexExcel.Excel

import typingsSlinky.activexOffice.Office.IMsoDiagram
import typingsSlinky.activexOffice.Office.MsoDiagramNodeType
import typingsSlinky.activexOffice.Office.MsoOrgChartLayoutType
import typingsSlinky.activexOffice.Office.MsoRelativeNodePosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagramNode extends js.Object {
  
  /**
    * @param pos [pos=2]
    * @param nodeType [nodeType=1]
    */
  def AddNode(): DiagramNode = js.native
  def AddNode(pos: js.UndefOr[scala.Nothing], nodeType: MsoDiagramNodeType): DiagramNode = js.native
  def AddNode(pos: MsoRelativeNodePosition): DiagramNode = js.native
  def AddNode(pos: MsoRelativeNodePosition, nodeType: MsoDiagramNodeType): DiagramNode = js.native
  
  val Application: js.Any = js.native
  
  def Children(Index: js.Any): DiagramNode = js.native
  @JSName("Children")
  val Children_Original: DiagramNodeChildren = js.native
  
  /** @param pos [pos=2] */
  def CloneNode(copyChildren: Boolean, pTargetNode: DiagramNode): DiagramNode = js.native
  def CloneNode(copyChildren: Boolean, pTargetNode: DiagramNode, pos: MsoRelativeNodePosition): DiagramNode = js.native
  
  val Creator: Double = js.native
  
  def Delete(): Unit = js.native
  
  val Diagram: IMsoDiagram = js.native
  
  @JSName("Excel.DiagramNode_typekey")
  var ExcelDotDiagramNode_typekey: DiagramNode = js.native
  
  var Layout: MsoOrgChartLayoutType = js.native
  
  def MoveNode(pTargetNode: DiagramNode, pos: MsoRelativeNodePosition): Unit = js.native
  
  def NextNode(): DiagramNode = js.native
  
  val Parent: js.Any = js.native
  
  def PrevNode(): DiagramNode = js.native
  
  def ReplaceNode(pTargetNode: DiagramNode): Unit = js.native
  
  val Root: DiagramNode = js.native
  
  val Shape: typingsSlinky.activexExcel.Excel.Shape = js.native
  
  /** @param swapChildren [swapChildren=true] */
  def SwapNode(pTargetNode: DiagramNode): Unit = js.native
  def SwapNode(pTargetNode: DiagramNode, swapChildren: Boolean): Unit = js.native
  
  val TextShape: typingsSlinky.activexExcel.Excel.Shape = js.native
  
  def TransferChildren(pReceivingNode: DiagramNode): Unit = js.native
}
