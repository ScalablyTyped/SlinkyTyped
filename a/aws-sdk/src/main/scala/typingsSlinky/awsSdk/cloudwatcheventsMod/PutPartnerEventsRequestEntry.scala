package typingsSlinky.awsSdk.cloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutPartnerEventsRequestEntry extends js.Object {
  /**
    * A valid JSON string. There is no other schema imposed. The JSON string may contain fields and nested subobjects.
    */
  var Detail: js.UndefOr[String] = js.native
  /**
    * A free-form string used to decide what fields to expect in the event detail.
    */
  var DetailType: js.UndefOr[String] = js.native
  /**
    * AWS resources, identified by Amazon Resource Name (ARN), which the event primarily concerns. Any number, including zero, may be present.
    */
  var Resources: js.UndefOr[EventResourceList] = js.native
  /**
    * The event source that is generating the evntry.
    */
  var Source: js.UndefOr[EventSourceName] = js.native
  /**
    * The date and time of the event.
    */
  var Time: js.UndefOr[js.Date] = js.native
}

object PutPartnerEventsRequestEntry {
  @scala.inline
  def apply(): PutPartnerEventsRequestEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutPartnerEventsRequestEntry]
  }
  @scala.inline
  implicit class PutPartnerEventsRequestEntryOps[Self <: PutPartnerEventsRequestEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Detail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Detail")(js.undefined)
        ret
    }
    @scala.inline
    def withDetailType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DetailType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetailType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DetailType")(js.undefined)
        ret
    }
    @scala.inline
    def withResources(value: EventResourceList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resources")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: EventSourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Source")(js.undefined)
        ret
    }
    @scala.inline
    def withTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Time")(js.undefined)
        ret
    }
  }
  
}

