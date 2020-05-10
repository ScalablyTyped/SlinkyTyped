package typingsSlinky.awsSdk.ioteventsdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectorState extends js.Object {
  /**
    * The name of the state.
    */
  var stateName: StateName = js.native
  /**
    * The current state of the detector's timers.
    */
  var timers: Timers = js.native
  /**
    * The current values of the detector's variables.
    */
  var variables: Variables = js.native
}

object DetectorState {
  @scala.inline
  def apply(stateName: StateName, timers: Timers, variables: Variables): DetectorState = {
    val __obj = js.Dynamic.literal(stateName = stateName.asInstanceOf[js.Any], timers = timers.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectorState]
  }
  @scala.inline
  implicit class DetectorStateOps[Self <: DetectorState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStateName(value: StateName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimers(value: Timers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariables(value: Variables): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

