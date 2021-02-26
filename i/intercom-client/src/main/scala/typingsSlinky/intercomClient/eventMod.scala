package typingsSlinky.intercomClient

import typingsSlinky.intercomClient.anon.Next
import typingsSlinky.intercomClient.anon.Perpage
import typingsSlinky.intercomClient.intercomClientStrings.eventDotlist
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventMod {
  
  @js.native
  trait EmailIdId extends EventIdentifier {
    
    var email: String = js.native
  }
  object EmailIdId {
    
    @scala.inline
    def apply(email: String): EmailIdId = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmailIdId]
    }
    
    @scala.inline
    implicit class EmailIdIdMutableBuilder[Self <: EmailIdId] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Partial<intercom-client.intercom-client/Event.UserIdId> */
  /* Inlined parent std.Partial<intercom-client.intercom-client/Event.IntercomUserIdId> */
  /* Inlined parent std.Partial<intercom-client.intercom-client/Event.EmailIdId> */
  @js.native
  trait Event extends StObject {
    
    var created_at: Double = js.native
    
    var email: js.UndefOr[String] = js.native
    
    var event_name: String = js.native
    
    val id: String = js.native
    
    var intercom_user_id: js.UndefOr[String] = js.native
    
    var metadata: js.UndefOr[js.Any] = js.native
    
    var user_id: js.UndefOr[String] = js.native
  }
  object Event {
    
    @scala.inline
    def apply(created_at: Double, event_name: String, id: String): Event = {
      val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], event_name = event_name.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    @scala.inline
    implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreated_at(value: Double): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setEvent_name(value: String): Self = StObject.set(x, "event_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntercom_user_id(value: String): Self = StObject.set(x, "intercom_user_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntercom_user_idUndefined: Self = StObject.set(x, "intercom_user_id", js.undefined)
      
      @scala.inline
      def setMetadata(value: js.Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser_idUndefined: Self = StObject.set(x, "user_id", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.intercomClient.eventMod.IntercomUserIdId
    - typingsSlinky.intercomClient.eventMod.UserIdId
    - typingsSlinky.intercomClient.eventMod.EmailIdId
  */
  trait EventIdentifier extends StObject
  object EventIdentifier {
    
    @scala.inline
    def EmailIdId(email: String): typingsSlinky.intercomClient.eventMod.EmailIdId = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.intercomClient.eventMod.EmailIdId]
    }
    
    @scala.inline
    def IntercomUserIdId(intercom_user_id: String): typingsSlinky.intercomClient.eventMod.IntercomUserIdId = {
      val __obj = js.Dynamic.literal(intercom_user_id = intercom_user_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.intercomClient.eventMod.IntercomUserIdId]
    }
    
    @scala.inline
    def UserIdId(user_id: String): typingsSlinky.intercomClient.eventMod.UserIdId = {
      val __obj = js.Dynamic.literal(user_id = user_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.intercomClient.eventMod.UserIdId]
    }
  }
  
  @js.native
  trait IntercomUserIdId extends EventIdentifier {
    
    var intercom_user_id: String = js.native
  }
  object IntercomUserIdId {
    
    @scala.inline
    def apply(intercom_user_id: String): IntercomUserIdId = {
      val __obj = js.Dynamic.literal(intercom_user_id = intercom_user_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[IntercomUserIdId]
    }
    
    @scala.inline
    implicit class IntercomUserIdIdMutableBuilder[Self <: IntercomUserIdId] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIntercom_user_id(value: String): Self = StObject.set(x, "intercom_user_id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait List extends StObject {
    
    var events: js.Array[Event] = js.native
    
    var pages: Next = js.native
    
    var total_count: Double = js.native
    
    var `type`: eventDotlist = js.native
  }
  object List {
    
    @scala.inline
    def apply(events: js.Array[Event], pages: Next, total_count: Double, `type`: eventDotlist): List = {
      val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[List]
    }
    
    @scala.inline
    implicit class ListMutableBuilder[Self <: List] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvents(value: js.Array[Event]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsVarargs(value: Event*): Self = StObject.set(x, "events", js.Array(value :_*))
      
      @scala.inline
      def setPages(value: Next): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: eventDotlist): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type ListParam = EventIdentifier with Perpage
  
  @js.native
  trait UserIdId extends EventIdentifier {
    
    var user_id: String = js.native
  }
  object UserIdId {
    
    @scala.inline
    def apply(user_id: String): UserIdId = {
      val __obj = js.Dynamic.literal(user_id = user_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserIdId]
    }
    
    @scala.inline
    implicit class UserIdIdMutableBuilder[Self <: UserIdId] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    }
  }
}
