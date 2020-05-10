package typingsSlinky.awsSdk.secretsmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResourcePolicyResponse extends js.Object {
  /**
    * The ARN of the secret that the resource-based policy was retrieved for.
    */
  var ARN: js.UndefOr[SecretARNType] = js.native
  /**
    * The friendly name of the secret that the resource-based policy was retrieved for.
    */
  var Name: js.UndefOr[NameType] = js.native
  /**
    * A JSON-formatted string that describes the permissions that are associated with the attached secret. These permissions are combined with any permissions that are associated with the user or role that attempts to access this secret. The combined permissions specify who can access the secret and what actions they can perform. For more information, see Authentication and Access Control for AWS Secrets Manager in the AWS Secrets Manager User Guide.
    */
  var ResourcePolicy: js.UndefOr[NonEmptyResourcePolicyType] = js.native
}

object GetResourcePolicyResponse {
  @scala.inline
  def apply(): GetResourcePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourcePolicyResponse]
  }
  @scala.inline
  implicit class GetResourcePolicyResponseOps[Self <: GetResourcePolicyResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withARN(value: SecretARNType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARN")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: NameType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withResourcePolicy(value: NonEmptyResourcePolicyType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourcePolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourcePolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourcePolicy")(js.undefined)
        ret
    }
  }
  
}

