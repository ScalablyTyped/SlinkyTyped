package typingsSlinky.chromeApps.chrome.identity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenDetails extends js.Object {
  /**
    * Optional.
    * The account ID whose token should be returned.
    * If not specified, the primary account for the profile will be used.
    * account is only supported when the 'enable-new-profile-management' flag is set.
    * @since Chrome 37.
    */
  var account: js.UndefOr[AccountInfo] = js.native
  /**
    * Fetching a token may require the user to sign-in to Chrome,
    * or approve the application's requested scopes.
    * If the interactive flag is true, getAuthToken will prompt the user as necessary.
    * When the flag is false or omitted, getAuthToken will return failure any time
    * a prompt would be required.
    */
  var interactive: js.UndefOr[Boolean] = js.native
  /**
    * Optional.
    * A list of OAuth2 scopes to request.
    * When the scopes field is present, it overrides the list of scopes specified in manifest.json.
    * @since Chrome 37.
    */
  var scopes: js.UndefOr[js.Array[String]] = js.native
}

object TokenDetails {
  @scala.inline
  def apply(): TokenDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenDetails]
  }
  @scala.inline
  implicit class TokenDetailsOps[Self <: TokenDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccount(value: AccountInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account")(js.undefined)
        ret
    }
    @scala.inline
    def withInteractive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInteractive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactive")(js.undefined)
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

