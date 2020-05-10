package typingsSlinky.emissary.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEmitter extends js.Object {
  def behavior(eventName: String, initialValue: js.Any): Unit = js.native
  def decrementSubscriptionCount(eventName: String): Double = js.native
  def emit(eventName: String, args: js.Any*): Unit = js.native
  def getSubscriptionCount(eventName: String): Double = js.native
  def hasSubscriptions(eventName: String): Boolean = js.native
  def incrementSubscriptionCount(eventName: String): Double = js.native
  def off(eventNames: String, handler: js.Function): Unit = js.native
  def on(eventNames: String, handler: js.Function): js.Any = js.native
   // return value type are Signal
  def once(eventName: String, handler: js.Function): js.Any = js.native
  def pauseEvents(eventNames: String): Unit = js.native
  def resumeEvents(eventNames: String): Unit = js.native
   // return value type are Signal
  def signal(eventName: String): Unit = js.native
}

object IEmitter {
  @scala.inline
  def apply(
    behavior: (String, js.Any) => Unit,
    decrementSubscriptionCount: String => Double,
    emit: (String, /* repeated */ js.Any) => Unit,
    getSubscriptionCount: String => Double,
    hasSubscriptions: String => Boolean,
    incrementSubscriptionCount: String => Double,
    off: (String, js.Function) => Unit,
    on: (String, js.Function) => js.Any,
    once: (String, js.Function) => js.Any,
    pauseEvents: String => Unit,
    resumeEvents: String => Unit,
    signal: String => Unit
  ): IEmitter = {
    val __obj = js.Dynamic.literal(behavior = js.Any.fromFunction2(behavior), decrementSubscriptionCount = js.Any.fromFunction1(decrementSubscriptionCount), emit = js.Any.fromFunction2(emit), getSubscriptionCount = js.Any.fromFunction1(getSubscriptionCount), hasSubscriptions = js.Any.fromFunction1(hasSubscriptions), incrementSubscriptionCount = js.Any.fromFunction1(incrementSubscriptionCount), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once), pauseEvents = js.Any.fromFunction1(pauseEvents), resumeEvents = js.Any.fromFunction1(resumeEvents), signal = js.Any.fromFunction1(signal))
    __obj.asInstanceOf[IEmitter]
  }
  @scala.inline
  implicit class IEmitterOps[Self <: IEmitter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBehavior(value: (String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("behavior")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDecrementSubscriptionCount(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decrementSubscriptionCount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEmit(value: (String, /* repeated */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emit")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetSubscriptionCount(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSubscriptionCount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHasSubscriptions(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasSubscriptions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIncrementSubscriptionCount(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incrementSubscriptionCount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOff(value: (String, js.Function) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("off")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOn(value: (String, js.Function) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnce(value: (String, js.Function) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("once")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPauseEvents(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseEvents")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResumeEvents(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resumeEvents")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSignal(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signal")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

