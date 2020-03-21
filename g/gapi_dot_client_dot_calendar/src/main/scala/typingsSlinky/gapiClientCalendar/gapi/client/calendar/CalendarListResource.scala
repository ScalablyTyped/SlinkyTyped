package typingsSlinky.gapiClientCalendar.gapi.client.calendar

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCalendar.AnonCalendarId
import typingsSlinky.gapiClientCalendar.AnonColorRgbFormat
import typingsSlinky.gapiClientCalendar.AnonKey
import typingsSlinky.gapiClientCalendar.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarListResource extends js.Object {
  /** Deletes an entry on the user's calendar list. */
  def delete(request: AnonCalendarId): Request_[Unit]
  /** Returns an entry on the user's calendar list. */
  def get(request: AnonCalendarId): Request_[CalendarListEntry]
  /** Adds an entry to the user's calendar list. */
  def insert(request: AnonColorRgbFormat): Request_[CalendarListEntry]
  /** Returns entries on the user's calendar list. */
  def list(request: AnonKey): Request_[CalendarList]
  /** Updates an entry on the user's calendar list. This method supports patch semantics. */
  def patch(request: AnonOauthtoken): Request_[CalendarListEntry]
  /** Updates an entry on the user's calendar list. */
  def update(request: AnonOauthtoken): Request_[CalendarListEntry]
  /** Watch for changes to CalendarList resources. */
  def watch(request: AnonKey): Request_[Channel]
}

object CalendarListResource {
  @scala.inline
  def apply(
    delete: AnonCalendarId => Request_[Unit],
    get: AnonCalendarId => Request_[CalendarListEntry],
    insert: AnonColorRgbFormat => Request_[CalendarListEntry],
    list: AnonKey => Request_[CalendarList],
    patch: AnonOauthtoken => Request_[CalendarListEntry],
    update: AnonOauthtoken => Request_[CalendarListEntry],
    watch: AnonKey => Request_[Channel]
  ): CalendarListResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update), watch = js.Any.fromFunction1(watch))
  
    __obj.asInstanceOf[CalendarListResource]
  }
}

