package typingsSlinky.awsSdkClientKmsNode

import typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.CreateGrant
import typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.Decrypt
import typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.DescribeKey
import typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.Encrypt
import typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.GenerateDataKey
import typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.GenerateDataKeyWithoutPlaintext
import typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.RSAES_OAEP_SHA_1
import typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.RSAES_OAEP_SHA_256
import typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.RSAES_PKCS1_V1_5
import typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.RSA_2048
import typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.ReEncryptFrom
import typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.ReEncryptTo
import typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.RetireGrant
import typingsSlinky.awsSdkClientKmsNode.typesTagMod.Tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputTypesUnionMod {
  
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
  trait InputTypesUnion extends StObject
  object InputTypesUnion {
    
    @scala.inline
    def CancelKeyDeletionInput(KeyId: String): typingsSlinky.awsSdkClientKmsNode.typesCancelKeyDeletionInputMod.CancelKeyDeletionInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsNode.typesCancelKeyDeletionInputMod.CancelKeyDeletionInput]
    }
    
    @scala.inline
    def CreateAliasInput(AliasName: String, TargetKeyId: String): typingsSlinky.awsSdkClientKmsNode.typesCreateAliasInputMod.CreateAliasInput = {
      val __obj = js.Dynamic.literal(AliasName = AliasName.asInstanceOf[js.Any], TargetKeyId = TargetKeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsNode.typesCreateAliasInputMod.CreateAliasInput]
    }
    
    @scala.inline
    def CreateGrantInput(
      GranteePrincipal: String,
      KeyId: String,
      Operations: (js.Array[
          Decrypt | Encrypt | GenerateDataKey | GenerateDataKeyWithoutPlaintext | ReEncryptFrom | ReEncryptTo | CreateGrant | RetireGrant | DescribeKey | String
        ]) | (js.Iterable[
          Decrypt | Encrypt | GenerateDataKey | GenerateDataKeyWithoutPlaintext | ReEncryptFrom | ReEncryptTo | CreateGrant | RetireGrant | DescribeKey | String
        ])
    ): typingsSlinky.awsSdkClientKmsNode.typesCreateGrantInputMod.CreateGrantInput = {
      val __obj = js.Dynamic.literal(GranteePrincipal = GranteePrincipal.asInstanceOf[js.Any], KeyId = KeyId.asInstanceOf[js.Any], Operations = Operations.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsNode.typesCreateGrantInputMod.CreateGrantInput]
    }
    
    @scala.inline
    def CreateKeyInput(): typingsSlinky.awsSdkClientKmsNode.typesCreateKeyInputMod.CreateKeyInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsNode.typesCreateKeyInputMod.CreateKeyInput]
    }
    
    @scala.inline
    def DecryptInput(CiphertextBlob: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String): typingsSlinky.awsSdkClientKmsNode.typesDecryptInputMod.DecryptInput = {
      val __obj = js.Dynamic.literal(CiphertextBlob = CiphertextBlob.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsNode.typesDecryptInputMod.DecryptInput]
    }
    
    @scala.inline
    def DeleteAliasInput(AliasName: String): typingsSlinky.awsSdkClientKmsNode.typesDeleteAliasInputMod.DeleteAliasInput = {
      val __obj = js.Dynamic.literal(AliasName = AliasName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsNode.typesDeleteAliasInputMod.DeleteAliasInput]
    }
    
    @scala.inline
    def DeleteImportedKeyMaterialInput(KeyId: String): typingsSlinky.awsSdkClientKmsNode.typesDeleteImportedKeyMaterialInputMod.DeleteImportedKeyMaterialInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsNode.typesDeleteImportedKeyMaterialInputMod.DeleteImportedKeyMaterialInput]
    }
    
    @scala.inline
    def DescribeKeyInput(KeyId: String): typingsSlinky.awsSdkClientKmsNode.typesDescribeKeyInputMod.DescribeKeyInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsNode.typesDescribeKeyInputMod.DescribeKeyInput]
    }
    
    @scala.inline
    def DisableKeyInput(KeyId: String): typingsSlinky.awsSdkClientKmsNode.typesDisableKeyInputMod.DisableKeyInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsNode.typesDisableKeyInputMod.DisableKeyInput]
    }
    
    @scala.inline
    def DisableKeyRotationInput(KeyId: String): typingsSlinky.awsSdkClientKmsNode.typesDisableKeyRotationInputMod.DisableKeyRotationInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsNode.typesDisableKeyRotationInputMod.DisableKeyRotationInput]
    }
    
    @scala.inline
    def EnableKeyInput(KeyId: String): typingsSlinky.awsSdkClientKmsNode.typesEnableKeyInputMod.EnableKeyInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsNode.typesEnableKeyInputMod.EnableKeyInput]
    }
    
    @scala.inline
    def EnableKeyRotationInput(KeyId: String): typingsSlinky.awsSdkClientKmsNode.typesEnableKeyRotationInputMod.EnableKeyRotationInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsNode.typesEnableKeyRotationInputMod.EnableKeyRotationInput]
    }
    
    @scala.inline
    def EncryptInput(KeyId: String, Plaintext: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String): typingsSlinky.awsSdkClientKmsNode.typesEncryptInputMod.EncryptInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], Plaintext = Plaintext.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsNode.typesEncryptInputMod.EncryptInput]
    }
    
    @scala.inline
    def GenerateDataKeyInput(KeyId: String): typingsSlinky.awsSdkClientKmsNode.typesGenerateDataKeyInputMod.GenerateDataKeyInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsNode.typesGenerateDataKeyInputMod.GenerateDataKeyInput]
    }
    
    @scala.inline
    def GenerateDataKeyWithoutPlaintextInput(KeyId: String): typingsSlinky.awsSdkClientKmsNode.typesGenerateDataKeyWithoutPlaintextInputMod.GenerateDataKeyWithoutPlaintextInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsNode.typesGenerateDataKeyWithoutPlaintextInputMod.GenerateDataKeyWithoutPlaintextInput]
    }
    
    @scala.inline
    def GenerateRandomInput(): typingsSlinky.awsSdkClientKmsNode.typesGenerateRandomInputMod.GenerateRandomInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsNode.typesGenerateRandomInputMod.GenerateRandomInput]
    }
    
    @scala.inline
    def GetKeyPolicyInput(KeyId: String, PolicyName: String): typingsSlinky.awsSdkClientKmsNode.typesGetKeyPolicyInputMod.GetKeyPolicyInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsNode.typesGetKeyPolicyInputMod.GetKeyPolicyInput]
    }
    
    @scala.inline
    def GetKeyRotationStatusInput(KeyId: String): typingsSlinky.awsSdkClientKmsNode.typesGetKeyRotationStatusInputMod.GetKeyRotationStatusInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsNode.typesGetKeyRotationStatusInputMod.GetKeyRotationStatusInput]
    }
    
    @scala.inline
    def GetParametersForImportInput(
      KeyId: String,
      WrappingAlgorithm: RSAES_PKCS1_V1_5 | RSAES_OAEP_SHA_1 | RSAES_OAEP_SHA_256 | String,
      WrappingKeySpec: RSA_2048 | String
    ): typingsSlinky.awsSdkClientKmsNode.typesGetParametersForImportInputMod.GetParametersForImportInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], WrappingAlgorithm = WrappingAlgorithm.asInstanceOf[js.Any], WrappingKeySpec = WrappingKeySpec.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsNode.typesGetParametersForImportInputMod.GetParametersForImportInput]
    }
    
    @scala.inline
    def ImportKeyMaterialInput(
      EncryptedKeyMaterial: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String,
      ImportToken: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String,
      KeyId: String
    ): typingsSlinky.awsSdkClientKmsNode.typesImportKeyMaterialInputMod.ImportKeyMaterialInput = {
      val __obj = js.Dynamic.literal(EncryptedKeyMaterial = EncryptedKeyMaterial.asInstanceOf[js.Any], ImportToken = ImportToken.asInstanceOf[js.Any], KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsNode.typesImportKeyMaterialInputMod.ImportKeyMaterialInput]
    }
    
    @scala.inline
    def ListAliasesInput(): typingsSlinky.awsSdkClientKmsNode.typesListAliasesInputMod.ListAliasesInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsNode.typesListAliasesInputMod.ListAliasesInput]
    }
    
    @scala.inline
    def ListGrantsInput(KeyId: String): typingsSlinky.awsSdkClientKmsNode.typesListGrantsInputMod.ListGrantsInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsNode.typesListGrantsInputMod.ListGrantsInput]
    }
    
    @scala.inline
    def ListKeyPoliciesInput(KeyId: String): typingsSlinky.awsSdkClientKmsNode.typesListKeyPoliciesInputMod.ListKeyPoliciesInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsNode.typesListKeyPoliciesInputMod.ListKeyPoliciesInput]
    }
    
    @scala.inline
    def ListKeysInput(): typingsSlinky.awsSdkClientKmsNode.typesListKeysInputMod.ListKeysInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsNode.typesListKeysInputMod.ListKeysInput]
    }
    
    @scala.inline
    def ListResourceTagsInput(KeyId: String): typingsSlinky.awsSdkClientKmsNode.typesListResourceTagsInputMod.ListResourceTagsInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsNode.typesListResourceTagsInputMod.ListResourceTagsInput]
    }
    
    @scala.inline
    def ListRetirableGrantsInput(RetiringPrincipal: String): typingsSlinky.awsSdkClientKmsNode.typesListRetirableGrantsInputMod.ListRetirableGrantsInput = {
      val __obj = js.Dynamic.literal(RetiringPrincipal = RetiringPrincipal.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsNode.typesListRetirableGrantsInputMod.ListRetirableGrantsInput]
    }
    
    @scala.inline
    def PutKeyPolicyInput(KeyId: String, Policy: String, PolicyName: String): typingsSlinky.awsSdkClientKmsNode.typesPutKeyPolicyInputMod.PutKeyPolicyInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], Policy = Policy.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsNode.typesPutKeyPolicyInputMod.PutKeyPolicyInput]
    }
    
    @scala.inline
    def ReEncryptInput(
      CiphertextBlob: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String,
      DestinationKeyId: String
    ): typingsSlinky.awsSdkClientKmsNode.typesReEncryptInputMod.ReEncryptInput = {
      val __obj = js.Dynamic.literal(CiphertextBlob = CiphertextBlob.asInstanceOf[js.Any], DestinationKeyId = DestinationKeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsNode.typesReEncryptInputMod.ReEncryptInput]
    }
    
    @scala.inline
    def RetireGrantInput(): typingsSlinky.awsSdkClientKmsNode.typesRetireGrantInputMod.RetireGrantInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsNode.typesRetireGrantInputMod.RetireGrantInput]
    }
    
    @scala.inline
    def RevokeGrantInput(GrantId: String, KeyId: String): typingsSlinky.awsSdkClientKmsNode.typesRevokeGrantInputMod.RevokeGrantInput = {
      val __obj = js.Dynamic.literal(GrantId = GrantId.asInstanceOf[js.Any], KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsNode.typesRevokeGrantInputMod.RevokeGrantInput]
    }
    
    @scala.inline
    def ScheduleKeyDeletionInput(KeyId: String): typingsSlinky.awsSdkClientKmsNode.typesScheduleKeyDeletionInputMod.ScheduleKeyDeletionInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsNode.typesScheduleKeyDeletionInputMod.ScheduleKeyDeletionInput]
    }
    
    @scala.inline
    def TagResourceInput(KeyId: String, Tags: js.Array[Tag] | js.Iterable[Tag]): typingsSlinky.awsSdkClientKmsNode.typesTagResourceInputMod.TagResourceInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsNode.typesTagResourceInputMod.TagResourceInput]
    }
    
    @scala.inline
    def UntagResourceInput(KeyId: String, TagKeys: js.Array[String] | js.Iterable[String]): typingsSlinky.awsSdkClientKmsNode.typesUntagResourceInputMod.UntagResourceInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsNode.typesUntagResourceInputMod.UntagResourceInput]
    }
    
    @scala.inline
    def UpdateAliasInput(AliasName: String, TargetKeyId: String): typingsSlinky.awsSdkClientKmsNode.typesUpdateAliasInputMod.UpdateAliasInput = {
      val __obj = js.Dynamic.literal(AliasName = AliasName.asInstanceOf[js.Any], TargetKeyId = TargetKeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsNode.typesUpdateAliasInputMod.UpdateAliasInput]
    }
    
    @scala.inline
    def UpdateKeyDescriptionInput(Description: String, KeyId: String): typingsSlinky.awsSdkClientKmsNode.typesUpdateKeyDescriptionInputMod.UpdateKeyDescriptionInput = {
      val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsNode.typesUpdateKeyDescriptionInputMod.UpdateKeyDescriptionInput]
    }
  }
}
