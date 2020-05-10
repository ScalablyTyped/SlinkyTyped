package typingsSlinky.awsSdk.stsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssumeRoleWithSAMLResponse extends js.Object {
  /**
    * The identifiers for the temporary security credentials that the operation returns.
    */
  var AssumedRoleUser: js.UndefOr[typingsSlinky.awsSdk.stsMod.AssumedRoleUser] = js.native
  /**
    *  The value of the Recipient attribute of the SubjectConfirmationData element of the SAML assertion. 
    */
  var Audience: js.UndefOr[typingsSlinky.awsSdk.stsMod.Audience] = js.native
  /**
    * The temporary security credentials, which include an access key ID, a secret access key, and a security (or session) token.  The size of the security token that STS API operations return is not fixed. We strongly recommend that you make no assumptions about the maximum size. 
    */
  var Credentials: js.UndefOr[typingsSlinky.awsSdk.stsMod.Credentials] = js.native
  /**
    * The value of the Issuer element of the SAML assertion.
    */
  var Issuer: js.UndefOr[typingsSlinky.awsSdk.stsMod.Issuer] = js.native
  /**
    * A hash value based on the concatenation of the Issuer response value, the AWS account ID, and the friendly name (the last part of the ARN) of the SAML provider in IAM. The combination of NameQualifier and Subject can be used to uniquely identify a federated user.  The following pseudocode shows how the hash value is calculated:  BASE64 ( SHA1 ( "https://example.com/saml" + "123456789012" + "/MySAMLIdP" ) ) 
    */
  var NameQualifier: js.UndefOr[typingsSlinky.awsSdk.stsMod.NameQualifier] = js.native
  /**
    * A percentage value that indicates the packed size of the session policies and session tags combined passed in the request. The request fails if the packed size is greater than 100 percent, which means the policies and tags exceeded the allowed space.
    */
  var PackedPolicySize: js.UndefOr[nonNegativeIntegerType] = js.native
  /**
    * The value of the NameID element in the Subject element of the SAML assertion.
    */
  var Subject: js.UndefOr[typingsSlinky.awsSdk.stsMod.Subject] = js.native
  /**
    *  The format of the name ID, as defined by the Format attribute in the NameID element of the SAML assertion. Typical examples of the format are transient or persistent.   If the format includes the prefix urn:oasis:names:tc:SAML:2.0:nameid-format, that prefix is removed. For example, urn:oasis:names:tc:SAML:2.0:nameid-format:transient is returned as transient. If the format includes any other prefix, the format is returned with no modifications.
    */
  var SubjectType: js.UndefOr[typingsSlinky.awsSdk.stsMod.SubjectType] = js.native
}

object AssumeRoleWithSAMLResponse {
  @scala.inline
  def apply(): AssumeRoleWithSAMLResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssumeRoleWithSAMLResponse]
  }
  @scala.inline
  implicit class AssumeRoleWithSAMLResponseOps[Self <: AssumeRoleWithSAMLResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssumedRoleUser(value: AssumedRoleUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssumedRoleUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssumedRoleUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssumedRoleUser")(js.undefined)
        ret
    }
    @scala.inline
    def withAudience(value: Audience): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Audience")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudience: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Audience")(js.undefined)
        ret
    }
    @scala.inline
    def withCredentials(value: Credentials): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Credentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Credentials")(js.undefined)
        ret
    }
    @scala.inline
    def withIssuer(value: Issuer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Issuer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIssuer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Issuer")(js.undefined)
        ret
    }
    @scala.inline
    def withNameQualifier(value: NameQualifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NameQualifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNameQualifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NameQualifier")(js.undefined)
        ret
    }
    @scala.inline
    def withPackedPolicySize(value: nonNegativeIntegerType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PackedPolicySize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPackedPolicySize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PackedPolicySize")(js.undefined)
        ret
    }
    @scala.inline
    def withSubject(value: Subject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subject")(js.undefined)
        ret
    }
    @scala.inline
    def withSubjectType(value: SubjectType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubjectType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubjectType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubjectType")(js.undefined)
        ret
    }
  }
  
}

