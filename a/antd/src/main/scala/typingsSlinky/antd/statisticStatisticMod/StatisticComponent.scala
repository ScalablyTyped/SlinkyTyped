package typingsSlinky.antd.statisticStatisticMod

import typingsSlinky.antd.anon.TypeofCountdown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatisticComponent extends js.Object {
  var Countdown: TypeofCountdown = js.native
}

object StatisticComponent {
  @scala.inline
  def apply(Countdown: TypeofCountdown): StatisticComponent = {
    val __obj = js.Dynamic.literal(Countdown = Countdown.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatisticComponent]
  }
  @scala.inline
  implicit class StatisticComponentOps[Self <: StatisticComponent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCountdown(value: TypeofCountdown): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Countdown")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

