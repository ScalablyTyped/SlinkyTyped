package typingsSlinky.gapiClientCalendar.gapi.client.calendar

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientCalendar.anon.FieldsKey
import typingsSlinky.gapiClientCalendar.anon.OauthtokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FreebusyResource extends js.Object {
  def query(request: FieldsKey, body: FreeBusyRequest): Request[FreeBusyResponse] = js.native
  /** Returns free/busy information for a set of calendars. */
  def query(request: OauthtokenPrettyPrint): Request[FreeBusyResponse] = js.native
}

