package typingsSlinky.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CognitoOptions extends js.Object {
  /**
    * Specifies the option to enable Cognito for Kibana authentication.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the Cognito identity pool ID for Kibana authentication.
    */
  var IdentityPoolId: js.UndefOr[typingsSlinky.awsSdk.esMod.IdentityPoolId] = js.native
  /**
    * Specifies the role ARN that provides Elasticsearch permissions for accessing Cognito resources.
    */
  var RoleArn: js.UndefOr[typingsSlinky.awsSdk.esMod.RoleArn] = js.native
  /**
    * Specifies the Cognito user pool ID for Kibana authentication.
    */
  var UserPoolId: js.UndefOr[typingsSlinky.awsSdk.esMod.UserPoolId] = js.native
}

object CognitoOptions {
  @scala.inline
  def apply(): CognitoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CognitoOptions]
  }
  @scala.inline
  implicit class CognitoOptionsOps[Self <: CognitoOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentityPoolId(value: IdentityPoolId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityPoolId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentityPoolId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityPoolId")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleArn(value: RoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withUserPoolId(value: UserPoolId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserPoolId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserPoolId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserPoolId")(js.undefined)
        ret
    }
  }
  
}

