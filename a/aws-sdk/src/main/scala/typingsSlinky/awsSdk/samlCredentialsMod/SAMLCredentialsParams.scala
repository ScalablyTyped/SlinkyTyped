package typingsSlinky.awsSdk.samlCredentialsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SAMLCredentialsParams extends js.Object {
  /**
    * The duration, in seconds, of the role session.
    * The minimum duration is 15 minutes.
    * The maximum duration is 12 hours.
    */
  var DurationSeconds: js.UndefOr[Double] = js.native
  /**
    * An IAM policy in JSON format.
    * The policy plain text must be 2048 bytes or shorter.
    */
  var Policy: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the SAML provider in IAM that describes the IdP.
    */
  var PrincipalArn: String = js.native
  /**
    * The Amazon Resource Name (ARN) of the role that the caller is assuming.
    */
  var RoleArn: String = js.native
  /**
    * The base-64 encoded SAML authentication response provided by the IdP.
    */
  var SAMLAssertion: String = js.native
}

object SAMLCredentialsParams {
  @scala.inline
  def apply(PrincipalArn: String, RoleArn: String, SAMLAssertion: String): SAMLCredentialsParams = {
    val __obj = js.Dynamic.literal(PrincipalArn = PrincipalArn.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any], SAMLAssertion = SAMLAssertion.asInstanceOf[js.Any])
    __obj.asInstanceOf[SAMLCredentialsParams]
  }
  @scala.inline
  implicit class SAMLCredentialsParamsOps[Self <: SAMLCredentialsParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrincipalArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrincipalArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSAMLAssertion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SAMLAssertion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDurationSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DurationSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurationSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DurationSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Policy")(js.undefined)
        ret
    }
  }
  
}

