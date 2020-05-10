package typingsSlinky.paypalRestSdk.mod.notification.webhookEvent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebhookEvent extends js.Object {
  val create_time: js.UndefOr[String] = js.native
  val event_type: js.UndefOr[String] = js.native
  val event_version: js.UndefOr[String] = js.native
  val id: js.UndefOr[String] = js.native
  val resource: js.UndefOr[js.Any] = js.native
  val resource_type: js.UndefOr[String] = js.native
  val summary: js.UndefOr[String] = js.native
}

object WebhookEvent {
  @scala.inline
  def apply(): WebhookEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebhookEvent]
  }
  @scala.inline
  implicit class WebhookEventOps[Self <: WebhookEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate_time(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreate_time: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create_time")(js.undefined)
        ret
    }
    @scala.inline
    def withEvent_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvent_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event_type")(js.undefined)
        ret
    }
    @scala.inline
    def withEvent_version(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvent_version: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event_version")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withResource(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(js.undefined)
        ret
    }
    @scala.inline
    def withResource_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResource_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource_type")(js.undefined)
        ret
    }
    @scala.inline
    def withSummary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(js.undefined)
        ret
    }
  }
  
}

