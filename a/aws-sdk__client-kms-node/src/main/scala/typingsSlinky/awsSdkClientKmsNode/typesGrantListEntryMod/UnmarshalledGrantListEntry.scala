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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConstraints(value: UnmarshalledGrantConstraints): Self = this.set("Constraints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstraints: Self = this.set("Constraints", js.undefined)
    @scala.inline
    def setCreationDate(value: js.Date): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    @scala.inline
    def setOperationsVarargs(
      value: (Decrypt | Encrypt | GenerateDataKey | GenerateDataKeyWithoutPlaintext | ReEncryptFrom | ReEncryptTo | CreateGrant | RetireGrant | DescribeKey | String)*
    ): Self = this.set("Operations", js.Array(value :_*))
    @scala.inline
    def setOperations(
      value: js.Array[
          Decrypt | Encrypt | GenerateDataKey | GenerateDataKeyWithoutPlaintext | ReEncryptFrom | ReEncryptTo | CreateGrant | RetireGrant | DescribeKey | String
        ]
    ): Self = this.set("Operations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperations: Self = this.set("Operations", js.undefined)
  }
  
}

