package typingsSlinky.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphqlApi extends js.Object {
  /**
    * A list of additional authentication providers for the GraphqlApi API.
    */
  var additionalAuthenticationProviders: js.UndefOr[AdditionalAuthenticationProviders] = js.native
  /**
    * The API ID.
    */
  var apiId: js.UndefOr[String] = js.native
  /**
    * The ARN.
    */
  var arn: js.UndefOr[String] = js.native
  /**
    * The authentication type.
    */
  var authenticationType: js.UndefOr[AuthenticationType] = js.native
  /**
    * The Amazon CloudWatch Logs configuration.
    */
  var logConfig: js.UndefOr[LogConfig] = js.native
  /**
    * The API name.
    */
  var name: js.UndefOr[ResourceName] = js.native
  /**
    * The OpenID Connect configuration.
    */
  var openIDConnectConfig: js.UndefOr[OpenIDConnectConfig] = js.native
  /**
    * The tags.
    */
  var tags: js.UndefOr[TagMap] = js.native
  /**
    * The URIs.
    */
  var uris: js.UndefOr[MapOfStringToString] = js.native
  /**
    * The Amazon Cognito user pool configuration.
    */
  var userPoolConfig: js.UndefOr[UserPoolConfig] = js.native
  /**
    * A flag representing whether X-Ray tracing is enabled for this GraphqlApi.
    */
  var xrayEnabled: js.UndefOr[Boolean] = js.native
}

object GraphqlApi {
  @scala.inline
  def apply(): GraphqlApi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphqlApi]
  }
  @scala.inline
  implicit class GraphqlApiOps[Self <: GraphqlApi] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withApiId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiId")(js.undefined)
        ret
    }
    @scala.inline
    def withArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
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
    def withName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
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
    def withTags(value: TagMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withUris(value: MapOfStringToString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uris")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUris: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uris")(js.undefined)
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

