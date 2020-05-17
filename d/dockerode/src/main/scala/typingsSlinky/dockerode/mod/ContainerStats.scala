package typingsSlinky.dockerode.mod

import typingsSlinky.dockerode.anon.Current
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerStats extends js.Object {
  var cpu_stats: CPUStats = js.native
  var memory_stats: MemoryStats = js.native
  var networks: NetworkStats = js.native
  var pid_stats: Current = js.native
  var precpu_stats: CPUStats = js.native
  var read: String = js.native
}

object ContainerStats {
  @scala.inline
  def apply(
    cpu_stats: CPUStats,
    memory_stats: MemoryStats,
    networks: NetworkStats,
    pid_stats: Current,
    precpu_stats: CPUStats,
    read: String
  ): ContainerStats = {
    val __obj = js.Dynamic.literal(cpu_stats = cpu_stats.asInstanceOf[js.Any], memory_stats = memory_stats.asInstanceOf[js.Any], networks = networks.asInstanceOf[js.Any], pid_stats = pid_stats.asInstanceOf[js.Any], precpu_stats = precpu_stats.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerStats]
  }
  @scala.inline
  implicit class ContainerStatsOps[Self <: ContainerStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCpu_stats(value: CPUStats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpu_stats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMemory_stats(value: MemoryStats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memory_stats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetworks(value: NetworkStats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPid_stats(value: Current): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pid_stats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrecpu_stats(value: CPUStats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precpu_stats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRead(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

