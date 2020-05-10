package typingsSlinky.awsSdk.healthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrganizationEvent extends js.Object {
  /**
    * The unique identifier for the event. Format: arn:aws:health:event-region::event/SERVICE/EVENT_TYPE_CODE/EVENT_TYPE_PLUS_ID . Example: Example: arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456 
    */
  var arn: js.UndefOr[eventArn] = js.native
  /**
    * The date and time that the event ended.
    */
  var endTime: js.UndefOr[js.Date] = js.native
  /**
    * The category of the event type.
    */
  var eventTypeCategory: js.UndefOr[typingsSlinky.awsSdk.healthMod.eventTypeCategory] = js.native
  /**
    * The unique identifier for the event type. The format is AWS_SERVICE_DESCRIPTION. For example, AWS_EC2_SYSTEM_MAINTENANCE_EVENT.
    */
  var eventTypeCode: js.UndefOr[typingsSlinky.awsSdk.healthMod.eventTypeCode] = js.native
  /**
    * The most recent date and time that the event was updated.
    */
  var lastUpdatedTime: js.UndefOr[js.Date] = js.native
  /**
    * The AWS Region name of the event.
    */
  var region: js.UndefOr[typingsSlinky.awsSdk.healthMod.region] = js.native
  /**
    * The AWS service that is affected by the event. For example, EC2, RDS.
    */
  var service: js.UndefOr[typingsSlinky.awsSdk.healthMod.service] = js.native
  /**
    * The date and time that the event began.
    */
  var startTime: js.UndefOr[js.Date] = js.native
  /**
    * The most recent status of the event. Possible values are open, closed, and upcoming.
    */
  var statusCode: js.UndefOr[eventStatusCode] = js.native
}

object OrganizationEvent {
  @scala.inline
  def apply(): OrganizationEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationEvent]
  }
  @scala.inline
  implicit class OrganizationEventOps[Self <: OrganizationEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: eventArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withEndTime(value: js.Date): Self = {
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
    def withEventTypeCategory(value: eventTypeCategory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTypeCategory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventTypeCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTypeCategory")(js.undefined)
        ret
    }
    @scala.inline
    def withEventTypeCode(value: eventTypeCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTypeCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventTypeCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTypeCode")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdatedTime(value: js.Date): Self = {
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
    def withRegion(value: region): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
        ret
    }
    @scala.inline
    def withService(value: service): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: js.Date): Self = {
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
    @scala.inline
    def withStatusCode(value: eventStatusCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(js.undefined)
        ret
    }
  }
  
}

