package typingsSlinky.reachRouter.mod

import typingsSlinky.history.mod.LocationState
import typingsSlinky.reachRouter.AnonPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatchRenderProps[TParams] extends js.Object {
  var location: WindowLocation[LocationState] = js.native
  var `match`: Null | (AnonPath with TParams) = js.native
  var navigate: NavigateFn = js.native
}

object MatchRenderProps {
  @scala.inline
  def apply[TParams](location: WindowLocation[LocationState], navigate: NavigateFn): MatchRenderProps[TParams] = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], navigate = navigate.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchRenderProps[TParams]]
  }
  @scala.inline
  implicit class MatchRenderPropsOps[Self[tparams] <: MatchRenderProps[tparams], TParams] (val x: Self[TParams]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TParams] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TParams]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TParams] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TParams] with Other]
    @scala.inline
    def withLocation(value: WindowLocation[LocationState]): Self[TParams] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNavigate(value: NavigateFn): Self[TParams] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatch(value: AnonPath with TParams): Self[TParams] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatchNull: Self[TParams] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(null)
        ret
    }
  }
  
}

