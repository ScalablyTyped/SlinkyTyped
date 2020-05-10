package typingsSlinky.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateGraphqlApiRequest extends js.Object {
  /**
    * A list of additional authentication providers for the GraphqlApi API.
    */
  var additionalAuthenticationProviders: js.UndefOr[AdditionalAuthenticationProviders] = js.native
  /**
    * The API ID.
    */
  var apiId: String = js.native
  /**
    * The new authentication type for the GraphqlApi object.
    */
  var authenticationType: js.UndefOr[AuthenticationType] = js.native
  /**
    * The Amazon CloudWatch Logs configuration for the GraphqlApi object.
    */
  var logConfig: js.UndefOr[LogConfig] = js.native
  /**
    * The new name for the GraphqlApi object.
    */
  var name: String = js.native
  /**
    * The OpenID Connect configuration for the GraphqlApi object.
    */
  var openIDConnectConfig: js.UndefOr[OpenIDConnectConfig] = js.native
  /**
    * The new Amazon Cognito user pool configuration for the GraphqlApi object.
    */
  var userPoolConfig: js.UndefOr[UserPoolConfig] = js.native
  /**
    * A flag indicating whether to enable X-Ray tracing for the GraphqlApi.
    */
  var xrayEnabled: js.UndefOr[Boolean] = js.native
}

object UpdateGraphqlApiRequest {
  @scala.inline
  def apply(apiId: String, name: String): UpdateGraphqlApiRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGraphqlApiRequest]
  }
  @scala.inline
  implicit class UpdateGraphqlApiRequestOps[Self <: UpdateGraphqlApiRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdditionalAuthenticationProviders(value: AdditionalAuthenticationProviders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalAuthenticationProviders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalAuthenticationProviders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalAuthenticationProviders")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthenticationType(value: AuthenticationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthenticationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticationType")(js.undefined)
        ret
    }
    @scala.inline
    def withLogConfig(value: LogConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenIDConnectConfig(value: OpenIDConnectConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openIDConnectConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenIDConnectConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openIDConnectConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withUserPoolConfig(value: UserPoolConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userPoolConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserPoolConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userPoolConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withXrayEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xrayEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXrayEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xrayEnabled")(js.undefined)
        ret
    }
  }
  
}

