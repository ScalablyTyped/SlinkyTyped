package typingsSlinky.firebaseAdmin.admin.auth

import typingsSlinky.firebaseAdmin.firebaseAdminStrings.oidc
import typingsSlinky.firebaseAdmin.firebaseAdminStrings.saml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The filter interface used for listing provider configurations. This is used
  * when specifying how to list configured identity providers via
  * {@link https://firebase.google.com/docs/reference/admin/node/admin.auth.Auth#listProviderConfigs `listProviderConfigs()`}.
  */
@js.native
trait AuthProviderConfigFilter extends js.Object {
  /**
    * The maximum number of results to return per page. The default and maximum is
    * 100.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * The next page token. When not specified, the lookup starts from the beginning
    * of the list.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The Auth provider configuration filter. This can be either `saml` or `oidc`.
    * The former is used to look up SAML providers only, while the latter is used
    * for OIDC providers.
    */
  var `type`: saml | oidc = js.native
}

object AuthProviderConfigFilter {
  @scala.inline
  def apply(`type`: saml | oidc): AuthProviderConfigFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthProviderConfigFilter]
  }
  @scala.inline
  implicit class AuthProviderConfigFilterOps[Self <: AuthProviderConfigFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: saml | oidc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxResults(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(js.undefined)
        ret
    }
    @scala.inline
    def withPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(js.undefined)
        ret
    }
  }
  
}

