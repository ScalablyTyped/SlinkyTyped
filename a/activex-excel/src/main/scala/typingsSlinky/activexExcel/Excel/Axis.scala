package typingsSlinky.activexExcel.Excel

import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Axis extends js.Object {
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  var AxisBetweenCategories: Boolean = js.native
  val AxisGroup: XlAxisGroup = js.native
  val AxisTitle: typingsSlinky.activexExcel.Excel.AxisTitle = js.native
  var BaseUnit: XlTimeUnit = js.native
  var BaseUnitIsAuto: Boolean = js.native
  val Border: typingsSlinky.activexExcel.Excel.Border = js.native
  var CategoryNames: SafeArray[String] | Range = js.native
  var CategoryType: XlCategoryType = js.native
  val Creator: XlCreator = js.native
  var Crosses: XlAxisCrosses = js.native
  var CrossesAt: Double = js.native
  var DisplayUnit: XlDisplayUnit = js.native
  var DisplayUnitCustom: Double = js.native
  val DisplayUnitLabel: typingsSlinky.activexExcel.Excel.DisplayUnitLabel = js.native
  @JSName("Excel.Axis_typekey")
  var ExcelDotAxis_typekey: Axis = js.native
  val Format: ChartFormat = js.native
  var HasDisplayUnitLabel: Boolean = js.native
  var HasMajorGridlines: Boolean = js.native
  var HasMinorGridlines: Boolean = js.native
  var HasTitle: Boolean = js.native
  val Height: Double = js.native
  val Left: Double = js.native
  var LogBase: Double = js.native
  val MajorGridlines: Gridlines = js.native
  var MajorTickMark: XlTickMark = js.native
  var MajorUnit: Double = js.native
  var MajorUnitIsAuto: Boolean = js.native
  var MajorUnitScale: XlTimeUnit = js.native
  var MaximumScale: Double = js.native
  var MaximumScaleIsAuto: Boolean = js.native
  var MinimumScale: Double = js.native
  var MinimumScaleIsAuto: Boolean = js.native
  val MinorGridlines: Gridlines = js.native
  var MinorTickMark: XlTickMark = js.native
  var MinorUnit: Double = js.native
  var MinorUnitIsAuto: Boolean = js.native
  var MinorUnitScale: XlTimeUnit = js.native
  val Parent: js.Any = js.native
  var ReversePlotOrder: Boolean = js.native
  var ScaleType: XlScaleType = js.native
  var TickLabelPosition: XlTickLabelPosition = js.native
  var TickLabelSpacing: Double = js.native
  var TickLabelSpacingIsAuto: Boolean = js.native
  val TickLabels: typingsSlinky.activexExcel.Excel.TickLabels = js.native
  var TickMarkSpacing: Double = js.native
  val Top: Double = js.native
  var Type: XlAxisType = js.native
  val Width: Double = js.native
  def Delete(): js.Any = js.native
  def Select(): js.Any = js.native
}

object Axis {
  @scala.inline
  def apply(
    Application: Application,
    AxisBetweenCategories: Boolean,
    AxisGroup: XlAxisGroup,
    AxisTitle: AxisTitle,
    BaseUnit: XlTimeUnit,
    BaseUnitIsAuto: Boolean,
    Border: Border,
    CategoryNames: SafeArray[String] | Range,
    CategoryType: XlCategoryType,
    Creator: XlCreator,
    Crosses: XlAxisCrosses,
    CrossesAt: Double,
    Delete: () => js.Any,
    DisplayUnit: XlDisplayUnit,
    DisplayUnitCustom: Double,
    DisplayUnitLabel: DisplayUnitLabel,
    ExcelDotAxis_typekey: Axis,
    Format: ChartFormat,
    HasDisplayUnitLabel: Boolean,
    HasMajorGridlines: Boolean,
    HasMinorGridlines: Boolean,
    HasTitle: Boolean,
    Height: Double,
    Left: Double,
    LogBase: Double,
    MajorGridlines: Gridlines,
    MajorTickMark: XlTickMark,
    MajorUnit: Double,
    MajorUnitIsAuto: Boolean,
    MajorUnitScale: XlTimeUnit,
    MaximumScale: Double,
    MaximumScaleIsAuto: Boolean,
    MinimumScale: Double,
    MinimumScaleIsAuto: Boolean,
    MinorGridlines: Gridlines,
    MinorTickMark: XlTickMark,
    MinorUnit: Double,
    MinorUnitIsAuto: Boolean,
    MinorUnitScale: XlTimeUnit,
    Parent: js.Any,
    ReversePlotOrder: Boolean,
    ScaleType: XlScaleType,
    Select: () => js.Any,
    TickLabelPosition: XlTickLabelPosition,
    TickLabelSpacing: Double,
    TickLabelSpacingIsAuto: Boolean,
    TickLabels: TickLabels,
    TickMarkSpacing: Double,
    Top: Double,
    Type: XlAxisType,
    Width: Double
  ): Axis = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AxisBetweenCategories = AxisBetweenCategories.asInstanceOf[js.Any], AxisGroup = AxisGroup.asInstanceOf[js.Any], AxisTitle = AxisTitle.asInstanceOf[js.Any], BaseUnit = BaseUnit.asInstanceOf[js.Any], BaseUnitIsAuto = BaseUnitIsAuto.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], CategoryNames = CategoryNames.asInstanceOf[js.Any], CategoryType = CategoryType.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Crosses = Crosses.asInstanceOf[js.Any], CrossesAt = CrossesAt.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), DisplayUnit = DisplayUnit.asInstanceOf[js.Any], DisplayUnitCustom = DisplayUnitCustom.asInstanceOf[js.Any], DisplayUnitLabel = DisplayUnitLabel.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], HasDisplayUnitLabel = HasDisplayUnitLabel.asInstanceOf[js.Any], HasMajorGridlines = HasMajorGridlines.asInstanceOf[js.Any], HasMinorGridlines = HasMinorGridlines.asInstanceOf[js.Any], HasTitle = HasTitle.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], LogBase = LogBase.asInstanceOf[js.Any], MajorGridlines = MajorGridlines.asInstanceOf[js.Any], MajorTickMark = MajorTickMark.asInstanceOf[js.Any], MajorUnit = MajorUnit.asInstanceOf[js.Any], MajorUnitIsAuto = MajorUnitIsAuto.asInstanceOf[js.Any], MajorUnitScale = MajorUnitScale.asInstanceOf[js.Any], MaximumScale = MaximumScale.asInstanceOf[js.Any], MaximumScaleIsAuto = MaximumScaleIsAuto.asInstanceOf[js.Any], MinimumScale = MinimumScale.asInstanceOf[js.Any], MinimumScaleIsAuto = MinimumScaleIsAuto.asInstanceOf[js.Any], MinorGridlines = MinorGridlines.asInstanceOf[js.Any], MinorTickMark = MinorTickMark.asInstanceOf[js.Any], MinorUnit = MinorUnit.asInstanceOf[js.Any], MinorUnitIsAuto = MinorUnitIsAuto.asInstanceOf[js.Any], MinorUnitScale = MinorUnitScale.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ReversePlotOrder = ReversePlotOrder.asInstanceOf[js.Any], ScaleType = ScaleType.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), TickLabelPosition = TickLabelPosition.asInstanceOf[js.Any], TickLabelSpacing = TickLabelSpacing.asInstanceOf[js.Any], TickLabelSpacingIsAuto = TickLabelSpacingIsAuto.asInstanceOf[js.Any], TickLabels = TickLabels.asInstanceOf[js.Any], TickMarkSpacing = TickMarkSpacing.asInstanceOf[js.Any], Top = Top.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Axis_typekey")(ExcelDotAxis_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Axis]
  }
  @scala.inline
  implicit class AxisOps[Self <: Axis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAxisBetweenCategories(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AxisBetweenCategories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAxisGroup(value: XlAxisGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AxisGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAxisTitle(value: AxisTitle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AxisTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseUnit(value: XlTimeUnit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BaseUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseUnitIsAuto(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BaseUnitIsAuto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorder(value: Border): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategoryNames(value: SafeArray[String] | Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CategoryNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategoryType(value: XlCategoryType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CategoryType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: XlCreator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCrosses(value: XlAxisCrosses): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Crosses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCrossesAt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CrossesAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDisplayUnit(value: XlDisplayUnit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayUnitCustom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayUnitCustom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayUnitLabel(value: DisplayUnitLabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayUnitLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcelDotAxis_typekey(value: Axis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Excel.Axis_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: ChartFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasDisplayUnitLabel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasDisplayUnitLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasMajorGridlines(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasMajorGridlines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasMinorGridlines(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasMinorGridlines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasTitle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogBase(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogBase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMajorGridlines(value: Gridlines): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MajorGridlines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMajorTickMark(value: XlTickMark): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MajorTickMark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMajorUnit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MajorUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMajorUnitIsAuto(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MajorUnitIsAuto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMajorUnitScale(value: XlTimeUnit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MajorUnitScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaximumScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaximumScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaximumScaleIsAuto(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaximumScaleIsAuto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinimumScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinimumScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinimumScaleIsAuto(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinimumScaleIsAuto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinorGridlines(value: Gridlines): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinorGridlines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinorTickMark(value: XlTickMark): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinorTickMark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinorUnit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinorUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinorUnitIsAuto(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinorUnitIsAuto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinorUnitScale(value: XlTimeUnit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinorUnitScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReversePlotOrder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReversePlotOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScaleType(value: XlScaleType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScaleType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelect(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Select")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTickLabelPosition(value: XlTickLabelPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TickLabelPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTickLabelSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TickLabelSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTickLabelSpacingIsAuto(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TickLabelSpacingIsAuto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTickLabels(value: TickLabels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TickLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTickMarkSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TickMarkSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: XlAxisType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

