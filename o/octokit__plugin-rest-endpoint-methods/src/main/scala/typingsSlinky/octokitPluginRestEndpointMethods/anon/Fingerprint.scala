package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fingerprint extends js.Object {
  var client_id: Required
  var client_secret: Required
  var fingerprint: Type
  var note: Type
  var note_url: Type
  var scopes: Type
}

object Fingerprint {
  @scala.inline
  def apply(
    client_id: Required,
    client_secret: Required,
    fingerprint: Type,
    note: Type,
    note_url: Type,
    scopes: Type
  ): Fingerprint = {
    val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any], client_secret = client_secret.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any], note_url = note_url.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fingerprint]
  }
}

