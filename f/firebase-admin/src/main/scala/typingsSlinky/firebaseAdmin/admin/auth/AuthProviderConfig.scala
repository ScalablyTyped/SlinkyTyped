package typingsSlinky.firebaseAdmin.admin.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The base Auth provider configuration interface.
  */
@js.native
trait AuthProviderConfig extends js.Object {
  /**
    * The user-friendly display name to the current configuration. This name is
    * also used as the provider label in the Cloud Console.
    */
  var displayName: String = js.native
  /**
    * Whether the provider configuration is enabled or disabled. A user
    * cannot sign in using a disabled provider.
    */
  var enabled: Boolean = js.native
  /**
    * The provider ID defined by the developer.
    * For a SAML provider, this is always prefixed by `saml.`.
    * For an OIDC provider, this is always prefixed by `oidc.`.
    */
  var providerId: String = js.native
}

object AuthProviderConfig {
  @scala.inline
  def apply(displayName: String, enabled: Boolean, providerId: String): AuthProviderConfig = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], providerId = providerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthProviderConfig]
  }
  @scala.inline
  implicit class AuthProviderConfigOps[Self <: AuthProviderConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProviderId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

