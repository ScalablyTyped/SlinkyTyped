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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object calendar {
        
        @JSGlobal("gapi.client.calendar.Event")
        @js.native
        class Event ()
          extends typingsSlinky.gapiCalendar.gapi.client.calendar.Event
        
        @JSGlobal("gapi.client.calendar.acl")
        @js.native
        class acl ()
          extends typingsSlinky.gapiCalendar.gapi.client.calendar.acl
        /* static members */
        object acl {
          
          @JSGlobal("gapi.client.calendar.acl.delete")
          @js.native
          def delete(parameters: AclDeleteParameters): HttpRequest[Unit] = js.native
          
          @JSGlobal("gapi.client.calendar.acl.get")
          @js.native
          def get(parameters: AclGetParameters): HttpRequest[Acl_] = js.native
          
          @JSGlobal("gapi.client.calendar.acl.insert")
          @js.native
          def insert(parameters: AclInsertParameters): HttpRequest[Acl_] = js.native
          
          @JSGlobal("gapi.client.calendar.acl.update")
          @js.native
          def update(parameters: AclUpdateParameters): HttpRequest[Acl_] = js.native
        }
        
        @JSGlobal("gapi.client.calendar.calendarList")
        @js.native
        class calendarList ()
          extends typingsSlinky.gapiCalendar.gapi.client.calendar.calendarList
        /* static members */
        object calendarList {
          
          @JSGlobal("gapi.client.calendar.calendarList.insert")
          @js.native
          def insert(parameters: CalendarListInsertParameters): HttpRequest[CalendarListEntry] = js.native
          
          @JSGlobal("gapi.client.calendar.calendarList.list")
          @js.native
          def list(): HttpRequest[CalendarList_] = js.native
          @JSGlobal("gapi.client.calendar.calendarList.list")
          @js.native
          def list(parameters: CalendarListListParameters): HttpRequest[CalendarList_] = js.native
        }
        
        @JSGlobal("gapi.client.calendar.calendars")
        @js.native
        class calendars ()
          extends typingsSlinky.gapiCalendar.gapi.client.calendar.calendars
        /* static members */
        object calendars {
          
          @JSGlobal("gapi.client.calendar.calendars.delete")
          @js.native
          def delete(parameters: CalendarsDeleteParameters): HttpRequest[Unit] = js.native
          
          @JSGlobal("gapi.client.calendar.calendars.insert")
          @js.native
          def insert(parameters: CalendarsInsertParameters): HttpRequest[Calendar] = js.native
          
          @JSGlobal("gapi.client.calendar.calendars.update")
          @js.native
          def update(parameters: CalendarsUpdateParameters): HttpRequest[Calendar] = js.native
        }
        
        @JSGlobal("gapi.client.calendar.events")
        @js.native
        class events ()
          extends typingsSlinky.gapiCalendar.gapi.client.calendar.events
        /* static members */
        object events {
          
          // delete the existing event from calendar
          @JSGlobal("gapi.client.calendar.events.delete")
          @js.native
          def delete(parameters: EventsDeleteParameters): HttpRequest[typingsSlinky.gapiCalendar.gapi.client.calendar.Event] = js.native
          
          @JSGlobal("gapi.client.calendar.events.get")
          @js.native
          def get(parameters: EventsGetParameters): HttpRequest[typingsSlinky.gapiCalendar.gapi.client.calendar.Event] = js.native
          
          @JSGlobal("gapi.client.calendar.events.insert")
          @js.native
          def insert(parameters: EventsInsertParameters): HttpRequest[typingsSlinky.gapiCalendar.gapi.client.calendar.Event] = js.native
          
          @JSGlobal("gapi.client.calendar.events.list")
          @js.native
          def list(parameters: EventsListParameters): HttpRequest[Events_] = js.native
          
          @JSGlobal("gapi.client.calendar.events.update")
          @js.native
          def update(parameters: EventsUpdateParameters): HttpRequest[typingsSlinky.gapiCalendar.gapi.client.calendar.Event] = js.native
        }
        
        @JSGlobal("gapi.client.calendar.freebusy")
        @js.native
        class freebusy ()
          extends typingsSlinky.gapiCalendar.gapi.client.calendar.freebusy
        /* static members */
        object freebusy {
          
          @JSGlobal("gapi.client.calendar.freebusy.query")
          @js.native
          def query(parameters: FreeBusyQueryParameters): HttpRequest[FreeBusy_] = js.native
        }
      }
    }
  }
}
