package typingsSlinky.awsSdk.codestarnotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventTypeSummary extends js.Object {
  /**
    * The system-generated ID of the event.
    */
  var EventTypeId: js.UndefOr[typingsSlinky.awsSdk.codestarnotificationsMod.EventTypeId] = js.native
  /**
    * The name of the event.
    */
  var EventTypeName: js.UndefOr[typingsSlinky.awsSdk.codestarnotificationsMod.EventTypeName] = js.native
  /**
    * The resource type of the event.
    */
  var ResourceType: js.UndefOr[typingsSlinky.awsSdk.codestarnotificationsMod.ResourceType] = js.native
  /**
    * The name of the service for which the event applies.
    */
  var ServiceName: js.UndefOr[typingsSlinky.awsSdk.codestarnotificationsMod.ServiceName] = js.native
}

object EventTypeSummary {
  @scala.inline
  def apply(): EventTypeSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventTypeSummary]
  }
  @scala.inline
  implicit class EventTypeSummaryOps[Self <: EventTypeSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventTypeId(value: EventTypeId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventTypeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventTypeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventTypeId")(js.undefined)
        ret
    }
    @scala.inline
    def withEventTypeName(value: EventTypeName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventTypeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventTypeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventTypeName")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceType(value: ResourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceName(value: ServiceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceName")(js.undefined)
        ret
    }
  }
  
}

