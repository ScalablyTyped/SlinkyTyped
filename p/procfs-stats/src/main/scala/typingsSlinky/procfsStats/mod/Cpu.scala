package typingsSlinky.procfsStats.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cpu extends js.Object {
  var btime: String = js.native
  var cpu: CpuDetail = js.native
  var ctxt: String = js.native
  var intr: String = js.native
  var processes: String = js.native
  var procs_blocked: String = js.native
  var procs_running: String = js.native
  var softirq: String = js.native
}

object Cpu {
  @scala.inline
  def apply(
    btime: String,
    cpu: CpuDetail,
    ctxt: String,
    intr: String,
    processes: String,
    procs_blocked: String,
    procs_running: String,
    softirq: String
  ): Cpu = {
    val __obj = js.Dynamic.literal(btime = btime.asInstanceOf[js.Any], cpu = cpu.asInstanceOf[js.Any], ctxt = ctxt.asInstanceOf[js.Any], intr = intr.asInstanceOf[js.Any], processes = processes.asInstanceOf[js.Any], procs_blocked = procs_blocked.asInstanceOf[js.Any], procs_running = procs_running.asInstanceOf[js.Any], softirq = softirq.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cpu]
  }
  @scala.inline
  implicit class CpuOps[Self <: Cpu] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBtime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCpu(value: CpuDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCtxt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctxt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcesses(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcs_blocked(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("procs_blocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcs_running(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("procs_running")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSoftirq(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("softirq")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

