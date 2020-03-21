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
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def iCalUID: typingsSlinky.gapiCalendar.gapiCalendarStrings.iCalUID = this.cast("iCalUID")
  @scala.inline
  def orderBy: typingsSlinky.gapiCalendar.gapiCalendarStrings.orderBy = this.cast("orderBy")
  @scala.inline
  def privateExtendedProperty: typingsSlinky.gapiCalendar.gapiCalendarStrings.privateExtendedProperty = this.cast("privateExtendedProperty")
  @scala.inline
  def q: typingsSlinky.gapiCalendar.gapiCalendarStrings.q = this.cast("q")
  @scala.inline
  def sharedExtendedProperty: typingsSlinky.gapiCalendar.gapiCalendarStrings.sharedExtendedProperty = this.cast("sharedExtendedProperty")
  @scala.inline
  def timeMax: typingsSlinky.gapiCalendar.gapiCalendarStrings.timeMax = this.cast("timeMax")
  @scala.inline
  def timeMin: typingsSlinky.gapiCalendar.gapiCalendarStrings.timeMin = this.cast("timeMin")
  @scala.inline
  def updatedMin: typingsSlinky.gapiCalendar.gapiCalendarStrings.updatedMin = this.cast("updatedMin")
}

