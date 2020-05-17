package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgQRCodeBarcode
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Gets or sets the Application Indicator assigned to identify the specification concerned by AIM International.
  	 * The value is respected only when the Fnc1Mode is set to Industry. Its value may take the form of any single Latin alphabetic character from the set {a - z, A - Z} or a two-digit number.
  	 */
  var applicationIndicator: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the brush to use to fill the backing of the barcode.
  	 */
  var backingBrush: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the brush to use for the outline of the backing.
  	 */
  var backingOutline: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the stroke thickness of the backing outline.
  	 */
  var backingStrokeThickness: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the brush to use to fill the background of the bars.
  	 */
  var barBrush: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets a value which specifies how the grid fills within the barcode control dimensions.
  	 *
  	 * Valid values:
  	 * "fillSpace" FillSpace mode ensures that the barcode grid fills the control dimensions.
  	 * "ensureEqualSize" EnsureEqualSize mode ensures that every grid column/row has the same pixels number width/height. The sum of all columns/rows pixels may be less than the width/height of the control.
  	 */
  var barsFillMode: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the data value.
  	 */
  var data: js.UndefOr[String] = js.native
  /**
  	 * Occurs when the data has changed.
  	 * Function takes first argument evt and second argument ui.
  	 * Use ui.owner to obtain reference to the barcode widget.
  	 * Use ui.newData to obtain the new data.
  	 */
  var dataChanged: js.UndefOr[DataChangedEvent] = js.native
  /**
  	 * Gets or sets a value indicating whether to show the ECI header.
  	 *
  	 * Valid values:
  	 * "hide" Hide the header.
  	 * "show" Show the header.
  	 */
  var eciHeaderDisplayMode: js.UndefOr[String] = js.native
  /**
  	 * Each Extended Channel Interpretation (ECI) is designated by a six-digit assignment number: 000000 - 999999.
  	 * The default value depends on the loaded encodings. The default is ECI 000003 (representing ISO/IEC 8859-1) if the ISO/IEC 8859-1 character set is loaded. Otherwise the default value is 000026 (representing UTF-8).
  	 */
  var eciNumber: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the encoding mode for compaction of the QR Code symbol data. The default value is undefined if the Shift_JIS encoding is loaded. Otherwise the default value is byte.
  	 *
  	 * Valid values:
  	 * "undefined" When Undefined encoding mode is set, the QR code barcode internally switches between modes as necessary in order to achieve the most efficient conversion of data into a binary string.
  	 * "numeric" Numeric mode encodes data from decimal digit set (0-9). Normally 3 data characters are represented by 10 bits.
  	 * "alphanumeric" Alphanumeric mode encodes data from a set of 45 characters (digits 0-9, upper case letters A-Z, nine other characters: space, $ % * + _ . / : ). Normally two input characters are represented by 11 bits.
  	 * "byte" In Byte mode the data is encoded at 8 bits per character. The character set of the Byte encoding mode is byte data (by default it is ISO/IEC 8859-1 character set).
  	 * "kanji" The Kanji mode efficiently encodes Kanji characters in accordance with the Shift JIS system based on JIS X 0208. Each two-byte character value is compacted to a 13-bit binary codeword.
  	 */
  var encodingMode: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the error correction level of the QR Code symbol.
  	 *
  	 * Valid values:
  	 * "low" Low error correction level allows recovery of 7% of the symbol codewords.
  	 * "medium" Medium error correction level allows recovery of 15% of the symbol codewords.
  	 * "quartil" Quartil error correction level allows recovery of 25% of the symbol codewords.
  	 * "high" High error correction level allows recovery of 30% of the symbol codewords.
  	 */
  var errorCorrectionLevel: js.UndefOr[String] = js.native
  /**
  	 * Occurs when an error has happened.
  	 * Function takes first argument evt and second argument ui.
  	 * Use ui.owner to obtain reference to the barcode widget.
  	 * Use ui.errorMessage to get or set the error message that is to be shown.
  	 */
  var errorMessageDisplaying: js.UndefOr[ErrorMessageDisplayingEvent] = js.native
  /**
  	 * Gets or sets the message text displayed when some error occurs.
  	 */
  var errorMessageText: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the FNC1 mode indicator which identifies symbols encoding messages formatted according to specific predefined industry or application specifications.
  	 *
  	 * Valid values:
  	 * "none" Do not use any Fnc1 symbols, i.e. the data is not identified according to specific predefined industry or application specifications.
  	 * "gs1" Uses Fnc1 symbol in the first position of the character in Code 128 symbols and designates data formatted in accordance with the GS1 General Specification.
  	 * "industry" Uses Fnc1 symbol in the second position of the character in Code 128 symbols and designates data formatted in accordance with a specific industry application previously agreed with AIM Inc.
  	 */
  var fnc1Mode: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the font of the text displayed by the control.
  	 */
  var font: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the brush to use for the label font.
  	 */
  var fontBrush: js.UndefOr[String] = js.native
  /**
  	 * The height of the barcode. It can be set as a number in pixels, string (px) or percentage (%).
  	 */
  var height: js.UndefOr[String | Double] = js.native
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[String] = js.native
  /**
  	 * Set/Get the locale setting for the widget.
  	 *
  	 */
  var locale: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the scaling value used to affect the pixel density of the control.
  	 * A higher scaling ratio will produce crisper visuals at the expense of memory.  Lower values will cause the control
  	 * to appear blurry.
  	 */
  var pixelScalingRatio: js.UndefOr[Double] = js.native
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.native
  /**
  	 * Gets or sets the size version of the QR Code symbol.
  	 *
  	 * Valid values:
  	 * "undefined" If set, the QR code barcode sets internally the smallest version that will accommodate the data.
  	 * "version1" Version1 defines size of 21x21 modules for the symbol.
  	 * "version2" Version2 defines size of 25x25 modules for the symbol.
  	 * "version3" Version3 defines size of 29x29 modules for the symbol.
  	 * "version4" Version4 defines size of 33x33 modules for the symbol.
  	 * "version5" Version5 defines size of 37x37 modules for the symbol.
  	 * "version6" Version6 defines size of 41x41 modules for the symbol.
  	 * "version7" Version7 defines size of 45x45 modules for the symbol.
  	 * "version8" Version8 defines size of 49x49 modules for the symbol.
  	 * "version9" Version9 defines size of 53x53 modules for the symbol.
  	 * "version10" Version10 defines size of 57x57 modules for the symbol.
  	 * "version11" Version11 defines size of 61x61 modules for the symbol.
  	 * "version12" Version12 defines size of 65x65 modules for the symbol.
  	 * "version13" Version13 defines size of 69x69 modules for the symbol.
  	 * "version14" Version14 defines size of 73x73 modules for the symbol.
  	 * "version15" Version15 defines size of 77x77 modules for the symbol.
  	 * "version16" Version16 defines size of 81x81 modules for the symbol.
  	 * "version17" Version17 defines size of 85x85 modules for the symbol.
  	 * "version18" Version18 defines size of 89x89 modules for the symbol.
  	 * "version19" Version19 defines size of 93x93 modules for the symbol.
  	 * "version20" Version20 defines size of 97x97 modules for the symbol.
  	 * "version21" Version21 defines size of 101x101 modules for the symbol.
  	 * "version22" Version22 defines size of 105x105 modules for the symbol.
  	 * "version23" Version23 defines size of 109x109 modules for the symbol.
  	 * "version24" Version24 defines size of 113x113 modules for the symbol.
  	 * "version25" Version25 defines size of 117x117 modules for the symbol.
  	 * "version26" Version26 defines size of 121x121 modules for the symbol.
  	 * "version27" Version27 defines size of 125x125 modules for the symbol.
  	 * "version28" Version28 defines size of 129x129 modules for the symbol.
  	 * "version29" Version29 defines size of 133x133 modules for the symbol.
  	 * "version30" Version30 defines size of 137x137 modules for the symbol.
  	 * "version31" Version31 defines size of 141x141 modules for the symbol.
  	 * "version32" Version32 defines size of 145x145 modules for the symbol.
  	 * "version33" Version33 defines size of 149x149 modules for the symbol.
  	 * "version34" Version34 defines size of 153x153 modules for the symbol.
  	 * "version35" Version35 defines size of 157x157 modules for the symbol.
  	 * "version36" Version36 defines size of 161x161 modules for the symbol.
  	 * "version37" Version37 defines size of 165x165 modules for the symbol.
  	 * "version38" Version38 defines size of 169x169 modules for the symbol.
  	 * "version39" Version39 defines size of 173x173 modules for the symbol.
  	 * "version40" Version40 defines size of 177x177 modules for the symbol.
  	 */
  var sizeVersion: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the stretch.
  	 *
  	 * Valid values:
  	 * "none"
  	 * "fill"
  	 * "uniform"
  	 * "uniformToFill"
  	 */
  var stretch: js.UndefOr[String] = js.native
  /**
  	 * The width of the barcode. It can be set as a number in pixels, string (px) or percentage (%).
  	 */
  var width: js.UndefOr[String | Double] = js.native
  /**
  	 * Gets or sets the width (XDimension) to height (YDimension) ratio. It accepts only positive values. This property does not apply for the QR barcode.
  	 */
  var widthToHeightRatio: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the X-dimension (narrow element width) for a symbol in mm. It accepts values from 0.01 to 100.
  	 */
  var xDimension: js.UndefOr[Double] = js.native
}

object IgQRCodeBarcode {
  @scala.inline
  def apply(): IgQRCodeBarcode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgQRCodeBarcode]
  }
  @scala.inline
  implicit class IgQRCodeBarcodeOps[Self <: IgQRCodeBarcode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationIndicator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationIndicator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationIndicator")(js.undefined)
        ret
    }
    @scala.inline
    def withBackingBrush(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backingBrush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackingBrush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backingBrush")(js.undefined)
        ret
    }
    @scala.inline
    def withBackingOutline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backingOutline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackingOutline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backingOutline")(js.undefined)
        ret
    }
    @scala.inline
    def withBackingStrokeThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backingStrokeThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackingStrokeThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backingStrokeThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withBarBrush(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barBrush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarBrush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barBrush")(js.undefined)
        ret
    }
    @scala.inline
    def withBarsFillMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barsFillMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarsFillMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barsFillMode")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDataChanged(value: (/* event */ Event, /* ui */ DataChangedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDataChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withEciHeaderDisplayMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eciHeaderDisplayMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEciHeaderDisplayMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eciHeaderDisplayMode")(js.undefined)
        ret
    }
    @scala.inline
    def withEciNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eciNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEciNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eciNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withEncodingMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncodingMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodingMode")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorCorrectionLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCorrectionLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorCorrectionLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCorrectionLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorMessageDisplaying(value: (/* event */ Event, /* ui */ ErrorMessageDisplayingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessageDisplaying")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutErrorMessageDisplaying: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessageDisplaying")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorMessageText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessageText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessageText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessageText")(js.undefined)
        ret
    }
    @scala.inline
    def withFnc1Mode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fnc1Mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFnc1Mode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fnc1Mode")(js.undefined)
        ret
    }
    @scala.inline
    def withFont(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(js.undefined)
        ret
    }
    @scala.inline
    def withFontBrush(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontBrush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontBrush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontBrush")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withPixelScalingRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelScalingRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPixelScalingRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelScalingRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withRegional(value: String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regional")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withStretch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stretch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStretch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stretch")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withWidthToHeightRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widthToHeightRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidthToHeightRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widthToHeightRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withXDimension(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xDimension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXDimension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xDimension")(js.undefined)
        ret
    }
  }
  
}

