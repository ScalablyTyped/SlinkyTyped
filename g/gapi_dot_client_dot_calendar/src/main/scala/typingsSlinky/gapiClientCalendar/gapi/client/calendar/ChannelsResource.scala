package typingsSlinky.gapiClientCalendar.gapi.client.calendar

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientCalendar.anon.FieldsKey
import typingsSlinky.gapiClientCalendar.anon.KeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelsResource extends js.Object {
  def stop(request: FieldsKey, body: Channel): Request[Unit] = js.native
  /** Stop watching resources through this channel */
  def stop(request: KeyOauthtoken): Request[Unit] = js.native
}

