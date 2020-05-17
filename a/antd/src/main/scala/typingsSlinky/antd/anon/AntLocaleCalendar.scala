package typingsSlinky.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AntLocaleCalendar extends js.Object {
  var antLocale: Calendar = js.native
}

object AntLocaleCalendar {
  @scala.inline
  def apply(antLocale: Calendar): AntLocaleCalendar = {
    val __obj = js.Dynamic.literal(antLocale = antLocale.asInstanceOf[js.Any])
    __obj.asInstanceOf[AntLocaleCalendar]
  }
  @scala.inline
  implicit class AntLocaleCalendarOps[Self <: AntLocaleCalendar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAntLocale(value: Calendar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("antLocale")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

