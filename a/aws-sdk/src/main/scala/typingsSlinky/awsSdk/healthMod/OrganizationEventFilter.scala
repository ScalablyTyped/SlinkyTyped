package typingsSlinky.awsSdk.healthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrganizationEventFilter extends js.Object {
  /**
    * A list of 12-digit AWS account numbers that contains the affected entities.
    */
  var awsAccountIds: js.UndefOr[awsAccountIdsList] = js.native
  var endTime: js.UndefOr[DateTimeRange] = js.native
  /**
    * REPLACEME
    */
  var entityArns: js.UndefOr[entityArnList] = js.native
  /**
    * A list of entity identifiers, such as EC2 instance IDs (i-34ab692e) or EBS volumes (vol-426ab23e).
    */
  var entityValues: js.UndefOr[entityValueList] = js.native
  /**
    * A list of event status codes.
    */
  var eventStatusCodes: js.UndefOr[eventStatusCodeList] = js.native
  /**
    * REPLACEME
    */
  var eventTypeCategories: js.UndefOr[eventTypeCategoryList] = js.native
  /**
    * A list of unique identifiers for event types. For example, "AWS_EC2_SYSTEM_MAINTENANCE_EVENT","AWS_RDS_MAINTENANCE_SCHEDULED". 
    */
  var eventTypeCodes: js.UndefOr[eventTypeList] = js.native
  var lastUpdatedTime: js.UndefOr[DateTimeRange] = js.native
  /**
    * A list of AWS Regions.
    */
  var regions: js.UndefOr[regionList] = js.native
  /**
    * The AWS services associated with the event. For example, EC2, RDS.
    */
  var services: js.UndefOr[serviceList] = js.native
  var startTime: js.UndefOr[DateTimeRange] = js.native
}

object OrganizationEventFilter {
  @scala.inline
  def apply(): OrganizationEventFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationEventFilter]
  }
  @scala.inline
  implicit class OrganizationEventFilterOps[Self <: OrganizationEventFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAwsAccountIds(value: awsAccountIdsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsAccountIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsAccountIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsAccountIds")(js.undefined)
        ret
    }
    @scala.inline
    def withEndTime(value: DateTimeRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(js.undefined)
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
    def withLastUpdatedTime(value: DateTimeRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdatedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedTime")(js.undefined)
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
    def withStartTime(value: DateTimeRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(js.undefined)
        ret
    }
  }
  
}

