package typingsSlinky.gapiDotClientDotCalendar.gapi.client.calendar

import typingsSlinky.gapiDotClient.gapi.client.Request
import typingsSlinky.gapiDotClientDotCalendar.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorsResource extends js.Object {
  /** Returns the color definitions for calendars and events. */
  def get(request: Anon_AltFieldsKey): Request[Colors]
}

object ColorsResource {
  @scala.inline
  def apply(get: Anon_AltFieldsKey => Request[Colors]): ColorsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[ColorsResource]
  }
}

