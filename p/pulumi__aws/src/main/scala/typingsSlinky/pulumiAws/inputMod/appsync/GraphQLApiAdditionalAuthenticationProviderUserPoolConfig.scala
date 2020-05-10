package typingsSlinky.pulumiAws.inputMod.appsync

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLApiAdditionalAuthenticationProviderUserPoolConfig extends js.Object {
  /**
    * A regular expression for validating the incoming Amazon Cognito User Pool app client ID.
    */
  var appIdClientRegex: js.UndefOr[Input[String]] = js.native
  /**
    * The AWS region in which the user pool was created.
    */
  var awsRegion: js.UndefOr[Input[String]] = js.native
  /**
    * The user pool ID.
    */
  var userPoolId: Input[String] = js.native
}

object GraphQLApiAdditionalAuthenticationProviderUserPoolConfig {
  @scala.inline
  def apply(userPoolId: Input[String]): GraphQLApiAdditionalAuthenticationProviderUserPoolConfig = {
    val __obj = js.Dynamic.literal(userPoolId = userPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLApiAdditionalAuthenticationProviderUserPoolConfig]
  }
  @scala.inline
  implicit class GraphQLApiAdditionalAuthenticationProviderUserPoolConfigOps[Self <: GraphQLApiAdditionalAuthenticationProviderUserPoolConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUserPoolId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userPoolId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppIdClientRegex(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appIdClientRegex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppIdClientRegex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appIdClientRegex")(js.undefined)
        ret
    }
    @scala.inline
    def withAwsRegion(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsRegion")(js.undefined)
        ret
    }
  }
  
}

