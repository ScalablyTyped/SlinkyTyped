package typingsSlinky.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionEvent extends js.Object {
  /**
    * The actions to be performed.
    */
  var actions: js.UndefOr[Actions] = js.native
  /**
    * Required. A Boolean expression that when TRUE causes the actions to be performed and the nextState to be entered.
    */
  var condition: Condition = js.native
  /**
    * The name of the transition event.
    */
  var eventName: EventName = js.native
  /**
    * The next state to enter.
    */
  var nextState: StateName = js.native
}

object TransitionEvent {
  @scala.inline
  def apply(condition: Condition, eventName: EventName, nextState: StateName): TransitionEvent = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any], nextState = nextState.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionEvent]
  }
  @scala.inline
  implicit class TransitionEventOps[Self <: TransitionEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCondition(value: Condition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventName(value: EventName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextState(value: StateName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActions(value: Actions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(js.undefined)
        ret
    }
  }
  
}

