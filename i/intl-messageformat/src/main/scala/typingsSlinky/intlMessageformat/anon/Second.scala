package typingsSlinky.intlMessageformat.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Second extends js.Object {
  var hour: String = js.native
  var minute: String = js.native
  var second: String = js.native
  var timeZoneName: String = js.native
}

object Second {
  @scala.inline
  def apply(hour: String, minute: String, second: String, timeZoneName: String): Second = {
    val __obj = js.Dynamic.literal(hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any], timeZoneName = timeZoneName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Second]
  }
  @scala.inline
  implicit class SecondOps[Self <: Second] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withTimeZoneName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZoneName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

