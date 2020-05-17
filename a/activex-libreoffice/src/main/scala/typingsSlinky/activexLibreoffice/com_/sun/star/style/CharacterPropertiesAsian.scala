package typingsSlinky.activexLibreoffice.com_.sun.star.style

import typingsSlinky.activexLibreoffice.com_.sun.star.awt.FontSlant
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This is a set of properties to describe the style of characters in Asian texts. */
@js.native
trait CharacterPropertiesAsian extends js.Object {
  /** This property contains the text encoding of the font as specified in {@link com.sun.star.awt.CharSet} . */
  var CharFontCharSetAsian: Double = js.native
  /** This property contains font family as specified in {@link com.sun.star.awt.FontFamily} . */
  var CharFontFamilyAsian: Double = js.native
  /**
    * This property specifies the name of the font style.
    *
    * It may contain more than one name separated by comma.
    */
  var CharFontNameAsian: String = js.native
  /** This property contains the font pitch as specified in {@link com.sun.star.awt.FontPitch} . */
  var CharFontPitchAsian: Double = js.native
  /**
    * This property contains the name of the font style.
    *
    * This property may be empty.
    */
  var CharFontStyleNameAsian: String = js.native
  /** This value contains the height of the characters in point. */
  var CharHeightAsian: Double = js.native
  /** contains the value of the locale. */
  var CharLocaleAsian: Locale = js.native
  /**
    * This property contains the value of the posture of the document.
    * @see com.sun.star.awt.FontSlant
    */
  var CharPostureAsian: FontSlant = js.native
  /**
    * This property contains the value of the font weight.
    * @see com.sun.star.awt.FontWeight
    */
  var CharWeightAsian: Double = js.native
}

object CharacterPropertiesAsian {
  @scala.inline
  def apply(
    CharFontCharSetAsian: Double,
    CharFontFamilyAsian: Double,
    CharFontNameAsian: String,
    CharFontPitchAsian: Double,
    CharFontStyleNameAsian: String,
    CharHeightAsian: Double,
    CharLocaleAsian: Locale,
    CharPostureAsian: FontSlant,
    CharWeightAsian: Double
  ): CharacterPropertiesAsian = {
    val __obj = js.Dynamic.literal(CharFontCharSetAsian = CharFontCharSetAsian.asInstanceOf[js.Any], CharFontFamilyAsian = CharFontFamilyAsian.asInstanceOf[js.Any], CharFontNameAsian = CharFontNameAsian.asInstanceOf[js.Any], CharFontPitchAsian = CharFontPitchAsian.asInstanceOf[js.Any], CharFontStyleNameAsian = CharFontStyleNameAsian.asInstanceOf[js.Any], CharHeightAsian = CharHeightAsian.asInstanceOf[js.Any], CharLocaleAsian = CharLocaleAsian.asInstanceOf[js.Any], CharPostureAsian = CharPostureAsian.asInstanceOf[js.Any], CharWeightAsian = CharWeightAsian.asInstanceOf[js.Any])
    __obj.asInstanceOf[CharacterPropertiesAsian]
  }
  @scala.inline
  implicit class CharacterPropertiesAsianOps[Self <: CharacterPropertiesAsian] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCharFontCharSetAsian(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharFontCharSetAsian")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharFontFamilyAsian(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharFontFamilyAsian")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharFontNameAsian(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharFontNameAsian")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharFontPitchAsian(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharFontPitchAsian")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharFontStyleNameAsian(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharFontStyleNameAsian")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharHeightAsian(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharHeightAsian")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharLocaleAsian(value: Locale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharLocaleAsian")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharPostureAsian(value: FontSlant): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharPostureAsian")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharWeightAsian(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharWeightAsian")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

