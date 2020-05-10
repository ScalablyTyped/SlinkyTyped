package typingsSlinky.nodeZendesk.mod.Tickets.Metrics

import typingsSlinky.nodeZendesk.mod.AuditableModel
import typingsSlinky.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseModel extends AuditableModel {
  val agent_wait_time_in_minutes: js.UndefOr[MinutesObject] = js.native
  val assigned_at: js.UndefOr[String | Null] = js.native
  val assignee_stations: js.UndefOr[Double] = js.native
  val assignee_updated_at: js.UndefOr[String | Null] = js.native
  val first_resolution_time_in_minutes: js.UndefOr[MinutesObject] = js.native
  val full_resolution_time_in_minutes: js.UndefOr[MinutesObject] = js.native
  val group_stations: js.UndefOr[Double] = js.native
  val initially_assigned_at: js.UndefOr[String | Null] = js.native
  val latest_comment_added_at: js.UndefOr[String | Null] = js.native
  val reopens: js.UndefOr[Double] = js.native
  val replies: js.UndefOr[Double] = js.native
  val reply_time_in_minutes: js.UndefOr[MinutesObject] = js.native
  val requester_updated_at: js.UndefOr[String | Null] = js.native
  val requester_wait_time_in_minutes: js.UndefOr[MinutesObject] = js.native
  val solved_at: js.UndefOr[String | Null] = js.native
  val ticket_id: js.UndefOr[ZendeskID] = js.native
  val url: js.UndefOr[String] = js.native
}

object ResponseModel {
  @scala.inline
  def apply(created_at: String, id: ZendeskID): ResponseModel = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseModel]
  }
  @scala.inline
  implicit class ResponseModelOps[Self <: ResponseModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgent_wait_time_in_minutes(value: MinutesObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agent_wait_time_in_minutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgent_wait_time_in_minutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agent_wait_time_in_minutes")(js.undefined)
        ret
    }
    @scala.inline
    def withAssigned_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assigned_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssigned_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assigned_at")(js.undefined)
        ret
    }
    @scala.inline
    def withAssigned_atNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assigned_at")(null)
        ret
    }
    @scala.inline
    def withAssignee_stations(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignee_stations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssignee_stations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignee_stations")(js.undefined)
        ret
    }
    @scala.inline
    def withAssignee_updated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignee_updated_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssignee_updated_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignee_updated_at")(js.undefined)
        ret
    }
    @scala.inline
    def withAssignee_updated_atNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignee_updated_at")(null)
        ret
    }
    @scala.inline
    def withFirst_resolution_time_in_minutes(value: MinutesObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first_resolution_time_in_minutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirst_resolution_time_in_minutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first_resolution_time_in_minutes")(js.undefined)
        ret
    }
    @scala.inline
    def withFull_resolution_time_in_minutes(value: MinutesObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("full_resolution_time_in_minutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFull_resolution_time_in_minutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("full_resolution_time_in_minutes")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup_stations(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group_stations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup_stations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group_stations")(js.undefined)
        ret
    }
    @scala.inline
    def withInitially_assigned_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initially_assigned_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitially_assigned_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initially_assigned_at")(js.undefined)
        ret
    }
    @scala.inline
    def withInitially_assigned_atNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initially_assigned_at")(null)
        ret
    }
    @scala.inline
    def withLatest_comment_added_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latest_comment_added_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatest_comment_added_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latest_comment_added_at")(js.undefined)
        ret
    }
    @scala.inline
    def withLatest_comment_added_atNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latest_comment_added_at")(null)
        ret
    }
    @scala.inline
    def withReopens(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reopens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReopens: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reopens")(js.undefined)
        ret
    }
    @scala.inline
    def withReplies(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replies")(js.undefined)
        ret
    }
    @scala.inline
    def withReply_time_in_minutes(value: MinutesObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reply_time_in_minutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReply_time_in_minutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reply_time_in_minutes")(js.undefined)
        ret
    }
    @scala.inline
    def withRequester_updated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requester_updated_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequester_updated_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requester_updated_at")(js.undefined)
        ret
    }
    @scala.inline
    def withRequester_updated_atNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requester_updated_at")(null)
        ret
    }
    @scala.inline
    def withRequester_wait_time_in_minutes(value: MinutesObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requester_wait_time_in_minutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequester_wait_time_in_minutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requester_wait_time_in_minutes")(js.undefined)
        ret
    }
    @scala.inline
    def withSolved_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solved_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSolved_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solved_at")(js.undefined)
        ret
    }
    @scala.inline
    def withSolved_atNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solved_at")(null)
        ret
    }
    @scala.inline
    def withTicket_id(value: ZendeskID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticket_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTicket_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticket_id")(js.undefined)
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

