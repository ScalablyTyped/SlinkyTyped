package typingsSlinky.awsSdkClientKmsNode.typesGrantListEntryMod

import typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.CreateGrant
import typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.Decrypt
import typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.DescribeKey
import typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.Encrypt
import typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.GenerateDataKey
import typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.GenerateDataKeyWithoutPlaintext
import typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.ReEncryptFrom
import typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.ReEncryptTo
import typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.RetireGrant
import typingsSlinky.awsSdkClientKmsNode.typesGrantConstraintsMod.GrantConstraints
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GrantListEntry extends js.Object {
  /**
    * <p>A list of key-value pairs that must be present in the encryption context of certain subsequent operations that the grant allows.</p>
    */
  var Constraints: js.UndefOr[GrantConstraints] = js.native
  /**
    * <p>The date and time when the grant was created.</p>
    */
  var CreationDate: js.UndefOr[js.Date | String | Double] = js.native
  /**
    * <p>The unique identifier for the grant.</p>
    */
  var GrantId: js.UndefOr[String] = js.native
  /**
    * <p>The principal that receives the grant's permissions.</p>
    */
  var GranteePrincipal: js.UndefOr[String] = js.native
  /**
    * <p>The AWS account under which the grant was issued.</p>
    */
  var IssuingAccount: js.UndefOr[String] = js.native
  /**
    * <p>The unique identifier for the customer master key (CMK) to which the grant applies.</p>
    */
  var KeyId: js.UndefOr[String] = js.native
  /**
    * <p>The friendly name that identifies the grant. If a name was provided in the <a>CreateGrant</a> request, that name is returned. Otherwise this value is null.</p>
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * <p>The list of operations permitted by the grant.</p>
    */
  var Operations: js.UndefOr[
    (js.Array[
      Decrypt | Encrypt | GenerateDataKey | GenerateDataKeyWithoutPlaintext | ReEncryptFrom | ReEncryptTo | CreateGrant | RetireGrant | DescribeKey | String
    ]) | (js.Iterable[
      Decrypt | Encrypt | GenerateDataKey | GenerateDataKeyWithoutPlaintext | ReEncryptFrom | ReEncryptTo | CreateGrant | RetireGrant | DescribeKey | String
    ])
  ] = js.native
  /**
    * <p>The principal that can retire the grant.</p>
    */
  var RetiringPrincipal: js.UndefOr[String] = js.native
}

object GrantListEntry {
  @scala.inline
  def apply(): GrantListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrantListEntry]
  }
  @scala.inline
  implicit class GrantListEntryOps[Self <: GrantListEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withCreationDateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreationDate(value: js.Date | String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withGrantId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GrantId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrantId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GrantId")(js.undefined)
        ret
    }
    @scala.inline
    def withGranteePrincipal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GranteePrincipal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGranteePrincipal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GranteePrincipal")(js.undefined)
        ret
    }
    @scala.inline
    def withIssuingAccount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IssuingAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIssuingAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IssuingAccount")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyId")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
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
    def withOperationsIterable(
      value: js.Iterable[
          Decrypt | Encrypt | GenerateDataKey | GenerateDataKeyWithoutPlaintext | ReEncryptFrom | ReEncryptTo | CreateGrant | RetireGrant | DescribeKey | String
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Operations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperations(
      value: (js.Array[
          Decrypt | Encrypt | GenerateDataKey | GenerateDataKeyWithoutPlaintext | ReEncryptFrom | ReEncryptTo | CreateGrant | RetireGrant | DescribeKey | String
        ]) | (js.Iterable[
          Decrypt | Encrypt | GenerateDataKey | GenerateDataKeyWithoutPlaintext | ReEncryptFrom | ReEncryptTo | CreateGrant | RetireGrant | DescribeKey | String
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Operations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Operations")(js.undefined)
        ret
    }
    @scala.inline
    def withRetiringPrincipal(value: String): Self = {
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

