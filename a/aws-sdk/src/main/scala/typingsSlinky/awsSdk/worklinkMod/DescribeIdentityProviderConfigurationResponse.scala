package typingsSlinky.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeIdentityProviderConfigurationResponse extends js.Object {
  /**
    * The SAML metadata document provided by the user’s identity provider.
    */
  var IdentityProviderSamlMetadata: js.UndefOr[SamlMetadata] = js.native
  /**
    * The type of identity provider.
    */
  var IdentityProviderType: js.UndefOr[typingsSlinky.awsSdk.worklinkMod.IdentityProviderType] = js.native
  /**
    * The SAML metadata document uploaded to the user’s identity provider.
    */
  var ServiceProviderSamlMetadata: js.UndefOr[SamlMetadata] = js.native
}

object DescribeIdentityProviderConfigurationResponse {
  @scala.inline
  def apply(): DescribeIdentityProviderConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeIdentityProviderConfigurationResponse]
  }
  @scala.inline
  implicit class DescribeIdentityProviderConfigurationResponseOps[Self <: DescribeIdentityProviderConfigurationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdentityProviderSamlMetadata(value: SamlMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityProviderSamlMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentityProviderSamlMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityProviderSamlMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentityProviderType(value: IdentityProviderType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityProviderType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentityProviderType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityProviderType")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceProviderSamlMetadata(value: SamlMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceProviderSamlMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceProviderSamlMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceProviderSamlMetadata")(js.undefined)
        ret
    }
  }
  
}

