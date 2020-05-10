package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceIdentifier extends js.Object {
  /**
    * The account with which the resource is associated.
    */
  var account: js.UndefOr[AwsAccountId] = js.native
  /**
    * The ID of the CA certificate used to authorize the certificate.
    */
  var caCertificateId: js.UndefOr[CertificateId] = js.native
  /**
    * The client ID.
    */
  var clientId: js.UndefOr[ClientId] = js.native
  /**
    * The ID of the Amazon Cognito identity pool.
    */
  var cognitoIdentityPoolId: js.UndefOr[CognitoIdentityPoolId] = js.native
  /**
    * The ID of the certificate attached to the resource.
    */
  var deviceCertificateId: js.UndefOr[CertificateId] = js.native
  /**
    * The ARN of the IAM role that has overly permissive actions.
    */
  var iamRoleArn: js.UndefOr[RoleArn] = js.native
  /**
    * The version of the policy associated with the resource.
    */
  var policyVersionIdentifier: js.UndefOr[PolicyVersionIdentifier] = js.native
  /**
    * The ARN of the role alias that has overly permissive actions.
    */
  var roleAliasArn: js.UndefOr[RoleAliasArn] = js.native
}

object ResourceIdentifier {
  @scala.inline
  def apply(): ResourceIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceIdentifier]
  }
  @scala.inline
  implicit class ResourceIdentifierOps[Self <: ResourceIdentifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccount(value: AwsAccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account")(js.undefined)
        ret
    }
    @scala.inline
    def withCaCertificateId(value: CertificateId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caCertificateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaCertificateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caCertificateId")(js.undefined)
        ret
    }
    @scala.inline
    def withClientId(value: ClientId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(js.undefined)
        ret
    }
    @scala.inline
    def withCognitoIdentityPoolId(value: CognitoIdentityPoolId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cognitoIdentityPoolId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCognitoIdentityPoolId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cognitoIdentityPoolId")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceCertificateId(value: CertificateId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceCertificateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceCertificateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceCertificateId")(js.undefined)
        ret
    }
    @scala.inline
    def withIamRoleArn(value: RoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIamRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamRoleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyVersionIdentifier(value: PolicyVersionIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyVersionIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyVersionIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyVersionIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleAliasArn(value: RoleAliasArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleAliasArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleAliasArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleAliasArn")(js.undefined)
        ret
    }
  }
  
}

