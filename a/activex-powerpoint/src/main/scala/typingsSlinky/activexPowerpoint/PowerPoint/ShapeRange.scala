package typingsSlinky.activexPowerpoint.PowerPoint

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
import typingsSlinky.activexOffice.Office.SmartArtLayout
import typingsSlinky.activexOffice.Office.SoftEdgeFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShapeRange extends StObject {
  
  val ActionSettings: typingsSlinky.activexPowerpoint.PowerPoint.ActionSettings = js.native
  
  val Adjustments: typingsSlinky.activexPowerpoint.PowerPoint.Adjustments = js.native
  
  def Align(AlignCmd: MsoAlignCmd, RelativeTo: MsoTriState): Unit = js.native
  
  var AlternativeText: String = js.native
  
  val AnimationSettings: typingsSlinky.activexPowerpoint.PowerPoint.AnimationSettings = js.native
  
  val Application: js.Any = js.native
  
  def Apply(): Unit = js.native
  
  def ApplyAnimation(): Unit = js.native
  
  var AutoShapeType: MsoAutoShapeType = js.native
  
  var BackgroundStyle: MsoBackgroundStyleIndex = js.native
  
  var BlackWhiteMode: MsoBlackWhiteMode = js.native
  
  val Callout: CalloutFormat = js.native
  
  def CanvasCropBottom(Increment: Double): Unit = js.native
  
  def CanvasCropLeft(Increment: Double): Unit = js.native
  
  def CanvasCropRight(Increment: Double): Unit = js.native
  
  def CanvasCropTop(Increment: Double): Unit = js.native
  
  val CanvasItems: CanvasShapes = js.native
  
  val Chart: typingsSlinky.activexPowerpoint.PowerPoint.Chart = js.native
  
  val Child: MsoTriState = js.native
  
  val ConnectionSiteCount: Double = js.native
  
  val Connector: MsoTriState = js.native
  
  val ConnectorFormat: typingsSlinky.activexPowerpoint.PowerPoint.ConnectorFormat = js.native
  
  def ConvertTextToSmartArt(Layout: SmartArtLayout): Unit = js.native
  
  def Copy(): Unit = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  val CustomerData: typingsSlinky.activexPowerpoint.PowerPoint.CustomerData = js.native
  
  def Cut(): Unit = js.native
  
  def Delete(): Unit = js.native
  
  val Diagram: typingsSlinky.activexPowerpoint.PowerPoint.Diagram = js.native
  
  val DiagramNode: typingsSlinky.activexPowerpoint.PowerPoint.DiagramNode = js.native
  
  def Distribute(DistributeCmd: MsoDistributeCmd, RelativeTo: MsoTriState): Unit = js.native
  
  def Duplicate(): ShapeRange = js.native
  
  /**
    * @param number [ScaleWidth=0]
    * @param number [ScaleHeight=0]
    * @param PowerPoint.PpExportMode [ExportMode=1]
    */
  def Export(PathName: String, Filter: PpShapeFormat): Unit = js.native
  def Export(
    PathName: String,
    Filter: PpShapeFormat,
    ScaleWidth: js.UndefOr[scala.Nothing],
    ScaleHeight: js.UndefOr[scala.Nothing],
    ExportMode: PpExportMode
  ): Unit = js.native
  def Export(
    PathName: String,
    Filter: PpShapeFormat,
    ScaleWidth: js.UndefOr[scala.Nothing],
    ScaleHeight: Double
  ): Unit = js.native
  def Export(
    PathName: String,
    Filter: PpShapeFormat,
    ScaleWidth: js.UndefOr[scala.Nothing],
    ScaleHeight: Double,
    ExportMode: PpExportMode
  ): Unit = js.native
  def Export(PathName: String, Filter: PpShapeFormat, ScaleWidth: Double): Unit = js.native
  def Export(
    PathName: String,
    Filter: PpShapeFormat,
    ScaleWidth: Double,
    ScaleHeight: js.UndefOr[scala.Nothing],
    ExportMode: PpExportMode
  ): Unit = js.native
  def Export(PathName: String, Filter: PpShapeFormat, ScaleWidth: Double, ScaleHeight: Double): Unit = js.native
  def Export(
    PathName: String,
    Filter: PpShapeFormat,
    ScaleWidth: Double,
    ScaleHeight: Double,
    ExportMode: PpExportMode
  ): Unit = js.native
  
  val Fill: FillFormat = js.native
  
  def Flip(FlipCmd: MsoFlipCmd): Unit = js.native
  
  val Glow: GlowFormat = js.native
  
  def Group(): Shape = js.native
  
  val GroupItems: GroupShapes = js.native
  
  val HasChart: MsoTriState = js.native
  
  val HasDiagram: MsoTriState = js.native
  
  val HasDiagramNode: MsoTriState = js.native
  
  val HasSmartArt: MsoTriState = js.native
  
  val HasTable: MsoTriState = js.native
  
  val HasTextFrame: MsoTriState = js.native
  
  var Height: Double = js.native
  
  val HorizontalFlip: MsoTriState = js.native
  
  val Id: Double = js.native
  
  def IncrementLeft(Increment: Double): Unit = js.native
  
  def IncrementRotation(Increment: Double): Unit = js.native
  
  def IncrementTop(Increment: Double): Unit = js.native
  
  def Item(Index: js.Any): Shape = js.native
  
  var Left: Double = js.native
  
  val Line: LineFormat = js.native
  
  val LinkFormat: typingsSlinky.activexPowerpoint.PowerPoint.LinkFormat = js.native
  
  var LockAspectRatio: MsoTriState = js.native
  
  val MediaFormat: typingsSlinky.activexPowerpoint.PowerPoint.MediaFormat = js.native
  
  val MediaType: PpMediaType = js.native
  
  var Name: String = js.native
  
  val Nodes: ShapeNodes = js.native
  
  val OLEFormat: typingsSlinky.activexPowerpoint.PowerPoint.OLEFormat = js.native
  
  val Parent: js.Any = js.native
  
  val ParentGroup: Shape = js.native
  
  def PickUp(): Unit = js.native
  
  def PickupAnimation(): Unit = js.native
  
  val PictureFormat: typingsSlinky.activexPowerpoint.PowerPoint.PictureFormat = js.native
  
  val PlaceholderFormat: typingsSlinky.activexPowerpoint.PowerPoint.PlaceholderFormat = js.native
  
  @JSName("PowerPoint.ShapeRange_typekey")
  var PowerPointDotShapeRange_typekey: ShapeRange = js.native
  
  val RTF: String = js.native
  
  val Reflection: ReflectionFormat = js.native
  
  def Regroup(): Shape = js.native
  
  def RerouteConnections(): Unit = js.native
  
  var Rotation: Double = js.native
  
  /** @param Office.MsoScaleFrom [fScale=0] */
  def ScaleHeight(Factor: Double, RelativeToOriginalSize: MsoTriState): Unit = js.native
  def ScaleHeight(Factor: Double, RelativeToOriginalSize: MsoTriState, fScale: MsoScaleFrom): Unit = js.native
  
  /** @param Office.MsoScaleFrom [fScale=0] */
  def ScaleWidth(Factor: Double, RelativeToOriginalSize: MsoTriState): Unit = js.native
  def ScaleWidth(Factor: Double, RelativeToOriginalSize: MsoTriState, fScale: MsoScaleFrom): Unit = js.native
  
  val Script: typingsSlinky.activexOffice.Office.Script = js.native
  
  /** @param Office.MsoTriState [Replace=-1] */
  def Select(): Unit = js.native
  def Select(Replace: MsoTriState): Unit = js.native
  
  def SetShapesDefaultProperties(): Unit = js.native
  
  val Shadow: ShadowFormat = js.native
  
  var ShapeStyle: MsoShapeStyleIndex = js.native
  
  val SmartArt: typingsSlinky.activexOffice.Office.SmartArt = js.native
  
  val SoftEdge: SoftEdgeFormat = js.native
  
  val SoundFormat: typingsSlinky.activexPowerpoint.PowerPoint.SoundFormat = js.native
  
  val Table: typingsSlinky.activexPowerpoint.PowerPoint.Table = js.native
  
  val Tags: typingsSlinky.activexPowerpoint.PowerPoint.Tags = js.native
  
  val TextEffect: TextEffectFormat = js.native
  
  val TextFrame: typingsSlinky.activexPowerpoint.PowerPoint.TextFrame = js.native
  
  val TextFrame2: typingsSlinky.activexPowerpoint.PowerPoint.TextFrame2 = js.native
  
  val ThreeD: ThreeDFormat = js.native
  
  var Title: String = js.native
  
  var Top: Double = js.native
  
  val Type: MsoShapeType = js.native
  
  def Ungroup(): ShapeRange = js.native
  
  def UpgradeMedia(): Unit = js.native
  
  val VerticalFlip: MsoTriState = js.native
  
  val Vertices: js.Any = js.native
  
  var Visible: MsoTriState = js.native
  
  var Width: Double = js.native
  
  def ZOrder(ZOrderCmd: MsoZOrderCmd): Unit = js.native
  
  val ZOrderPosition: Double = js.native
}
