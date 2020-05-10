package typingsSlinky.knockoutProjections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDisposeItem[T, TResult] extends js.Object {
  var disposeItem: js.UndefOr[js.Function1[/* mappedItem */ TResult, Unit]] = js.native
  def mapping(value: T): TResult = js.native
}

object AnonDisposeItem {
  @scala.inline
  def apply[T, TResult](mapping: T => TResult): AnonDisposeItem[T, TResult] = {
    val __obj = js.Dynamic.literal(mapping = js.Any.fromFunction1(mapping))
    __obj.asInstanceOf[AnonDisposeItem[T, TResult]]
  }
  @scala.inline
  implicit class AnonDisposeItemOps[Self[t, tresult] <: AnonDisposeItem[t, tresult], T, TResult] (val x: Self[T, TResult]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, TResult] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, TResult]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, TResult]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, TResult]) with Other]
    @scala.inline
    def withMapping(value: T => TResult): Self[T, TResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapping")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDisposeItem(value: /* mappedItem */ TResult => Unit): Self[T, TResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disposeItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDisposeItem: Self[T, TResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disposeItem")(js.undefined)
        ret
    }
  }
  
}

