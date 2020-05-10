package typingsSlinky.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAntLocaleAnonCalendar extends js.Object {
  var antLocale: AnonCalendar = js.native
}

object AnonAntLocaleAnonCalendar {
  @scala.inline
  def apply(antLocale: AnonCalendar): AnonAntLocaleAnonCalendar = {
    val __obj = js.Dynamic.literal(antLocale = antLocale.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAntLocaleAnonCalendar]
  }
  @scala.inline
  implicit class AnonAntLocaleAnonCalendarOps[Self <: AnonAntLocaleAnonCalendar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAntLocale(value: AnonCalendar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("antLocale")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

