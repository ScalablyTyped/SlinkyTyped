package typingsSlinky.rcPicker.anon

import typingsSlinky.rcPicker.generateMod.GenerateConfig
import typingsSlinky.rcPicker.interfaceMod.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisabledDate[DateType] extends js.Object {
  var generateConfig: GenerateConfig[DateType]
  var locale: Locale
  def disabledDate(date: DateType): Boolean
}

object DisabledDate {
  @scala.inline
  def apply[DateType](disabledDate: DateType => Boolean, generateConfig: GenerateConfig[DateType], locale: Locale): DisabledDate[DateType] = {
    val __obj = js.Dynamic.literal(disabledDate = js.Any.fromFunction1(disabledDate), generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisabledDate[DateType]]
  }
  @scala.inline
  implicit class DisabledDateOps[Self <: DisabledDate[_], DateType] (val x: Self with DisabledDate[DateType]) extends AnyVal {
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
    def setDisabledDate(value: DateType => Boolean): Self = this.set("disabledDate", js.Any.fromFunction1(value))
    @scala.inline
    def setGenerateConfig(value: GenerateConfig[DateType]): Self = this.set("generateConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocale(value: Locale): Self = this.set("locale", value.asInstanceOf[js.Any])
  }
  
}

