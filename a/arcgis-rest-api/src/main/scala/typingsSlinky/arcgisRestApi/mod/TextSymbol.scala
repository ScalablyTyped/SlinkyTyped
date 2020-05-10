package typingsSlinky.arcgisRestApi.mod

import typingsSlinky.arcgisRestApi.arcgisRestApiStrings.baseline
import typingsSlinky.arcgisRestApi.arcgisRestApiStrings.bottom
import typingsSlinky.arcgisRestApi.arcgisRestApiStrings.center
import typingsSlinky.arcgisRestApi.arcgisRestApiStrings.esriTS
import typingsSlinky.arcgisRestApi.arcgisRestApiStrings.justify
import typingsSlinky.arcgisRestApi.arcgisRestApiStrings.left
import typingsSlinky.arcgisRestApi.arcgisRestApiStrings.middle
import typingsSlinky.arcgisRestApi.arcgisRestApiStrings.right
import typingsSlinky.arcgisRestApi.arcgisRestApiStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextSymbol extends MarkerSymbol {
  var backgroundColor: js.UndefOr[Color] = js.native
   // <size>;
  var borderLineColor: js.UndefOr[Color] = js.native
  var borderLineSize: js.UndefOr[Double] = js.native
  var color: js.UndefOr[Color] = js.native
  var font: js.UndefOr[Font] = js.native
   // <size>;
  var haloColor: js.UndefOr[Color] = js.native
  var haloSize: js.UndefOr[Double] = js.native
  var horizontalAlignment: js.UndefOr[left | right | center | justify] = js.native
  var kerning: js.UndefOr[Boolean] = js.native
  var rightToLeft: js.UndefOr[Boolean] = js.native
  var text: js.UndefOr[String] = js.native
  @JSName("type")
  var type_TextSymbol: esriTS = js.native
  var verticalAlignment: js.UndefOr[baseline | top | middle | bottom] = js.native
}

object TextSymbol {
  @scala.inline
  def apply(`type`: esriTS): TextSymbol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextSymbol]
  }
  @scala.inline
  implicit class TextSymbolOps[Self <: TextSymbol] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: esriTS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackgroundColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderLineColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderLineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderLineColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderLineColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderLineSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderLineSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderLineSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderLineSize")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withFont(value: Font): Self = {
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
    def withHaloColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("haloColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHaloColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("haloColor")(js.undefined)
        ret
    }
    @scala.inline
    def withHaloSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("haloSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHaloSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("haloSize")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalAlignment(value: left | right | center | justify): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalAlignment")(js.undefined)
        ret
    }
    @scala.inline
    def withKerning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kerning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKerning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kerning")(js.undefined)
        ret
    }
    @scala.inline
    def withRightToLeft(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightToLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightToLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightToLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalAlignment(value: baseline | top | middle | bottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlignment")(js.undefined)
        ret
    }
  }
  
}

