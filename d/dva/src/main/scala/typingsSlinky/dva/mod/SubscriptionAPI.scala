package typingsSlinky.dva.mod

import typingsSlinky.history.mod.History
import typingsSlinky.history.mod.LocationState
import typingsSlinky.redux.mod.Dispatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionAPI extends js.Object {
  var dispatch: Dispatch[_] = js.native
  var history: History[LocationState] = js.native
}

object SubscriptionAPI {
  @scala.inline
  def apply(dispatch: _ => _, history: History[LocationState]): SubscriptionAPI = {
    val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch), history = history.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionAPI]
  }
  @scala.inline
  implicit class SubscriptionAPIOps[Self <: SubscriptionAPI] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDispatch(value: _ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHistory(value: History[LocationState]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

