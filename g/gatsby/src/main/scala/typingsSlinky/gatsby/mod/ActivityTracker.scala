package typingsSlinky.gatsby.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityTracker extends js.Object {
  var panic: LogErrorType = js.native
  var panicOnBuild: LogErrorType = js.native
  var span: js.Object = js.native
  def end(): js.Function0[Unit] = js.native
  def setStatus(status: String): Unit = js.native
  def start(): js.Function0[Unit] = js.native
}

object ActivityTracker {
  @scala.inline
  def apply(
    end: () => js.Function0[Unit],
    panic: (/* errorMeta */ String | js.Object, /* error */ js.UndefOr[js.Object]) => Unit,
    panicOnBuild: (/* errorMeta */ String | js.Object, /* error */ js.UndefOr[js.Object]) => Unit,
    setStatus: String => Unit,
    span: js.Object,
    start: () => js.Function0[Unit]
  ): ActivityTracker = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), panic = js.Any.fromFunction2(panic), panicOnBuild = js.Any.fromFunction2(panicOnBuild), setStatus = js.Any.fromFunction1(setStatus), span = span.asInstanceOf[js.Any], start = js.Any.fromFunction0(start))
    __obj.asInstanceOf[ActivityTracker]
  }
  @scala.inline
  implicit class ActivityTrackerOps[Self <: ActivityTracker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnd(value: () => js.Function0[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPanic(value: (/* errorMeta */ String | js.Object, /* error */ js.UndefOr[js.Object]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panic")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPanicOnBuild(value: (/* errorMeta */ String | js.Object, /* error */ js.UndefOr[js.Object]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panicOnBuild")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetStatus(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStatus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSpan(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("span")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: () => js.Function0[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

