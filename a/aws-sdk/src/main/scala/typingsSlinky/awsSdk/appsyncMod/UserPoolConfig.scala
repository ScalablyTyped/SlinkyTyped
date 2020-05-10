package typingsSlinky.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPoolConfig extends js.Object {
  /**
    * A regular expression for validating the incoming Amazon Cognito user pool app client ID.
    */
  var appIdClientRegex: js.UndefOr[String] = js.native
  /**
    * The AWS Region in which the user pool was created.
    */
  var awsRegion: String = js.native
  /**
    * The action that you want your GraphQL API to take when a request that uses Amazon Cognito user pool authentication doesn't match the Amazon Cognito user pool configuration.
    */
  var defaultAction: DefaultAction = js.native
  /**
    * The user pool ID.
    */
  var userPoolId: String = js.native
}

object UserPoolConfig {
  @scala.inline
  def apply(awsRegion: String, defaultAction: DefaultAction, userPoolId: String): UserPoolConfig = {
    val __obj = js.Dynamic.literal(awsRegion = awsRegion.asInstanceOf[js.Any], defaultAction = defaultAction.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPoolConfig]
  }
  @scala.inline
  implicit class UserPoolConfigOps[Self <: UserPoolConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAwsRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultAction(value: DefaultAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserPoolId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userPoolId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppIdClientRegex(value: String): Self = {
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
  }
  
}

