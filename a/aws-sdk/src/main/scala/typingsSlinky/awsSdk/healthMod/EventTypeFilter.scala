package typingsSlinky.awsSdk.healthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventTypeFilter extends js.Object {
  /**
    * A list of event type category codes (issue, scheduledChange, or accountNotification).
    */
  var eventTypeCategories: js.UndefOr[EventTypeCategoryList_] = js.native
  /**
    * A list of event type codes.
    */
  var eventTypeCodes: js.UndefOr[EventTypeCodeList] = js.native
  /**
    * The AWS services associated with the event. For example, EC2, RDS.
    */
  var services: js.UndefOr[serviceList] = js.native
}

object EventTypeFilter {
  @scala.inline
  def apply(): EventTypeFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventTypeFilter]
  }
  @scala.inline
  implicit class EventTypeFilterOps[Self <: EventTypeFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventTypeCategories(value: EventTypeCategoryList_): Self = {
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
    def withEventTypeCodes(value: EventTypeCodeList): Self = {
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
  }
  
}

