package typingsSlinky.activexLibreoffice.com_.sun.star.style

import typingsSlinky.activexLibreoffice.com_.sun.star.awt.FontSlant
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This is a set of properties to describe the style of characters in complex texts. */
@js.native
trait CharacterPropertiesComplex extends js.Object {
  /** This property contains the text encoding of the font as specified in {@link com.sun.star.awt.CharSet} . */
  var CharFontCharSetComplex: Double = js.native
  /** This property contains font family as specified in {@link com.sun.star.awt.FontFamily} . */
  var CharFontFamilyComplex: Double = js.native
  /**
    * This property specifies the name of the font style.
    *
    * It may contain more than one name separated by comma.
    */
  var CharFontNameComplex: String = js.native
  /** This property contains the font pitch as specified in {@link com.sun.star.awt.FontPitch} . */
  var CharFontPitchComplex: Double = js.native
  /**
    * This property contains the name of the font style.
    *
    * This property may be empty.
    */
  var CharFontStyleNameComplex: String = js.native
  /** This value contains the height of the characters in point. */
  var CharHeightComplex: Double = js.native
  /** contains the value of the locale. */
  var CharLocaleComplex: Locale = js.native
  /**
    * This property contains the value of the posture of the document.
    * @see com.sun.star.awt.FontSlant
    */
  var CharPostureComplex: FontSlant = js.native
  /**
    * This property contains the value of the font weight.
    * @see com.sun.star.awt.FontWeight
    */
  var CharWeightComplex: Double = js.native
}

object CharacterPropertiesComplex {
  @scala.inline
  def apply(
    CharFontCharSetComplex: Double,
    CharFontFamilyComplex: Double,
    CharFontNameComplex: String,
    CharFontPitchComplex: Double,
    CharFontStyleNameComplex: String,
    CharHeightComplex: Double,
    CharLocaleComplex: Locale,
    CharPostureComplex: FontSlant,
    CharWeightComplex: Double
  ): CharacterPropertiesComplex = {
    val __obj = js.Dynamic.literal(CharFontCharSetComplex = CharFontCharSetComplex.asInstanceOf[js.Any], CharFontFamilyComplex = CharFontFamilyComplex.asInstanceOf[js.Any], CharFontNameComplex = CharFontNameComplex.asInstanceOf[js.Any], CharFontPitchComplex = CharFontPitchComplex.asInstanceOf[js.Any], CharFontStyleNameComplex = CharFontStyleNameComplex.asInstanceOf[js.Any], CharHeightComplex = CharHeightComplex.asInstanceOf[js.Any], CharLocaleComplex = CharLocaleComplex.asInstanceOf[js.Any], CharPostureComplex = CharPostureComplex.asInstanceOf[js.Any], CharWeightComplex = CharWeightComplex.asInstanceOf[js.Any])
    __obj.asInstanceOf[CharacterPropertiesComplex]
  }
  @scala.inline
  implicit class CharacterPropertiesComplexOps[Self <: CharacterPropertiesComplex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCharFontCharSetComplex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharFontCharSetComplex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharFontFamilyComplex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharFontFamilyComplex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharFontNameComplex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharFontNameComplex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharFontPitchComplex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharFontPitchComplex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharFontStyleNameComplex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharFontStyleNameComplex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharHeightComplex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharHeightComplex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharLocaleComplex(value: Locale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharLocaleComplex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharPostureComplex(value: FontSlant): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharPostureComplex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharWeightComplex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharWeightComplex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

