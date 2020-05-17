package typingsSlinky.activexLibreoffice.com_.sun.star.i18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Locale specific data, for example, separators, quotation marks.
  * @see XLocaleData for links to DTD of XML locale data files.
  */
@js.native
trait LocaleDataItem extends js.Object {
  var LongDateDayOfWeekSeparator: String = js.native
  var LongDateDaySeparator: String = js.native
  var LongDateMonthSeparator: String = js.native
  var LongDateYearSeparator: String = js.native
  var dateSeparator: String = js.native
  var decimalSeparator: String = js.native
  var doubleQuotationEnd: String = js.native
  var doubleQuotationStart: String = js.native
  var listSeparator: String = js.native
  var measurementSystem: String = js.native
  var quotationEnd: String = js.native
  var quotationStart: String = js.native
  var thousandSeparator: String = js.native
  var time100SecSeparator: String = js.native
  var timeAM: String = js.native
  var timePM: String = js.native
  var timeSeparator: String = js.native
  var unoID: String = js.native
}

object LocaleDataItem {
  @scala.inline
  def apply(
    LongDateDayOfWeekSeparator: String,
    LongDateDaySeparator: String,
    LongDateMonthSeparator: String,
    LongDateYearSeparator: String,
    dateSeparator: String,
    decimalSeparator: String,
    doubleQuotationEnd: String,
    doubleQuotationStart: String,
    listSeparator: String,
    measurementSystem: String,
    quotationEnd: String,
    quotationStart: String,
    thousandSeparator: String,
    time100SecSeparator: String,
    timeAM: String,
    timePM: String,
    timeSeparator: String,
    unoID: String
  ): LocaleDataItem = {
    val __obj = js.Dynamic.literal(LongDateDayOfWeekSeparator = LongDateDayOfWeekSeparator.asInstanceOf[js.Any], LongDateDaySeparator = LongDateDaySeparator.asInstanceOf[js.Any], LongDateMonthSeparator = LongDateMonthSeparator.asInstanceOf[js.Any], LongDateYearSeparator = LongDateYearSeparator.asInstanceOf[js.Any], dateSeparator = dateSeparator.asInstanceOf[js.Any], decimalSeparator = decimalSeparator.asInstanceOf[js.Any], doubleQuotationEnd = doubleQuotationEnd.asInstanceOf[js.Any], doubleQuotationStart = doubleQuotationStart.asInstanceOf[js.Any], listSeparator = listSeparator.asInstanceOf[js.Any], measurementSystem = measurementSystem.asInstanceOf[js.Any], quotationEnd = quotationEnd.asInstanceOf[js.Any], quotationStart = quotationStart.asInstanceOf[js.Any], thousandSeparator = thousandSeparator.asInstanceOf[js.Any], time100SecSeparator = time100SecSeparator.asInstanceOf[js.Any], timeAM = timeAM.asInstanceOf[js.Any], timePM = timePM.asInstanceOf[js.Any], timeSeparator = timeSeparator.asInstanceOf[js.Any], unoID = unoID.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocaleDataItem]
  }
  @scala.inline
  implicit class LocaleDataItemOps[Self <: LocaleDataItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLongDateDayOfWeekSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LongDateDayOfWeekSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongDateDaySeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LongDateDaySeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongDateMonthSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LongDateMonthSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongDateYearSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LongDateYearSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecimalSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimalSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDoubleQuotationEnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleQuotationEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDoubleQuotationStart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleQuotationStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeasurementSystem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measurementSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuotationEnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotationEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuotationStart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotationStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThousandSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thousandSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime100SecSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time100SecSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeAM(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeAM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimePM(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timePM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnoID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unoID")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

