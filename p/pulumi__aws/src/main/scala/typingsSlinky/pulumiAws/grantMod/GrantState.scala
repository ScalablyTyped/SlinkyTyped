package typingsSlinky.pulumiAws.grantMod

import typingsSlinky.pulumiAws.inputMod.kms.GrantConstraint
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GrantState extends js.Object {
  /**
    * A structure that you can use to allow certain operations in the grant only when the desired encryption context is present. For more information about encryption context, see [Encryption Context](http://docs.aws.amazon.com/kms/latest/developerguide/encryption-context.html).
    */
  val constraints: js.UndefOr[Input[js.Array[Input[GrantConstraint]]]] = js.native
  /**
    * A list of grant tokens to be used when creating the grant. See [Grant Tokens](http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token) for more information about grant tokens.
    * * `retireOnDelete` -(Defaults to false, Forces new resources) If set to false (the default) the grants will be revoked upon deletion, and if set to true the grants will try to be retired upon deletion. Note that retiring grants requires special permissions, hence why we default to revoking grants.
    * See [RetireGrant](https://docs.aws.amazon.com/kms/latest/APIReference/API_RetireGrant.html) for more information.
    */
  val grantCreationTokens: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The unique identifier for the grant.
    */
  val grantId: js.UndefOr[Input[String]] = js.native
  /**
    * The grant token for the created grant. For more information, see [Grant Tokens](http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token).
    */
  val grantToken: js.UndefOr[Input[String]] = js.native
  /**
    * The principal that is given permission to perform the operations that the grant permits in ARN format. Note that due to eventual consistency issues around IAM principals, the state may not always be refreshed to reflect what is true in AWS.
    */
  val granteePrincipal: js.UndefOr[Input[String]] = js.native
  /**
    * The unique identifier for the customer master key (CMK) that the grant applies to. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. To specify a CMK in a different AWS account, you must use the key ARN.
    */
  val keyId: js.UndefOr[Input[String]] = js.native
  /**
    * A friendly name for identifying the grant.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * A list of operations that the grant permits. The permitted values are: `Decrypt, Encrypt, GenerateDataKey, GenerateDataKeyWithoutPlaintext, ReEncryptFrom, ReEncryptTo, CreateGrant, RetireGrant, DescribeKey`
    */
  val operations: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  val retireOnDelete: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The principal that is given permission to retire the grant by using RetireGrant operation in ARN format. Note that due to eventual consistency issues around IAM principals, the state may not always be refreshed to reflect what is true in AWS.
    */
  val retiringPrincipal: js.UndefOr[Input[String]] = js.native
}

object GrantState {
  @scala.inline
  def apply(): GrantState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrantState]
  }
  @scala.inline
  implicit class GrantStateOps[Self <: GrantState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConstraints(value: Input[js.Array[Input[GrantConstraint]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstraints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraints")(js.undefined)
        ret
    }
    @scala.inline
    def withGrantCreationTokens(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grantCreationTokens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrantCreationTokens: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grantCreationTokens")(js.undefined)
        ret
    }
    @scala.inline
    def withGrantId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grantId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrantId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grantId")(js.undefined)
        ret
    }
    @scala.inline
    def withGrantToken(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grantToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrantToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grantToken")(js.undefined)
        ret
    }
    @scala.inline
    def withGranteePrincipal(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("granteePrincipal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGranteePrincipal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("granteePrincipal")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyId")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOperations(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operations")(js.undefined)
        ret
    }
    @scala.inline
    def withRetireOnDelete(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retireOnDelete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetireOnDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retireOnDelete")(js.undefined)
        ret
    }
    @scala.inline
    def withRetiringPrincipal(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retiringPrincipal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetiringPrincipal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retiringPrincipal")(js.undefined)
        ret
    }
  }
  
}

