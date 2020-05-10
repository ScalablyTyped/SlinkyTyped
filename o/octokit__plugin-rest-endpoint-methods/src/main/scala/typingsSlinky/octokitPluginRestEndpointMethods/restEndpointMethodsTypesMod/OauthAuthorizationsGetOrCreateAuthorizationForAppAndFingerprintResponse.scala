package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintResponse extends js.Object {
  var app: OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintResponseApp = js.native
  var created_at: String = js.native
  var fingerprint: String = js.native
  var hashed_token: String = js.native
  var id: Double = js.native
  var note: String = js.native
  var note_url: String = js.native
  var scopes: js.Array[String] = js.native
  var token: String = js.native
  var token_last_eight: String = js.native
  var updated_at: String = js.native
  var url: String = js.native
}

object OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintResponse {
  @scala.inline
  def apply(
    app: OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintResponseApp,
    created_at: String,
    fingerprint: String,
    hashed_token: String,
    id: Double,
    note: String,
    note_url: String,
    scopes: js.Array[String],
    token: String,
    token_last_eight: String,
    updated_at: String,
    url: String
  ): OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintResponse = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], hashed_token = hashed_token.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any], note_url = note_url.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], token_last_eight = token_last_eight.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintResponse]
  }
  @scala.inline
  implicit class OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintResponseOps[Self <: OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApp(value: OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintResponseApp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFingerprint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHashed_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashed_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNote(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNote_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScopes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToken_last_eight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token_last_eight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

