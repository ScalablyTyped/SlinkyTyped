package typingsSlinky.node.osMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ key in node.NodeJS.Signals ]: number} */
@js.native
trait SignalConstants extends js.Object {
  var SIGABRT: Double = js.native
  var SIGALRM: Double = js.native
  var SIGBREAK: Double = js.native
  var SIGBUS: Double = js.native
  var SIGCHLD: Double = js.native
  var SIGCONT: Double = js.native
  var SIGFPE: Double = js.native
  var SIGHUP: Double = js.native
  var SIGILL: Double = js.native
  var SIGINFO: Double = js.native
  var SIGINT: Double = js.native
  var SIGIO: Double = js.native
  var SIGIOT: Double = js.native
  var SIGKILL: Double = js.native
  var SIGLOST: Double = js.native
  var SIGPIPE: Double = js.native
  var SIGPOLL: Double = js.native
  var SIGPROF: Double = js.native
  var SIGPWR: Double = js.native
  var SIGQUIT: Double = js.native
  var SIGSEGV: Double = js.native
  var SIGSTKFLT: Double = js.native
  var SIGSTOP: Double = js.native
  var SIGSYS: Double = js.native
  var SIGTERM: Double = js.native
  var SIGTRAP: Double = js.native
  var SIGTSTP: Double = js.native
  var SIGTTIN: Double = js.native
  var SIGTTOU: Double = js.native
  var SIGUNUSED: Double = js.native
  var SIGURG: Double = js.native
  var SIGUSR1: Double = js.native
  var SIGUSR2: Double = js.native
  var SIGVTALRM: Double = js.native
  var SIGWINCH: Double = js.native
  var SIGXCPU: Double = js.native
  var SIGXFSZ: Double = js.native
}

object SignalConstants {
  @scala.inline
  def apply(
    SIGABRT: Double,
    SIGALRM: Double,
    SIGBREAK: Double,
    SIGBUS: Double,
    SIGCHLD: Double,
    SIGCONT: Double,
    SIGFPE: Double,
    SIGHUP: Double,
    SIGILL: Double,
    SIGINFO: Double,
    SIGINT: Double,
    SIGIO: Double,
    SIGIOT: Double,
    SIGKILL: Double,
    SIGLOST: Double,
    SIGPIPE: Double,
    SIGPOLL: Double,
    SIGPROF: Double,
    SIGPWR: Double,
    SIGQUIT: Double,
    SIGSEGV: Double,
    SIGSTKFLT: Double,
    SIGSTOP: Double,
    SIGSYS: Double,
    SIGTERM: Double,
    SIGTRAP: Double,
    SIGTSTP: Double,
    SIGTTIN: Double,
    SIGTTOU: Double,
    SIGUNUSED: Double,
    SIGURG: Double,
    SIGUSR1: Double,
    SIGUSR2: Double,
    SIGVTALRM: Double,
    SIGWINCH: Double,
    SIGXCPU: Double,
    SIGXFSZ: Double
  ): SignalConstants = {
    val __obj = js.Dynamic.literal(SIGABRT = SIGABRT.asInstanceOf[js.Any], SIGALRM = SIGALRM.asInstanceOf[js.Any], SIGBREAK = SIGBREAK.asInstanceOf[js.Any], SIGBUS = SIGBUS.asInstanceOf[js.Any], SIGCHLD = SIGCHLD.asInstanceOf[js.Any], SIGCONT = SIGCONT.asInstanceOf[js.Any], SIGFPE = SIGFPE.asInstanceOf[js.Any], SIGHUP = SIGHUP.asInstanceOf[js.Any], SIGILL = SIGILL.asInstanceOf[js.Any], SIGINFO = SIGINFO.asInstanceOf[js.Any], SIGINT = SIGINT.asInstanceOf[js.Any], SIGIO = SIGIO.asInstanceOf[js.Any], SIGIOT = SIGIOT.asInstanceOf[js.Any], SIGKILL = SIGKILL.asInstanceOf[js.Any], SIGLOST = SIGLOST.asInstanceOf[js.Any], SIGPIPE = SIGPIPE.asInstanceOf[js.Any], SIGPOLL = SIGPOLL.asInstanceOf[js.Any], SIGPROF = SIGPROF.asInstanceOf[js.Any], SIGPWR = SIGPWR.asInstanceOf[js.Any], SIGQUIT = SIGQUIT.asInstanceOf[js.Any], SIGSEGV = SIGSEGV.asInstanceOf[js.Any], SIGSTKFLT = SIGSTKFLT.asInstanceOf[js.Any], SIGSTOP = SIGSTOP.asInstanceOf[js.Any], SIGSYS = SIGSYS.asInstanceOf[js.Any], SIGTERM = SIGTERM.asInstanceOf[js.Any], SIGTRAP = SIGTRAP.asInstanceOf[js.Any], SIGTSTP = SIGTSTP.asInstanceOf[js.Any], SIGTTIN = SIGTTIN.asInstanceOf[js.Any], SIGTTOU = SIGTTOU.asInstanceOf[js.Any], SIGUNUSED = SIGUNUSED.asInstanceOf[js.Any], SIGURG = SIGURG.asInstanceOf[js.Any], SIGUSR1 = SIGUSR1.asInstanceOf[js.Any], SIGUSR2 = SIGUSR2.asInstanceOf[js.Any], SIGVTALRM = SIGVTALRM.asInstanceOf[js.Any], SIGWINCH = SIGWINCH.asInstanceOf[js.Any], SIGXCPU = SIGXCPU.asInstanceOf[js.Any], SIGXFSZ = SIGXFSZ.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignalConstants]
  }
  @scala.inline
  implicit class SignalConstantsOps[Self <: SignalConstants] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSIGABRT(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIGABRT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSIGALRM(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIGALRM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSIGBREAK(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIGBREAK")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSIGBUS(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIGBUS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSIGCHLD(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIGCHLD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSIGCONT(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIGCONT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSIGFPE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIGFPE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSIGHUP(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIGHUP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSIGILL(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIGILL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSIGINFO(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIGINFO")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSIGINT(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIGINT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSIGIO(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIGIO")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSIGIOT(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIGIOT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSIGKILL(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIGKILL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSIGLOST(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIGLOST")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSIGPIPE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIGPIPE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSIGPOLL(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIGPOLL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSIGPROF(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIGPROF")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSIGPWR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIGPWR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSIGQUIT(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIGQUIT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSIGSEGV(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIGSEGV")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSIGSTKFLT(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIGSTKFLT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSIGSTOP(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIGSTOP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSIGSYS(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIGSYS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSIGTERM(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIGTERM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSIGTRAP(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIGTRAP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSIGTSTP(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIGTSTP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSIGTTIN(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIGTTIN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSIGTTOU(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIGTTOU")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSIGUNUSED(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIGUNUSED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSIGURG(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIGURG")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSIGUSR1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIGUSR1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSIGUSR2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIGUSR2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSIGVTALRM(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIGVTALRM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSIGWINCH(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIGWINCH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSIGXCPU(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIGXCPU")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSIGXFSZ(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIGXFSZ")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

