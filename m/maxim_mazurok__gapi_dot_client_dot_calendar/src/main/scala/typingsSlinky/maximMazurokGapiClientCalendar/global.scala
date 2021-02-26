package typingsSlinky.maximMazurokGapiClientCalendar

import typingsSlinky.maximMazurokGapiClientCalendar.gapi.client.calendar.AclResource
import typingsSlinky.maximMazurokGapiClientCalendar.gapi.client.calendar.CalendarListResource
import typingsSlinky.maximMazurokGapiClientCalendar.gapi.client.calendar.CalendarsResource
import typingsSlinky.maximMazurokGapiClientCalendar.gapi.client.calendar.ChannelsResource
import typingsSlinky.maximMazurokGapiClientCalendar.gapi.client.calendar.ColorsResource
import typingsSlinky.maximMazurokGapiClientCalendar.gapi.client.calendar.EventsResource
import typingsSlinky.maximMazurokGapiClientCalendar.gapi.client.calendar.FreebusyResource
import typingsSlinky.maximMazurokGapiClientCalendar.gapi.client.calendar.SettingsResource
import typingsSlinky.maximMazurokGapiClientCalendar.maximMazurokGapiClientCalendarStrings.calendar
import typingsSlinky.maximMazurokGapiClientCalendar.maximMazurokGapiClientCalendarStrings.v3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object calendar {
        
        @JSGlobal("gapi.client.calendar.acl")
        @js.native
        val acl: AclResource = js.native
        
        @JSGlobal("gapi.client.calendar.calendarList")
        @js.native
        val calendarList: CalendarListResource = js.native
        
        @JSGlobal("gapi.client.calendar.calendars")
        @js.native
        val calendars: CalendarsResource = js.native
        
        @JSGlobal("gapi.client.calendar.channels")
        @js.native
        val channels: ChannelsResource = js.native
        
        @JSGlobal("gapi.client.calendar.colors")
        @js.native
        val colors: ColorsResource = js.native
        
        @JSGlobal("gapi.client.calendar.events")
        @js.native
        val events: EventsResource = js.native
        
        @JSGlobal("gapi.client.calendar.freebusy")
        @js.native
        val freebusy: FreebusyResource = js.native
        
        @JSGlobal("gapi.client.calendar.settings")
        @js.native
        val settings: SettingsResource = js.native
      }
      
      /** Load Calendar API v3 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: calendar, version: v3): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: calendar, version: v3, callback: js.Function0[_]): Unit = js.native
    }
  }
}
