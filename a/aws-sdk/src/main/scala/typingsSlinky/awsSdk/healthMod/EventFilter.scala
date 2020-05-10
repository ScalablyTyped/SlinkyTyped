package typingsSlinky.awsSdk.healthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventFilter extends js.Object {
  /**
    * A list of AWS availability zones.
    */
  var availabilityZones: js.UndefOr[typingsSlinky.awsSdk.healthMod.availabilityZones] = js.native
  /**
    * A list of dates and times that the event ended.
    */
  var endTimes: js.UndefOr[dateTimeRangeList] = js.native
  /**
    * A list of entity ARNs (unique identifiers).
    */
  var entityArns: js.UndefOr[entityArnList] = js.native
  /**
    * A list of entity identifiers, such as EC2 instance IDs (i-34ab692e) or EBS volumes (vol-426ab23e).
    */
  var entityValues: js.UndefOr[entityValueList] = js.native
  /**
    * A list of event ARNs (unique identifiers). For example: "arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-CDE456", "arn:aws:health:us-west-1::event/EBS/AWS_EBS_LOST_VOLUME/AWS_EBS_LOST_VOLUME_CHI789_JKL101" 
    */
  var eventArns: js.UndefOr[eventArnList] = js.native
  /**
    * A list of event status codes.
    */
  var eventStatusCodes: js.UndefOr[eventStatusCodeList] = js.native
  /**
    * A list of event type category codes (issue, scheduledChange, or accountNotification).
    */
  var eventTypeCategories: js.UndefOr[eventTypeCategoryList] = js.native
  /**
    * A list of unique identifiers for event types. For example, "AWS_EC2_SYSTEM_MAINTENANCE_EVENT","AWS_RDS_MAINTENANCE_SCHEDULED". 
    */
  var eventTypeCodes: js.UndefOr[eventTypeList] = js.native
  /**
    * A list of dates and times that the event was last updated.
    */
  var lastUpdatedTimes: js.UndefOr[dateTimeRangeList] = js.native
  /**
    * A list of AWS regions.
    */
  var regions: js.UndefOr[regionList] = js.native
  /**
    * The AWS services associated with the event. For example, EC2, RDS.
    */
  var services: js.UndefOr[serviceList] = js.native
  /**
    * A list of dates and times that the event began.
    */
  var startTimes: js.UndefOr[dateTimeRangeList] = js.native
  /**
    * A map of entity tags attached to the affected entity.
    */
  var tags: js.UndefOr[tagFilter] = js.native
}

object EventFilter {
  @scala.inline
  def apply(): EventFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventFilter]
  }
  @scala.inline
  implicit class EventFilterOps[Self <: EventFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailabilityZones(value: availabilityZones): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityZones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZones: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityZones")(js.undefined)
        ret
    }
    @scala.inline
    def withEndTimes(value: dateTimeRangeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTimes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTimes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTimes")(js.undefined)
        ret
    }
    @scala.inline
    def withEntityArns(value: entityArnList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityArns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityArns")(js.undefined)
        ret
    }
    @scala.inline
    def withEntityValues(value: entityValueList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityValues")(js.undefined)
        ret
    }
    @scala.inline
    def withEventArns(value: eventArnList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventArns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventArns")(js.undefined)
        ret
    }
    @scala.inline
    def withEventStatusCodes(value: eventStatusCodeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventStatusCodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventStatusCodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventStatusCodes")(js.undefined)
        ret
    }
    @scala.inline
    def withEventTypeCategories(value: eventTypeCategoryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTypeCategories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventTypeCategories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTypeCategories")(js.undefined)
        ret
    }
    @scala.inline
    def withEventTypeCodes(value: eventTypeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTypeCodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventTypeCodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTypeCodes")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdatedTimes(value: dateTimeRangeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedTimes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdatedTimes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedTimes")(js.undefined)
        ret
    }
    @scala.inline
    def withRegions(value: regionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regions")(js.undefined)
        ret
    }
    @scala.inline
    def withServices(value: serviceList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("services")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("services")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTimes(value: dateTimeRangeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTimes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTimes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTimes")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: tagFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

