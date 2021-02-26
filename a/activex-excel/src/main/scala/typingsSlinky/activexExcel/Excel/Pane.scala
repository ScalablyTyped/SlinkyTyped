package typingsSlinky.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pane extends StObject {
  
  def Activate(): Boolean = js.native
  
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  
  val Creator: XlCreator = js.native
  
  @JSName("Excel.Pane_typekey")
  var ExcelDotPane_typekey: Pane = js.native
  
  val Index: Double = js.native
  
  def LargeScroll(): js.Any = js.native
  def LargeScroll(
    Down: js.UndefOr[scala.Nothing],
    Up: js.UndefOr[scala.Nothing],
    ToRight: js.UndefOr[scala.Nothing],
    ToLeft: Double
  ): js.Any = js.native
  def LargeScroll(Down: js.UndefOr[scala.Nothing], Up: js.UndefOr[scala.Nothing], ToRight: Double): js.Any = js.native
  def LargeScroll(Down: js.UndefOr[scala.Nothing], Up: js.UndefOr[scala.Nothing], ToRight: Double, ToLeft: Double): js.Any = js.native
  def LargeScroll(Down: js.UndefOr[scala.Nothing], Up: Double): js.Any = js.native
  def LargeScroll(Down: js.UndefOr[scala.Nothing], Up: Double, ToRight: js.UndefOr[scala.Nothing], ToLeft: Double): js.Any = js.native
  def LargeScroll(Down: js.UndefOr[scala.Nothing], Up: Double, ToRight: Double): js.Any = js.native
  def LargeScroll(Down: js.UndefOr[scala.Nothing], Up: Double, ToRight: Double, ToLeft: Double): js.Any = js.native
  def LargeScroll(Down: Double): js.Any = js.native
  def LargeScroll(Down: Double, Up: js.UndefOr[scala.Nothing], ToRight: js.UndefOr[scala.Nothing], ToLeft: Double): js.Any = js.native
  def LargeScroll(Down: Double, Up: js.UndefOr[scala.Nothing], ToRight: Double): js.Any = js.native
  def LargeScroll(Down: Double, Up: js.UndefOr[scala.Nothing], ToRight: Double, ToLeft: Double): js.Any = js.native
  def LargeScroll(Down: Double, Up: Double): js.Any = js.native
  def LargeScroll(Down: Double, Up: Double, ToRight: js.UndefOr[scala.Nothing], ToLeft: Double): js.Any = js.native
  def LargeScroll(Down: Double, Up: Double, ToRight: Double): js.Any = js.native
  def LargeScroll(Down: Double, Up: Double, ToRight: Double, ToLeft: Double): js.Any = js.native
  
  val Parent: js.Any = js.native
  
  def PointsToScreenPixelsX(Points: Double): Double = js.native
  
  def PointsToScreenPixelsY(Points: Double): Double = js.native
  
  var ScrollColumn: Double = js.native
  
  def ScrollIntoView(Left: Double, Top: Double, Width: Double, Height: Double): Unit = js.native
  def ScrollIntoView(Left: Double, Top: Double, Width: Double, Height: Double, Start: Boolean): Unit = js.native
  
  var ScrollRow: Double = js.native
  
  def SmallScroll(): js.Any = js.native
  def SmallScroll(
    Down: js.UndefOr[scala.Nothing],
    Up: js.UndefOr[scala.Nothing],
    ToRight: js.UndefOr[scala.Nothing],
    ToLeft: Double
  ): js.Any = js.native
  def SmallScroll(Down: js.UndefOr[scala.Nothing], Up: js.UndefOr[scala.Nothing], ToRight: Double): js.Any = js.native
  def SmallScroll(Down: js.UndefOr[scala.Nothing], Up: js.UndefOr[scala.Nothing], ToRight: Double, ToLeft: Double): js.Any = js.native
  def SmallScroll(Down: js.UndefOr[scala.Nothing], Up: Double): js.Any = js.native
  def SmallScroll(Down: js.UndefOr[scala.Nothing], Up: Double, ToRight: js.UndefOr[scala.Nothing], ToLeft: Double): js.Any = js.native
  def SmallScroll(Down: js.UndefOr[scala.Nothing], Up: Double, ToRight: Double): js.Any = js.native
  def SmallScroll(Down: js.UndefOr[scala.Nothing], Up: Double, ToRight: Double, ToLeft: Double): js.Any = js.native
  def SmallScroll(Down: Double): js.Any = js.native
  def SmallScroll(Down: Double, Up: js.UndefOr[scala.Nothing], ToRight: js.UndefOr[scala.Nothing], ToLeft: Double): js.Any = js.native
  def SmallScroll(Down: Double, Up: js.UndefOr[scala.Nothing], ToRight: Double): js.Any = js.native
  def SmallScroll(Down: Double, Up: js.UndefOr[scala.Nothing], ToRight: Double, ToLeft: Double): js.Any = js.native
  def SmallScroll(Down: Double, Up: Double): js.Any = js.native
  def SmallScroll(Down: Double, Up: Double, ToRight: js.UndefOr[scala.Nothing], ToLeft: Double): js.Any = js.native
  def SmallScroll(Down: Double, Up: Double, ToRight: Double): js.Any = js.native
  def SmallScroll(Down: Double, Up: Double, ToRight: Double, ToLeft: Double): js.Any = js.native
  
  def VisibleRange(Address: String): Range = js.native
  def VisibleRange(RowIndex: Double): Range = js.native
  def VisibleRange(RowIndex: Double, ColumnIndex: Double): Range = js.native
  @JSName("VisibleRange")
  val VisibleRange_Original: Range = js.native
}
