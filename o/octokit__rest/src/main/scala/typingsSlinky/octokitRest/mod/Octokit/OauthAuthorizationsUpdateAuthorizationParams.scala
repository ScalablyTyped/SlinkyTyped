package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OauthAuthorizationsUpdateAuthorizationParams extends js.Object {
  /**
    * A list of scopes to add to this authorization.
    */
  var add_scopes: js.UndefOr[js.Array[String]] = js.native
  var authorization_id: Double = js.native
  /**
    * A unique string to distinguish an authorization from others created for the same client ID and user.
    */
  var fingerprint: js.UndefOr[String] = js.native
  /**
    * A note to remind you what the OAuth token is for. Tokens not associated with a specific OAuth application (i.e. personal access tokens) must have a unique note.
    */
  var note: js.UndefOr[String] = js.native
  /**
    * A URL to remind you what app the OAuth token is for.
    */
  var note_url: js.UndefOr[String] = js.native
  /**
    * A list of scopes to remove from this authorization.
    */
  var remove_scopes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Replaces the authorization scopes with these.
    */
  var scopes: js.UndefOr[js.Array[String]] = js.native
}

object OauthAuthorizationsUpdateAuthorizationParams {
  @scala.inline
  def apply(authorization_id: Double): OauthAuthorizationsUpdateAuthorizationParams = {
    val __obj = js.Dynamic.literal(authorization_id = authorization_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[OauthAuthorizationsUpdateAuthorizationParams]
  }
  @scala.inline
  implicit class OauthAuthorizationsUpdateAuthorizationParamsOps[Self <: OauthAuthorizationsUpdateAuthorizationParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorization_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorization_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdd_scopes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add_scopes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdd_scopes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add_scopes")(js.undefined)
        ret
    }
    @scala.inline
    def withFingerprint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFingerprint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(js.undefined)
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
    def withRemove_scopes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove_scopes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemove_scopes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove_scopes")(js.undefined)
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

