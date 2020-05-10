package typingsSlinky.reactRedux.mod

import typingsSlinky.redux.mod.Action
import typingsSlinky.redux.mod.Dispatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DispatchProp[A /* <: Action[_] */] extends js.Object {
  var dispatch: Dispatch[A] = js.native
}

object DispatchProp {
  @scala.inline
  def apply[A](dispatch: A => A): DispatchProp[A] = {
    val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch))
    __obj.asInstanceOf[DispatchProp[A]]
  }
  @scala.inline
  implicit class DispatchPropOps[Self[a] <: DispatchProp[a], A] (val x: Self[A]) extends AnyVal {
    @scala.inline
    def duplicate: Self[A] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[A]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[A] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[A] with Other]
    @scala.inline
    def withDispatch(value: A => A): Self[A] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatch")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

