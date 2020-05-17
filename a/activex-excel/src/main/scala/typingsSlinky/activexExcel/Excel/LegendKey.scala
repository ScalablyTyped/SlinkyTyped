package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LegendKey extends js.Object {
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  val Border: typingsSlinky.activexExcel.Excel.Border = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.LegendKey_typekey")
  var ExcelDotLegendKey_typekey: LegendKey = js.native
  val Fill: ChartFillFormat = js.native
  val Format: ChartFormat = js.native
  val Height: Double = js.native
  val Interior: typingsSlinky.activexExcel.Excel.Interior = js.native
  var InvertIfNegative: Boolean = js.native
  val Left: Double = js.native
  var MarkerBackgroundColor: Double = js.native
  var MarkerBackgroundColorIndex: XlColorIndex = js.native
  var MarkerForegroundColor: Double = js.native
  var MarkerForegroundColorIndex: XlColorIndex = js.native
  var MarkerSize: Double = js.native
  var MarkerStyle: XlMarkerStyle = js.native
  val Parent: js.Any = js.native
  var PictureType: Double = js.native
  var PictureUnit: Double = js.native
  var PictureUnit2: Double = js.native
  var Shadow: Boolean = js.native
  var Smooth: Boolean = js.native
  val Top: Double = js.native
  val Width: Double = js.native
  def ClearFormats(): js.Any = js.native
  def Delete(): js.Any = js.native
  def Select(): js.Any = js.native
}

object LegendKey {
  @scala.inline
  def apply(
    Application: Application,
    Border: Border,
    ClearFormats: () => js.Any,
    Creator: XlCreator,
    Delete: () => js.Any,
    ExcelDotLegendKey_typekey: LegendKey,
    Fill: ChartFillFormat,
    Format: ChartFormat,
    Height: Double,
    Interior: Interior,
    InvertIfNegative: Boolean,
    Left: Double,
    MarkerBackgroundColor: Double,
    MarkerBackgroundColorIndex: XlColorIndex,
    MarkerForegroundColor: Double,
    MarkerForegroundColorIndex: XlColorIndex,
    MarkerSize: Double,
    MarkerStyle: XlMarkerStyle,
    Parent: js.Any,
    PictureType: Double,
    PictureUnit: Double,
    PictureUnit2: Double,
    Select: () => js.Any,
    Shadow: Boolean,
    Smooth: Boolean,
    Top: Double,
    Width: Double
  ): LegendKey = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], ClearFormats = js.Any.fromFunction0(ClearFormats), Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Fill = Fill.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Interior = Interior.asInstanceOf[js.Any], InvertIfNegative = InvertIfNegative.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], MarkerBackgroundColor = MarkerBackgroundColor.asInstanceOf[js.Any], MarkerBackgroundColorIndex = MarkerBackgroundColorIndex.asInstanceOf[js.Any], MarkerForegroundColor = MarkerForegroundColor.asInstanceOf[js.Any], MarkerForegroundColorIndex = MarkerForegroundColorIndex.asInstanceOf[js.Any], MarkerSize = MarkerSize.asInstanceOf[js.Any], MarkerStyle = MarkerStyle.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PictureType = PictureType.asInstanceOf[js.Any], PictureUnit = PictureUnit.asInstanceOf[js.Any], PictureUnit2 = PictureUnit2.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), Shadow = Shadow.asInstanceOf[js.Any], Smooth = Smooth.asInstanceOf[js.Any], Top = Top.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.LegendKey_typekey")(ExcelDotLegendKey_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendKey]
  }
  @scala.inline
  implicit class LegendKeyOps[Self <: LegendKey] (val x: Self) extends AnyVal {
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
    def withBorder(value: Border): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClearFormats(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClearFormats")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreator(value: XlCreator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExcelDotLegendKey_typekey(value: LegendKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Excel.LegendKey_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFill(value: ChartFillFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: ChartFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterior(value: Interior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Interior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvertIfNegative(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InvertIfNegative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarkerBackgroundColor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MarkerBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarkerBackgroundColorIndex(value: XlColorIndex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MarkerBackgroundColorIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarkerForegroundColor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MarkerForegroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarkerForegroundColorIndex(value: XlColorIndex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MarkerForegroundColorIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarkerSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MarkerSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarkerStyle(value: XlMarkerStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MarkerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPictureType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PictureType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPictureUnit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PictureUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPictureUnit2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PictureUnit2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelect(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Select")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShadow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Shadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmooth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Smooth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Top")(value.asInstanceOf[js.Any])
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

