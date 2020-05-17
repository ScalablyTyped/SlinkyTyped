package typingsSlinky.gapiClientCalendar

import typingsSlinky.gapiClientCalendar.gapi.client.calendar.AclResource
import typingsSlinky.gapiClientCalendar.gapi.client.calendar.CalendarListResource
import typingsSlinky.gapiClientCalendar.gapi.client.calendar.CalendarsResource
import typingsSlinky.gapiClientCalendar.gapi.client.calendar.ChannelsResource
import typingsSlinky.gapiClientCalendar.gapi.client.calendar.ColorsResource
import typingsSlinky.gapiClientCalendar.gapi.client.calendar.EventsResource
import typingsSlinky.gapiClientCalendar.gapi.client.calendar.FreebusyResource
import typingsSlinky.gapiClientCalendar.gapi.client.calendar.SettingsResource
import typingsSlinky.gapiClientCalendar.gapiClientCalendarStrings.calendar
import typingsSlinky.gapiClientCalendar.gapiClientCalendarStrings.v3
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
      /** Load Calendar API v3 */
      def load(name: calendar, version: v3): js.Thenable[Unit] = js.native
      def load(name: calendar, version: v3, callback: js.Function0[_]): Unit = js.native
      @js.native
      object calendar extends js.Object {
        val acl: AclResource = js.native
        val calendarList: CalendarListResource = js.native
        val calendars: CalendarsResource = js.native
        val channels: ChannelsResource = js.native
        val colors: ColorsResource = js.native
        val events: EventsResource = js.native
        val freebusy: FreebusyResource = js.native
        val settings: SettingsResource = js.native
      }
      
    }
    
  }
  
}

