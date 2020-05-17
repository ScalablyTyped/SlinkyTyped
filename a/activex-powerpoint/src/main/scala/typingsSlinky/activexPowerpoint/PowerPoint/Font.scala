package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Font extends js.Object {
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  var AutoRotateNumbers: MsoTriState = js.native
  var BaselineOffset: Double = js.native
  var Bold: MsoTriState = js.native
  val Color: ColorFormat = js.native
  val Embeddable: MsoTriState = js.native
  val Embedded: MsoTriState = js.native
  var Emboss: MsoTriState = js.native
  var Italic: MsoTriState = js.native
  var Name: String = js.native
  var NameAscii: String = js.native
  var NameComplexScript: String = js.native
  var NameFarEast: String = js.native
  var NameOther: String = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.Font_typekey")
  var PowerPointDotFont_typekey: Font = js.native
  var Shadow: MsoTriState = js.native
  var Size: Double = js.native
  var Subscript: MsoTriState = js.native
  var Superscript: MsoTriState = js.native
  var Underline: MsoTriState = js.native
}

object Font {
  @scala.inline
  def apply(
    Application: Application,
    AutoRotateNumbers: MsoTriState,
    BaselineOffset: Double,
    Bold: MsoTriState,
    Color: ColorFormat,
    Embeddable: MsoTriState,
    Embedded: MsoTriState,
    Emboss: MsoTriState,
    Italic: MsoTriState,
    Name: String,
    NameAscii: String,
    NameComplexScript: String,
    NameFarEast: String,
    NameOther: String,
    Parent: js.Any,
    PowerPointDotFont_typekey: Font,
    Shadow: MsoTriState,
    Size: Double,
    Subscript: MsoTriState,
    Superscript: MsoTriState,
    Underline: MsoTriState
  ): Font = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoRotateNumbers = AutoRotateNumbers.asInstanceOf[js.Any], BaselineOffset = BaselineOffset.asInstanceOf[js.Any], Bold = Bold.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], Embeddable = Embeddable.asInstanceOf[js.Any], Embedded = Embedded.asInstanceOf[js.Any], Emboss = Emboss.asInstanceOf[js.Any], Italic = Italic.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NameAscii = NameAscii.asInstanceOf[js.Any], NameComplexScript = NameComplexScript.asInstanceOf[js.Any], NameFarEast = NameFarEast.asInstanceOf[js.Any], NameOther = NameOther.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Shadow = Shadow.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Subscript = Subscript.asInstanceOf[js.Any], Superscript = Superscript.asInstanceOf[js.Any], Underline = Underline.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Font_typekey")(PowerPointDotFont_typekey.asInstanceOf[js.Any])
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
    def withAutoRotateNumbers(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoRotateNumbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaselineOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BaselineOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBold(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: ColorFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmbeddable(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Embeddable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmbedded(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Embedded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmboss(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Emboss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItalic(value: MsoTriState): Self = {
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
    def withNameAscii(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NameAscii")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNameComplexScript(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NameComplexScript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNameFarEast(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NameFarEast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNameOther(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NameOther")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerPointDotFont_typekey(value: Font): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.Font_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShadow(value: MsoTriState): Self = {
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
    def withSubscript(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subscript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuperscript(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Superscript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnderline(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Underline")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

