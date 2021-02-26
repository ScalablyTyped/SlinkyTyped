package typingsSlinky.nodeZendesk.mod.Tickets

import typingsSlinky.nodeZendesk.mod.AuditableModel
import typingsSlinky.nodeZendesk.mod.ZendeskID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Metrics {
  
  @js.native
  trait ListPayload extends StObject {
    
    val ticket_metrics: js.Array[typingsSlinky.nodeZendesk.mod.Tickets.Metrics.ResponseModel] = js.native
  }
  object ListPayload {
    
    @scala.inline
    def apply(ticket_metrics: js.Array[typingsSlinky.nodeZendesk.mod.Tickets.Metrics.ResponseModel]): typingsSlinky.nodeZendesk.mod.Tickets.Metrics.ListPayload = {
      val __obj = js.Dynamic.literal(ticket_metrics = ticket_metrics.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.nodeZendesk.mod.Tickets.Metrics.ListPayload]
    }
    
    @scala.inline
    implicit class ListPayloadMutableBuilder[Self <: typingsSlinky.nodeZendesk.mod.Tickets.Metrics.ListPayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTicket_metrics(value: js.Array[typingsSlinky.nodeZendesk.mod.Tickets.Metrics.ResponseModel]): Self = StObject.set(x, "ticket_metrics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTicket_metricsVarargs(value: typingsSlinky.nodeZendesk.mod.Tickets.Metrics.ResponseModel*): Self = StObject.set(x, "ticket_metrics", js.Array(value :_*))
    }
  }
  
  @js.native
  trait MinutesObject extends StObject {
    
    var business: Double = js.native
    
    var calendar: Double = js.native
  }
  object MinutesObject {
    
    @scala.inline
    def apply(business: Double, calendar: Double): MinutesObject = {
      val __obj = js.Dynamic.literal(business = business.asInstanceOf[js.Any], calendar = calendar.asInstanceOf[js.Any])
      __obj.asInstanceOf[MinutesObject]
    }
    
    @scala.inline
    implicit class MinutesObjectMutableBuilder[Self <: MinutesObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBusiness(value: Double): Self = StObject.set(x, "business", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalendar(value: Double): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
    }
  }
  
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
    def apply(created_at: String, id: ZendeskID): typingsSlinky.nodeZendesk.mod.Tickets.Metrics.ResponseModel = {
      val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.nodeZendesk.mod.Tickets.Metrics.ResponseModel]
    }
    
    @scala.inline
    implicit class ResponseModelMutableBuilder[Self <: typingsSlinky.nodeZendesk.mod.Tickets.Metrics.ResponseModel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgent_wait_time_in_minutes(value: MinutesObject): Self = StObject.set(x, "agent_wait_time_in_minutes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgent_wait_time_in_minutesUndefined: Self = StObject.set(x, "agent_wait_time_in_minutes", js.undefined)
      
      @scala.inline
      def setAssigned_at(value: String): Self = StObject.set(x, "assigned_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssigned_atNull: Self = StObject.set(x, "assigned_at", null)
      
      @scala.inline
      def setAssigned_atUndefined: Self = StObject.set(x, "assigned_at", js.undefined)
      
      @scala.inline
      def setAssignee_stations(value: Double): Self = StObject.set(x, "assignee_stations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssignee_stationsUndefined: Self = StObject.set(x, "assignee_stations", js.undefined)
      
      @scala.inline
      def setAssignee_updated_at(value: String): Self = StObject.set(x, "assignee_updated_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssignee_updated_atNull: Self = StObject.set(x, "assignee_updated_at", null)
      
      @scala.inline
      def setAssignee_updated_atUndefined: Self = StObject.set(x, "assignee_updated_at", js.undefined)
      
      @scala.inline
      def setFirst_resolution_time_in_minutes(value: MinutesObject): Self = StObject.set(x, "first_resolution_time_in_minutes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirst_resolution_time_in_minutesUndefined: Self = StObject.set(x, "first_resolution_time_in_minutes", js.undefined)
      
      @scala.inline
      def setFull_resolution_time_in_minutes(value: MinutesObject): Self = StObject.set(x, "full_resolution_time_in_minutes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFull_resolution_time_in_minutesUndefined: Self = StObject.set(x, "full_resolution_time_in_minutes", js.undefined)
      
      @scala.inline
      def setGroup_stations(value: Double): Self = StObject.set(x, "group_stations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroup_stationsUndefined: Self = StObject.set(x, "group_stations", js.undefined)
      
      @scala.inline
      def setInitially_assigned_at(value: String): Self = StObject.set(x, "initially_assigned_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitially_assigned_atNull: Self = StObject.set(x, "initially_assigned_at", null)
      
      @scala.inline
      def setInitially_assigned_atUndefined: Self = StObject.set(x, "initially_assigned_at", js.undefined)
      
      @scala.inline
      def setLatest_comment_added_at(value: String): Self = StObject.set(x, "latest_comment_added_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatest_comment_added_atNull: Self = StObject.set(x, "latest_comment_added_at", null)
      
      @scala.inline
      def setLatest_comment_added_atUndefined: Self = StObject.set(x, "latest_comment_added_at", js.undefined)
      
      @scala.inline
      def setReopens(value: Double): Self = StObject.set(x, "reopens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReopensUndefined: Self = StObject.set(x, "reopens", js.undefined)
      
      @scala.inline
      def setReplies(value: Double): Self = StObject.set(x, "replies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepliesUndefined: Self = StObject.set(x, "replies", js.undefined)
      
      @scala.inline
      def setReply_time_in_minutes(value: MinutesObject): Self = StObject.set(x, "reply_time_in_minutes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReply_time_in_minutesUndefined: Self = StObject.set(x, "reply_time_in_minutes", js.undefined)
      
      @scala.inline
      def setRequester_updated_at(value: String): Self = StObject.set(x, "requester_updated_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequester_updated_atNull: Self = StObject.set(x, "requester_updated_at", null)
      
      @scala.inline
      def setRequester_updated_atUndefined: Self = StObject.set(x, "requester_updated_at", js.undefined)
      
      @scala.inline
      def setRequester_wait_time_in_minutes(value: MinutesObject): Self = StObject.set(x, "requester_wait_time_in_minutes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequester_wait_time_in_minutesUndefined: Self = StObject.set(x, "requester_wait_time_in_minutes", js.undefined)
      
      @scala.inline
      def setSolved_at(value: String): Self = StObject.set(x, "solved_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSolved_atNull: Self = StObject.set(x, "solved_at", null)
      
      @scala.inline
      def setSolved_atUndefined: Self = StObject.set(x, "solved_at", js.undefined)
      
      @scala.inline
      def setTicket_id(value: ZendeskID): Self = StObject.set(x, "ticket_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTicket_idUndefined: Self = StObject.set(x, "ticket_id", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait ResponsePayload extends StObject {
    
    val ticket_metric: typingsSlinky.nodeZendesk.mod.Tickets.Metrics.ResponseModel = js.native
  }
  object ResponsePayload {
    
    @scala.inline
    def apply(ticket_metric: typingsSlinky.nodeZendesk.mod.Tickets.Metrics.ResponseModel): typingsSlinky.nodeZendesk.mod.Tickets.Metrics.ResponsePayload = {
      val __obj = js.Dynamic.literal(ticket_metric = ticket_metric.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.nodeZendesk.mod.Tickets.Metrics.ResponsePayload]
    }
    
    @scala.inline
    implicit class ResponsePayloadMutableBuilder[Self <: typingsSlinky.nodeZendesk.mod.Tickets.Metrics.ResponsePayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTicket_metric(value: typingsSlinky.nodeZendesk.mod.Tickets.Metrics.ResponseModel): Self = StObject.set(x, "ticket_metric", value.asInstanceOf[js.Any])
    }
  }
}
