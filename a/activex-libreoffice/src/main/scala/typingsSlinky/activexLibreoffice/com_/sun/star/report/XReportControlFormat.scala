package typingsSlinky.activexLibreoffice.com_.sun.star.report

import typingsSlinky.activexLibreoffice.com_.sun.star.awt.FontDescriptor
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.FontSlant
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.Locale
import typingsSlinky.activexLibreoffice.com_.sun.star.style.VerticalAlignment
import typingsSlinky.activexLibreoffice.com_.sun.star.util.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a format condition for a control. */
@js.native
trait XReportControlFormat extends js.Object {
  /**
    * optional property to determine whether the kerning tables from the current font are used.
    *
    * Automatic **kerning** applies a spacing in between certain pairs of characters to make the text look better.
    */
  var CharAutoKerning: Boolean = js.native
  /**
    * optional property which contains the value of the case-mapping of the text for formatting and displaying.
    * @see CaseMap
    */
  var CharCaseMap: Double = js.native
  /** specifies the text color (RGB) of the control. */
  var CharColor: Color = js.native
  /**
    * determines whether text is formatted in two lines.
    *
    * It is linked to the properties CharCombinePrefix and CharCombineSuffix.
    */
  var CharCombineIsOn: Boolean = js.native
  /**
    * contains the prefix (usually parenthesis) before text that is formatted in two lines.
    *
    * It is linked to the properties CharCombineIsOn and CharCombineSuffix.
    */
  var CharCombinePrefix: String = js.native
  /**
    * contains the suffix (usually parenthesis) after text that is formatted in two lines.
    *
    * It is linked to the properties CharCombineIsOn and CharCombinePrefix.
    */
  var CharCombineSuffix: String = js.native
  /** specifies if the characters are formatted and displayed with a contour effect. */
  var CharContoured: Boolean = js.native
  /** contains the font emphasis value as {@link com.sun.star.text.FontEmphasis} . */
  var CharEmphasis: Double = js.native
  /**
    * specifies the percentage by which to raise/lower superscript/subscript characters.
    *
    * Negative values denote subscripts and positive values superscripts.
    */
  var CharEscapement: Double = js.native
  /**
    * This is the additional height used for subscript or superscript characters in units of percent. For subscript characters the value is negative and for
    * superscript characters positive.
    */
  var CharEscapementHeight: Double = js.native
  /** If this optional property is `TRUE` , then the characters are flashing. */
  var CharFlash: Boolean = js.native
  /** This attribute contains the text encoding of the font as specified in {@link com.sun.star.awt.CharSet} . */
  var CharFontCharSet: Double = js.native
  /** This property contains the text encoding of the font as specified in {@link com.sun.star.awt.CharSet} . */
  var CharFontCharSetAsian: Double = js.native
  /** This property contains the text encoding of the font as specified in {@link com.sun.star.awt.CharSet} . */
  var CharFontCharSetComplex: Double = js.native
  /** This attribute contains font family as specified in {@link com.sun.star.awt.FontFamily} . */
  var CharFontFamily: Double = js.native
  /** This property contains font family as specified in {@link com.sun.star.awt.FontFamily} . */
  var CharFontFamilyAsian: Double = js.native
  /** This property contains font family as specified in {@link com.sun.star.awt.FontFamily} . */
  var CharFontFamilyComplex: Double = js.native
  /**
    * This attribute specifies the name of the font style.
    *
    * It may contain more than one name separated by comma.
    */
  var CharFontName: String = js.native
  /**
    * This property specifies the name of the font style.
    *
    * It may contain more than one name separated by comma.
    */
  var CharFontNameAsian: String = js.native
  /**
    * This property specifies the name of the font style.
    *
    * It may contain more than one name separated by comma.
    */
  var CharFontNameComplex: String = js.native
  /** This attribute contains the font pitch as specified in {@link com.sun.star.awt.FontPitch} . */
  var CharFontPitch: Double = js.native
  /** This property contains the font pitch as specified in {@link com.sun.star.awt.FontPitch} . */
  var CharFontPitchAsian: Double = js.native
  /** This property contains the font pitch as specified in {@link com.sun.star.awt.FontPitch} . */
  var CharFontPitchComplex: Double = js.native
  /**
    * This attribute contains the name of the font style.
    *
    * This attribute may be empty.
    */
  var CharFontStyleName: String = js.native
  /**
    * This property contains the name of the font style.
    *
    * This property may be empty.
    */
  var CharFontStyleNameAsian: String = js.native
  /**
    * This property contains the name of the font style.
    *
    * This property may be empty.
    */
  var CharFontStyleNameComplex: String = js.native
  /** This value contains the height of the characters in point. */
  var CharHeight: Double = js.native
  /** This value contains the height of the characters in point. */
  var CharHeightAsian: Double = js.native
  /** This value contains the height of the characters in point. */
  var CharHeightComplex: Double = js.native
  /**
    * If this optional property is `TRUE` , then the characters are invisible.
    * @since OOo 2.0
    */
  var CharHidden: Boolean = js.native
  /** optional property which contains the value of the kerning of the characters. */
  var CharKerning: Double = js.native
  /** contains the value of the locale. */
  var CharLocale: Locale = js.native
  /** contains the value of the locale. */
  var CharLocaleAsian: Locale = js.native
  /** contains the value of the locale. */
  var CharLocaleComplex: Locale = js.native
  /**
    * This attribute contains the value of the posture of the document.
    * @see com.sun.star.awt.FontSlant
    */
  var CharPosture: FontSlant = js.native
  /**
    * This property contains the value of the posture of the document.
    * @see com.sun.star.awt.FontSlant
    */
  var CharPostureAsian: FontSlant = js.native
  /**
    * This property contains the value of the posture of the document.
    * @see com.sun.star.awt.FontSlant
    */
  var CharPostureComplex: FontSlant = js.native
  /** specifies the {@link com.sun.star.text.FontRelief} value of the text in the control. */
  var CharRelief: Double = js.native
  /**
    * determines the rotation of a character in degree.
    *
    * Depending on the implementation only certain values may be allowed.
    */
  var CharRotation: Double = js.native
  /**
    * determines the percentage value for scaling the width of characters.
    *
    * The value refers to the original width which is denoted by 100, and it has to be greater than 0.
    */
  var CharScaleWidth: Double = js.native
  /** specifies if the characters are formatted and displayed with a shadow effect. */
  var CharShadowed: Boolean = js.native
  /**
    * determines the type of the strike out of the character.
    * @see com.sun.star.awt.FontStrikeout
    */
  var CharStrikeout: Double = js.native
  /**
    * This attribute contains the value for the character underline.
    * @see com.sun.star.awt.FontUnderline
    */
  var CharUnderline: Double = js.native
  /** specifies the text line color (RGB) of the control. */
  var CharUnderlineColor: Color = js.native
  /**
    * This attribute contains the value of the font weight.
    * @see com.sun.star.awt.FontWeight
    */
  var CharWeight: Double = js.native
  /**
    * This property contains the value of the font weight.
    * @see com.sun.star.awt.FontWeight
    */
  var CharWeightAsian: Double = js.native
  /**
    * This property contains the value of the font weight.
    * @see com.sun.star.awt.FontWeight
    */
  var CharWeightComplex: Double = js.native
  /** If this attribute is `TRUE` , the underline and strike-through properties are not applied to white spaces. */
  var CharWordMode: Boolean = js.native
  /** specifies the background color (RGB) of the control. */
  var ControlBackground: Color = js.native
  /** determines if the back ground color is set to transparent. */
  var ControlBackgroundTransparent: Boolean = js.native
  /** specifies the {@link com.sun.star.text.FontEmphasis} value of the text in the control. */
  var ControlTextEmphasis: Double = js.native
  /** specifies the font attributes of the text in the control. */
  var FontDescriptor: typingsSlinky.activexLibreoffice.com_.sun.star.awt.FontDescriptor = js.native
  /** specifies the font attributes of the text in the control. */
  var FontDescriptorAsian: FontDescriptor = js.native
  /** specifies the font attributes of the text in the control. */
  var FontDescriptorComplex: FontDescriptor = js.native
  /** contains the name of the hyperlink (if set). */
  var HyperLinkName: String = js.native
  /** contains the name of the target for a hyperlink (if set). */
  var HyperLinkTarget: String = js.native
  /** contains the URL of a hyperlink (if set). */
  var HyperLinkURL: String = js.native
  /**
    * specifies the horizontal alignment of the text.
    * @see com.sun.star.style.ParagraphAdjust
    */
  var ParaAdjust: Double = js.native
  /** contains the character style name for unvisited hyperlinks. */
  var UnvisitedCharStyleName: String = js.native
  /**
    * specifies the vertical alignment of the text in the control.
    * @see com.sun.star.style.VerticalAlignment
    */
  var VerticalAlign: VerticalAlignment = js.native
  /** contains the character style name for visited hyperlinks. */
  var VisitedCharStyleName: String = js.native
}

object XReportControlFormat {
  @scala.inline
  def apply(
    CharAutoKerning: Boolean,
    CharCaseMap: Double,
    CharColor: Color,
    CharCombineIsOn: Boolean,
    CharCombinePrefix: String,
    CharCombineSuffix: String,
    CharContoured: Boolean,
    CharEmphasis: Double,
    CharEscapement: Double,
    CharEscapementHeight: Double,
    CharFlash: Boolean,
    CharFontCharSet: Double,
    CharFontCharSetAsian: Double,
    CharFontCharSetComplex: Double,
    CharFontFamily: Double,
    CharFontFamilyAsian: Double,
    CharFontFamilyComplex: Double,
    CharFontName: String,
    CharFontNameAsian: String,
    CharFontNameComplex: String,
    CharFontPitch: Double,
    CharFontPitchAsian: Double,
    CharFontPitchComplex: Double,
    CharFontStyleName: String,
    CharFontStyleNameAsian: String,
    CharFontStyleNameComplex: String,
    CharHeight: Double,
    CharHeightAsian: Double,
    CharHeightComplex: Double,
    CharHidden: Boolean,
    CharKerning: Double,
    CharLocale: Locale,
    CharLocaleAsian: Locale,
    CharLocaleComplex: Locale,
    CharPosture: FontSlant,
    CharPostureAsian: FontSlant,
    CharPostureComplex: FontSlant,
    CharRelief: Double,
    CharRotation: Double,
    CharScaleWidth: Double,
    CharShadowed: Boolean,
    CharStrikeout: Double,
    CharUnderline: Double,
    CharUnderlineColor: Color,
    CharWeight: Double,
    CharWeightAsian: Double,
    CharWeightComplex: Double,
    CharWordMode: Boolean,
    ControlBackground: Color,
    ControlBackgroundTransparent: Boolean,
    ControlTextEmphasis: Double,
    FontDescriptor: FontDescriptor,
    FontDescriptorAsian: FontDescriptor,
    FontDescriptorComplex: FontDescriptor,
    HyperLinkName: String,
    HyperLinkTarget: String,
    HyperLinkURL: String,
    ParaAdjust: Double,
    UnvisitedCharStyleName: String,
    VerticalAlign: VerticalAlignment,
    VisitedCharStyleName: String
  ): XReportControlFormat = {
    val __obj = js.Dynamic.literal(CharAutoKerning = CharAutoKerning.asInstanceOf[js.Any], CharCaseMap = CharCaseMap.asInstanceOf[js.Any], CharColor = CharColor.asInstanceOf[js.Any], CharCombineIsOn = CharCombineIsOn.asInstanceOf[js.Any], CharCombinePrefix = CharCombinePrefix.asInstanceOf[js.Any], CharCombineSuffix = CharCombineSuffix.asInstanceOf[js.Any], CharContoured = CharContoured.asInstanceOf[js.Any], CharEmphasis = CharEmphasis.asInstanceOf[js.Any], CharEscapement = CharEscapement.asInstanceOf[js.Any], CharEscapementHeight = CharEscapementHeight.asInstanceOf[js.Any], CharFlash = CharFlash.asInstanceOf[js.Any], CharFontCharSet = CharFontCharSet.asInstanceOf[js.Any], CharFontCharSetAsian = CharFontCharSetAsian.asInstanceOf[js.Any], CharFontCharSetComplex = CharFontCharSetComplex.asInstanceOf[js.Any], CharFontFamily = CharFontFamily.asInstanceOf[js.Any], CharFontFamilyAsian = CharFontFamilyAsian.asInstanceOf[js.Any], CharFontFamilyComplex = CharFontFamilyComplex.asInstanceOf[js.Any], CharFontName = CharFontName.asInstanceOf[js.Any], CharFontNameAsian = CharFontNameAsian.asInstanceOf[js.Any], CharFontNameComplex = CharFontNameComplex.asInstanceOf[js.Any], CharFontPitch = CharFontPitch.asInstanceOf[js.Any], CharFontPitchAsian = CharFontPitchAsian.asInstanceOf[js.Any], CharFontPitchComplex = CharFontPitchComplex.asInstanceOf[js.Any], CharFontStyleName = CharFontStyleName.asInstanceOf[js.Any], CharFontStyleNameAsian = CharFontStyleNameAsian.asInstanceOf[js.Any], CharFontStyleNameComplex = CharFontStyleNameComplex.asInstanceOf[js.Any], CharHeight = CharHeight.asInstanceOf[js.Any], CharHeightAsian = CharHeightAsian.asInstanceOf[js.Any], CharHeightComplex = CharHeightComplex.asInstanceOf[js.Any], CharHidden = CharHidden.asInstanceOf[js.Any], CharKerning = CharKerning.asInstanceOf[js.Any], CharLocale = CharLocale.asInstanceOf[js.Any], CharLocaleAsian = CharLocaleAsian.asInstanceOf[js.Any], CharLocaleComplex = CharLocaleComplex.asInstanceOf[js.Any], CharPosture = CharPosture.asInstanceOf[js.Any], CharPostureAsian = CharPostureAsian.asInstanceOf[js.Any], CharPostureComplex = CharPostureComplex.asInstanceOf[js.Any], CharRelief = CharRelief.asInstanceOf[js.Any], CharRotation = CharRotation.asInstanceOf[js.Any], CharScaleWidth = CharScaleWidth.asInstanceOf[js.Any], CharShadowed = CharShadowed.asInstanceOf[js.Any], CharStrikeout = CharStrikeout.asInstanceOf[js.Any], CharUnderline = CharUnderline.asInstanceOf[js.Any], CharUnderlineColor = CharUnderlineColor.asInstanceOf[js.Any], CharWeight = CharWeight.asInstanceOf[js.Any], CharWeightAsian = CharWeightAsian.asInstanceOf[js.Any], CharWeightComplex = CharWeightComplex.asInstanceOf[js.Any], CharWordMode = CharWordMode.asInstanceOf[js.Any], ControlBackground = ControlBackground.asInstanceOf[js.Any], ControlBackgroundTransparent = ControlBackgroundTransparent.asInstanceOf[js.Any], ControlTextEmphasis = ControlTextEmphasis.asInstanceOf[js.Any], FontDescriptor = FontDescriptor.asInstanceOf[js.Any], FontDescriptorAsian = FontDescriptorAsian.asInstanceOf[js.Any], FontDescriptorComplex = FontDescriptorComplex.asInstanceOf[js.Any], HyperLinkName = HyperLinkName.asInstanceOf[js.Any], HyperLinkTarget = HyperLinkTarget.asInstanceOf[js.Any], HyperLinkURL = HyperLinkURL.asInstanceOf[js.Any], ParaAdjust = ParaAdjust.asInstanceOf[js.Any], UnvisitedCharStyleName = UnvisitedCharStyleName.asInstanceOf[js.Any], VerticalAlign = VerticalAlign.asInstanceOf[js.Any], VisitedCharStyleName = VisitedCharStyleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[XReportControlFormat]
  }
  @scala.inline
  implicit class XReportControlFormatOps[Self <: XReportControlFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCharAutoKerning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharAutoKerning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharCaseMap(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharCaseMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharCombineIsOn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharCombineIsOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharCombinePrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharCombinePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharCombineSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharCombineSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharContoured(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharContoured")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharEmphasis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharEmphasis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharEscapement(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharEscapement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharEscapementHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharEscapementHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharFlash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharFlash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharFontCharSet(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharFontCharSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharFontCharSetAsian(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharFontCharSetAsian")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharFontCharSetComplex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharFontCharSetComplex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharFontFamily(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharFontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharFontFamilyAsian(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharFontFamilyAsian")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharFontFamilyComplex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharFontFamilyComplex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharFontName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharFontName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharFontNameAsian(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharFontNameAsian")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharFontNameComplex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharFontNameComplex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharFontPitch(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharFontPitch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharFontPitchAsian(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharFontPitchAsian")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharFontPitchComplex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharFontPitchComplex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharFontStyleName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharFontStyleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharFontStyleNameAsian(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharFontStyleNameAsian")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharFontStyleNameComplex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharFontStyleNameComplex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharHeightAsian(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharHeightAsian")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharHeightComplex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharHeightComplex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharKerning(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharKerning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharLocale(value: Locale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharLocale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharLocaleAsian(value: Locale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharLocaleAsian")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharLocaleComplex(value: Locale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharLocaleComplex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharPosture(value: FontSlant): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharPosture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharPostureAsian(value: FontSlant): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharPostureAsian")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharPostureComplex(value: FontSlant): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharPostureComplex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharRelief(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharRelief")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharRotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharScaleWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharScaleWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharShadowed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharShadowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharStrikeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharStrikeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharUnderline(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharUnderline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharUnderlineColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharUnderlineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharWeightAsian(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharWeightAsian")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharWeightComplex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharWeightComplex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharWordMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharWordMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withControlBackground(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ControlBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withControlBackgroundTransparent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ControlBackgroundTransparent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withControlTextEmphasis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ControlTextEmphasis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontDescriptor(value: FontDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FontDescriptor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontDescriptorAsian(value: FontDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FontDescriptorAsian")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontDescriptorComplex(value: FontDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FontDescriptorComplex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHyperLinkName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HyperLinkName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHyperLinkTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HyperLinkTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHyperLinkURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HyperLinkURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParaAdjust(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParaAdjust")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnvisitedCharStyleName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnvisitedCharStyleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerticalAlign(value: VerticalAlignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VerticalAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisitedCharStyleName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VisitedCharStyleName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

