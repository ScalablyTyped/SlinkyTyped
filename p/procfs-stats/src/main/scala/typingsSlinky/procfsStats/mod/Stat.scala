package typingsSlinky.procfsStats.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stat extends js.Object {
  var blocked: String = js.native
  var cguest_time: String = js.native
  var cmajflt: String = js.native
  var cminflt: String = js.native
  var cnswap: String = js.native
  var comm: String = js.native
  var cstime: String = js.native
  var cutime: String = js.native
  var delayacct_blkio_ticks: String = js.native
  var endcode: String = js.native
  var exit_signal: String = js.native
  var flags: String = js.native
  var guest_time: String = js.native
  var itrealvalue: String = js.native
  var kstkeip: String = js.native
  var kstkesp: String = js.native
  var majflt: String = js.native
  var minflt: String = js.native
  var nice: String = js.native
  var nswap: String = js.native
  var num_threads: String = js.native
  var pgrp: String = js.native
  var pid: String = js.native
  var policy: String = js.native
  var ppid: String = js.native
  var priority: String = js.native
  var processor: String = js.native
  var rss: String = js.native
  var rsslim: String = js.native
  var rt_priority: String = js.native
  var session: String = js.native
  var sigcatch: String = js.native
  var sigignore: String = js.native
  var signal: String = js.native
  var startcode: String = js.native
  var startstack: String = js.native
  var starttime: String = js.native
  var state: String = js.native
  var stime: String = js.native
  var tpgid: String = js.native
  var tty_nr: String = js.native
  var utime: String = js.native
  var vsize: String = js.native
  var wchan: String = js.native
}

object Stat {
  @scala.inline
  def apply(
    blocked: String,
    cguest_time: String,
    cmajflt: String,
    cminflt: String,
    cnswap: String,
    comm: String,
    cstime: String,
    cutime: String,
    delayacct_blkio_ticks: String,
    endcode: String,
    exit_signal: String,
    flags: String,
    guest_time: String,
    itrealvalue: String,
    kstkeip: String,
    kstkesp: String,
    majflt: String,
    minflt: String,
    nice: String,
    nswap: String,
    num_threads: String,
    pgrp: String,
    pid: String,
    policy: String,
    ppid: String,
    priority: String,
    processor: String,
    rss: String,
    rsslim: String,
    rt_priority: String,
    session: String,
    sigcatch: String,
    sigignore: String,
    signal: String,
    startcode: String,
    startstack: String,
    starttime: String,
    state: String,
    stime: String,
    tpgid: String,
    tty_nr: String,
    utime: String,
    vsize: String,
    wchan: String
  ): Stat = {
    val __obj = js.Dynamic.literal(blocked = blocked.asInstanceOf[js.Any], cguest_time = cguest_time.asInstanceOf[js.Any], cmajflt = cmajflt.asInstanceOf[js.Any], cminflt = cminflt.asInstanceOf[js.Any], cnswap = cnswap.asInstanceOf[js.Any], comm = comm.asInstanceOf[js.Any], cstime = cstime.asInstanceOf[js.Any], cutime = cutime.asInstanceOf[js.Any], delayacct_blkio_ticks = delayacct_blkio_ticks.asInstanceOf[js.Any], endcode = endcode.asInstanceOf[js.Any], exit_signal = exit_signal.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], guest_time = guest_time.asInstanceOf[js.Any], itrealvalue = itrealvalue.asInstanceOf[js.Any], kstkeip = kstkeip.asInstanceOf[js.Any], kstkesp = kstkesp.asInstanceOf[js.Any], majflt = majflt.asInstanceOf[js.Any], minflt = minflt.asInstanceOf[js.Any], nice = nice.asInstanceOf[js.Any], nswap = nswap.asInstanceOf[js.Any], num_threads = num_threads.asInstanceOf[js.Any], pgrp = pgrp.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any], ppid = ppid.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], processor = processor.asInstanceOf[js.Any], rss = rss.asInstanceOf[js.Any], rsslim = rsslim.asInstanceOf[js.Any], rt_priority = rt_priority.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], sigcatch = sigcatch.asInstanceOf[js.Any], sigignore = sigignore.asInstanceOf[js.Any], signal = signal.asInstanceOf[js.Any], startcode = startcode.asInstanceOf[js.Any], startstack = startstack.asInstanceOf[js.Any], starttime = starttime.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], stime = stime.asInstanceOf[js.Any], tpgid = tpgid.asInstanceOf[js.Any], tty_nr = tty_nr.asInstanceOf[js.Any], utime = utime.asInstanceOf[js.Any], vsize = vsize.asInstanceOf[js.Any], wchan = wchan.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stat]
  }
  @scala.inline
  implicit class StatOps[Self <: Stat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlocked(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCguest_time(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cguest_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCmajflt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cmajflt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCminflt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cminflt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCnswap(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cnswap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCstime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cstime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCutime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cutime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelayacct_blkio_ticks(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayacct_blkio_ticks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndcode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endcode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExit_signal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exit_signal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlags(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGuest_time(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guest_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItrealvalue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itrealvalue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKstkeip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kstkeip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKstkesp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kstkesp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMajflt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majflt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinflt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minflt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNswap(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nswap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNum_threads(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("num_threads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPgrp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pgrp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolicy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPpid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ppid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPriority(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcessor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRss(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRsslim(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rsslim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRt_priority(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rt_priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSession(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSigcatch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sigcatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSigignore(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sigignore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartcode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startcode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartstack(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startstack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStarttime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starttime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTpgid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tpgid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTty_nr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tty_nr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUtime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVsize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vsize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWchan(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wchan")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

