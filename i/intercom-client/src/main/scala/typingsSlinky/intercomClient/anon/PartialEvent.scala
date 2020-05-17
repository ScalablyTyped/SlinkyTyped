package typingsSlinky.intercomClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<intercom-client.intercom-client/Event.Event> */
@js.native
trait PartialEvent extends js.Object {
  var created_at: js.UndefOr[Double] = js.native
  var email: js.UndefOr[String] = js.native
  var event_name: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var intercom_user_id: js.UndefOr[String] = js.native
  var metadata: js.UndefOr[js.Any] = js.native
  var user_id: js.UndefOr[String] = js.native
}

object PartialEvent {
  @scala.inline
  def apply(): PartialEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialEvent]
  }
  @scala.inline
  implicit class PartialEventOps[Self <: PartialEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreated_at(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(js.undefined)
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withEvent_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvent_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event_name")(js.undefined)
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
    def withIntercom_user_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intercom_user_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntercom_user_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intercom_user_id")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withUser_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_id")(js.undefined)
        ret
    }
  }
  
}

