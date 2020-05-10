package typingsSlinky.kosCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDispatch extends js.Object {
  var dispatch: js.Any = js.native
  var getState: js.Any = js.native
}

object AnonDispatch {
  @scala.inline
  def apply(dispatch: js.Any, getState: js.Any): AnonDispatch = {
    val __obj = js.Dynamic.literal(dispatch = dispatch.asInstanceOf[js.Any], getState = getState.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDispatch]
  }
  @scala.inline
  implicit class AnonDispatchOps[Self <: AnonDispatch] (val x: Self) extends AnyVal {
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

