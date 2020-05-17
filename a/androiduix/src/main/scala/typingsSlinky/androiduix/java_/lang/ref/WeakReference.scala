package typingsSlinky.androiduix.java_.lang.ref

import typingsSlinky.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WeakReference[T] extends js.Object {
  var weakMap: WeakMap[_, T] = js.native
  def clear(): Unit = js.native
  def get(): T = js.native
  def set(value: T): Unit = js.native
}

object WeakReference {
  @scala.inline
  def apply[T](clear: () => Unit, get: () => T, set: T => Unit, weakMap: WeakMap[_, T]): WeakReference[T] = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), get = js.Any.fromFunction0(get), set = js.Any.fromFunction1(set), weakMap = weakMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeakReference[T]]
  }
  @scala.inline
  implicit class WeakReferenceOps[Self[t] <: WeakReference[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withClear(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet(value: () => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSet(value: T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWeakMap(value: WeakMap[_, T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weakMap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

