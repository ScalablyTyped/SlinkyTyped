package typingsSlinky.reactNavigation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationEventPayload extends js.Object {
  var action: NavigationAction = js.native
  var lastState: js.UndefOr[NavigationState | Null] = js.native
  var state: NavigationState = js.native
  var `type`: EventType = js.native
}

object NavigationEventPayload {
  @scala.inline
  def apply(action: NavigationAction, state: NavigationState, `type`: EventType): NavigationEventPayload = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationEventPayload]
  }
  @scala.inline
  implicit class NavigationEventPayloadOps[Self <: NavigationEventPayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: NavigationAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: NavigationState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: EventType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastState(value: NavigationState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastState")(js.undefined)
        ret
    }
    @scala.inline
    def withLastStateNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastState")(null)
        ret
    }
  }
  
}

