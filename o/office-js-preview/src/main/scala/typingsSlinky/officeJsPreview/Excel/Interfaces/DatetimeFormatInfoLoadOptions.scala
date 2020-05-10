package typingsSlinky.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Defines the culturally appropriate format of displaying numbers. This is based on current system culture settings.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@js.native
trait DatetimeFormatInfoLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the string used as the date separator. This is based on current system settings.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var dateSeparator: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the format string for a long date value. This is based on current system settings.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var longDatePattern: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the format string for a long time value. This is based on current system settings.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var longTimePattern: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the format string for a short date value. This is based on current system settings.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var shortDatePattern: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the string used as the time separator. This is based on current system settings.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var timeSeparator: js.UndefOr[Boolean] = js.native
}

object DatetimeFormatInfoLoadOptions {
  @scala.inline
  def apply(): DatetimeFormatInfoLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatetimeFormatInfoLoadOptions]
  }
  @scala.inline
  implicit class DatetimeFormatInfoLoadOptionsOps[Self <: DatetimeFormatInfoLoadOptions] (val x: Self) extends AnyVal {
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
    def withDateSeparator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withLongDatePattern(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longDatePattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongDatePattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longDatePattern")(js.undefined)
        ret
    }
    @scala.inline
    def withLongTimePattern(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longTimePattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongTimePattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longTimePattern")(js.undefined)
        ret
    }
    @scala.inline
    def withShortDatePattern(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortDatePattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortDatePattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortDatePattern")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeSeparator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeSeparator")(js.undefined)
        ret
    }
  }
  
}

