package typingsSlinky.activexWord.Word

import typingsSlinky.activexOffice.Office.IMsoDiagram
import typingsSlinky.activexOffice.Office.MsoAlignCmd
import typingsSlinky.activexOffice.Office.MsoAutoShapeType
import typingsSlinky.activexOffice.Office.MsoBackgroundStyleIndex
import typingsSlinky.activexOffice.Office.MsoDistributeCmd
import typingsSlinky.activexOffice.Office.MsoFlipCmd
import typingsSlinky.activexOffice.Office.MsoScaleFrom
import typingsSlinky.activexOffice.Office.MsoShapeStyleIndex
import typingsSlinky.activexOffice.Office.MsoShapeType
import typingsSlinky.activexOffice.Office.MsoTriState
import typingsSlinky.activexOffice.Office.MsoZOrderCmd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShapeRange extends js.Object {
  
  def Activate(): Unit = js.native
  
  val Adjustments: typingsSlinky.activexWord.Word.Adjustments = js.native
  
  def Align(Align: MsoAlignCmd, RelativeTo: Double): Unit = js.native
  
  var AlternativeText: String = js.native
  
  val Anchor: Range = js.native
  
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  
  def Apply(): Unit = js.native
  
  var AutoShapeType: MsoAutoShapeType = js.native
  
  var BackgroundStyle: MsoBackgroundStyleIndex = js.native
  
  val Callout: CalloutFormat = js.native
  
  def CanvasCropBottom(Increment: Double): Unit = js.native
  
  def CanvasCropLeft(Increment: Double): Unit = js.native
  
  def CanvasCropRight(Increment: Double): Unit = js.native
  
  def CanvasCropTop(Increment: Double): Unit = js.native
  
  val CanvasItems: CanvasShapes = js.native
  
  val Child: MsoTriState = js.native
  
  val ConnectionSiteCount: Double = js.native
  
  val Connector: MsoTriState = js.native
  
  val ConnectorFormat: typingsSlinky.activexWord.Word.ConnectorFormat = js.native
  
  def ConvertToFrame(): Frame = js.native
  
  def ConvertToInlineShape(): InlineShape = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Delete(): Unit = js.native
  
  val Diagram: IMsoDiagram = js.native
  
  val DiagramNode: typingsSlinky.activexWord.Word.DiagramNode = js.native
  
  def Distribute(Distribute: MsoDistributeCmd, RelativeTo: Double): Unit = js.native
  
  def Duplicate(): ShapeRange = js.native
  
  val Fill: FillFormat = js.native
  
  def Flip(FlipCmd: MsoFlipCmd): Unit = js.native
  
  val Glow: GlowFormat = js.native
  
  def Group(): Shape = js.native
  
  val GroupItems: GroupShapes = js.native
  
  val HasDiagram: MsoTriState = js.native
  
  val HasDiagramNode: MsoTriState = js.native
  
  var Height: Double = js.native
  
  var HeightRelative: Double = js.native
  
  val HorizontalFlip: MsoTriState = js.native
  
  val Hyperlink: typingsSlinky.activexWord.Word.Hyperlink = js.native
  
  val ID: Double = js.native
  
  def IncrementLeft(Increment: Double): Unit = js.native
  
  def IncrementRotation(Increment: Double): Unit = js.native
  
  def IncrementTop(Increment: Double): Unit = js.native
  
  def Item(Index: js.Any): Shape = js.native
  
  var LayoutInCell: Double = js.native
  
  var Left: Double = js.native
  
  var LeftRelative: Double = js.native
  
  val Line: LineFormat = js.native
  
  var LockAnchor: Double = js.native
  
  var LockAspectRatio: MsoTriState = js.native
  
  var Name: String = js.native
  
  val Nodes: ShapeNodes = js.native
  
  val Parent: js.Any = js.native
  
  val ParentGroup: Shape = js.native
  
  def PickUp(): Unit = js.native
  
  val PictureFormat: typingsSlinky.activexWord.Word.PictureFormat = js.native
  
  val RTF: String = js.native
  
  val Reflection: ReflectionFormat = js.native
  
  def Regroup(): Shape = js.native
  
  var RelativeHorizontalPosition: WdRelativeHorizontalPosition = js.native
  
  var RelativeHorizontalSize: WdRelativeHorizontalSize = js.native
  
  var RelativeVerticalPosition: WdRelativeVerticalPosition = js.native
  
  var RelativeVerticalSize: WdRelativeVerticalSize = js.native
  
  def RerouteConnections(): Unit = js.native
  
  var Rotation: Double = js.native
  
  /** @param Office.MsoScaleFrom [Scale=0] */
  def ScaleHeight(Factor: Double, RelativeToOriginalSize: MsoTriState): Unit = js.native
  def ScaleHeight(Factor: Double, RelativeToOriginalSize: MsoTriState, Scale: MsoScaleFrom): Unit = js.native
  
  /** @param Office.MsoScaleFrom [Scale=0] */
  def ScaleWidth(Factor: Double, RelativeToOriginalSize: MsoTriState): Unit = js.native
  def ScaleWidth(Factor: Double, RelativeToOriginalSize: MsoTriState, Scale: MsoScaleFrom): Unit = js.native
  
  def Select(): Unit = js.native
  def Select(Replace: js.Any): Unit = js.native
  
  def SetShapesDefaultProperties(): Unit = js.native
  
  val Shadow: ShadowFormat = js.native
  
  var ShapeStyle: MsoShapeStyleIndex = js.native
  
  val SoftEdge: SoftEdgeFormat = js.native
  
  val TextEffect: TextEffectFormat = js.native
  
  val TextFrame: typingsSlinky.activexWord.Word.TextFrame = js.native
  
  val TextFrame2: typingsSlinky.activexOffice.Office.TextFrame2 = js.native
  
  val ThreeD: ThreeDFormat = js.native
  
  var Title: String = js.native
  
  var Top: Double = js.native
  
  var TopRelative: Double = js.native
  
  val Type: MsoShapeType = js.native
  
  def Ungroup(): ShapeRange = js.native
  
  val VerticalFlip: MsoTriState = js.native
  
  val Vertices: js.Any = js.native
  
  var Visible: MsoTriState = js.native
  
  var Width: Double = js.native
  
  var WidthRelative: Double = js.native
  
  @JSName("Word.ShapeRange_typekey")
  var WordDotShapeRange_typekey: ShapeRange = js.native
  
  val WrapFormat: typingsSlinky.activexWord.Word.WrapFormat = js.native
  
  def ZOrder(ZOrderCmd: MsoZOrderCmd): Unit = js.native
  
  val ZOrderPosition: Double = js.native
}
