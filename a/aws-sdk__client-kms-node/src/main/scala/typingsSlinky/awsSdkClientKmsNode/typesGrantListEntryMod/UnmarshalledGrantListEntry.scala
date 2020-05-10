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
import typingsSlinky.awsSdkClientKmsNode.typesGrantConstraintsMod.UnmarshalledGrantConstraints
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledGrantListEntry extends GrantListEntry {
  /**
    * <p>A list of key-value pairs that must be present in the encryption context of certain subsequent operations that the grant allows.</p>
    */
  @JSName("Constraints")
  var Constraints_UnmarshalledGrantListEntry: js.UndefOr[UnmarshalledGrantConstraints] = js.native
  /**
    * <p>The date and time when the grant was created.</p>
    */
  @JSName("CreationDate")
  var CreationDate_UnmarshalledGrantListEntry: js.UndefOr[js.Date] = js.native
  /**
    * <p>The list of operations permitted by the grant.</p>
    */
  @JSName("Operations")
  var Operations_UnmarshalledGrantListEntry: js.UndefOr[
    js.Array[
      Decrypt | Encrypt | GenerateDataKey | GenerateDataKeyWithoutPlaintext | ReEncryptFrom | ReEncryptTo | CreateGrant | RetireGrant | DescribeKey | String
    ]
  ] = js.native
}

object UnmarshalledGrantListEntry {
  @scala.inline
  def apply(): UnmarshalledGrantListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledGrantListEntry]
  }
  @scala.inline
  implicit class UnmarshalledGrantListEntryOps[Self <: UnmarshalledGrantListEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConstraints(value: UnmarshalledGrantConstraints): Self = {
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
    def withCreationDate(value: js.Date): Self = {
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
    def withOperations(
      value: js.Array[
          Decrypt | Encrypt | GenerateDataKey | GenerateDataKeyWithoutPlaintext | ReEncryptFrom | ReEncryptTo | CreateGrant | RetireGrant | DescribeKey | String
        ]
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
  }
  
}

