package typingsSlinky.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `conditionalDataBarPositiveFormat.toJSON()`. */
@js.native
trait ConditionalDataBarPositiveFormatData extends js.Object {
  /**
    *
    * HTML color code representing the color of the border line, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange").
    "" (empty string) if no border is present or set.
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
    * Boolean representation of whether or not the DataBar has a gradient.
    *
    * [Api set: ExcelApi 1.6]
    */
  var gradientFill: js.UndefOr[Boolean] = js.native
}

object ConditionalDataBarPositiveFormatData {
  @scala.inline
  def apply(): ConditionalDataBarPositiveFormatData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalDataBarPositiveFormatData]
  }
  @scala.inline
  implicit class ConditionalDataBarPositiveFormatDataOps[Self <: ConditionalDataBarPositiveFormatData] (val x: Self) extends AnyVal {
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
    def withGradientFill(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientFill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGradientFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientFill")(js.undefined)
        ret
    }
  }
  
}

