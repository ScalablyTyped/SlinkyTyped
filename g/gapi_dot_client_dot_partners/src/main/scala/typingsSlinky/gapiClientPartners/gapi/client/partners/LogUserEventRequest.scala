package typingsSlinky.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogUserEventRequest extends js.Object {
  /** The action that occurred. */
  var eventAction: js.UndefOr[String] = js.native
  /** The category the action belongs to. */
  var eventCategory: js.UndefOr[String] = js.native
  /** List of event data for the event. */
  var eventDatas: js.UndefOr[js.Array[EventData]] = js.native
  /** The scope of the event. */
  var eventScope: js.UndefOr[String] = js.native
  /** Advertiser lead information. */
  var lead: js.UndefOr[Lead] = js.native
  /** Current request metadata. */
  var requestMetadata: js.UndefOr[RequestMetadata] = js.native
  /** The URL where the event occurred. */
  var url: js.UndefOr[String] = js.native
}

object LogUserEventRequest {
  @scala.inline
  def apply(): LogUserEventRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogUserEventRequest]
  }
  @scala.inline
  implicit class LogUserEventRequestOps[Self <: LogUserEventRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventAction")(js.undefined)
        ret
    }
    @scala.inline
    def withEventCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventCategory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventCategory")(js.undefined)
        ret
    }
    @scala.inline
    def withEventDatas(value: js.Array[EventData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventDatas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventDatas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventDatas")(js.undefined)
        ret
    }
    @scala.inline
    def withEventScope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventScope")(js.undefined)
        ret
    }
    @scala.inline
    def withLead(value: Lead): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lead")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestMetadata(value: RequestMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

