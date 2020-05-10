package typingsSlinky.gapiCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Token obtained from the nextSyncToken field returned on the last page of results from the previous list request.
// It makes the result of this list request contain only entries that have changed since then.
// All events deleted since the previous list request will always be in the result set and it is not allowed to set showDeleted to False.
// There are several query parameters that cannot be specified together with nextSyncToken to ensure consistency of the client state.
// These are:
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.gapiCalendar.gapiCalendarStrings.iCalUID
  - typingsSlinky.gapiCalendar.gapiCalendarStrings.orderBy
  - typingsSlinky.gapiCalendar.gapiCalendarStrings.privateExtendedProperty
  - typingsSlinky.gapiCalendar.gapiCalendarStrings.q
  - typingsSlinky.gapiCalendar.gapiCalendarStrings.sharedExtendedProperty
  - typingsSlinky.gapiCalendar.gapiCalendarStrings.timeMin
  - typingsSlinky.gapiCalendar.gapiCalendarStrings.timeMax
  - typingsSlinky.gapiCalendar.gapiCalendarStrings.updatedMin
*/
trait SyncToken extends js.Object

object SyncToken {
  @scala.inline
  def iCalUID: typingsSlinky.gapiCalendar.gapiCalendarStrings.iCalUID = "iCalUID".asInstanceOf[typingsSlinky.gapiCalendar.gapiCalendarStrings.iCalUID]
  @scala.inline
  def orderBy: typingsSlinky.gapiCalendar.gapiCalendarStrings.orderBy = "orderBy".asInstanceOf[typingsSlinky.gapiCalendar.gapiCalendarStrings.orderBy]
  @scala.inline
  def privateExtendedProperty: typingsSlinky.gapiCalendar.gapiCalendarStrings.privateExtendedProperty = "privateExtendedProperty".asInstanceOf[typingsSlinky.gapiCalendar.gapiCalendarStrings.privateExtendedProperty]
  @scala.inline
  def q: typingsSlinky.gapiCalendar.gapiCalendarStrings.q = "q".asInstanceOf[typingsSlinky.gapiCalendar.gapiCalendarStrings.q]
  @scala.inline
  def sharedExtendedProperty: typingsSlinky.gapiCalendar.gapiCalendarStrings.sharedExtendedProperty = "sharedExtendedProperty".asInstanceOf[typingsSlinky.gapiCalendar.gapiCalendarStrings.sharedExtendedProperty]
  @scala.inline
  def timeMax: typingsSlinky.gapiCalendar.gapiCalendarStrings.timeMax = "timeMax".asInstanceOf[typingsSlinky.gapiCalendar.gapiCalendarStrings.timeMax]
  @scala.inline
  def timeMin: typingsSlinky.gapiCalendar.gapiCalendarStrings.timeMin = "timeMin".asInstanceOf[typingsSlinky.gapiCalendar.gapiCalendarStrings.timeMin]
  @scala.inline
  def updatedMin: typingsSlinky.gapiCalendar.gapiCalendarStrings.updatedMin = "updatedMin".asInstanceOf[typingsSlinky.gapiCalendar.gapiCalendarStrings.updatedMin]
}

