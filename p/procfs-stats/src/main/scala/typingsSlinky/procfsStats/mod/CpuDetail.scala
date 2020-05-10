package typingsSlinky.procfsStats.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CpuDetail extends js.Object {
  var guest: String = js.native
  var guest_nice: String = js.native
  var idle: String = js.native
  var iowait: String = js.native
  var irq: String = js.native
  var nice: String = js.native
  var softirq: String = js.native
  var steal: String = js.native
  var system: String = js.native
  var user: String = js.native
}

object CpuDetail {
  @scala.inline
  def apply(
    guest: String,
    guest_nice: String,
    idle: String,
    iowait: String,
    irq: String,
    nice: String,
    softirq: String,
    steal: String,
    system: String,
    user: String
  ): CpuDetail = {
    val __obj = js.Dynamic.literal(guest = guest.asInstanceOf[js.Any], guest_nice = guest_nice.asInstanceOf[js.Any], idle = idle.asInstanceOf[js.Any], iowait = iowait.asInstanceOf[js.Any], irq = irq.asInstanceOf[js.Any], nice = nice.asInstanceOf[js.Any], softirq = softirq.asInstanceOf[js.Any], steal = steal.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[CpuDetail]
  }
  @scala.inline
  implicit class CpuDetailOps[Self <: CpuDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGuest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGuest_nice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guest_nice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIowait(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iowait")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIrq(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("irq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSoftirq(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("softirq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSteal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSystem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("system")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

