package typingsSlinky.luxon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocaleOptions extends js.Object {
  var locale: js.UndefOr[String] = js.native
  var numberingSystem: js.UndefOr[NumberingSystem] = js.native
  var outputCalendar: js.UndefOr[CalendarSystem] = js.native
}

object LocaleOptions {
  @scala.inline
  def apply(): LocaleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocaleOptions]
  }
  @scala.inline
  implicit class LocaleOptionsOps[Self <: LocaleOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberingSystem(value: NumberingSystem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberingSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberingSystem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberingSystem")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputCalendar(value: CalendarSystem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputCalendar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputCalendar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputCalendar")(js.undefined)
        ret
    }
  }
  
}

