package typingsSlinky.gapiClientServiceuser.gapi.client.serviceuser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthenticationRule extends js.Object {
  /**
    * Whether to allow requests without a credential. The credential can be
    * an OAuth token, Google cookies (first-party auth) or EndUserCreds.
    *
    * For requests without credentials, if the service control environment is
    * specified, each incoming request &#42;&#42;must&#42;&#42; be associated with a service
    * consumer. This can be done by passing an API key that belongs to a consumer
    * project.
    */
  var allowWithoutCredential: js.UndefOr[Boolean] = js.native
  /** Configuration for custom authentication. */
  var customAuth: js.UndefOr[CustomAuthRequirements] = js.native
  /** The requirements for OAuth credentials. */
  var oauth: js.UndefOr[OAuthRequirements] = js.native
  /** Requirements for additional authentication providers. */
  var requirements: js.UndefOr[js.Array[AuthRequirement]] = js.native
  /**
    * Selects the methods to which this rule applies.
    *
    * Refer to selector for syntax details.
    */
  var selector: js.UndefOr[String] = js.native
}

object AuthenticationRule {
  @scala.inline
  def apply(): AuthenticationRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationRule]
  }
  @scala.inline
  implicit class AuthenticationRuleOps[Self <: AuthenticationRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowWithoutCredential(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowWithoutCredential")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowWithoutCredential: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowWithoutCredential")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomAuth(value: CustomAuthRequirements): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customAuth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customAuth")(js.undefined)
        ret
    }
    @scala.inline
    def withOauth(value: OAuthRequirements): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOauth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauth")(js.undefined)
        ret
    }
    @scala.inline
    def withRequirements(value: js.Array[AuthRequirement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requirements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequirements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requirements")(js.undefined)
        ret
    }
    @scala.inline
    def withSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(js.undefined)
        ret
    }
  }
  
}

