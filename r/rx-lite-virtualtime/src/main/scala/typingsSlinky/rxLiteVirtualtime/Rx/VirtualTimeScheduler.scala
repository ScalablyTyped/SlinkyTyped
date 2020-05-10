package typingsSlinky.rxLiteVirtualtime.Rx

import typingsSlinky.rxCore.Rx.IDisposable
import typingsSlinky.rxLite.Rx.IScheduler
import typingsSlinky.rxLite.Rx.internals.ScheduledItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualTimeScheduler[TAbsolute, TRelative] extends IScheduler {
  var isEnabled: Boolean = js.native
  /* protected abstract */ def add(from: TAbsolute, by: TRelative): TAbsolute = js.native
  // protected constructor(initialClock: TAbsolute, comparer: (first: TAbsolute, second: TAbsolute) => number);
  def advanceBy(time: TRelative): Unit = js.native
  def advanceTo(time: TAbsolute): Unit = js.native
  /* protected */ def getNext(): ScheduledItem[TAbsolute] = js.native
  def scheduleAbsolute(dueTime: TAbsolute, action: js.Function0[Unit]): IDisposable = js.native
  def scheduleAbsoluteWithState[TState](
    state: TState,
    dueTime: TAbsolute,
    action: js.Function2[/* scheduler */ typingsSlinky.rxCore.Rx.IScheduler, /* state */ TState, IDisposable]
  ): IDisposable = js.native
  def scheduleRelative(dueTime: TRelative, action: js.Function0[Unit]): IDisposable = js.native
  def scheduleRelativeWithState[TState](
    state: TState,
    dueTime: TRelative,
    action: js.Function2[/* scheduler */ typingsSlinky.rxCore.Rx.IScheduler, /* state */ TState, IDisposable]
  ): IDisposable = js.native
  def sleep(time: TRelative): Unit = js.native
  def start(): IDisposable = js.native
  def stop(): Unit = js.native
  /* protected abstract */ def toDateTimeOffset(duetime: TAbsolute): Double = js.native
  /* protected abstract */ def toRelative(duetime: Double): TRelative = js.native
}

object VirtualTimeScheduler {
  @scala.inline
  def apply[TAbsolute, TRelative](
    add: (TAbsolute, TRelative) => TAbsolute,
    advanceBy: TRelative => Unit,
    advanceTo: TAbsolute => Unit,
    getNext: () => ScheduledItem[TAbsolute],
    isEnabled: Boolean,
    isScheduler: js.Any => Boolean,
    now: () => Double,
    schedule: js.Function0[Unit] => IDisposable,
    scheduleAbsolute: (TAbsolute, js.Function0[Unit]) => IDisposable,
    scheduleAbsoluteWithState: (js.Any, TAbsolute, js.Function2[/* scheduler */ typingsSlinky.rxCore.Rx.IScheduler, js.Any, IDisposable]) => IDisposable,
    schedulePeriodic: (Double, js.Function0[Unit]) => IDisposable,
    schedulePeriodicWithState: (js.Any, Double, js.Function1[js.Any, js.Any]) => IDisposable,
    scheduleRecursive: js.Function1[/* action */ js.Function0[Unit], Unit] => IDisposable,
    scheduleRecursiveWithAbsolute: (Double, js.Function1[/* action */ js.Function1[/* dueTime */ Double, Unit], Unit]) => IDisposable,
    scheduleRecursiveWithAbsoluteAndState: (js.Any, Double, js.Function2[js.Any, /* action */ js.Function2[js.Any, /* dueTime */ Double, Unit], Unit]) => IDisposable,
    scheduleRecursiveWithRelative: (Double, js.Function1[/* action */ js.Function1[/* dueTime */ Double, Unit], Unit]) => IDisposable,
    scheduleRecursiveWithRelativeAndState: (js.Any, Double, js.Function2[js.Any, /* action */ js.Function2[js.Any, /* dueTime */ Double, Unit], Unit]) => IDisposable,
    scheduleRecursiveWithState: (js.Any, js.Function2[js.Any, /* action */ js.Function1[js.Any, Unit], Unit]) => IDisposable,
    scheduleRelative: (TRelative, js.Function0[Unit]) => IDisposable,
    scheduleRelativeWithState: (js.Any, TRelative, js.Function2[/* scheduler */ typingsSlinky.rxCore.Rx.IScheduler, js.Any, IDisposable]) => IDisposable,
    scheduleWithAbsolute: (Double, js.Function0[Unit]) => IDisposable,
    scheduleWithAbsoluteAndState: (js.Any, Double, js.Function2[VirtualTimeScheduler[TAbsolute, TRelative], js.Any, IDisposable]) => IDisposable,
    scheduleWithRelative: (Double, js.Function0[Unit]) => IDisposable,
    scheduleWithRelativeAndState: (js.Any, Double, js.Function2[VirtualTimeScheduler[TAbsolute, TRelative], js.Any, IDisposable]) => IDisposable,
    scheduleWithState: (js.Any, js.Function2[VirtualTimeScheduler[TAbsolute, TRelative], js.Any, IDisposable]) => IDisposable,
    sleep: TRelative => Unit,
    start: () => IDisposable,
    stop: () => Unit,
    toDateTimeOffset: TAbsolute => Double,
    toRelative: Double => TRelative
  ): VirtualTimeScheduler[TAbsolute, TRelative] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), advanceBy = js.Any.fromFunction1(advanceBy), advanceTo = js.Any.fromFunction1(advanceTo), getNext = js.Any.fromFunction0(getNext), isEnabled = isEnabled.asInstanceOf[js.Any], isScheduler = js.Any.fromFunction1(isScheduler), now = js.Any.fromFunction0(now), schedule = js.Any.fromFunction1(schedule), scheduleAbsolute = js.Any.fromFunction2(scheduleAbsolute), scheduleAbsoluteWithState = js.Any.fromFunction3(scheduleAbsoluteWithState), schedulePeriodic = js.Any.fromFunction2(schedulePeriodic), schedulePeriodicWithState = js.Any.fromFunction3(schedulePeriodicWithState), scheduleRecursive = js.Any.fromFunction1(scheduleRecursive), scheduleRecursiveWithAbsolute = js.Any.fromFunction2(scheduleRecursiveWithAbsolute), scheduleRecursiveWithAbsoluteAndState = js.Any.fromFunction3(scheduleRecursiveWithAbsoluteAndState), scheduleRecursiveWithRelative = js.Any.fromFunction2(scheduleRecursiveWithRelative), scheduleRecursiveWithRelativeAndState = js.Any.fromFunction3(scheduleRecursiveWithRelativeAndState), scheduleRecursiveWithState = js.Any.fromFunction2(scheduleRecursiveWithState), scheduleRelative = js.Any.fromFunction2(scheduleRelative), scheduleRelativeWithState = js.Any.fromFunction3(scheduleRelativeWithState), scheduleWithAbsolute = js.Any.fromFunction2(scheduleWithAbsolute), scheduleWithAbsoluteAndState = js.Any.fromFunction3(scheduleWithAbsoluteAndState), scheduleWithRelative = js.Any.fromFunction2(scheduleWithRelative), scheduleWithRelativeAndState = js.Any.fromFunction3(scheduleWithRelativeAndState), scheduleWithState = js.Any.fromFunction2(scheduleWithState), sleep = js.Any.fromFunction1(sleep), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop), toDateTimeOffset = js.Any.fromFunction1(toDateTimeOffset), toRelative = js.Any.fromFunction1(toRelative))
    __obj.asInstanceOf[VirtualTimeScheduler[TAbsolute, TRelative]]
  }
  @scala.inline
  implicit class VirtualTimeSchedulerOps[Self[tabsolute, trelative] <: VirtualTimeScheduler[tabsolute, trelative], TAbsolute, TRelative] (val x: Self[TAbsolute, TRelative]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TAbsolute, TRelative] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TAbsolute, TRelative]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TAbsolute, TRelative]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TAbsolute, TRelative]) with Other]
    @scala.inline
    def withAdd(value: (TAbsolute, TRelative) => TAbsolute): Self[TAbsolute, TRelative] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAdvanceBy(value: TRelative => Unit): Self[TAbsolute, TRelative] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advanceBy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAdvanceTo(value: TAbsolute => Unit): Self[TAbsolute, TRelative] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advanceTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetNext(value: () => ScheduledItem[TAbsolute]): Self[TAbsolute, TRelative] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNext")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsEnabled(value: Boolean): Self[TAbsolute, TRelative] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScheduleAbsolute(value: (TAbsolute, js.Function0[Unit]) => IDisposable): Self[TAbsolute, TRelative] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleAbsolute")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withScheduleAbsoluteWithState(
      value: (js.Any, TAbsolute, js.Function2[/* scheduler */ typingsSlinky.rxCore.Rx.IScheduler, js.Any, IDisposable]) => IDisposable
    ): Self[TAbsolute, TRelative] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleAbsoluteWithState")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withScheduleRelative(value: (TRelative, js.Function0[Unit]) => IDisposable): Self[TAbsolute, TRelative] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleRelative")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withScheduleRelativeWithState(
      value: (js.Any, TRelative, js.Function2[/* scheduler */ typingsSlinky.rxCore.Rx.IScheduler, js.Any, IDisposable]) => IDisposable
    ): Self[TAbsolute, TRelative] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleRelativeWithState")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSleep(value: TRelative => Unit): Self[TAbsolute, TRelative] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sleep")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStart(value: () => IDisposable): Self[TAbsolute, TRelative] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStop(value: () => Unit): Self[TAbsolute, TRelative] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToDateTimeOffset(value: TAbsolute => Double): Self[TAbsolute, TRelative] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toDateTimeOffset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToRelative(value: Double => TRelative): Self[TAbsolute, TRelative] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toRelative")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

