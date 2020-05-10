package typingsSlinky.rotJs.eventqueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventQueue[T] extends js.Object {
  var _eventTimes: js.Array[Double] = js.native
  var _events: js.Array[T] = js.native
  var _time: Double = js.native
  /**
    * Remove an event from the queue
    * @param {int} index
    */
  def _remove(index: Double): Unit = js.native
  /**
    * @param {?} event
    * @param {number} time
    */
  def add(event: T, time: Double): Unit = js.native
  /**
    * Clear all scheduled events
    */
  def clear(): this.type = js.native
  /**
    * Locates the nearest event, advances time if necessary. Returns that event and removes it from the queue.
    * @returns {? || null} The event previously added by addEvent, null if no event available
    */
  def get(): T | Null = js.native
  /**
    * Get the time associated with the given event
    * @param {?} event
    * @returns {number} time
    */
  def getEventTime(event: T): js.UndefOr[Double] = js.native
  /**
    * @returns {number} Elapsed time
    */
  def getTime(): Double = js.native
  /**
    * Remove an event from the queue
    * @param {?} event
    * @returns {bool} success?
    */
  def remove(event: T): Boolean = js.native
}

object EventQueue {
  @scala.inline
  def apply[T](
    _eventTimes: js.Array[Double],
    _events: js.Array[T],
    _remove: Double => Unit,
    _time: Double,
    add: (T, Double) => Unit,
    clear: () => EventQueue[T],
    get: () => T | Null,
    getEventTime: T => js.UndefOr[Double],
    getTime: () => Double,
    remove: T => Boolean
  ): EventQueue[T] = {
    val __obj = js.Dynamic.literal(_eventTimes = _eventTimes.asInstanceOf[js.Any], _events = _events.asInstanceOf[js.Any], _remove = js.Any.fromFunction1(_remove), _time = _time.asInstanceOf[js.Any], add = js.Any.fromFunction2(add), clear = js.Any.fromFunction0(clear), get = js.Any.fromFunction0(get), getEventTime = js.Any.fromFunction1(getEventTime), getTime = js.Any.fromFunction0(getTime), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[EventQueue[T]]
  }
  @scala.inline
  implicit class EventQueueOps[Self[t] <: EventQueue[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def with_eventTimes(value: js.Array[Double]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_eventTimes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_events(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_remove(value: Double => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def with_time(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdd(value: (T, Double) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withClear(value: () => EventQueue[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet(value: () => T | Null): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetEventTime(value: T => js.UndefOr[Double]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEventTime")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetTime(value: () => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTime")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemove(value: T => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

