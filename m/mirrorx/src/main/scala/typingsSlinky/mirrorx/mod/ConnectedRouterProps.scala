package typingsSlinky.mirrorx.mod

import typingsSlinky.history.mod.History
import typingsSlinky.history.mod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectedRouterProps[State] extends js.Object {
  var history: js.UndefOr[History[LocationState]] = js.native
  var store: js.UndefOr[js.Any] = js.native
}

object ConnectedRouterProps {
  @scala.inline
  def apply[State](): ConnectedRouterProps[State] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectedRouterProps[State]]
  }
  @scala.inline
  implicit class ConnectedRouterPropsOps[Self[state] <: ConnectedRouterProps[state], State] (val x: Self[State]) extends AnyVal {
    @scala.inline
    def duplicate: Self[State] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[State]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[State] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[State] with Other]
    @scala.inline
    def withHistory(value: History[LocationState]): Self[State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHistory: Self[State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(js.undefined)
        ret
    }
    @scala.inline
    def withStore(value: js.Any): Self[State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStore: Self[State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(js.undefined)
        ret
    }
  }
  
}

