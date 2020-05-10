package typingsSlinky.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarkerRecordedEventAttributes extends js.Object {
  /**
    * The ID of the DecisionTaskCompleted event corresponding to the decision task that resulted in the RecordMarker decision that requested this marker. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var decisionTaskCompletedEventId: EventId = js.native
  /**
    * The details of the marker.
    */
  var details: js.UndefOr[Data] = js.native
  /**
    * The name of the marker.
    */
  var markerName: MarkerName = js.native
}

object MarkerRecordedEventAttributes {
  @scala.inline
  def apply(decisionTaskCompletedEventId: EventId, markerName: MarkerName): MarkerRecordedEventAttributes = {
    val __obj = js.Dynamic.literal(decisionTaskCompletedEventId = decisionTaskCompletedEventId.asInstanceOf[js.Any], markerName = markerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerRecordedEventAttributes]
  }
  @scala.inline
  implicit class MarkerRecordedEventAttributesOps[Self <: MarkerRecordedEventAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecisionTaskCompletedEventId(value: EventId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decisionTaskCompletedEventId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarkerName(value: MarkerName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetails(value: Data): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(js.undefined)
        ret
    }
  }
  
}

