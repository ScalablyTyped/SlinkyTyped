package typingsSlinky.angularAnimations.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationEvent extends js.Object {
  /**
    * Internal.
    */
  var disabled: Boolean = js.native
  /**
    * The element to which the animation is attached.
    */
  var element: js.Any = js.native
  /**
    * The name of the state from which the animation is triggered.
    */
  var fromState: String = js.native
  /**
    * The animation phase in which the callback was invoked, one of
    * "start" or "done".
    */
  var phaseName: String = js.native
  /**
    * The name of the state in which the animation completes.
    */
  var toState: String = js.native
  /**
    * The time it takes the animation to complete, in milliseconds.
    */
  var totalTime: Double = js.native
  /**
    * Internal.
    */
  var triggerName: String = js.native
}

object AnimationEvent {
  @scala.inline
  def apply(
    disabled: Boolean,
    element: js.Any,
    fromState: String,
    phaseName: String,
    toState: String,
    totalTime: Double,
    triggerName: String
  ): AnimationEvent = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fromState = fromState.asInstanceOf[js.Any], phaseName = phaseName.asInstanceOf[js.Any], toState = toState.asInstanceOf[js.Any], totalTime = totalTime.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationEvent]
  }
  @scala.inline
  implicit class AnimationEventOps[Self <: AnimationEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElement(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFromState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhaseName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phaseName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriggerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

