package typingsSlinky.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ConditionalDataBarNegativeFormat object, for use in `conditionalDataBarNegativeFormat.set({ ... })`. */
@js.native
trait ConditionalDataBarNegativeFormatUpdateData extends js.Object {
  /**
    *
    * HTML color code representing the color of the border line, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange").
    "Empty String" if no border is present or set.
    *
    * [Api set: ExcelApi 1.6]
    */
  var borderColor: js.UndefOr[String] = js.native
  /**
    *
    * HTML color code representing the fill color, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange").
    *
    * [Api set: ExcelApi 1.6]
    */
  var fillColor: js.UndefOr[String] = js.native
  /**
    *
    * Boolean representation of whether or not the negative DataBar has the same border color as the positive DataBar.
    *
    * [Api set: ExcelApi 1.6]
    */
  var matchPositiveBorderColor: js.UndefOr[Boolean] = js.native
  /**
    *
    * Boolean representation of whether or not the negative DataBar has the same fill color as the positive DataBar.
    *
    * [Api set: ExcelApi 1.6]
    */
  var matchPositiveFillColor: js.UndefOr[Boolean] = js.native
}

object ConditionalDataBarNegativeFormatUpdateData {
  @scala.inline
  def apply(): ConditionalDataBarNegativeFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalDataBarNegativeFormatUpdateData]
  }
  @scala.inline
  implicit class ConditionalDataBarNegativeFormatUpdateDataOps[Self <: ConditionalDataBarNegativeFormatUpdateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withFillColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillColor")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchPositiveBorderColor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchPositiveBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchPositiveBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchPositiveBorderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchPositiveFillColor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchPositiveFillColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchPositiveFillColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchPositiveFillColor")(js.undefined)
        ret
    }
  }
  
}

