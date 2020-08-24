package typingsSlinky.gapiCalendar

import typingsSlinky.gapi.gapi.client.HttpRequest
import typingsSlinky.gapiCalendar.gapi.client.calendar.AclDeleteParameters
import typingsSlinky.gapiCalendar.gapi.client.calendar.AclGetParameters
import typingsSlinky.gapiCalendar.gapi.client.calendar.AclInsertParameters
import typingsSlinky.gapiCalendar.gapi.client.calendar.AclUpdateParameters
import typingsSlinky.gapiCalendar.gapi.client.calendar.Acl_
import typingsSlinky.gapiCalendar.gapi.client.calendar.Calendar
import typingsSlinky.gapiCalendar.gapi.client.calendar.CalendarListEntry
import typingsSlinky.gapiCalendar.gapi.client.calendar.CalendarListInsertParameters
import typingsSlinky.gapiCalendar.gapi.client.calendar.CalendarListListParameters
import typingsSlinky.gapiCalendar.gapi.client.calendar.CalendarList_
import typingsSlinky.gapiCalendar.gapi.client.calendar.CalendarsDeleteParameters
import typingsSlinky.gapiCalendar.gapi.client.calendar.CalendarsInsertParameters
import typingsSlinky.gapiCalendar.gapi.client.calendar.CalendarsUpdateParameters
import typingsSlinky.gapiCalendar.gapi.client.calendar.EventsDeleteParameters
import typingsSlinky.gapiCalendar.gapi.client.calendar.EventsGetParameters
import typingsSlinky.gapiCalendar.gapi.client.calendar.EventsInsertParameters
import typingsSlinky.gapiCalendar.gapi.client.calendar.EventsListParameters
import typingsSlinky.gapiCalendar.gapi.client.calendar.EventsUpdateParameters
import typingsSlinky.gapiCalendar.gapi.client.calendar.Events_
import typingsSlinky.gapiCalendar.gapi.client.calendar.FreeBusyQueryParameters
import typingsSlinky.gapiCalendar.gapi.client.calendar.FreeBusy_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object gapi extends js.Object {
    @js.native
    object client extends js.Object {
      @js.native
      object calendar extends js.Object {
        @js.native
        class Event ()
          extends typingsSlinky.gapiCalendar.gapi.client.calendar.Event
        
        @js.native
        class acl ()
          extends typingsSlinky.gapiCalendar.gapi.client.calendar.acl
        
        @js.native
        class calendarList ()
          extends typingsSlinky.gapiCalendar.gapi.client.calendar.calendarList
        
        @js.native
        class calendars ()
          extends typingsSlinky.gapiCalendar.gapi.client.calendar.calendars
        
        @js.native
        class events ()
          extends typingsSlinky.gapiCalendar.gapi.client.calendar.events
        
        @js.native
        class freebusy ()
          extends typingsSlinky.gapiCalendar.gapi.client.calendar.freebusy
        
        /* static members */
        @js.native
        object acl extends js.Object {
          def delete(parameters: AclDeleteParameters): HttpRequest[Unit] = js.native
          def get(parameters: AclGetParameters): HttpRequest[Acl_] = js.native
          def insert(parameters: AclInsertParameters): HttpRequest[Acl_] = js.native
          def update(parameters: AclUpdateParameters): HttpRequest[Acl_] = js.native
        }
        
        /* static members */
        @js.native
        object calendarList extends js.Object {
          def insert(parameters: CalendarListInsertParameters): HttpRequest[CalendarListEntry] = js.native
          def list(): HttpRequest[CalendarList_] = js.native
          def list(parameters: CalendarListListParameters): HttpRequest[CalendarList_] = js.native
        }
        
        /* static members */
        @js.native
        object calendars extends js.Object {
          def delete(parameters: CalendarsDeleteParameters): HttpRequest[Unit] = js.native
          def insert(parameters: CalendarsInsertParameters): HttpRequest[Calendar] = js.native
          def update(parameters: CalendarsUpdateParameters): HttpRequest[Calendar] = js.native
        }
        
        /* static members */
        @js.native
        object events extends js.Object {
          // delete the existing event from calendar
          def delete(parameters: EventsDeleteParameters): HttpRequest[typingsSlinky.gapiCalendar.gapi.client.calendar.Event] = js.native
          def get(parameters: EventsGetParameters): HttpRequest[typingsSlinky.gapiCalendar.gapi.client.calendar.Event] = js.native
          def insert(parameters: EventsInsertParameters): HttpRequest[typingsSlinky.gapiCalendar.gapi.client.calendar.Event] = js.native
          def list(parameters: EventsListParameters): HttpRequest[Events_] = js.native
          def update(parameters: EventsUpdateParameters): HttpRequest[typingsSlinky.gapiCalendar.gapi.client.calendar.Event] = js.native
        }
        
        /* static members */
        @js.native
        object freebusy extends js.Object {
          def query(parameters: FreeBusyQueryParameters): HttpRequest[FreeBusy_] = js.native
        }
        
      }
      
    }
    
  }
  
}

