package typingsSlinky.procfsStats.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Status extends js.Object {
  var CapBnd: String = js.native
  var CapEff: String = js.native
  var CapInh: String = js.native
  var CapPrm: String = js.native
  var Cpus_allowed: String = js.native
  var Cpus_allowed_list: String = js.native
  var FDSize: String = js.native
  var Gid: String = js.native
  var Groups: String = js.native
  var Mems_allowed: String = js.native
  var Mems_allowed_list: String = js.native
  var Name: String = js.native
  var PPid: String = js.native
  var Pid: String = js.native
  var ShdPnd: String = js.native
  var SigBlk: String = js.native
  var SigCgt: String = js.native
  var SigIgn: String = js.native
  var SigPnd: String = js.native
  var SigQ: String = js.native
  var State: String = js.native
  var Tgid: String = js.native
  var Threads: String = js.native
  var TracerPid: String = js.native
  var Uid: String = js.native
  var VmData: String = js.native
  var VmExe: String = js.native
  var VmHWM: String = js.native
  var VmLck: String = js.native
  var VmLib: String = js.native
  var VmPTE: String = js.native
  var VmPeak: String = js.native
  var VmPin: String = js.native
  var VmRSS: String = js.native
  var VmSize: String = js.native
  var VmStk: String = js.native
  var VmSwap: String = js.native
  var nonvoluntary_ctxt_switches: String = js.native
  var voluntary_ctxt_switches: String = js.native
}

object Status {
  @scala.inline
  def apply(
    CapBnd: String,
    CapEff: String,
    CapInh: String,
    CapPrm: String,
    Cpus_allowed: String,
    Cpus_allowed_list: String,
    FDSize: String,
    Gid: String,
    Groups: String,
    Mems_allowed: String,
    Mems_allowed_list: String,
    Name: String,
    PPid: String,
    Pid: String,
    ShdPnd: String,
    SigBlk: String,
    SigCgt: String,
    SigIgn: String,
    SigPnd: String,
    SigQ: String,
    State: String,
    Tgid: String,
    Threads: String,
    TracerPid: String,
    Uid: String,
    VmData: String,
    VmExe: String,
    VmHWM: String,
    VmLck: String,
    VmLib: String,
    VmPTE: String,
    VmPeak: String,
    VmPin: String,
    VmRSS: String,
    VmSize: String,
    VmStk: String,
    VmSwap: String,
    nonvoluntary_ctxt_switches: String,
    voluntary_ctxt_switches: String
  ): Status = {
    val __obj = js.Dynamic.literal(CapBnd = CapBnd.asInstanceOf[js.Any], CapEff = CapEff.asInstanceOf[js.Any], CapInh = CapInh.asInstanceOf[js.Any], CapPrm = CapPrm.asInstanceOf[js.Any], Cpus_allowed = Cpus_allowed.asInstanceOf[js.Any], Cpus_allowed_list = Cpus_allowed_list.asInstanceOf[js.Any], FDSize = FDSize.asInstanceOf[js.Any], Gid = Gid.asInstanceOf[js.Any], Groups = Groups.asInstanceOf[js.Any], Mems_allowed = Mems_allowed.asInstanceOf[js.Any], Mems_allowed_list = Mems_allowed_list.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PPid = PPid.asInstanceOf[js.Any], Pid = Pid.asInstanceOf[js.Any], ShdPnd = ShdPnd.asInstanceOf[js.Any], SigBlk = SigBlk.asInstanceOf[js.Any], SigCgt = SigCgt.asInstanceOf[js.Any], SigIgn = SigIgn.asInstanceOf[js.Any], SigPnd = SigPnd.asInstanceOf[js.Any], SigQ = SigQ.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], Tgid = Tgid.asInstanceOf[js.Any], Threads = Threads.asInstanceOf[js.Any], TracerPid = TracerPid.asInstanceOf[js.Any], Uid = Uid.asInstanceOf[js.Any], VmData = VmData.asInstanceOf[js.Any], VmExe = VmExe.asInstanceOf[js.Any], VmHWM = VmHWM.asInstanceOf[js.Any], VmLck = VmLck.asInstanceOf[js.Any], VmLib = VmLib.asInstanceOf[js.Any], VmPTE = VmPTE.asInstanceOf[js.Any], VmPeak = VmPeak.asInstanceOf[js.Any], VmPin = VmPin.asInstanceOf[js.Any], VmRSS = VmRSS.asInstanceOf[js.Any], VmSize = VmSize.asInstanceOf[js.Any], VmStk = VmStk.asInstanceOf[js.Any], VmSwap = VmSwap.asInstanceOf[js.Any], nonvoluntary_ctxt_switches = nonvoluntary_ctxt_switches.asInstanceOf[js.Any], voluntary_ctxt_switches = voluntary_ctxt_switches.asInstanceOf[js.Any])
    __obj.asInstanceOf[Status]
  }
  @scala.inline
  implicit class StatusOps[Self <: Status] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapBnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CapBnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCapEff(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CapEff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCapInh(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CapInh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCapPrm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CapPrm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCpus_allowed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cpus_allowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCpus_allowed_list(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cpus_allowed_list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFDSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FDSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Gid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroups(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMems_allowed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mems_allowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMems_allowed_list(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mems_allowed_list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPPid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PPid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShdPnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShdPnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSigBlk(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SigBlk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSigCgt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SigCgt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSigIgn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SigIgn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSigPnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SigPnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSigQ(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SigQ")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTgid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tgid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThreads(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Threads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTracerPid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TracerPid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Uid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVmData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VmData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVmExe(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VmExe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVmHWM(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VmHWM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVmLck(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VmLck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVmLib(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VmLib")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVmPTE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VmPTE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVmPeak(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VmPeak")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVmPin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VmPin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVmRSS(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VmRSS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVmSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VmSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVmStk(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VmStk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVmSwap(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VmSwap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNonvoluntary_ctxt_switches(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonvoluntary_ctxt_switches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVoluntary_ctxt_switches(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voluntary_ctxt_switches")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

