package typingsSlinky.dockerode.mod

import typingsSlinky.dockerode.AnonActiveanon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemoryStats extends js.Object {
  var failcnt: Double = js.native
  var limit: Double = js.native
  var max_usage: Double = js.native
  var stats: AnonActiveanon = js.native
  var usage: Double = js.native
}

object MemoryStats {
  @scala.inline
  def apply(failcnt: Double, limit: Double, max_usage: Double, stats: AnonActiveanon, usage: Double): MemoryStats = {
    val __obj = js.Dynamic.literal(failcnt = failcnt.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], max_usage = max_usage.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryStats]
  }
  @scala.inline
  implicit class MemoryStatsOps[Self <: MemoryStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailcnt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failcnt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax_usage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_usage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStats(value: AnonActiveanon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

