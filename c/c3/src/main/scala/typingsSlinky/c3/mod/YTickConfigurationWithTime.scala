package typingsSlinky.c3.mod

import typingsSlinky.c3.AnonInterval
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait YTickConfigurationWithTime extends YTickConfiguration {
  var time: js.UndefOr[AnonInterval] = js.native
}

object YTickConfigurationWithTime {
  @scala.inline
  def apply(): YTickConfigurationWithTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[YTickConfigurationWithTime]
  }
  @scala.inline
  implicit class YTickConfigurationWithTimeOps[Self <: YTickConfigurationWithTime] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTime(value: AnonInterval): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(js.undefined)
        ret
    }
  }
  
}

