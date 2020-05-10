package typingsSlinky.gatsby.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Store extends js.Object {
  var dispatch: js.Function = js.native
  var getState: js.Function = js.native
  var replaceReducer: js.Function = js.native
  var subscribe: js.Function = js.native
}

object Store {
  @scala.inline
  def apply(dispatch: js.Function, getState: js.Function, replaceReducer: js.Function, subscribe: js.Function): Store = {
    val __obj = js.Dynamic.literal(dispatch = dispatch.asInstanceOf[js.Any], getState = getState.asInstanceOf[js.Any], replaceReducer = replaceReducer.asInstanceOf[js.Any], subscribe = subscribe.asInstanceOf[js.Any])
    __obj.asInstanceOf[Store]
  }
  @scala.inline
  implicit class StoreOps[Self <: Store] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDispatch(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetState(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplaceReducer(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceReducer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscribe(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribe")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

