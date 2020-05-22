package typingsSlinky.activexExcel.global.Excel

import typingsSlinky.activexExcel.Excel.Range
import typingsSlinky.activexExcel.Excel.XlAxisCrosses
import typingsSlinky.activexExcel.Excel.XlAxisGroup
import typingsSlinky.activexExcel.Excel.XlAxisType
import typingsSlinky.activexExcel.Excel.XlCategoryType
import typingsSlinky.activexExcel.Excel.XlCreator
import typingsSlinky.activexExcel.Excel.XlDisplayUnit
import typingsSlinky.activexExcel.Excel.XlScaleType
import typingsSlinky.activexExcel.Excel.XlTickLabelPosition
import typingsSlinky.activexExcel.Excel.XlTickMark
import typingsSlinky.activexExcel.Excel.XlTimeUnit
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Axis")
@js.native
class Axis protected ()
  extends typingsSlinky.activexExcel.Excel.Axis {
  /* CompleteClass */
  override val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  /* CompleteClass */
  override var AxisBetweenCategories: Boolean = js.native
  /* CompleteClass */
  override val AxisGroup: XlAxisGroup = js.native
  /* CompleteClass */
  override val AxisTitle: typingsSlinky.activexExcel.Excel.AxisTitle = js.native
  /* CompleteClass */
  override var BaseUnit: XlTimeUnit = js.native
  /* CompleteClass */
  override var BaseUnitIsAuto: Boolean = js.native
  /* CompleteClass */
  override val Border: typingsSlinky.activexExcel.Excel.Border = js.native
  /* CompleteClass */
  override var CategoryNames: SafeArray[String] | Range = js.native
  /* CompleteClass */
  override var CategoryType: XlCategoryType = js.native
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  /* CompleteClass */
  override var Crosses: XlAxisCrosses = js.native
  /* CompleteClass */
  override var CrossesAt: Double = js.native
  /* CompleteClass */
  override var DisplayUnit: XlDisplayUnit = js.native
  /* CompleteClass */
  override var DisplayUnitCustom: Double = js.native
  /* CompleteClass */
  override val DisplayUnitLabel: typingsSlinky.activexExcel.Excel.DisplayUnitLabel = js.native
  /* CompleteClass */
  @JSName("Excel.Axis_typekey")
  override var ExcelDotAxis_typekey: typingsSlinky.activexExcel.Excel.Axis = js.native
  /* CompleteClass */
  override val Format: typingsSlinky.activexExcel.Excel.ChartFormat = js.native
  /* CompleteClass */
  override var HasDisplayUnitLabel: Boolean = js.native
  /* CompleteClass */
  override var HasMajorGridlines: Boolean = js.native
  /* CompleteClass */
  override var HasMinorGridlines: Boolean = js.native
  /* CompleteClass */
  override var HasTitle: Boolean = js.native
  /* CompleteClass */
  override val Height: Double = js.native
  /* CompleteClass */
  override val Left: Double = js.native
  /* CompleteClass */
  override var LogBase: Double = js.native
  /* CompleteClass */
  override val MajorGridlines: typingsSlinky.activexExcel.Excel.Gridlines = js.native
  /* CompleteClass */
  override var MajorTickMark: XlTickMark = js.native
  /* CompleteClass */
  override var MajorUnit: Double = js.native
  /* CompleteClass */
  override var MajorUnitIsAuto: Boolean = js.native
  /* CompleteClass */
  override var MajorUnitScale: XlTimeUnit = js.native
  /* CompleteClass */
  override var MaximumScale: Double = js.native
  /* CompleteClass */
  override var MaximumScaleIsAuto: Boolean = js.native
  /* CompleteClass */
  override var MinimumScale: Double = js.native
  /* CompleteClass */
  override var MinimumScaleIsAuto: Boolean = js.native
  /* CompleteClass */
  override val MinorGridlines: typingsSlinky.activexExcel.Excel.Gridlines = js.native
  /* CompleteClass */
  override var MinorTickMark: XlTickMark = js.native
  /* CompleteClass */
  override var MinorUnit: Double = js.native
  /* CompleteClass */
  override var MinorUnitIsAuto: Boolean = js.native
  /* CompleteClass */
  override var MinorUnitScale: XlTimeUnit = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var ReversePlotOrder: Boolean = js.native
  /* CompleteClass */
  override var ScaleType: XlScaleType = js.native
  /* CompleteClass */
  override var TickLabelPosition: XlTickLabelPosition = js.native
  /* CompleteClass */
  override var TickLabelSpacing: Double = js.native
  /* CompleteClass */
  override var TickLabelSpacingIsAuto: Boolean = js.native
  /* CompleteClass */
  override val TickLabels: typingsSlinky.activexExcel.Excel.TickLabels = js.native
  /* CompleteClass */
  override var TickMarkSpacing: Double = js.native
  /* CompleteClass */
  override val Top: Double = js.native
  /* CompleteClass */
  override var Type: XlAxisType = js.native
  /* CompleteClass */
  override val Width: Double = js.native
  /* CompleteClass */
  override def Delete(): js.Any = js.native
  /* CompleteClass */
  override def Select(): js.Any = js.native
}

