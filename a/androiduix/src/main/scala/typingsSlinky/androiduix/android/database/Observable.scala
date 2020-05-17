package typingsSlinky.androiduix.android.database

import typingsSlinky.androiduix.java_.util.ArrayList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Observable[T] extends js.Object {
  var mObservers: ArrayList[T] = js.native
  def registerObserver(observer: T): Unit = js.native
  def unregisterAll(): Unit = js.native
  def unregisterObserver(observer: T): Unit = js.native
}

object Observable {
  @scala.inline
  def apply[T](
    mObservers: ArrayList[T],
    registerObserver: T => Unit,
    unregisterAll: () => Unit,
    unregisterObserver: T => Unit
  ): Observable[T] = {
    val __obj = js.Dynamic.literal(mObservers = mObservers.asInstanceOf[js.Any], registerObserver = js.Any.fromFunction1(registerObserver), unregisterAll = js.Any.fromFunction0(unregisterAll), unregisterObserver = js.Any.fromFunction1(unregisterObserver))
    __obj.asInstanceOf[Observable[T]]
  }
  @scala.inline
  implicit class ObservableOps[Self[t] <: Observable[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withMObservers(value: ArrayList[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mObservers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegisterObserver(value: T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerObserver")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnregisterAll(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unregisterAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUnregisterObserver(value: T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unregisterObserver")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

