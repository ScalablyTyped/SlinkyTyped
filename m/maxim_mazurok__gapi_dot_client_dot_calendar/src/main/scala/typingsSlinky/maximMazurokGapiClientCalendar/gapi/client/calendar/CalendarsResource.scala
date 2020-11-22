package typingsSlinky.maximMazurokGapiClientCalendar.gapi.client.calendar

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientCalendar.anon.AltFields
import typingsSlinky.maximMazurokGapiClientCalendar.anon.CalendarIdFields
import typingsSlinky.maximMazurokGapiClientCalendar.anon.FieldsKey
import typingsSlinky.maximMazurokGapiClientCalendar.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalendarsResource extends js.Object {
  
  /** Clears a primary calendar. This operation deletes all events associated with the primary calendar of an account. */
  def clear(): Request[Unit] = js.native
  def clear(request: QuotaUser): Request[Unit] = js.native
  
  /** Deletes a secondary calendar. Use calendars.clear for clearing all events on primary calendars. */
  def delete(): Request[Unit] = js.native
  def delete(request: QuotaUser): Request[Unit] = js.native
  
  /** Returns metadata for a calendar. */
  def get(): Request[Calendar] = js.native
  def get(request: QuotaUser): Request[Calendar] = js.native
  
  /** Creates a secondary calendar. */
  def insert(request: AltFields): Request[Calendar] = js.native
  def insert(request: FieldsKey, body: Calendar): Request[Calendar] = js.native
  
  /** Updates metadata for a calendar. This method supports patch semantics. */
  def patch(request: CalendarIdFields): Request[Calendar] = js.native
  def patch(request: QuotaUser, body: Calendar): Request[Calendar] = js.native
  
  /** Updates metadata for a calendar. */
  def update(request: CalendarIdFields): Request[Calendar] = js.native
  def update(request: QuotaUser, body: Calendar): Request[Calendar] = js.native
}
