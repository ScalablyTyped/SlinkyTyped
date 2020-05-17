package typingsSlinky.kosCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dispatch extends js.Object {
  var dispatch: js.Any = js.native
  var getState: js.Any = js.native
}

object Dispatch {
  @scala.inline
  def apply(dispatch: js.Any, getState: js.Any): Dispatch = {
    val __obj = js.Dynamic.literal(dispatch = dispatch.asInstanceOf[js.Any], getState = getState.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dispatch]
  }
  @scala.inline
  implicit class DispatchOps[Self <: Dispatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDispatch(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetState(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getState")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

