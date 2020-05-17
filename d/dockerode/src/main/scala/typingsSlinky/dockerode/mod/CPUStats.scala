package typingsSlinky.dockerode.mod

import typingsSlinky.dockerode.anon.Percpuusage
import typingsSlinky.dockerode.anon.Periods
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CPUStats extends js.Object {
  var cpu_usage: Percpuusage = js.native
  var online_cpus: Double = js.native
  var system_cpu_usage: Double = js.native
  var throttling_data: Periods = js.native
}

object CPUStats {
  @scala.inline
  def apply(cpu_usage: Percpuusage, online_cpus: Double, system_cpu_usage: Double, throttling_data: Periods): CPUStats = {
    val __obj = js.Dynamic.literal(cpu_usage = cpu_usage.asInstanceOf[js.Any], online_cpus = online_cpus.asInstanceOf[js.Any], system_cpu_usage = system_cpu_usage.asInstanceOf[js.Any], throttling_data = throttling_data.asInstanceOf[js.Any])
    __obj.asInstanceOf[CPUStats]
  }
  @scala.inline
  implicit class CPUStatsOps[Self <: CPUStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCpu_usage(value: Percpuusage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpu_usage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnline_cpus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("online_cpus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSystem_cpu_usage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("system_cpu_usage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThrottling_data(value: Periods): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttling_data")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

