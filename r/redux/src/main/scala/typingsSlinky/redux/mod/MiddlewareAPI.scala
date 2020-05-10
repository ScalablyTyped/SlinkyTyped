package typingsSlinky.redux.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MiddlewareAPI[D /* <: Dispatch[AnyAction] */, S] extends js.Object {
  var dispatch: D = js.native
  def getState(): S = js.native
}

object MiddlewareAPI {
  @scala.inline
  def apply[D, S](dispatch: D, getState: () => S): MiddlewareAPI[D, S] = {
    val __obj = js.Dynamic.literal(dispatch = dispatch.asInstanceOf[js.Any], getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[MiddlewareAPI[D, S]]
  }
  @scala.inline
  implicit class MiddlewareAPIOps[Self[d, s] <: MiddlewareAPI[d, s], D, S] (val x: Self[D, S]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D, S] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D, S]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[D, S]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[D, S]) with Other]
    @scala.inline
    def withDispatch(value: D): Self[D, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetState(value: () => S): Self[D, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getState")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

