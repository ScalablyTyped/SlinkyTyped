package typingsSlinky.activexExcel.Excel

import typingsSlinky.activexExcel.activexExcelStrings.Bold
import typingsSlinky.activexExcel.activexExcelStrings.Italic
import typingsSlinky.activexExcel.activexExcelStrings.Regular
import typingsSlinky.activexExcel.activexExcelStrings.`Bold Italic`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Font extends js.Object {
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  var Background: XlBackground = js.native
  var Bold: Boolean = js.native
  var Color: XlRgbColor | Double = js.native
  var ColorIndex: Double | XlColorIndex = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.Font_typekey")
  var ExcelDotFont_typekey: Font = js.native
  var FontStyle: Regular | Italic | Bold | (`Bold Italic`) = js.native
  var Italic: Boolean = js.native
  var Name: String = js.native
  var OutlineFont: js.Any = js.native
  val Parent: js.Any = js.native
  var Shadow: js.Any = js.native
  var Size: Double = js.native
  var Strikethrough: Boolean = js.native
  var Subscript: Boolean = js.native
  var Superscript: Boolean = js.native
  var ThemeColor: XlThemeColor = js.native
  var ThemeFont: XlThemeFont = js.native
  var TintAndShade: Double = js.native
  var Underline: XlUnderlineStyle = js.native
}

object Font {
  @scala.inline
  def apply(
    Application: Application,
    Background: XlBackground,
    Bold: Boolean,
    Color: XlRgbColor | Double,
    ColorIndex: Double | XlColorIndex,
    Creator: XlCreator,
    ExcelDotFont_typekey: Font,
    FontStyle: Regular | Italic | Bold | (`Bold Italic`),
    Italic: Boolean,
    Name: String,
    OutlineFont: js.Any,
    Parent: js.Any,
    Shadow: js.Any,
    Size: Double,
    Strikethrough: Boolean,
    Subscript: Boolean,
    Superscript: Boolean,
    ThemeColor: XlThemeColor,
    ThemeFont: XlThemeFont,
    TintAndShade: Double,
    Underline: XlUnderlineStyle
  ): Font = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Background = Background.asInstanceOf[js.Any], Bold = Bold.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ColorIndex = ColorIndex.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], FontStyle = FontStyle.asInstanceOf[js.Any], Italic = Italic.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], OutlineFont = OutlineFont.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Shadow = Shadow.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Strikethrough = Strikethrough.asInstanceOf[js.Any], Subscript = Subscript.asInstanceOf[js.Any], Superscript = Superscript.asInstanceOf[js.Any], ThemeColor = ThemeColor.asInstanceOf[js.Any], ThemeFont = ThemeFont.asInstanceOf[js.Any], TintAndShade = TintAndShade.asInstanceOf[js.Any], Underline = Underline.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Font_typekey")(ExcelDotFont_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Font]
  }
  @scala.inline
  implicit class FontOps[Self <: Font] (val x: Self) extends AnyVal {
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
    def withBackground(value: XlBackground): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBold(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bold")(value.asInstanceOf[js.Any])
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
    def withExcelDotFont_typekey(value: Font): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Excel.Font_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontStyle(value: Regular | Italic | Bold | (`Bold Italic`)): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FontStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItalic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Italic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutlineFont(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutlineFont")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShadow(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Shadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrikethrough(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Strikethrough")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscript(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subscript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuperscript(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Superscript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThemeColor(value: XlThemeColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThemeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThemeFont(value: XlThemeFont): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThemeFont")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTintAndShade(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TintAndShade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnderline(value: XlUnderlineStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Underline")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

