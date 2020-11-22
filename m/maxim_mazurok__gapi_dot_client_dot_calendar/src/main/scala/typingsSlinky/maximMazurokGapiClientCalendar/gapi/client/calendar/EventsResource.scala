package typingsSlinky.maximMazurokGapiClientCalendar.gapi.client.calendar

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientCalendar.anon.AltAlwaysIncludeEmail
import typingsSlinky.maximMazurokGapiClientCalendar.anon.AlwaysIncludeEmail
import typingsSlinky.maximMazurokGapiClientCalendar.anon.ConferenceDataVersion
import typingsSlinky.maximMazurokGapiClientCalendar.anon.Destination
import typingsSlinky.maximMazurokGapiClientCalendar.anon.EventId
import typingsSlinky.maximMazurokGapiClientCalendar.anon.ICalUID
import typingsSlinky.maximMazurokGapiClientCalendar.anon.MaxAttendees
import typingsSlinky.maximMazurokGapiClientCalendar.anon.OrderBy
import typingsSlinky.maximMazurokGapiClientCalendar.anon.OriginalStart
import typingsSlinky.maximMazurokGapiClientCalendar.anon.SendNotifications
import typingsSlinky.maximMazurokGapiClientCalendar.anon.SendUpdates
import typingsSlinky.maximMazurokGapiClientCalendar.anon.SupportsAttachments
import typingsSlinky.maximMazurokGapiClientCalendar.anon.Text
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
