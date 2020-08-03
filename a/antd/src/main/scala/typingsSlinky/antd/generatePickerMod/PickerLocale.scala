package typingsSlinky.antd.generatePickerMod

import typingsSlinky.antd.timePickerMod.TimePickerLocale
import typingsSlinky.rcPicker.interfaceMod.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  lang :rc-picker.rc-picker/es/interface.Locale & antd.antd/lib/date-picker/generatePicker.AdditionalPickerLocaleLangProps,   timePickerLocale :antd.antd/lib/time-picker.TimePickerLocale} & antd.antd/lib/date-picker/generatePicker.AdditionalPickerLocaleProps */
trait PickerLocale extends js.Object {
  var dateFormat: js.UndefOr[String] = js.undefined
  var dateTimeFormat: js.UndefOr[String] = js.undefined
  var lang: Locale with AdditionalPickerLocaleLangProps
  var monthFormat: js.UndefOr[String] = js.undefined
  var timePickerLocale: TimePickerLocale
  var weekFormat: js.UndefOr[String] = js.undefined
}

object PickerLocale {
  @scala.inline
  def apply(lang: Locale with AdditionalPickerLocaleLangProps, timePickerLocale: TimePickerLocale): PickerLocale = {
    val __obj = js.Dynamic.literal(lang = lang.asInstanceOf[js.Any], timePickerLocale = timePickerLocale.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerLocale]
  }
  @scala.inline
  implicit class PickerLocaleOps[Self <: PickerLocale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLang(value: Locale with AdditionalPickerLocaleLangProps): Self = this.set("lang", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimePickerLocale(value: TimePickerLocale): Self = this.set("timePickerLocale", value.asInstanceOf[js.Any])
    @scala.inline
    def setDateFormat(value: String): Self = this.set("dateFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateFormat: Self = this.set("dateFormat", js.undefined)
    @scala.inline
    def setDateTimeFormat(value: String): Self = this.set("dateTimeFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateTimeFormat: Self = this.set("dateTimeFormat", js.undefined)
    @scala.inline
    def setMonthFormat(value: String): Self = this.set("monthFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonthFormat: Self = this.set("monthFormat", js.undefined)
    @scala.inline
    def setWeekFormat(value: String): Self = this.set("weekFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeekFormat: Self = this.set("weekFormat", js.undefined)
  }
  
}

