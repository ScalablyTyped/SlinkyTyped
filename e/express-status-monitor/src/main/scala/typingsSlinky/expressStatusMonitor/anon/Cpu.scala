package typingsSlinky.expressStatusMonitor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cpu extends js.Object {
  var cpu: js.UndefOr[Boolean] = js.native
  var load: js.UndefOr[Boolean] = js.native
  var mem: js.UndefOr[Boolean] = js.native
  var responseTime: js.UndefOr[Boolean] = js.native
  var rps: js.UndefOr[Boolean] = js.native
  var statusCodes: js.UndefOr[Boolean] = js.native
}

object Cpu {
  @scala.inline
  def apply(): Cpu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cpu]
  }
  @scala.inline
  implicit class CpuOps[Self <: Cpu] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCpu(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCpu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpu")(js.undefined)
        ret
    }
    @scala.inline
    def withLoad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.undefined)
        ret
    }
    @scala.inline
    def withMem(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mem")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseTime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseTime")(js.undefined)
        ret
    }
    @scala.inline
    def withRps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rps")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusCodes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusCodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCodes")(js.undefined)
        ret
    }
  }
  
}

