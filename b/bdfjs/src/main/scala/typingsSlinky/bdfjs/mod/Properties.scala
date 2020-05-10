package typingsSlinky.bdfjs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Properties
  extends /* key */ StringDictionary[js.UndefOr[String | Double]] {
  var addStyleName: js.UndefOr[String] = js.native
  var averageWidth: js.UndefOr[Double] = js.native
  var capHeight: js.UndefOr[Double] = js.native
  var charsetEncoding: js.UndefOr[String] = js.native
  var charsetRegistry: js.UndefOr[String] = js.native
  var copyright: js.UndefOr[String] = js.native
  var defaultChar: Double = js.native
  var faceName: js.UndefOr[String] = js.native
  var familyName: js.UndefOr[String] = js.native
  var font: js.UndefOr[String] = js.native
  var fontAscent: Double = js.native
  var fontDescent: Double = js.native
  var fontVersion: js.UndefOr[String] = js.native
  var fontnameRegistry: js.UndefOr[String] = js.native
  var foundry: js.UndefOr[String] = js.native
  var notice: js.UndefOr[String] = js.native
  var pixelSize: js.UndefOr[Double] = js.native
  var pointSize: js.UndefOr[Double] = js.native
  var resolutionX: js.UndefOr[Double] = js.native
  var resolutionY: js.UndefOr[Double] = js.native
  var setwidthName: js.UndefOr[String] = js.native
  var slant: js.UndefOr[String] = js.native
  var spacing: js.UndefOr[String] = js.native
  var weightName: js.UndefOr[String] = js.native
  var xHeight: js.UndefOr[Double] = js.native
}

object Properties {
  @scala.inline
  def apply(defaultChar: Double, fontAscent: Double, fontDescent: Double): Properties = {
    val __obj = js.Dynamic.literal(defaultChar = defaultChar.asInstanceOf[js.Any], fontAscent = fontAscent.asInstanceOf[js.Any], fontDescent = fontDescent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Properties]
  }
  @scala.inline
  implicit class PropertiesOps[Self <: Properties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultChar(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontAscent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontAscent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontDescent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontDescent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddStyleName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addStyleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddStyleName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addStyleName")(js.undefined)
        ret
    }
    @scala.inline
    def withAverageWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("averageWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAverageWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("averageWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withCapHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withCharsetEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charsetEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCharsetEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charsetEncoding")(js.undefined)
        ret
    }
    @scala.inline
    def withCharsetRegistry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charsetRegistry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCharsetRegistry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charsetRegistry")(js.undefined)
        ret
    }
    @scala.inline
    def withCopyright(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyright: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyright")(js.undefined)
        ret
    }
    @scala.inline
    def withFaceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFaceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faceName")(js.undefined)
        ret
    }
    @scala.inline
    def withFamilyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("familyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFamilyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("familyName")(js.undefined)
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
    def withFontVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withFontnameRegistry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontnameRegistry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontnameRegistry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontnameRegistry")(js.undefined)
        ret
    }
    @scala.inline
    def withFoundry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foundry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFoundry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foundry")(js.undefined)
        ret
    }
    @scala.inline
    def withNotice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notice")(js.undefined)
        ret
    }
    @scala.inline
    def withPixelSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPixelSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelSize")(js.undefined)
        ret
    }
    @scala.inline
    def withPointSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointSize")(js.undefined)
        ret
    }
    @scala.inline
    def withResolutionX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolutionX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolutionX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolutionX")(js.undefined)
        ret
    }
    @scala.inline
    def withResolutionY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolutionY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolutionY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolutionY")(js.undefined)
        ret
    }
    @scala.inline
    def withSetwidthName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setwidthName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetwidthName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setwidthName")(js.undefined)
        ret
    }
    @scala.inline
    def withSlant(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slant")(js.undefined)
        ret
    }
    @scala.inline
    def withSpacing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacing")(js.undefined)
        ret
    }
    @scala.inline
    def withWeightName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weightName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeightName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weightName")(js.undefined)
        ret
    }
    @scala.inline
    def withXHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xHeight")(js.undefined)
        ret
    }
  }
  
}

