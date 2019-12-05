package typingsSlinky.gapiDotClientDotMirror.gapi.client.mirror

import typingsSlinky.gapiDotClient.gapi.client.Request
import typingsSlinky.gapiDotClientDotMirror.Anon_Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingsResource extends js.Object {
  /** Gets a single setting by ID. */
  def get(request: Anon_Alt): Request[Setting]
}

object SettingsResource {
  @scala.inline
  def apply(get: Anon_Alt => Request[Setting]): SettingsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[SettingsResource]
  }
}

