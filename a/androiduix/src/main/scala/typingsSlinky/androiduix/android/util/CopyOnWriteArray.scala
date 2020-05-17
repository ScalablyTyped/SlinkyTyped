package typingsSlinky.androiduix.android.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyOnWriteArray[T] extends js.Object {
  var mAccess: js.Any = js.native
  var mData: js.Any = js.native
  var mDataCopy: js.Any = js.native
  var mStart: js.Any = js.native
  def add(items: T*): Unit = js.native
  def addAll(array: CopyOnWriteArray[T]): Unit = js.native
  def end(): Unit = js.native
  /* private */ def getArray(): js.Any = js.native
  def remove(item: T): Unit = js.native
  def size(): Double = js.native
  def start(): js.Array[T] = js.native
}

object CopyOnWriteArray {
  @scala.inline
  def apply[T](
    add: /* repeated */ T => Unit,
    addAll: CopyOnWriteArray[T] => Unit,
    end: () => Unit,
    getArray: () => js.Any,
    mAccess: js.Any,
    mData: js.Any,
    mDataCopy: js.Any,
    mStart: js.Any,
    remove: T => Unit,
    size: () => Double,
    start: () => js.Array[T]
  ): CopyOnWriteArray[T] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), addAll = js.Any.fromFunction1(addAll), end = js.Any.fromFunction0(end), getArray = js.Any.fromFunction0(getArray), mAccess = mAccess.asInstanceOf[js.Any], mData = mData.asInstanceOf[js.Any], mDataCopy = mDataCopy.asInstanceOf[js.Any], mStart = mStart.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove), size = js.Any.fromFunction0(size), start = js.Any.fromFunction0(start))
    __obj.asInstanceOf[CopyOnWriteArray[T]]
  }
  @scala.inline
  implicit class CopyOnWriteArrayOps[Self[t] <: CopyOnWriteArray[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAdd(value: /* repeated */ T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddAll(value: CopyOnWriteArray[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addAll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEnd(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetArray(value: () => js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getArray")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMAccess(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mAccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMData(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDataCopy(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDataCopy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMStart(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemove(value: T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSize(value: () => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStart(value: () => js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

