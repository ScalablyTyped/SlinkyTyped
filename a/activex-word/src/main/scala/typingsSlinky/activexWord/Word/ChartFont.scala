package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartFont extends js.Object {
  val Application: js.Any = js.native
  var Background: js.Any = js.native
  var Bold: js.Any = js.native
  var Color: js.Any = js.native
  var ColorIndex: js.Any = js.native
  val Creator: Double = js.native
  var FontStyle: js.Any = js.native
  var Italic: js.Any = js.native
  var Name: js.Any = js.native
  var OutlineFont: js.Any = js.native
  val Parent: js.Any = js.native
  var Shadow: js.Any = js.native
  var Size: js.Any = js.native
  var StrikeThrough: js.Any = js.native
  var Subscript: js.Any = js.native
  var Superscript: js.Any = js.native
  var Underline: js.Any = js.native
  @JSName("Word.ChartFont_typekey")
  var WordDotChartFont_typekey: ChartFont = js.native
}

object ChartFont {
  @scala.inline
  def apply(
    Application: js.Any,
    Background: js.Any,
    Bold: js.Any,
    Color: js.Any,
    ColorIndex: js.Any,
    Creator: Double,
    FontStyle: js.Any,
    Italic: js.Any,
    Name: js.Any,
    OutlineFont: js.Any,
    Parent: js.Any,
    Shadow: js.Any,
    Size: js.Any,
    StrikeThrough: js.Any,
    Subscript: js.Any,
    Superscript: js.Any,
    Underline: js.Any,
    WordDotChartFont_typekey: ChartFont
  ): ChartFont = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Background = Background.asInstanceOf[js.Any], Bold = Bold.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ColorIndex = ColorIndex.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], FontStyle = FontStyle.asInstanceOf[js.Any], Italic = Italic.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], OutlineFont = OutlineFont.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Shadow = Shadow.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], StrikeThrough = StrikeThrough.asInstanceOf[js.Any], Subscript = Subscript.asInstanceOf[js.Any], Superscript = Superscript.asInstanceOf[js.Any], Underline = Underline.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.ChartFont_typekey")(WordDotChartFont_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartFont]
  }
  @scala.inline
  implicit class ChartFontOps[Self <: ChartFont] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackground(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBold(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorIndex(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColorIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FontStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItalic(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Italic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: js.Any): Self = {
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
    def withSize(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrikeThrough(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StrikeThrough")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscript(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subscript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuperscript(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Superscript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnderline(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Underline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotChartFont_typekey(value: ChartFont): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.ChartFont_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

