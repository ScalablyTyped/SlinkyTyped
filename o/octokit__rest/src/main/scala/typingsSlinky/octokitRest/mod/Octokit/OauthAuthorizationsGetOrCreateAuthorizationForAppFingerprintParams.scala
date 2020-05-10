package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OauthAuthorizationsGetOrCreateAuthorizationForAppFingerprintParams extends js.Object {
  var client_id: String = js.native
  /**
    * The 40 character OAuth app client secret associated with the client ID specified in the URL.
    */
  var client_secret: String = js.native
  var fingerprint: String = js.native
  /**
    * A note to remind you what the OAuth token is for.
    */
  var note: js.UndefOr[String] = js.native
  /**
    * A URL to remind you what app the OAuth token is for.
    */
  var note_url: js.UndefOr[String] = js.native
  /**
    * A list of scopes that this authorization is in.
    */
  var scopes: js.UndefOr[js.Array[String]] = js.native
}

object OauthAuthorizationsGetOrCreateAuthorizationForAppFingerprintParams {
  @scala.inline
  def apply(client_id: String, client_secret: String, fingerprint: String): OauthAuthorizationsGetOrCreateAuthorizationForAppFingerprintParams = {
    val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any], client_secret = client_secret.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any])
    __obj.asInstanceOf[OauthAuthorizationsGetOrCreateAuthorizationForAppFingerprintParams]
  }
  @scala.inline
  implicit class OauthAuthorizationsGetOrCreateAuthorizationForAppFingerprintParamsOps[Self <: OauthAuthorizationsGetOrCreateAuthorizationForAppFingerprintParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClient_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_secret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_secret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFingerprint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNote(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(js.undefined)
        ret
    }
    @scala.inline
    def withNote_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNote_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note_url")(js.undefined)
        ret
    }
    @scala.inline
    def withScopes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScopes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopes")(js.undefined)
        ret
    }
  }
  
}

