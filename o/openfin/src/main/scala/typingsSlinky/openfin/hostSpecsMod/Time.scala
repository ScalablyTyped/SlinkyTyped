package typingsSlinky.openfin.hostSpecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Time extends js.Object {
  var idle: Double = js.native
  var irq: Double = js.native
  var nice: Double = js.native
  var sys: Double = js.native
  var user: Double = js.native
}

object Time {
  @scala.inline
  def apply(idle: Double, irq: Double, nice: Double, sys: Double, user: Double): Time = {
    val __obj = js.Dynamic.literal(idle = idle.asInstanceOf[js.Any], irq = irq.asInstanceOf[js.Any], nice = nice.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Time]
  }
  @scala.inline
  implicit class TimeOps[Self <: Time] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIrq(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("irq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNice(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSys(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

