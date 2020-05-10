package typingsSlinky.c3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait YAxisConfigurationWithTime extends YAxisConfiguration {
  @JSName("tick")
  var tick_YAxisConfigurationWithTime: js.UndefOr[YTickConfigurationWithTime] = js.native
  var `type`: js.UndefOr[js.Any] = js.native
}

object YAxisConfigurationWithTime {
  @scala.inline
  def apply(): YAxisConfigurationWithTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[YAxisConfigurationWithTime]
  }
  @scala.inline
  implicit class YAxisConfigurationWithTimeOps[Self <: YAxisConfigurationWithTime] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTick(value: YTickConfigurationWithTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tick")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

