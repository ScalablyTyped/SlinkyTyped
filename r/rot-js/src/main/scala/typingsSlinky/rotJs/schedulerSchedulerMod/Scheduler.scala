package typingsSlinky.rotJs.schedulerSchedulerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scheduler[T] extends js.Object {
  var _current: js.Any = js.native
  var _queue: typingsSlinky.rotJs.eventqueueMod.default[T] = js.native
  var _repeat: js.Array[T] = js.native
  /**
    * @param {?} item
    * @param {bool} repeat
    */
  def add(item: T, repeat: Boolean): this.type = js.native
  /**
    * Clear all items
    */
  def clear(): this.type = js.native
  /**
    * @see ROT.EventQueue#getTime
    */
  def getTime(): Double = js.native
  /**
    * Get the time the given item is scheduled for
    * @param {?} item
    * @returns {number} time
    */
  def getTimeOf(item: T): js.UndefOr[Double] = js.native
  /**
    * Schedule next item
    * @returns {?}
    */
  def next(): js.Any = js.native
  /**
    * Remove a previously added item
    * @param {?} item
    * @returns {bool} successful?
    */
  def remove(item: js.Any): Boolean = js.native
}

object Scheduler {
  @scala.inline
  def apply[T](
    _current: js.Any,
    _queue: typingsSlinky.rotJs.eventqueueMod.default[T],
    _repeat: js.Array[T],
    add: (T, Boolean) => Scheduler[T],
    clear: () => Scheduler[T],
    getTime: () => Double,
    getTimeOf: T => js.UndefOr[Double],
    next: () => js.Any,
    remove: js.Any => Boolean
  ): Scheduler[T] = {
    val __obj = js.Dynamic.literal(_current = _current.asInstanceOf[js.Any], _queue = _queue.asInstanceOf[js.Any], _repeat = _repeat.asInstanceOf[js.Any], add = js.Any.fromFunction2(add), clear = js.Any.fromFunction0(clear), getTime = js.Any.fromFunction0(getTime), getTimeOf = js.Any.fromFunction1(getTimeOf), next = js.Any.fromFunction0(next), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[Scheduler[T]]
  }
  @scala.inline
  implicit class SchedulerOps[Self[t] <: Scheduler[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def with_current(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_current")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_queue(value: typingsSlinky.rotJs.eventqueueMod.default[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_queue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_repeat(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_repeat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdd(value: (T, Boolean) => Scheduler[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withClear(value: () => Scheduler[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTime(value: () => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTime")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTimeOf(value: T => js.UndefOr[Double]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTimeOf")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNext(value: () => js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemove(value: js.Any => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

