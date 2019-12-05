package typingsSlinky.gapiDotClientDotCalendar.gapi.client.calendar

import typingsSlinky.gapiDotClient.gapi.client.Request
import typingsSlinky.gapiDotClientDotCalendar.Anon_AltFieldsKeyMaxResults
import typingsSlinky.gapiDotClientDotCalendar.Anon_AltFieldsKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingsResource extends js.Object {
  /** Returns a single user setting. */
  def get(request: Anon_AltFieldsKeyOauthtoken): Request[Setting]
  /** Returns all user settings for the authenticated user. */
  def list(request: Anon_AltFieldsKeyMaxResults): Request[Settings]
  /** Watch for changes to Settings resources. */
  def watch(request: Anon_AltFieldsKeyMaxResults): Request[Channel]
}

object SettingsResource {
  @scala.inline
  def apply(
    get: Anon_AltFieldsKeyOauthtoken => Request[Setting],
    list: Anon_AltFieldsKeyMaxResults => Request[Settings],
    watch: Anon_AltFieldsKeyMaxResults => Request[Channel]
  ): SettingsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), watch = js.Any.fromFunction1(watch))
  
    __obj.asInstanceOf[SettingsResource]
  }
}

