package typingsSlinky.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * A format object encapsulating the conditional formats range's font, fill, borders, and other properties.
  *
  * [Api set: ExcelApi 1.6]
  */
@js.native
trait ConditionalRangeFormatLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Collection of border objects that apply to the overall conditional format range.
    *
    * [Api set: ExcelApi 1.6]
    */
  var borders: js.UndefOr[ConditionalRangeBorderCollectionLoadOptions] = js.native
  /**
    *
    * Returns the fill object defined on the overall conditional format range.
    *
    * [Api set: ExcelApi 1.6]
    */
  var fill: js.UndefOr[ConditionalRangeFillLoadOptions] = js.native
  /**
    *
    * Returns the font object defined on the overall conditional format range.
    *
    * [Api set: ExcelApi 1.6]
    */
  var font: js.UndefOr[ConditionalRangeFontLoadOptions] = js.native
  /**
    *
    * Represents Excel's number format code for the given range. Cleared if null is passed in.
    *
    * [Api set: ExcelApi 1.6]
    */
  var numberFormat: js.UndefOr[Boolean] = js.native
}

object ConditionalRangeFormatLoadOptions {
  @scala.inline
  def apply(): ConditionalRangeFormatLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalRangeFormatLoadOptions]
  }
  @scala.inline
  implicit class ConditionalRangeFormatLoadOptionsOps[Self <: ConditionalRangeFormatLoadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$all(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$all: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$all")(js.undefined)
        ret
    }
    @scala.inline
    def withBorders(value: ConditionalRangeBorderCollectionLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borders")(js.undefined)
        ret
    }
    @scala.inline
    def withFill(value: ConditionalRangeFillLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def withFont(value: ConditionalRangeFontLoadOptions): Self = {
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
    def withNumberFormat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberFormat")(js.undefined)
        ret
    }
  }
  
}

