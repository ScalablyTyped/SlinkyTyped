package typingsSlinky.activexWord.Word

import typingsSlinky.activexOffice.Office.MsoDiagramNodeType
import typingsSlinky.activexOffice.Office.MsoOrgChartLayoutType
import typingsSlinky.activexOffice.Office.MsoRelativeNodePosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagramNode extends StObject {
  
  /**
    * @param Office.MsoRelativeNodePosition [Pos=2]
    * @param Office.MsoDiagramNodeType [NodeType=1]
    */
  def AddNode(): DiagramNode = js.native
  def AddNode(Pos: js.UndefOr[scala.Nothing], NodeType: MsoDiagramNodeType): DiagramNode = js.native
  def AddNode(Pos: MsoRelativeNodePosition): DiagramNode = js.native
  def AddNode(Pos: MsoRelativeNodePosition, NodeType: MsoDiagramNodeType): DiagramNode = js.native
  
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  
  val Children: DiagramNodeChildren = js.native
  
  /**
    * @param Word.DiagramNode [TargetNode=0]
    * @param Office.MsoRelativeNodePosition [Pos=2]
    */
  def CloneNode(copyChildren: Boolean): DiagramNode = js.native
  def CloneNode(copyChildren: Boolean, TargetNode: js.UndefOr[scala.Nothing], Pos: MsoRelativeNodePosition): DiagramNode = js.native
  def CloneNode(copyChildren: Boolean, TargetNode: DiagramNode): DiagramNode = js.native
  def CloneNode(copyChildren: Boolean, TargetNode: DiagramNode, Pos: MsoRelativeNodePosition): DiagramNode = js.native
  
  val Creator: Double = js.native
  
  def Delete(): Unit = js.native
  
  val Diagram: typingsSlinky.activexWord.Word.Diagram = js.native
  
  var Layout: MsoOrgChartLayoutType = js.native
  
  def MoveNode(TargetNode: DiagramNode, Pos: MsoRelativeNodePosition): Unit = js.native
  
  def NextNode(): DiagramNode = js.native
  
  val Parent: js.Any = js.native
  
  def PrevNode(): DiagramNode = js.native
  
  def ReplaceNode(TargetNode: DiagramNode): Unit = js.native
  
  val Root: DiagramNode = js.native
  
  val Shape: typingsSlinky.activexWord.Word.Shape = js.native
  
  /** @param Office.MsoRelativeNodePosition [Pos=-1] */
  def SwapNode(TargetNode: DiagramNode): Unit = js.native
  def SwapNode(TargetNode: DiagramNode, Pos: MsoRelativeNodePosition): Unit = js.native
  
  val TextShape: typingsSlinky.activexWord.Word.Shape = js.native
  
  def TransferChildren(ReceivingNode: DiagramNode): Unit = js.native
  
  @JSName("Word.DiagramNode_typekey")
  var WordDotDiagramNode_typekey: DiagramNode = js.native
}
