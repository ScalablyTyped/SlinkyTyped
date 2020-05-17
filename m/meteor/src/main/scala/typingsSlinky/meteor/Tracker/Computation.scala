package typingsSlinky.meteor.Tracker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Computation extends js.Object {
  var firstRun: Boolean = js.native
  var invalidated: Boolean = js.native
  var stopped: Boolean = js.native
  def invalidate(): Unit = js.native
  def onInvalidate(callback: js.Function): Unit = js.native
  def onStop(callback: js.Function): Unit = js.native
  def stop(): Unit = js.native
}

object Computation {
  @scala.inline
  def apply(
    firstRun: Boolean,
    invalidate: () => Unit,
    invalidated: Boolean,
    onInvalidate: js.Function => Unit,
    onStop: js.Function => Unit,
    stop: () => Unit,
    stopped: Boolean
  ): Computation = {
    val __obj = js.Dynamic.literal(firstRun = firstRun.asInstanceOf[js.Any], invalidate = js.Any.fromFunction0(invalidate), invalidated = invalidated.asInstanceOf[js.Any], onInvalidate = js.Any.fromFunction1(onInvalidate), onStop = js.Any.fromFunction1(onStop), stop = js.Any.fromFunction0(stop), stopped = stopped.asInstanceOf[js.Any])
    __obj.asInstanceOf[Computation]
  }
  @scala.inline
  implicit class ComputationOps[Self <: Computation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFirstRun(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvalidate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInvalidated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnInvalidate(value: js.Function => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInvalidate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnStop(value: js.Function => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStop(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStopped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopped")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

