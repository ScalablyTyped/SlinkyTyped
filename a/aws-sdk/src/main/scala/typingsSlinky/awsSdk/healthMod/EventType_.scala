package typingsSlinky.awsSdk.healthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventType_ extends js.Object {
  /**
    * A list of event type category codes (issue, scheduledChange, or accountNotification).
    */
  var category: js.UndefOr[eventTypeCategory] = js.native
  /**
    * The unique identifier for the event type. The format is AWS_SERVICE_DESCRIPTION ; for example, AWS_EC2_SYSTEM_MAINTENANCE_EVENT.
    */
  var code: js.UndefOr[eventTypeCode] = js.native
  /**
    * The AWS service that is affected by the event. For example, EC2, RDS.
    */
  var service: js.UndefOr[typingsSlinky.awsSdk.healthMod.service] = js.native
}

object EventType_ {
  @scala.inline
  def apply(): EventType_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventType_]
  }
  @scala.inline
  implicit class EventType_Ops[Self <: EventType_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategory(value: eventTypeCategory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(js.undefined)
        ret
    }
    @scala.inline
    def withCode(value: eventTypeCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(js.undefined)
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
  }
  
}

