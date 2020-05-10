package typingsSlinky.awsSdk.cloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LookupEventsRequest extends js.Object {
  /**
    * Specifies that only events that occur before or at the specified time are returned. If the specified end time is before the specified start time, an error is returned.
    */
  var EndTime: js.UndefOr[js.Date] = js.native
  /**
    * Specifies the event category. If you do not specify an event category, events of the category are not returned in the response. For example, if you do not specify insight as the value of EventCategory, no Insights events are returned.
    */
  var EventCategory: js.UndefOr[typingsSlinky.awsSdk.cloudtrailMod.EventCategory] = js.native
  /**
    * Contains a list of lookup attributes. Currently the list can contain only one item.
    */
  var LookupAttributes: js.UndefOr[LookupAttributesList] = js.native
  /**
    * The number of events to return. Possible values are 1 through 50. The default is 50.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.cloudtrailMod.MaxResults] = js.native
  /**
    * The token to use to get the next page of results after a previous API call. This token must be passed in with the same parameters that were specified in the the original call. For example, if the original call specified an AttributeKey of 'Username' with a value of 'root', the call with NextToken should include those same parameters.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.cloudtrailMod.NextToken] = js.native
  /**
    * Specifies that only events that occur after or at the specified time are returned. If the specified start time is after the specified end time, an error is returned.
    */
  var StartTime: js.UndefOr[js.Date] = js.native
}

object LookupEventsRequest {
  @scala.inline
  def apply(): LookupEventsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LookupEventsRequest]
  }
  @scala.inline
  implicit class LookupEventsRequestOps[Self <: LookupEventsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndTime")(js.undefined)
        ret
    }
    @scala.inline
    def withEventCategory(value: EventCategory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventCategory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventCategory")(js.undefined)
        ret
    }
    @scala.inline
    def withLookupAttributes(value: LookupAttributesList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LookupAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLookupAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LookupAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: MaxResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTime")(js.undefined)
        ret
    }
  }
  
}

