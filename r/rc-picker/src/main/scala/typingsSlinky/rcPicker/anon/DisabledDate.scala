package typingsSlinky.rcPicker.anon

import typingsSlinky.rcPicker.generateMod.GenerateConfig
import typingsSlinky.rcPicker.interfaceMod.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisabledDate[DateType] extends js.Object {
  var generateConfig: GenerateConfig[DateType] = js.native
  var locale: Locale = js.native
  def disabledDate(date: DateType): Boolean = js.native
}

object DisabledDate {
  @scala.inline
  def apply[DateType](disabledDate: DateType => Boolean, generateConfig: GenerateConfig[DateType], locale: Locale): DisabledDate[DateType] = {
    val __obj = js.Dynamic.literal(disabledDate = js.Any.fromFunction1(disabledDate), generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisabledDate[DateType]]
  }
  @scala.inline
  implicit class DisabledDateOps[Self[datetype] <: DisabledDate[datetype], DateType] (val x: Self[DateType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[DateType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[DateType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[DateType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[DateType] with Other]
    @scala.inline
    def withDisabledDate(value: DateType => Boolean): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledDate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGenerateConfig(value: GenerateConfig[DateType]): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocale(value: Locale): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

