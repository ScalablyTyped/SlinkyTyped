package typingsSlinky.fundamentalReact.anon

import typingsSlinky.fundamentalReact.fundamentalReactNumbers.`0`
import typingsSlinky.fundamentalReact.fundamentalReactNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hour extends js.Object {
  var hour: String = js.native
  var meridiem: `0` | `1` = js.native
  var minute: String = js.native
  var second: String = js.native
}

object Hour {
  @scala.inline
  def apply(hour: String, meridiem: `0` | `1`, minute: String, second: String): Hour = {
    val __obj = js.Dynamic.literal(hour = hour.asInstanceOf[js.Any], meridiem = meridiem.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hour]
  }
  @scala.inline
  implicit class HourOps[Self <: Hour] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHour(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeridiem(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meridiem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinute(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecond(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("second")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

