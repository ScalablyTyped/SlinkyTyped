package typingsSlinky.mobx.interceptUtilsMod

import typingsSlinky.mobx.utilsMod.Lambda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInterceptable[T] extends js.Object {
  var interceptors: js.UndefOr[js.Array[IInterceptor[T]]] = js.native
  def intercept(handler: IInterceptor[T]): Lambda = js.native
}

object IInterceptable {
  @scala.inline
  def apply[T](intercept: IInterceptor[T] => Lambda): IInterceptable[T] = {
    val __obj = js.Dynamic.literal(intercept = js.Any.fromFunction1(intercept))
    __obj.asInstanceOf[IInterceptable[T]]
  }
  @scala.inline
  implicit class IInterceptableOps[Self[t] <: IInterceptable[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withIntercept(value: IInterceptor[T] => Lambda): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intercept")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInterceptors(value: js.Array[IInterceptor[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interceptors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterceptors: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interceptors")(js.undefined)
        ret
    }
  }
  
}

