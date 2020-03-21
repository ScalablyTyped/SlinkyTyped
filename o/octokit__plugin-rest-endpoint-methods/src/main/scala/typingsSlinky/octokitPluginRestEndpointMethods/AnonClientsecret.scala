package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClientsecret extends js.Object {
  var client_id: AnonType
  var client_secret: AnonType
  var fingerprint: AnonType
  var note: AnonRequired
  var note_url: AnonType
  var scopes: AnonType
}

object AnonClientsecret {
  @scala.inline
  def apply(
    client_id: AnonType,
    client_secret: AnonType,
    fingerprint: AnonType,
    note: AnonRequired,
    note_url: AnonType,
    scopes: AnonType
  ): AnonClientsecret = {
    val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any], client_secret = client_secret.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any], note_url = note_url.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonClientsecret]
  }
}

