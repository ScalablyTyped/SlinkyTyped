package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes the characteristics of a font.
  *
  * For example, this can be used to select a font.
  */
@js.native
trait FontDescriptor extends js.Object {
  /**
    * specifies the character set which is supported by the font.
    *
    * Use one value out of the constant group {@link com.sun.star.awt.CharSet} .
    */
  var CharSet: Double = js.native
  /**
    * specifies the character width.
    *
    * Depending on the specified width, a font that supports this width may be selected.
    *
    * The value is expressed as a percentage.
    */
  var CharacterWidth: Double = js.native
  /**
    * specifies the general style of the font.
    *
    * Use one value out of the constant group {@link com.sun.star.awt.FontFamily} .
    */
  var Family: Double = js.native
  /** specifies the height of the font in the measure of the destination. */
  var Height: Double = js.native
  /** For requesting, it specifies if there is a kerning table available. For selecting, it specifies if the kerning table is to be used. */
  var Kerning: Boolean = js.native
  /** specifies the exact name of the font. */
  var Name: String = js.native
  /**
    * specifies the rotation of the font.
    *
    * The unit of measure is degrees; 0 is the baseline.
    */
  var Orientation: Double = js.native
  /**
    * specifies the pitch of the font.
    *
    * Use one value out of the constant group {@link com.sun.star.awt.FontPitch} .
    */
  var Pitch: Double = js.native
  /** specifies the slant of the font. */
  var Slant: FontSlant = js.native
  /**
    * specifies the kind of strikeout.
    *
    * Use one value out of the constant group {@link com.sun.star.awt.FontStrikeout} .
    */
  var Strikeout: Double = js.native
  /** specifies the style name of the font. */
  var StyleName: String = js.native
  /**
    * specifies the technology of the font representation.
    *
    * One or more values out of the constant group {@link com.sun.star.awt.FontType} can be combined by an arithmetical or-operation.
    */
  var Type: Double = js.native
  /**
    * specifies the kind of underlining.
    *
    * Use one value out of the constant group {@link com.sun.star.awt.FontUnderline} .
    */
  var Underline: Double = js.native
  /**
    * specifies the thickness of the line.
    *
    * Depending on the specified weight, a font that supports this thickness may be selected.
    *
    * The value is expressed as a percentage.
    */
  var Weight: Double = js.native
  /** specifies the width of the font in the measure of the destination. */
  var Width: Double = js.native
  /**
    * specifies if only words get underlined.
    *
    * `TRUE` means that only non-space characters get underlined, `FALSE` means that the spacing also gets underlined.
    *
    * This property is only valid if the property {@link com.sun.star.awt.FontDescriptor.Underline} is not {@link FontUnderline.NONE} .
    */
  var WordLineMode: Boolean = js.native
}

object FontDescriptor {
  @scala.inline
  def apply(
    CharSet: Double,
    CharacterWidth: Double,
    Family: Double,
    Height: Double,
    Kerning: Boolean,
    Name: String,
    Orientation: Double,
    Pitch: Double,
    Slant: FontSlant,
    Strikeout: Double,
    StyleName: String,
    Type: Double,
    Underline: Double,
    Weight: Double,
    Width: Double,
    WordLineMode: Boolean
  ): FontDescriptor = {
    val __obj = js.Dynamic.literal(CharSet = CharSet.asInstanceOf[js.Any], CharacterWidth = CharacterWidth.asInstanceOf[js.Any], Family = Family.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Kerning = Kerning.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], Pitch = Pitch.asInstanceOf[js.Any], Slant = Slant.asInstanceOf[js.Any], Strikeout = Strikeout.asInstanceOf[js.Any], StyleName = StyleName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Underline = Underline.asInstanceOf[js.Any], Weight = Weight.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], WordLineMode = WordLineMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontDescriptor]
  }
  @scala.inline
  implicit class FontDescriptorOps[Self <: FontDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCharSet(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharacterWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharacterWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFamily(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Family")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKerning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Kerning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrientation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPitch(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pitch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlant(value: FontSlant): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Slant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrikeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Strikeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyleName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StyleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnderline(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Underline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Weight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordLineMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WordLineMode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

