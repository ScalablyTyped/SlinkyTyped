package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Clientsecret extends js.Object {
  var client_id: Type
  var client_secret: Type
  var fingerprint: Type
  var note: Required
  var note_url: Type
  var scopes: Type
}

object Clientsecret {
  @scala.inline
  def apply(
    client_id: Type,
    client_secret: Type,
    fingerprint: Type,
    note: Required,
    note_url: Type,
    scopes: Type
  ): Clientsecret = {
    val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any], client_secret = client_secret.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any], note_url = note_url.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Clientsecret]
  }
}

