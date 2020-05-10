package typingsSlinky.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizationConfig extends js.Object {
  /**
    * The authorization type required by the HTTP endpoint.    AWS_IAM: The authorization type is Sigv4.  
    */
  var authorizationType: AuthorizationType = js.native
  /**
    * The AWS IAM settings.
    */
  var awsIamConfig: js.UndefOr[AwsIamConfig] = js.native
}

object AuthorizationConfig {
  @scala.inline
  def apply(authorizationType: AuthorizationType): AuthorizationConfig = {
    val __obj = js.Dynamic.literal(authorizationType = authorizationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizationConfig]
  }
  @scala.inline
  implicit class AuthorizationConfigOps[Self <: AuthorizationConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorizationType(value: AuthorizationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAwsIamConfig(value: AwsIamConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsIamConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsIamConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsIamConfig")(js.undefined)
        ret
    }
  }
  
}

