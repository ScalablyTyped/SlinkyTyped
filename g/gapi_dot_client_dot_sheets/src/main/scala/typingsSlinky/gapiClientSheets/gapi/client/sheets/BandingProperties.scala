package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BandingProperties extends js.Object {
  /** The first color that is alternating. (Required) */
  var firstBandColor: js.UndefOr[Color] = js.native
  /**
    * The first color that is alternating. (Required)
    * If first_band_color is also set, this field takes precedence.
    */
  var firstBandColorStyle: js.UndefOr[ColorStyle] = js.native
  /**
    * The color of the last row or column. If this field is not set, the last
    * row or column is filled with either first_band_color or
    * second_band_color, depending on the color of the previous row or
    * column.
    */
  var footerColor: js.UndefOr[Color] = js.native
  /**
    * The color of the last row or column. If this field is not set, the last
    * row or column is filled with either first_band_color or
    * second_band_color, depending on the color of the previous row or
    * column.
    * If footer_color is also set, this field takes precedence.
    */
  var footerColorStyle: js.UndefOr[ColorStyle] = js.native
  /**
    * The color of the first row or column. If this field is set, the first row
    * or column is filled with this color and the colors alternate between
    * first_band_color and second_band_color starting from the second
    * row or column. Otherwise, the first row or column is filled with
    * first_band_color and the colors proceed to alternate as they normally
    * would.
    */
  var headerColor: js.UndefOr[Color] = js.native
  /**
    * The color of the first row or column. If this field is set, the first row
    * or column is filled with this color and the colors alternate between
    * first_band_color and second_band_color starting from the second
    * row or column. Otherwise, the first row or column is filled with
    * first_band_color and the colors proceed to alternate as they normally
    * would. If header_color is also set, this field takes precedence.
    */
  var headerColorStyle: js.UndefOr[ColorStyle] = js.native
  /** The second color that is alternating. (Required) */
  var secondBandColor: js.UndefOr[Color] = js.native
  /**
    * The second color that is alternating. (Required)
    * If second_band_color is also set, this field takes precedence.
    */
  var secondBandColorStyle: js.UndefOr[ColorStyle] = js.native
}

object BandingProperties {
  @scala.inline
  def apply(): BandingProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BandingProperties]
  }
  @scala.inline
  implicit class BandingPropertiesOps[Self <: BandingProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFirstBandColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstBandColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstBandColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstBandColor")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstBandColorStyle(value: ColorStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstBandColorStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstBandColorStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstBandColorStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooterColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerColor")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterColorStyle(value: ColorStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerColorStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooterColorStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerColorStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerColor")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderColorStyle(value: ColorStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerColorStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderColorStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerColorStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondBandColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondBandColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondBandColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondBandColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondBandColorStyle(value: ColorStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondBandColorStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondBandColorStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondBandColorStyle")(js.undefined)
        ret
    }
  }
  
}

