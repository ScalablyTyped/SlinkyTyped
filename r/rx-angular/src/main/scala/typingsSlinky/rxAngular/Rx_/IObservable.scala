package typingsSlinky.rxAngular.Rx_

import typingsSlinky.angular.mod.IScope
import typingsSlinky.rxLiteAggregates.Rx.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObservable[T] extends js.Object {
  def safeApply($scope: IScope, callback: js.Function1[/* data */ T, Unit]): Observable[T] = js.native
}

object IObservable {
  @scala.inline
  def apply[T](safeApply: (IScope, js.Function1[/* data */ T, Unit]) => Observable[T]): IObservable[T] = {
    val __obj = js.Dynamic.literal(safeApply = js.Any.fromFunction2(safeApply))
    __obj.asInstanceOf[IObservable[T]]
  }
  @scala.inline
  implicit class IObservableOps[Self[t] <: IObservable[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withSafeApply(value: (IScope, js.Function1[/* data */ T, Unit]) => Observable[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeApply")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

