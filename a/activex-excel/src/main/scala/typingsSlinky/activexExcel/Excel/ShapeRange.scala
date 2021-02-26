package typingsSlinky.activexExcel.Excel

import typingsSlinky.activexOffice.Office.CanvasShapes
import typingsSlinky.activexOffice.Office.GlowFormat
import typingsSlinky.activexOffice.Office.MsoAlignCmd
import typingsSlinky.activexOffice.Office.MsoAutoShapeType
import typingsSlinky.activexOffice.Office.MsoBackgroundStyleIndex
import typingsSlinky.activexOffice.Office.MsoBlackWhiteMode
import typingsSlinky.activexOffice.Office.MsoDistributeCmd
import typingsSlinky.activexOffice.Office.MsoFlipCmd
import typingsSlinky.activexOffice.Office.MsoScaleFrom
import typingsSlinky.activexOffice.Office.MsoShapeStyleIndex
import typingsSlinky.activexOffice.Office.MsoShapeType
import typingsSlinky.activexOffice.Office.MsoTriState
import typingsSlinky.activexOffice.Office.MsoZOrderCmd
import typingsSlinky.activexOffice.Office.ReflectionFormat
import typingsSlinky.activexOffice.Office.SoftEdgeFormat
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShapeRange extends StObject {
  
  def apply(Index: String): Shape = js.native
  def apply(Index: Double): Shape = js.native
  
  def Adjustments(Index: Double): Double = js.native
  @JSName("Adjustments")
  val Adjustments_Original: Adjustments = js.native
  
  def Align(AlignCmd: MsoAlignCmd, RelativeTo: MsoTriState): Unit = js.native
  
  var AlternativeText: String = js.native
  
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  
  def Apply(): Unit = js.native
  
  var AutoShapeType: MsoAutoShapeType = js.native
  
  var BackgroundStyle: MsoBackgroundStyleIndex = js.native
  
  var BlackWhiteMode: MsoBlackWhiteMode = js.native
  
  val Callout: CalloutFormat = js.native
  
  def CanvasCropBottom(Increment: Double): Unit = js.native
  
  def CanvasCropLeft(Increment: Double): Unit = js.native
  
  def CanvasCropRight(Increment: Double): Unit = js.native
  
  def CanvasCropTop(Increment: Double): Unit = js.native
  
  def CanvasItems(Index: String): typingsSlinky.activexOffice.Office.Shape = js.native
  def CanvasItems(Index: Double): typingsSlinky.activexOffice.Office.Shape = js.native
  @JSName("CanvasItems")
  val CanvasItems_Original: CanvasShapes = js.native
  
  val Chart: typingsSlinky.activexExcel.Excel.Chart = js.native
  
  val Child: MsoTriState = js.native
  
  val ConnectionSiteCount: Double = js.native
  
  val Connector: MsoTriState = js.native
  
  val ConnectorFormat: typingsSlinky.activexExcel.Excel.ConnectorFormat = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Delete(): Unit = js.native
  
  val Diagram: typingsSlinky.activexExcel.Excel.Diagram = js.native
  
  val DiagramNode: typingsSlinky.activexExcel.Excel.DiagramNode = js.native
  
  def Distribute(DistributeCmd: MsoDistributeCmd, RelativeTo: MsoTriState): Unit = js.native
  
  def Duplicate(): ShapeRange = js.native
  
  val Fill: FillFormat = js.native
  
  def Flip(FlipCmd: MsoFlipCmd): Unit = js.native
  
  val Glow: GlowFormat = js.native
  
  def Group(): Shape = js.native
  
  def GroupItems(Index: String): Shape = js.native
  def GroupItems(Index: Double): Shape = js.native
  @JSName("GroupItems")
  val GroupItems_Original: GroupShapes = js.native
  
  val HasChart: MsoTriState = js.native
  
  val HasDiagram: MsoTriState = js.native
  
  val HasDiagramNode: MsoTriState = js.native
  
  var Height: Double = js.native
  
  val HorizontalFlip: MsoTriState = js.native
  
  val ID: Double = js.native
  
  def IncrementLeft(Increment: Double): Unit = js.native
  
  def IncrementRotation(Increment: Double): Unit = js.native
  
  def IncrementTop(Increment: Double): Unit = js.native
  
  def Item(Index: String): Shape = js.native
  def Item(Index: Double): Shape = js.native
  
  var Left: Double = js.native
  
  val Line: LineFormat = js.native
  
  var LockAspectRatio: MsoTriState = js.native
  
  var Name: String = js.native
  
  def Nodes(Index: String): ShapeNode = js.native
  def Nodes(Index: Double): ShapeNode = js.native
  @JSName("Nodes")
  val Nodes_Original: ShapeNodes = js.native
  
  val Parent: js.Any = js.native
  
  val ParentGroup: Shape = js.native
  
  def PickUp(): Unit = js.native
  
  val PictureFormat: typingsSlinky.activexExcel.Excel.PictureFormat = js.native
  
  val Reflection: ReflectionFormat = js.native
  
  def Regroup(): Shape = js.native
  
  def RerouteConnections(): Unit = js.native
  
  var Rotation: Double = js.native
  
  def ScaleHeight(Factor: Double, RelativeToOriginalSize: MsoTriState): Unit = js.native
  def ScaleHeight(Factor: Double, RelativeToOriginalSize: MsoTriState, Scale: MsoScaleFrom): Unit = js.native
  
  def ScaleWidth(Factor: Double, RelativeToOriginalSize: MsoTriState): Unit = js.native
  def ScaleWidth(Factor: Double, RelativeToOriginalSize: MsoTriState, Scale: MsoScaleFrom): Unit = js.native
  
  def Select(): Unit = js.native
  def Select(Replace: Boolean): Unit = js.native
  
  def SetShapesDefaultProperties(): Unit = js.native
  
  val Shadow: ShadowFormat = js.native
  
  var ShapeStyle: MsoShapeStyleIndex = js.native
  
  val SoftEdge: SoftEdgeFormat = js.native
  
  val TextEffect: TextEffectFormat = js.native
  
  val TextFrame: typingsSlinky.activexExcel.Excel.TextFrame = js.native
  
  val TextFrame2: typingsSlinky.activexExcel.Excel.TextFrame2 = js.native
  
  val ThreeD: ThreeDFormat = js.native
  
  var Title: String = js.native
  
  var Top: Double = js.native
  
  val Type: MsoShapeType = js.native
  
  def Ungroup(): ShapeRange = js.native
  
  val VerticalFlip: MsoTriState = js.native
  
  val Vertices: SafeArray[Double] = js.native
  
  var Visible: MsoTriState = js.native
  
  var Width: Double = js.native
  
  def ZOrder(ZOrderCmd: MsoZOrderCmd): Unit = js.native
  
  val ZOrderPosition: Double = js.native
  
  def _Default(Index: js.Any): Shape = js.native
}
