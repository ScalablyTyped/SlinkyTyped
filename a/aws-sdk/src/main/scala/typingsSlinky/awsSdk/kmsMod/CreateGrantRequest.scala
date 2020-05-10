package typingsSlinky.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGrantRequest extends js.Object {
  /**
    * Allows a cryptographic operation only when the encryption context matches or includes the encryption context specified in this structure. For more information about encryption context, see Encryption Context in the  AWS Key Management Service Developer Guide .
    */
  var Constraints: js.UndefOr[GrantConstraints] = js.native
  /**
    * A list of grant tokens. For more information, see Grant Tokens in the AWS Key Management Service Developer Guide.
    */
  var GrantTokens: js.UndefOr[GrantTokenList] = js.native
  /**
    * The principal that is given permission to perform the operations that the grant permits. To specify the principal, use the Amazon Resource Name (ARN) of an AWS principal. Valid AWS principals include AWS accounts (root), IAM users, IAM roles, federated users, and assumed role users. For examples of the ARN syntax to use for specifying a principal, see AWS Identity and Access Management (IAM) in the Example ARNs section of the AWS General Reference.
    */
  var GranteePrincipal: PrincipalIdType = js.native
  /**
    * The unique identifier for the customer master key (CMK) that the grant applies to. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. To specify a CMK in a different AWS account, you must use the key ARN. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    To get the key ID and key ARN for a CMK, use ListKeys or DescribeKey.
    */
  var KeyId: KeyIdType = js.native
  /**
    * A friendly name for identifying the grant. Use this value to prevent the unintended creation of duplicate grants when retrying this request. When this value is absent, all CreateGrant requests result in a new grant with a unique GrantId even if all the supplied parameters are identical. This can result in unintended duplicates when you retry the CreateGrant request. When this value is present, you can retry a CreateGrant request with identical parameters; if the grant already exists, the original GrantId is returned without creating a new grant. Note that the returned grant token is unique with every CreateGrant request, even when a duplicate GrantId is returned. All grant tokens obtained in this way can be used interchangeably.
    */
  var Name: js.UndefOr[GrantNameType] = js.native
  /**
    * A list of operations that the grant permits.
    */
  var Operations: GrantOperationList = js.native
  /**
    * The principal that is given permission to retire the grant by using RetireGrant operation. To specify the principal, use the Amazon Resource Name (ARN) of an AWS principal. Valid AWS principals include AWS accounts (root), IAM users, federated users, and assumed role users. For examples of the ARN syntax to use for specifying a principal, see AWS Identity and Access Management (IAM) in the Example ARNs section of the AWS General Reference.
    */
  var RetiringPrincipal: js.UndefOr[PrincipalIdType] = js.native
}

object CreateGrantRequest {
  @scala.inline
  def apply(GranteePrincipal: PrincipalIdType, KeyId: KeyIdType, Operations: GrantOperationList): CreateGrantRequest = {
    val __obj = js.Dynamic.literal(GranteePrincipal = GranteePrincipal.asInstanceOf[js.Any], KeyId = KeyId.asInstanceOf[js.Any], Operations = Operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGrantRequest]
  }
  @scala.inline
  implicit class CreateGrantRequestOps[Self <: CreateGrantRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGranteePrincipal(value: PrincipalIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GranteePrincipal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyId(value: KeyIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperations(value: GrantOperationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Operations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConstraints(value: GrantConstraints): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Constraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstraints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Constraints")(js.undefined)
        ret
    }
    @scala.inline
    def withGrantTokens(value: GrantTokenList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GrantTokens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrantTokens: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GrantTokens")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: GrantNameType): Self = {
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
    def withRetiringPrincipal(value: PrincipalIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RetiringPrincipal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetiringPrincipal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RetiringPrincipal")(js.undefined)
        ret
    }
  }
  
}

