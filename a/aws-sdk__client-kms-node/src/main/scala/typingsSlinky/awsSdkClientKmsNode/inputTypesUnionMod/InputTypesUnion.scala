package typingsSlinky.awsSdkClientKmsNode.inputTypesUnionMod

import typingsSlinky.awsSdkClientKmsNode.typesCancelKeyDeletionInputMod.CancelKeyDeletionInput
import typingsSlinky.awsSdkClientKmsNode.typesCreateAliasInputMod.CreateAliasInput
import typingsSlinky.awsSdkClientKmsNode.typesCreateGrantInputMod.CreateGrantInput
import typingsSlinky.awsSdkClientKmsNode.typesCreateKeyInputMod.CreateKeyInput
import typingsSlinky.awsSdkClientKmsNode.typesDecryptInputMod.DecryptInput
import typingsSlinky.awsSdkClientKmsNode.typesDeleteAliasInputMod.DeleteAliasInput
import typingsSlinky.awsSdkClientKmsNode.typesDeleteImportedKeyMaterialInputMod.DeleteImportedKeyMaterialInput
import typingsSlinky.awsSdkClientKmsNode.typesDescribeKeyInputMod.DescribeKeyInput
import typingsSlinky.awsSdkClientKmsNode.typesDisableKeyInputMod.DisableKeyInput
import typingsSlinky.awsSdkClientKmsNode.typesDisableKeyRotationInputMod.DisableKeyRotationInput
import typingsSlinky.awsSdkClientKmsNode.typesEnableKeyInputMod.EnableKeyInput
import typingsSlinky.awsSdkClientKmsNode.typesEnableKeyRotationInputMod.EnableKeyRotationInput
import typingsSlinky.awsSdkClientKmsNode.typesEncryptInputMod.EncryptInput
import typingsSlinky.awsSdkClientKmsNode.typesGenerateDataKeyInputMod.GenerateDataKeyInput
import typingsSlinky.awsSdkClientKmsNode.typesGenerateDataKeyWithoutPlaintextInputMod.GenerateDataKeyWithoutPlaintextInput
import typingsSlinky.awsSdkClientKmsNode.typesGenerateRandomInputMod.GenerateRandomInput
import typingsSlinky.awsSdkClientKmsNode.typesGetKeyPolicyInputMod.GetKeyPolicyInput
import typingsSlinky.awsSdkClientKmsNode.typesGetKeyRotationStatusInputMod.GetKeyRotationStatusInput
import typingsSlinky.awsSdkClientKmsNode.typesGetParametersForImportInputMod.GetParametersForImportInput
import typingsSlinky.awsSdkClientKmsNode.typesImportKeyMaterialInputMod.ImportKeyMaterialInput
import typingsSlinky.awsSdkClientKmsNode.typesListAliasesInputMod.ListAliasesInput
import typingsSlinky.awsSdkClientKmsNode.typesListGrantsInputMod.ListGrantsInput
import typingsSlinky.awsSdkClientKmsNode.typesListKeyPoliciesInputMod.ListKeyPoliciesInput
import typingsSlinky.awsSdkClientKmsNode.typesListKeysInputMod.ListKeysInput
import typingsSlinky.awsSdkClientKmsNode.typesListResourceTagsInputMod.ListResourceTagsInput
import typingsSlinky.awsSdkClientKmsNode.typesListRetirableGrantsInputMod.ListRetirableGrantsInput
import typingsSlinky.awsSdkClientKmsNode.typesPutKeyPolicyInputMod.PutKeyPolicyInput
import typingsSlinky.awsSdkClientKmsNode.typesReEncryptInputMod.ReEncryptInput
import typingsSlinky.awsSdkClientKmsNode.typesRetireGrantInputMod.RetireGrantInput
import typingsSlinky.awsSdkClientKmsNode.typesRevokeGrantInputMod.RevokeGrantInput
import typingsSlinky.awsSdkClientKmsNode.typesScheduleKeyDeletionInputMod.ScheduleKeyDeletionInput
import typingsSlinky.awsSdkClientKmsNode.typesTagResourceInputMod.TagResourceInput
import typingsSlinky.awsSdkClientKmsNode.typesUntagResourceInputMod.UntagResourceInput
import typingsSlinky.awsSdkClientKmsNode.typesUpdateAliasInputMod.UpdateAliasInput
import typingsSlinky.awsSdkClientKmsNode.typesUpdateKeyDescriptionInputMod.UpdateKeyDescriptionInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientKmsNode.typesCancelKeyDeletionInputMod.CancelKeyDeletionInput
  - typingsSlinky.awsSdkClientKmsNode.typesCreateAliasInputMod.CreateAliasInput
  - typingsSlinky.awsSdkClientKmsNode.typesCreateGrantInputMod.CreateGrantInput
  - typingsSlinky.awsSdkClientKmsNode.typesCreateKeyInputMod.CreateKeyInput
  - typingsSlinky.awsSdkClientKmsNode.typesDecryptInputMod.DecryptInput
  - typingsSlinky.awsSdkClientKmsNode.typesDeleteAliasInputMod.DeleteAliasInput
  - typingsSlinky.awsSdkClientKmsNode.typesDeleteImportedKeyMaterialInputMod.DeleteImportedKeyMaterialInput
  - typingsSlinky.awsSdkClientKmsNode.typesDescribeKeyInputMod.DescribeKeyInput
  - typingsSlinky.awsSdkClientKmsNode.typesDisableKeyInputMod.DisableKeyInput
  - typingsSlinky.awsSdkClientKmsNode.typesDisableKeyRotationInputMod.DisableKeyRotationInput
  - typingsSlinky.awsSdkClientKmsNode.typesEnableKeyInputMod.EnableKeyInput
  - typingsSlinky.awsSdkClientKmsNode.typesEnableKeyRotationInputMod.EnableKeyRotationInput
  - typingsSlinky.awsSdkClientKmsNode.typesEncryptInputMod.EncryptInput
  - typingsSlinky.awsSdkClientKmsNode.typesGenerateDataKeyInputMod.GenerateDataKeyInput
  - typingsSlinky.awsSdkClientKmsNode.typesGenerateDataKeyWithoutPlaintextInputMod.GenerateDataKeyWithoutPlaintextInput
  - typingsSlinky.awsSdkClientKmsNode.typesGenerateRandomInputMod.GenerateRandomInput
  - typingsSlinky.awsSdkClientKmsNode.typesGetKeyPolicyInputMod.GetKeyPolicyInput
  - typingsSlinky.awsSdkClientKmsNode.typesGetKeyRotationStatusInputMod.GetKeyRotationStatusInput
  - typingsSlinky.awsSdkClientKmsNode.typesGetParametersForImportInputMod.GetParametersForImportInput
  - typingsSlinky.awsSdkClientKmsNode.typesImportKeyMaterialInputMod.ImportKeyMaterialInput
  - typingsSlinky.awsSdkClientKmsNode.typesListAliasesInputMod.ListAliasesInput
  - typingsSlinky.awsSdkClientKmsNode.typesListGrantsInputMod.ListGrantsInput
  - typingsSlinky.awsSdkClientKmsNode.typesListKeyPoliciesInputMod.ListKeyPoliciesInput
  - typingsSlinky.awsSdkClientKmsNode.typesListKeysInputMod.ListKeysInput
  - typingsSlinky.awsSdkClientKmsNode.typesListResourceTagsInputMod.ListResourceTagsInput
  - typingsSlinky.awsSdkClientKmsNode.typesListRetirableGrantsInputMod.ListRetirableGrantsInput
  - typingsSlinky.awsSdkClientKmsNode.typesPutKeyPolicyInputMod.PutKeyPolicyInput
  - typingsSlinky.awsSdkClientKmsNode.typesReEncryptInputMod.ReEncryptInput
  - typingsSlinky.awsSdkClientKmsNode.typesRetireGrantInputMod.RetireGrantInput
  - typingsSlinky.awsSdkClientKmsNode.typesRevokeGrantInputMod.RevokeGrantInput
  - typingsSlinky.awsSdkClientKmsNode.typesScheduleKeyDeletionInputMod.ScheduleKeyDeletionInput
  - typingsSlinky.awsSdkClientKmsNode.typesTagResourceInputMod.TagResourceInput
  - typingsSlinky.awsSdkClientKmsNode.typesUntagResourceInputMod.UntagResourceInput
  - typingsSlinky.awsSdkClientKmsNode.typesUpdateAliasInputMod.UpdateAliasInput
  - typingsSlinky.awsSdkClientKmsNode.typesUpdateKeyDescriptionInputMod.UpdateKeyDescriptionInput
*/
trait InputTypesUnion extends js.Object

object InputTypesUnion {
  @scala.inline
  implicit def apply(value: CancelKeyDeletionInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: CreateAliasInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: CreateGrantInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: CreateKeyInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: DecryptInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: DeleteAliasInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: DeleteImportedKeyMaterialInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: DescribeKeyInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: DisableKeyInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: DisableKeyRotationInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: EnableKeyInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: EnableKeyRotationInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: EncryptInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: GenerateDataKeyInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: GenerateDataKeyWithoutPlaintextInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: GenerateRandomInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: GetKeyPolicyInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: GetKeyRotationStatusInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: GetParametersForImportInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: ImportKeyMaterialInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: ListAliasesInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: ListGrantsInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: ListKeyPoliciesInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: ListKeysInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: ListResourceTagsInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: ListRetirableGrantsInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: PutKeyPolicyInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: ReEncryptInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: RetireGrantInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: RevokeGrantInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: ScheduleKeyDeletionInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: TagResourceInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: UntagResourceInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: UpdateAliasInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: UpdateKeyDescriptionInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
}

