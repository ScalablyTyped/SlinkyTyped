package typingsSlinky.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `cultureInfo.toJSON()`. */
@js.native
trait CultureInfoData extends js.Object {
  /**
    *
    * Defines the culturally appropriate format of displaying date and time. This is based on current system culture settings.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var datetimeFormat: js.UndefOr[DatetimeFormatInfoData] = js.native
  /**
    *
    * Gets the culture name in the format languagecode2-country/regioncode2 (e.g. "zh-cn" or "en-us"). This is based on current system settings.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var name: js.UndefOr[String] = js.native
  /**
    *
    * Defines the culturally appropriate format of displaying numbers. This is based on current system culture settings.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var numberFormat: js.UndefOr[NumberFormatInfoData] = js.native
}

object CultureInfoData {
  @scala.inline
  def apply(): CultureInfoData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CultureInfoData]
  }
  @scala.inline
  implicit class CultureInfoDataOps[Self <: CultureInfoData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatetimeFormat(value: DatetimeFormatInfoData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datetimeFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatetimeFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datetimeFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberFormat(value: NumberFormatInfoData): Self = {
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

