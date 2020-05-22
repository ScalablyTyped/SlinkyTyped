package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Addscopes extends js.Object {
  var add_scopes: Type
  var authorization_id: Required
  var fingerprint: Type
  var note: Type
  var note_url: Type
  var remove_scopes: Type
  var scopes: Type
}

object Addscopes {
  @scala.inline
  def apply(
    add_scopes: Type,
    authorization_id: Required,
    fingerprint: Type,
    note: Type,
    note_url: Type,
    remove_scopes: Type,
    scopes: Type
  ): Addscopes = {
    val __obj = js.Dynamic.literal(add_scopes = add_scopes.asInstanceOf[js.Any], authorization_id = authorization_id.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any], note_url = note_url.asInstanceOf[js.Any], remove_scopes = remove_scopes.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Addscopes]
  }
}

