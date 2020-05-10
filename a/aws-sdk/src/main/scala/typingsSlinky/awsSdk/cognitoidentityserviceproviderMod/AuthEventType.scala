package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthEventType extends js.Object {
  /**
    * The challenge responses.
    */
  var ChallengeResponses: js.UndefOr[ChallengeResponseListType] = js.native
  /**
    * The creation date
    */
  var CreationDate: js.UndefOr[js.Date] = js.native
  /**
    * The user context data captured at the time of an event request. It provides additional information about the client from which event the request is received.
    */
  var EventContextData: js.UndefOr[EventContextDataType] = js.native
  /**
    * A flag specifying the user feedback captured at the time of an event request is good or bad. 
    */
  var EventFeedback: js.UndefOr[EventFeedbackType] = js.native
  /**
    * The event ID.
    */
  var EventId: js.UndefOr[StringType] = js.native
  /**
    * The event response.
    */
  var EventResponse: js.UndefOr[EventResponseType] = js.native
  /**
    * The event risk.
    */
  var EventRisk: js.UndefOr[EventRiskType] = js.native
  /**
    * The event type.
    */
  var EventType: js.UndefOr[typingsSlinky.awsSdk.cognitoidentityserviceproviderMod.EventType] = js.native
}

object AuthEventType {
  @scala.inline
  def apply(): AuthEventType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthEventType]
  }
  @scala.inline
  implicit class AuthEventTypeOps[Self <: AuthEventType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChallengeResponses(value: ChallengeResponseListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChallengeResponses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChallengeResponses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChallengeResponses")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withEventContextData(value: EventContextDataType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventContextData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventContextData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventContextData")(js.undefined)
        ret
    }
    @scala.inline
    def withEventFeedback(value: EventFeedbackType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventFeedback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventFeedback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventFeedback")(js.undefined)
        ret
    }
    @scala.inline
    def withEventId(value: StringType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventId")(js.undefined)
        ret
    }
    @scala.inline
    def withEventResponse(value: EventResponseType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withEventRisk(value: EventRiskType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventRisk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventRisk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventRisk")(js.undefined)
        ret
    }
    @scala.inline
    def withEventType(value: EventType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventType")(js.undefined)
        ret
    }
  }
  
}

