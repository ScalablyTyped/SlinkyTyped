package typingsSlinky.grpcGrpcJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Console> */
@js.native
trait PartialConsole extends js.Object {
  var assert: js.UndefOr[js.Function0[Unit]] = js.native
  var clear: js.UndefOr[js.Function0[Unit]] = js.native
  var count: js.UndefOr[js.Function0[Unit]] = js.native
  var debug: js.UndefOr[js.Function0[Unit]] = js.native
  var dir: js.UndefOr[js.Function0[Unit]] = js.native
  var dirxml: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.native
  var error: js.UndefOr[js.Function0[Unit]] = js.native
  var exception: js.UndefOr[js.Function0[Unit]] = js.native
  var group: js.UndefOr[js.Function0[Unit]] = js.native
  var groupCollapsed: js.UndefOr[js.Function0[Unit]] = js.native
  var groupEnd: js.UndefOr[js.Function0[Unit]] = js.native
  var info: js.UndefOr[js.Function0[Unit]] = js.native
  var log: js.UndefOr[js.Function0[Unit]] = js.native
  var markTimeline: js.UndefOr[js.Function0[Unit]] = js.native
  var memory: js.UndefOr[js.Any] = js.native
  var profile: js.UndefOr[js.Function0[Unit]] = js.native
  var profileEnd: js.UndefOr[js.Function0[Unit]] = js.native
  var table: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  var time: js.UndefOr[js.Function0[Unit]] = js.native
  var timeEnd: js.UndefOr[js.Function0[Unit]] = js.native
  var timeStamp: js.UndefOr[js.Function0[Unit]] = js.native
  var timeline: js.UndefOr[js.Function0[Unit]] = js.native
  var timelineEnd: js.UndefOr[js.Function0[Unit]] = js.native
  var trace: js.UndefOr[js.Function0[Unit]] = js.native
  var warn: js.UndefOr[js.Function0[Unit]] = js.native
}

object PartialConsole {
  @scala.inline
  def apply(): PartialConsole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialConsole]
  }
  @scala.inline
  implicit class PartialConsoleOps[Self <: PartialConsole] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssert(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assert")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAssert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assert")(js.undefined)
        ret
    }
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutClear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.undefined)
        ret
    }
    @scala.inline
    def withCount(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withDir(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(js.undefined)
        ret
    }
    @scala.inline
    def withDirxml(value: /* value */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirxml")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDirxml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirxml")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withException(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exception")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutException: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exception")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupCollapsed(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupCollapsed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGroupCollapsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupCollapsed")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupEnd(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGroupEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withInfo(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(js.undefined)
        ret
    }
    @scala.inline
    def withLog(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutLog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkTimeline(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markTimeline")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutMarkTimeline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markTimeline")(js.undefined)
        ret
    }
    @scala.inline
    def withMemory(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memory")(js.undefined)
        ret
    }
    @scala.inline
    def withProfile(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(js.undefined)
        ret
    }
    @scala.inline
    def withProfileEnd(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutProfileEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withTable(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(js.undefined)
        ret
    }
    @scala.inline
    def withTime(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeEnd(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutTimeEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeStamp(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeStamp")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutTimeStamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeStamp")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeline(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeline")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutTimeline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeline")(js.undefined)
        ret
    }
    @scala.inline
    def withTimelineEnd(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timelineEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutTimelineEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timelineEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withTrace(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trace")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutTrace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trace")(js.undefined)
        ret
    }
    @scala.inline
    def withWarn(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warn")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutWarn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warn")(js.undefined)
        ret
    }
  }
  
}

