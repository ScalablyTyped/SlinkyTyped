package typingsSlinky.rxLite.Rx.internals

import typingsSlinky.rxCore.Rx.IDisposable
import typingsSlinky.rxLite.Rx.IScheduler
import typingsSlinky.rxLite.Rx.SingleAssignmentDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduledItem[TTime] extends js.Object {
  var disposable: SingleAssignmentDisposable = js.native
  var dueTime: TTime = js.native
  var scheduler: IScheduler = js.native
  var state: TTime = js.native
  def action(scheduler: IScheduler, state: js.Any): IDisposable = js.native
  def compareTo(other: ScheduledItem[TTime]): Double = js.native
  def comparer(x: TTime, y: TTime): Double = js.native
  def invoke(): Unit = js.native
  def invokeCore(): IDisposable = js.native
  def isCancelled(): Boolean = js.native
}

object ScheduledItem {
  @scala.inline
  def apply[TTime](
    action: (IScheduler, js.Any) => IDisposable,
    compareTo: ScheduledItem[TTime] => Double,
    comparer: (TTime, TTime) => Double,
    disposable: SingleAssignmentDisposable,
    dueTime: TTime,
    invoke: () => Unit,
    invokeCore: () => IDisposable,
    isCancelled: () => Boolean,
    scheduler: IScheduler,
    state: TTime
  ): ScheduledItem[TTime] = {
    val __obj = js.Dynamic.literal(action = js.Any.fromFunction2(action), compareTo = js.Any.fromFunction1(compareTo), comparer = js.Any.fromFunction2(comparer), disposable = disposable.asInstanceOf[js.Any], dueTime = dueTime.asInstanceOf[js.Any], invoke = js.Any.fromFunction0(invoke), invokeCore = js.Any.fromFunction0(invokeCore), isCancelled = js.Any.fromFunction0(isCancelled), scheduler = scheduler.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduledItem[TTime]]
  }
  @scala.inline
  implicit class ScheduledItemOps[Self[ttime] <: ScheduledItem[ttime], TTime] (val x: Self[TTime]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TTime] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TTime]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TTime] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TTime] with Other]
    @scala.inline
    def withAction(value: (IScheduler, js.Any) => IDisposable): Self[TTime] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCompareTo(value: ScheduledItem[TTime] => Double): Self[TTime] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComparer(value: (TTime, TTime) => Double): Self[TTime] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDisposable(value: SingleAssignmentDisposable): Self[TTime] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disposable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDueTime(value: TTime): Self[TTime] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dueTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvoke(value: () => Unit): Self[TTime] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoke")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInvokeCore(value: () => IDisposable): Self[TTime] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invokeCore")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsCancelled(value: () => Boolean): Self[TTime] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCancelled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withScheduler(value: IScheduler): Self[TTime] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: TTime): Self[TTime] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

