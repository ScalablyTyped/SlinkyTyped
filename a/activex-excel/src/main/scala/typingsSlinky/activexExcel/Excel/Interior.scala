package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Interior extends js.Object {
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  var Color: XlRgbColor | Double = js.native
  var ColorIndex: Double | XlColorIndex = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.Interior_typekey")
  var ExcelDotInterior_typekey: Interior = js.native
  val Gradient: js.Any = js.native
  var InvertIfNegative: Boolean = js.native
  val Parent: js.Any = js.native
  var Pattern: XlPattern = js.native
  var PatternColor: XlRgbColor | Double = js.native
  var PatternColorIndex: Double | XlColorIndex = js.native
  var PatternThemeColor: XlThemeColor = js.native
  var PatternTintAndShade: Double = js.native
  var ThemeColor: XlThemeColor = js.native
  var TintAndShade: Double = js.native
}

object Interior {
  @scala.inline
  def apply(
    Application: Application,
    Color: XlRgbColor | Double,
    ColorIndex: Double | XlColorIndex,
    Creator: XlCreator,
    ExcelDotInterior_typekey: Interior,
    Gradient: js.Any,
    InvertIfNegative: Boolean,
    Parent: js.Any,
    Pattern: XlPattern,
    PatternColor: XlRgbColor | Double,
    PatternColorIndex: Double | XlColorIndex,
    PatternThemeColor: XlThemeColor,
    PatternTintAndShade: Double,
    ThemeColor: XlThemeColor,
    TintAndShade: Double
  ): Interior = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ColorIndex = ColorIndex.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Gradient = Gradient.asInstanceOf[js.Any], InvertIfNegative = InvertIfNegative.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Pattern = Pattern.asInstanceOf[js.Any], PatternColor = PatternColor.asInstanceOf[js.Any], PatternColorIndex = PatternColorIndex.asInstanceOf[js.Any], PatternThemeColor = PatternThemeColor.asInstanceOf[js.Any], PatternTintAndShade = PatternTintAndShade.asInstanceOf[js.Any], ThemeColor = ThemeColor.asInstanceOf[js.Any], TintAndShade = TintAndShade.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Interior_typekey")(ExcelDotInterior_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interior]
  }
  @scala.inline
  implicit class InteriorOps[Self <: Interior] (val x: Self) extends AnyVal {
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
    def withColor(value: XlRgbColor | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorIndex(value: Double | XlColorIndex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColorIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: XlCreator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcelDotInterior_typekey(value: Interior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Excel.Interior_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGradient(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Gradient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvertIfNegative(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InvertIfNegative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPattern(value: XlPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPatternColor(value: XlRgbColor | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PatternColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPatternColorIndex(value: Double | XlColorIndex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PatternColorIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPatternThemeColor(value: XlThemeColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PatternThemeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPatternTintAndShade(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PatternTintAndShade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThemeColor(value: XlThemeColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThemeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTintAndShade(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TintAndShade")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

