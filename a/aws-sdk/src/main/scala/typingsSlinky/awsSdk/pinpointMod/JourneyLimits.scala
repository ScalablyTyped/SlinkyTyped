package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JourneyLimits extends js.Object {
  /**
    * The maximum number of messages that the journey can send to a single participant during a 24-hour period. The maximum value is 100.
    */
  var DailyCap: js.UndefOr[integer] = js.native
  /**
    * The maximum number of times that a participant can enter the journey. The maximum value is 100. To allow participants to enter the journey an unlimited number of times, set this value to 0.
    */
  var EndpointReentryCap: js.UndefOr[integer] = js.native
  /**
    * The maximum number of messages that the journey can send each second.
    */
  var MessagesPerSecond: js.UndefOr[integer] = js.native
}

object JourneyLimits {
  @scala.inline
  def apply(): JourneyLimits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JourneyLimits]
  }
  @scala.inline
  implicit class JourneyLimitsOps[Self <: JourneyLimits] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDailyCap(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DailyCap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDailyCap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DailyCap")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpointReentryCap(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointReentryCap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpointReentryCap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointReentryCap")(js.undefined)
        ret
    }
    @scala.inline
    def withMessagesPerSecond(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessagesPerSecond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessagesPerSecond: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessagesPerSecond")(js.undefined)
        ret
    }
  }
  
}

