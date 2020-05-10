package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaselineValueFormat extends js.Object {
  /** The comparison type of key value with baseline value. */
  var comparisonType: js.UndefOr[String] = js.native
  /**
    * Description which is appended after the baseline value.
    * This field is optional.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Color to be used, in case baseline value represents a negative change for
    * key value. This field is optional.
    */
  var negativeColor: js.UndefOr[Color] = js.native
  /**
    * Color to be used, in case baseline value represents a negative change for
    * key value. This field is optional.
    * If negative_color is also set, this field takes precedence.
    */
  var negativeColorStyle: js.UndefOr[ColorStyle] = js.native
  /**
    * Specifies the horizontal text positioning of baseline value.
    * This field is optional. If not specified, default positioning is used.
    */
  var position: js.UndefOr[TextPosition] = js.native
  /**
    * Color to be used, in case baseline value represents a positive change for
    * key value. This field is optional.
    */
  var positiveColor: js.UndefOr[Color] = js.native
  /**
    * Color to be used, in case baseline value represents a positive change for
    * key value. This field is optional.
    * If positive_color is also set, this field takes precedence.
    */
  var positiveColorStyle: js.UndefOr[ColorStyle] = js.native
  /** Text formatting options for baseline value. */
  var textFormat: js.UndefOr[TextFormat] = js.native
}

object BaselineValueFormat {
  @scala.inline
  def apply(): BaselineValueFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaselineValueFormat]
  }
  @scala.inline
  implicit class BaselineValueFormatOps[Self <: BaselineValueFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComparisonType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparisonType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComparisonType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparisonType")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withNegativeColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNegativeColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativeColor")(js.undefined)
        ret
    }
    @scala.inline
    def withNegativeColorStyle(value: ColorStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativeColorStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNegativeColorStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativeColorStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: TextPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withPositiveColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positiveColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositiveColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positiveColor")(js.undefined)
        ret
    }
    @scala.inline
    def withPositiveColorStyle(value: ColorStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positiveColorStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositiveColorStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positiveColorStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTextFormat(value: TextFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textFormat")(js.undefined)
        ret
    }
  }
  
}

