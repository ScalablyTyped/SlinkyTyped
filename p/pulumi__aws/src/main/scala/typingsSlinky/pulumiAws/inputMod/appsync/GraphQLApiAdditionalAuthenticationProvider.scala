package typingsSlinky.pulumiAws.inputMod.appsync

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLApiAdditionalAuthenticationProvider extends js.Object {
  /**
    * The authentication type. Valid values: `API_KEY`, `AWS_IAM`, `AMAZON_COGNITO_USER_POOLS`, `OPENID_CONNECT`
    */
  var authenticationType: Input[String] = js.native
  /**
    * Nested argument containing OpenID Connect configuration. Defined below.
    */
  var openidConnectConfig: js.UndefOr[Input[GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfig]] = js.native
  /**
    * The Amazon Cognito User Pool configuration. Defined below.
    */
  var userPoolConfig: js.UndefOr[Input[GraphQLApiAdditionalAuthenticationProviderUserPoolConfig]] = js.native
}

object GraphQLApiAdditionalAuthenticationProvider {
  @scala.inline
  def apply(authenticationType: Input[String]): GraphQLApiAdditionalAuthenticationProvider = {
    val __obj = js.Dynamic.literal(authenticationType = authenticationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLApiAdditionalAuthenticationProvider]
  }
  @scala.inline
  implicit class GraphQLApiAdditionalAuthenticationProviderOps[Self <: GraphQLApiAdditionalAuthenticationProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthenticationType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenidConnectConfig(value: Input[GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openidConnectConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenidConnectConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openidConnectConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withUserPoolConfig(value: Input[GraphQLApiAdditionalAuthenticationProviderUserPoolConfig]): Self = {
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
  }
  
}

