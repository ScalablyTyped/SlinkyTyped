package typingsSlinky.agGrid.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExternalPromise[T] extends js.Object {
  var promise: Promise[T] = js.native
  def resolve(value: T): Unit = js.native
}

object ExternalPromise {
  @scala.inline
  def apply[T](promise: Promise[T], resolve: T => Unit): ExternalPromise[T] = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any], resolve = js.Any.fromFunction1(resolve))
    __obj.asInstanceOf[ExternalPromise[T]]
  }
  @scala.inline
  implicit class ExternalPromiseOps[Self[t] <: ExternalPromise[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withPromise(value: Promise[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolve(value: T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolve")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

