package typingsSlinky.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartTimerDecisionAttributes extends js.Object {
  /**
    * The data attached to the event that can be used by the decider in subsequent workflow tasks.
    */
  var control: js.UndefOr[Data] = js.native
  /**
    *  The duration to wait before firing the timer. The duration is specified in seconds, an integer greater than or equal to 0.
    */
  var startToFireTimeout: DurationInSeconds = js.native
  /**
    *  The unique ID of the timer. The specified string must not start or end with whitespace. It must not contain a : (colon), / (slash), | (vertical bar), or any control characters (\\u0000-\\u001f | \\u007f-\\u009f). Also, it must not contain the literal string arn.
    */
  var timerId: TimerId = js.native
}

object StartTimerDecisionAttributes {
  @scala.inline
  def apply(startToFireTimeout: DurationInSeconds, timerId: TimerId): StartTimerDecisionAttributes = {
    val __obj = js.Dynamic.literal(startToFireTimeout = startToFireTimeout.asInstanceOf[js.Any], timerId = timerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartTimerDecisionAttributes]
  }
  @scala.inline
  implicit class StartTimerDecisionAttributesOps[Self <: StartTimerDecisionAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStartToFireTimeout(value: DurationInSeconds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startToFireTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimerId(value: TimerId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withControl(value: Data): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control")(js.undefined)
        ret
    }
  }
  
}

