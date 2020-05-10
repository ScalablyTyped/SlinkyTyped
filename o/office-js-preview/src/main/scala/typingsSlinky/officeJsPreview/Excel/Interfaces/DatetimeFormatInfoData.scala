package typingsSlinky.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `datetimeFormatInfo.toJSON()`. */
@js.native
trait DatetimeFormatInfoData extends js.Object {
  /**
    *
    * Gets the string used as the date separator. This is based on current system settings.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var dateSeparator: js.UndefOr[String] = js.native
  /**
    *
    * Gets the format string for a long date value. This is based on current system settings.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var longDatePattern: js.UndefOr[String] = js.native
  /**
    *
    * Gets the format string for a long time value. This is based on current system settings.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var longTimePattern: js.UndefOr[String] = js.native
  /**
    *
    * Gets the format string for a short date value. This is based on current system settings.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var shortDatePattern: js.UndefOr[String] = js.native
  /**
    *
    * Gets the string used as the time separator. This is based on current system settings.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var timeSeparator: js.UndefOr[String] = js.native
}

object DatetimeFormatInfoData {
  @scala.inline
  def apply(): DatetimeFormatInfoData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatetimeFormatInfoData]
  }
  @scala.inline
  implicit class DatetimeFormatInfoDataOps[Self <: DatetimeFormatInfoData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDateSeparator(value: String): Self = {
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
    def withLongDatePattern(value: String): Self = {
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
    def withLongTimePattern(value: String): Self = {
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
    def withShortDatePattern(value: String): Self = {
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
    def withTimeSeparator(value: String): Self = {
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

