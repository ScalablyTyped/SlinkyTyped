package typingsSlinky.awsLambda.apiGatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait APIGatewayEventIdentity extends js.Object {
  var accessKey: String | Null = js.native
  var accountId: String | Null = js.native
  var apiKey: String | Null = js.native
  var apiKeyId: String | Null = js.native
  var caller: String | Null = js.native
  var cognitoAuthenticationProvider: String | Null = js.native
  var cognitoAuthenticationType: String | Null = js.native
  var cognitoIdentityId: String | Null = js.native
  var cognitoIdentityPoolId: String | Null = js.native
  var principalOrgId: String | Null = js.native
  var sourceIp: String = js.native
  var user: String | Null = js.native
  var userAgent: String | Null = js.native
  var userArn: String | Null = js.native
}

object APIGatewayEventIdentity {
  @scala.inline
  def apply(sourceIp: String): APIGatewayEventIdentity = {
    val __obj = js.Dynamic.literal(sourceIp = sourceIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIGatewayEventIdentity]
  }
  @scala.inline
  implicit class APIGatewayEventIdentityOps[Self <: APIGatewayEventIdentity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSourceIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccessKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccessKeyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessKey")(null)
        ret
    }
    @scala.inline
    def withAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccountIdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(null)
        ret
    }
    @scala.inline
    def withApiKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApiKeyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiKey")(null)
        ret
    }
    @scala.inline
    def withApiKeyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApiKeyIdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiKeyId")(null)
        ret
    }
    @scala.inline
    def withCaller(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caller")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCallerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caller")(null)
        ret
    }
    @scala.inline
    def withCognitoAuthenticationProvider(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cognitoAuthenticationProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCognitoAuthenticationProviderNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cognitoAuthenticationProvider")(null)
        ret
    }
    @scala.inline
    def withCognitoAuthenticationType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cognitoAuthenticationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCognitoAuthenticationTypeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cognitoAuthenticationType")(null)
        ret
    }
    @scala.inline
    def withCognitoIdentityId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cognitoIdentityId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCognitoIdentityIdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cognitoIdentityId")(null)
        ret
    }
    @scala.inline
    def withCognitoIdentityPoolId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cognitoIdentityPoolId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCognitoIdentityPoolIdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cognitoIdentityPoolId")(null)
        ret
    }
    @scala.inline
    def withPrincipalOrgId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("principalOrgId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrincipalOrgIdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("principalOrgId")(null)
        ret
    }
    @scala.inline
    def withUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(null)
        ret
    }
    @scala.inline
    def withUserAgent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserAgentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgent")(null)
        ret
    }
    @scala.inline
    def withUserArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserArnNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userArn")(null)
        ret
    }
  }
  
}

