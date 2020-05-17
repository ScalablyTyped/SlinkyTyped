package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fingerprint extends js.Object {
  var client_id: Required = js.native
  var client_secret: Required = js.native
  var fingerprint: Type = js.native
  var note: Type = js.native
  var note_url: Type = js.native
  var scopes: Type = js.native
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
  @scala.inline
  implicit class FingerprintOps[Self <: Fingerprint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClient_id(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_secret(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_secret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFingerprint(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNote(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNote_url(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScopes(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

