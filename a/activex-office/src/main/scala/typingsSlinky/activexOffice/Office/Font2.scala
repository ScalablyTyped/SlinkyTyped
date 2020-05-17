package typingsSlinky.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Font2 extends js.Object {
  var Allcaps: MsoTriState = js.native
  val Application: js.Any = js.native
  var AutorotateNumbers: MsoTriState = js.native
  var BaselineOffset: Double = js.native
  var Bold: MsoTriState = js.native
  var Caps: MsoTextCaps = js.native
  val Creator: Double = js.native
  var DoubleStrikeThrough: MsoTriState = js.native
  val Embeddable: MsoTriState = js.native
  val Embedded: MsoTriState = js.native
  var Equalize: MsoTriState = js.native
  val Fill: FillFormat = js.native
  val Glow: GlowFormat = js.native
  val Highlight: ColorFormat = js.native
  var Italic: MsoTriState = js.native
  var Kerning: Double = js.native
  val Line: LineFormat = js.native
  var Name: String = js.native
  var NameAscii: String = js.native
  var NameComplexScript: String = js.native
  var NameFarEast: String = js.native
  var NameOther: String = js.native
  @JSName("Office.Font2_typekey")
  var OfficeDotFont2_typekey: Font2 = js.native
  val Parent: js.Any = js.native
  val Reflection: ReflectionFormat = js.native
  val Shadow: ShadowFormat = js.native
  var Size: Double = js.native
  var Smallcaps: MsoTriState = js.native
  var SoftEdgeFormat: MsoSoftEdgeType = js.native
  var Spacing: Double = js.native
  var Strike: MsoTextStrike = js.native
  var StrikeThrough: MsoTriState = js.native
  var Subscript: MsoTriState = js.native
  var Superscript: MsoTriState = js.native
  val UnderlineColor: ColorFormat = js.native
  var UnderlineStyle: MsoTextUnderlineType = js.native
  var WordArtformat: MsoPresetTextEffect = js.native
}

object Font2 {
  @scala.inline
  def apply(
    Allcaps: MsoTriState,
    Application: js.Any,
    AutorotateNumbers: MsoTriState,
    BaselineOffset: Double,
    Bold: MsoTriState,
    Caps: MsoTextCaps,
    Creator: Double,
    DoubleStrikeThrough: MsoTriState,
    Embeddable: MsoTriState,
    Embedded: MsoTriState,
    Equalize: MsoTriState,
    Fill: FillFormat,
    Glow: GlowFormat,
    Highlight: ColorFormat,
    Italic: MsoTriState,
    Kerning: Double,
    Line: LineFormat,
    Name: String,
    NameAscii: String,
    NameComplexScript: String,
    NameFarEast: String,
    NameOther: String,
    OfficeDotFont2_typekey: Font2,
    Parent: js.Any,
    Reflection: ReflectionFormat,
    Shadow: ShadowFormat,
    Size: Double,
    Smallcaps: MsoTriState,
    SoftEdgeFormat: MsoSoftEdgeType,
    Spacing: Double,
    Strike: MsoTextStrike,
    StrikeThrough: MsoTriState,
    Subscript: MsoTriState,
    Superscript: MsoTriState,
    UnderlineColor: ColorFormat,
    UnderlineStyle: MsoTextUnderlineType,
    WordArtformat: MsoPresetTextEffect
  ): Font2 = {
    val __obj = js.Dynamic.literal(Allcaps = Allcaps.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], AutorotateNumbers = AutorotateNumbers.asInstanceOf[js.Any], BaselineOffset = BaselineOffset.asInstanceOf[js.Any], Bold = Bold.asInstanceOf[js.Any], Caps = Caps.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DoubleStrikeThrough = DoubleStrikeThrough.asInstanceOf[js.Any], Embeddable = Embeddable.asInstanceOf[js.Any], Embedded = Embedded.asInstanceOf[js.Any], Equalize = Equalize.asInstanceOf[js.Any], Fill = Fill.asInstanceOf[js.Any], Glow = Glow.asInstanceOf[js.Any], Highlight = Highlight.asInstanceOf[js.Any], Italic = Italic.asInstanceOf[js.Any], Kerning = Kerning.asInstanceOf[js.Any], Line = Line.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NameAscii = NameAscii.asInstanceOf[js.Any], NameComplexScript = NameComplexScript.asInstanceOf[js.Any], NameFarEast = NameFarEast.asInstanceOf[js.Any], NameOther = NameOther.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Reflection = Reflection.asInstanceOf[js.Any], Shadow = Shadow.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Smallcaps = Smallcaps.asInstanceOf[js.Any], SoftEdgeFormat = SoftEdgeFormat.asInstanceOf[js.Any], Spacing = Spacing.asInstanceOf[js.Any], Strike = Strike.asInstanceOf[js.Any], StrikeThrough = StrikeThrough.asInstanceOf[js.Any], Subscript = Subscript.asInstanceOf[js.Any], Superscript = Superscript.asInstanceOf[js.Any], UnderlineColor = UnderlineColor.asInstanceOf[js.Any], UnderlineStyle = UnderlineStyle.asInstanceOf[js.Any], WordArtformat = WordArtformat.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.Font2_typekey")(OfficeDotFont2_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Font2]
  }
  @scala.inline
  implicit class Font2Ops[Self <: Font2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllcaps(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Allcaps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplication(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutorotateNumbers(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutorotateNumbers")(value.asInstanceOf[js.Any])
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
    def withCaps(value: MsoTextCaps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Caps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDoubleStrikeThrough(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DoubleStrikeThrough")(value.asInstanceOf[js.Any])
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
    def withEqualize(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Equalize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFill(value: FillFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlow(value: GlowFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Glow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlight(value: ColorFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Highlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItalic(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Italic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKerning(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Kerning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLine(value: LineFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Line")(value.asInstanceOf[js.Any])
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
    def withOfficeDotFont2_typekey(value: Font2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Office.Font2_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReflection(value: ReflectionFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reflection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShadow(value: ShadowFormat): Self = {
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
    def withSmallcaps(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Smallcaps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSoftEdgeFormat(value: MsoSoftEdgeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SoftEdgeFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Spacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrike(value: MsoTextStrike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Strike")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrikeThrough(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StrikeThrough")(value.asInstanceOf[js.Any])
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
    def withUnderlineColor(value: ColorFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnderlineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnderlineStyle(value: MsoTextUnderlineType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnderlineStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordArtformat(value: MsoPresetTextEffect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WordArtformat")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

