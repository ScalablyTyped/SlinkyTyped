package typingsSlinky.activexWord.Word

import typingsSlinky.activexOffice.Office.MsoChartElementType
import typingsSlinky.activexOffice.Office.XlChartType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Chart extends js.Object {
  
  val Application: js.Any = js.native
  
  def ApplyChartTemplate(FileName: String): Unit = js.native
  
  def ApplyCustomType(ChartType: XlChartType): Unit = js.native
  def ApplyCustomType(ChartType: XlChartType, TypeName: js.Any): Unit = js.native
  
  /** @param Word.XlDataLabelsType [Type=2] */
  def ApplyDataLabels(
    Type: js.UndefOr[XlDataLabelsType],
    LegendKey: js.UndefOr[js.Any],
    AutoText: js.UndefOr[js.Any],
    HasLeaderLines: js.UndefOr[js.Any],
    ShowSeriesName: js.UndefOr[js.Any],
    ShowCategoryName: js.UndefOr[js.Any],
    ShowValue: js.UndefOr[js.Any],
    ShowPercentage: js.UndefOr[js.Any],
    ShowBubbleSize: js.UndefOr[js.Any],
    Separator: js.UndefOr[js.Any]
  ): Unit = js.native
  
  def ApplyLayout(Layout: Double): Unit = js.native
  def ApplyLayout(Layout: Double, ChartType: js.Any): Unit = js.native
  
  val Area3DGroup: ChartGroup = js.native
  
  def AreaGroups(): js.Any = js.native
  def AreaGroups(Index: js.Any): js.Any = js.native
  
  def AutoFormat(Gallery: Double): Unit = js.native
  def AutoFormat(Gallery: Double, Format: js.Any): Unit = js.native
  
  var AutoScaling: Boolean = js.native
  
  /** @param Word.XlAxisGroup [AxisGroup=1] */
  def Axes(Type: js.Any): js.Any = js.native
  def Axes(Type: js.Any, AxisGroup: XlAxisGroup): js.Any = js.native
  
  val BackWall: typingsSlinky.activexWord.Word.Walls = js.native
  
  val Bar3DGroup: ChartGroup = js.native
  
  def BarGroups(): js.Any = js.native
  def BarGroups(Index: js.Any): js.Any = js.native
  
  var BarShape: XlBarShape = js.native
  
  val ChartArea: typingsSlinky.activexWord.Word.ChartArea = js.native
  
  val ChartData: typingsSlinky.activexWord.Word.ChartData = js.native
  
  def ChartGroups(): js.Any = js.native
  def ChartGroups(Index: js.Any): js.Any = js.native
  
  var ChartStyle: js.Any = js.native
  
  val ChartTitle: typingsSlinky.activexWord.Word.ChartTitle = js.native
  
  var ChartType: XlChartType = js.native
  
  def ChartWizard(
    Source: js.UndefOr[js.Any],
    Gallery: js.UndefOr[js.Any],
    Format: js.UndefOr[js.Any],
    PlotBy: js.UndefOr[js.Any],
    CategoryLabels: js.UndefOr[js.Any],
    SeriesLabels: js.UndefOr[js.Any],
    HasLegend: js.UndefOr[js.Any],
    Title: js.UndefOr[js.Any],
    CategoryTitle: js.UndefOr[js.Any],
    ValueTitle: js.UndefOr[js.Any],
    ExtraTitle: js.UndefOr[js.Any]
  ): Unit = js.native
  
  def ClearToMatchStyle(): Unit = js.native
  
  val Column3DGroup: ChartGroup = js.native
  
  def ColumnGroups(): js.Any = js.native
  def ColumnGroups(Index: js.Any): js.Any = js.native
  
  def Copy(): Unit = js.native
  def Copy(Before: js.UndefOr[scala.Nothing], After: js.Any): Unit = js.native
  def Copy(Before: js.Any): Unit = js.native
  def Copy(Before: js.Any, After: js.Any): Unit = js.native
  
  /**
    * @param Word.XlPictureAppearance [Appearance=1]
    * @param Word.XlCopyPictureFormat [Format=-4147]
    * @param Word.XlPictureAppearance [Size=2]
    */
  def CopyPicture(): Unit = js.native
  def CopyPicture(
    Appearance: js.UndefOr[scala.Nothing],
    Format: js.UndefOr[scala.Nothing],
    Size: XlPictureAppearance
  ): Unit = js.native
  def CopyPicture(Appearance: js.UndefOr[scala.Nothing], Format: XlCopyPictureFormat): Unit = js.native
  def CopyPicture(Appearance: js.UndefOr[scala.Nothing], Format: XlCopyPictureFormat, Size: XlPictureAppearance): Unit = js.native
  def CopyPicture(Appearance: XlPictureAppearance): Unit = js.native
  def CopyPicture(Appearance: XlPictureAppearance, Format: js.UndefOr[scala.Nothing], Size: XlPictureAppearance): Unit = js.native
  def CopyPicture(Appearance: XlPictureAppearance, Format: XlCopyPictureFormat): Unit = js.native
  def CopyPicture(Appearance: XlPictureAppearance, Format: XlCopyPictureFormat, Size: XlPictureAppearance): Unit = js.native
  
  val Corners: typingsSlinky.activexWord.Word.Corners = js.native
  
  val Creator: Double = js.native
  
  val DataTable: typingsSlinky.activexWord.Word.DataTable = js.native
  
  def Delete(): js.Any = js.native
  
  var DepthPercent: Double = js.native
  
  var DisplayBlanksAs: XlDisplayBlanksAs = js.native
  
  def DoughnutGroups(): js.Any = js.native
  def DoughnutGroups(Index: js.Any): js.Any = js.native
  
  var Elevation: Double = js.native
  
  def Export(FileName: String): Boolean = js.native
  def Export(FileName: String, FilterName: js.UndefOr[scala.Nothing], Interactive: js.Any): Boolean = js.native
  def Export(FileName: String, FilterName: js.Any): Boolean = js.native
  def Export(FileName: String, FilterName: js.Any, Interactive: js.Any): Boolean = js.native
  
  val Floor: typingsSlinky.activexWord.Word.Floor = js.native
  
  var GapDepth: Double = js.native
  
  def GetChartElement(x: Double, y: Double, ElementID: Double, Arg1: Double, Arg2: Double): Unit = js.native
  
  def HasAxis(): js.Any = js.native
  def HasAxis(Index1: js.UndefOr[scala.Nothing], Index2: js.Any): js.Any = js.native
  def HasAxis(Index1: js.Any): js.Any = js.native
  def HasAxis(Index1: js.Any, Index2: js.Any): js.Any = js.native
  
  var HasDataTable: Boolean = js.native
  
  var HasLegend: Boolean = js.native
  
  var HasPivotFields: Boolean = js.native
  
  var HasTitle: Boolean = js.native
  
  var HeightPercent: Double = js.native
  
  val Legend: typingsSlinky.activexWord.Word.Legend = js.native
  
  val Line3DGroup: ChartGroup = js.native
  
  def LineGroups(): js.Any = js.native
  def LineGroups(Index: js.Any): js.Any = js.native
  
  val Parent: js.Any = js.native
  
  def Paste(): Unit = js.native
  def Paste(Type: js.Any): Unit = js.native
  
  var Perspective: Double = js.native
  
  val Pie3DGroup: ChartGroup = js.native
  
  def PieGroups(): js.Any = js.native
  def PieGroups(Index: js.Any): js.Any = js.native
  
  val PivotLayout: js.Any = js.native
  
  val PlotArea: typingsSlinky.activexWord.Word.PlotArea = js.native
  
  var PlotBy: XlRowCol = js.native
  
  var PlotVisibleOnly: Boolean = js.native
  
  def RadarGroups(): js.Any = js.native
  def RadarGroups(Index: js.Any): js.Any = js.native
  
  def Refresh(): Unit = js.native
  
  var RightAngleAxes: js.Any = js.native
  
  var Rotation: js.Any = js.native
  
  def SaveChartTemplate(FileName: String): Unit = js.native
  
  def Select(): js.Any = js.native
  def Select(Replace: js.Any): js.Any = js.native
  
  def SeriesCollection(): js.Any = js.native
  def SeriesCollection(Index: js.Any): js.Any = js.native
  
  def SetBackgroundPicture(FileName: String): Unit = js.native
  
  def SetDefaultChart(Name: js.Any): Unit = js.native
  
  def SetElement(Element: MsoChartElementType): Unit = js.native
  
  def SetSourceData(Source: String): Unit = js.native
  def SetSourceData(Source: String, PlotBy: js.Any): Unit = js.native
  
  val Shapes: js.Any = js.native
  
  var ShowAllFieldButtons: Boolean = js.native
  
  var ShowAxisFieldButtons: Boolean = js.native
  
  var ShowDataLabelsOverMaximum: Boolean = js.native
  
  var ShowLegendFieldButtons: Boolean = js.native
  
  var ShowReportFilterFieldButtons: Boolean = js.native
  
  var ShowValueFieldButtons: Boolean = js.native
  
  val SideWall: typingsSlinky.activexWord.Word.Walls = js.native
  
  var SubType: Double = js.native
  
  val SurfaceGroup: ChartGroup = js.native
  
  var Type: Double = js.native
  
  val Walls: typingsSlinky.activexWord.Word.Walls = js.native
  
  @JSName("Word.Chart_typekey")
  var WordDotChart_typekey: Chart = js.native
  
  def XYGroups(): js.Any = js.native
  def XYGroups(Index: js.Any): js.Any = js.native
}
