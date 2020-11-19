package typingsSlinky.gapiClientCalendar.gapi.client.calendar

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientCalendar.anon.AltAlwaysIncludeEmail
import typingsSlinky.gapiClientCalendar.anon.AlwaysIncludeEmail
import typingsSlinky.gapiClientCalendar.anon.ConferenceDataVersion
import typingsSlinky.gapiClientCalendar.anon.Destination
import typingsSlinky.gapiClientCalendar.anon.EventId
import typingsSlinky.gapiClientCalendar.anon.ICalUID
import typingsSlinky.gapiClientCalendar.anon.MaxAttendees
import typingsSlinky.gapiClientCalendar.anon.OrderBy
import typingsSlinky.gapiClientCalendar.anon.OriginalStart
import typingsSlinky.gapiClientCalendar.anon.SendNotifications
import typingsSlinky.gapiClientCalendar.anon.SendUpdates
import typingsSlinky.gapiClientCalendar.anon.SupportsAttachments
import typingsSlinky.gapiClientCalendar.anon.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventsResource extends js.Object {
  
  /** Deletes an event. */
  def delete(): Request[Unit] = js.native
  def delete(request: EventId): Request[Unit] = js.native
  
  /** Returns an event. */
  def get(): Request[Event] = js.native
  def get(request: AlwaysIncludeEmail): Request[Event] = js.native
  
  /** Imports an event. This operation is used to add a private copy of an existing event to a calendar. */
  def `import`(request: ConferenceDataVersion): Request[Event] = js.native
  def `import`(request: SupportsAttachments, body: Event): Request[Event] = js.native
  
  /** Creates an event. */
  def insert(request: MaxAttendees): Request[Event] = js.native
  def insert(request: SendNotifications, body: Event): Request[Event] = js.native
  
  /** Returns instances of the specified recurring event. */
  def instances(): Request[Events] = js.native
  def instances(request: OriginalStart): Request[Events] = js.native
  
  /** Returns events on the specified calendar. */
  def list(): Request[Events] = js.native
  def list(request: ICalUID): Request[Events] = js.native
  
  /** Moves an event to another calendar, i.e. changes an event's organizer. */
  def move(): Request[Event] = js.native
  def move(request: Destination): Request[Event] = js.native
  
  def patch(request: AltAlwaysIncludeEmail, body: Event): Request[Event] = js.native
  /** Updates an event. This method supports patch semantics. */
  def patch(request: SendUpdates): Request[Event] = js.native
  
  /** Creates an event based on a simple text string. */
  def quickAdd(): Request[Event] = js.native
  def quickAdd(request: Text): Request[Event] = js.native
  
  def update(request: AltAlwaysIncludeEmail, body: Event): Request[Event] = js.native
  /** Updates an event. */
  def update(request: SendUpdates): Request[Event] = js.native
  
  def watch(request: ICalUID, body: Channel): Request[Channel] = js.native
  /** Watch for changes to Events resources. */
  def watch(request: OrderBy): Request[Channel] = js.native
}
