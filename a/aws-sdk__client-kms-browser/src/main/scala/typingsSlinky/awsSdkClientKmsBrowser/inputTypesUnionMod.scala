package typingsSlinky.awsSdkClientKmsBrowser

import typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.CreateGrant
import typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.Decrypt
import typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.DescribeKey
import typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.Encrypt
import typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.GenerateDataKey
import typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.GenerateDataKeyWithoutPlaintext
import typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.RSAES_OAEP_SHA_1
import typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.RSAES_OAEP_SHA_256
import typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.RSAES_PKCS1_V1_5
import typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.RSA_2048
import typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.ReEncryptFrom
import typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.ReEncryptTo
import typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.RetireGrant
import typingsSlinky.awsSdkClientKmsBrowser.typesTagMod.Tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputTypesUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdkClientKmsBrowser.typesCancelKeyDeletionInputMod.CancelKeyDeletionInput
    - typingsSlinky.awsSdkClientKmsBrowser.typesCreateAliasInputMod.CreateAliasInput
    - typingsSlinky.awsSdkClientKmsBrowser.typesCreateGrantInputMod.CreateGrantInput
    - typingsSlinky.awsSdkClientKmsBrowser.typesCreateKeyInputMod.CreateKeyInput
    - typingsSlinky.awsSdkClientKmsBrowser.typesDecryptInputMod.DecryptInput
    - typingsSlinky.awsSdkClientKmsBrowser.typesDeleteAliasInputMod.DeleteAliasInput
    - typingsSlinky.awsSdkClientKmsBrowser.typesDeleteImportedKeyMaterialInputMod.DeleteImportedKeyMaterialInput
    - typingsSlinky.awsSdkClientKmsBrowser.typesDescribeKeyInputMod.DescribeKeyInput
    - typingsSlinky.awsSdkClientKmsBrowser.typesDisableKeyInputMod.DisableKeyInput
    - typingsSlinky.awsSdkClientKmsBrowser.typesDisableKeyRotationInputMod.DisableKeyRotationInput
    - typingsSlinky.awsSdkClientKmsBrowser.typesEnableKeyInputMod.EnableKeyInput
    - typingsSlinky.awsSdkClientKmsBrowser.typesEnableKeyRotationInputMod.EnableKeyRotationInput
    - typingsSlinky.awsSdkClientKmsBrowser.typesEncryptInputMod.EncryptInput
    - typingsSlinky.awsSdkClientKmsBrowser.typesGenerateDataKeyInputMod.GenerateDataKeyInput
    - typingsSlinky.awsSdkClientKmsBrowser.typesGenerateDataKeyWithoutPlaintextInputMod.GenerateDataKeyWithoutPlaintextInput
    - typingsSlinky.awsSdkClientKmsBrowser.typesGenerateRandomInputMod.GenerateRandomInput
    - typingsSlinky.awsSdkClientKmsBrowser.typesGetKeyPolicyInputMod.GetKeyPolicyInput
    - typingsSlinky.awsSdkClientKmsBrowser.typesGetKeyRotationStatusInputMod.GetKeyRotationStatusInput
    - typingsSlinky.awsSdkClientKmsBrowser.typesGetParametersForImportInputMod.GetParametersForImportInput
    - typingsSlinky.awsSdkClientKmsBrowser.typesImportKeyMaterialInputMod.ImportKeyMaterialInput
    - typingsSlinky.awsSdkClientKmsBrowser.typesListAliasesInputMod.ListAliasesInput
    - typingsSlinky.awsSdkClientKmsBrowser.typesListGrantsInputMod.ListGrantsInput
    - typingsSlinky.awsSdkClientKmsBrowser.typesListKeyPoliciesInputMod.ListKeyPoliciesInput
    - typingsSlinky.awsSdkClientKmsBrowser.typesListKeysInputMod.ListKeysInput
    - typingsSlinky.awsSdkClientKmsBrowser.typesListResourceTagsInputMod.ListResourceTagsInput
    - typingsSlinky.awsSdkClientKmsBrowser.typesListRetirableGrantsInputMod.ListRetirableGrantsInput
    - typingsSlinky.awsSdkClientKmsBrowser.typesPutKeyPolicyInputMod.PutKeyPolicyInput
    - typingsSlinky.awsSdkClientKmsBrowser.typesReEncryptInputMod.ReEncryptInput
    - typingsSlinky.awsSdkClientKmsBrowser.typesRetireGrantInputMod.RetireGrantInput
    - typingsSlinky.awsSdkClientKmsBrowser.typesRevokeGrantInputMod.RevokeGrantInput
    - typingsSlinky.awsSdkClientKmsBrowser.typesScheduleKeyDeletionInputMod.ScheduleKeyDeletionInput
    - typingsSlinky.awsSdkClientKmsBrowser.typesTagResourceInputMod.TagResourceInput
    - typingsSlinky.awsSdkClientKmsBrowser.typesUntagResourceInputMod.UntagResourceInput
    - typingsSlinky.awsSdkClientKmsBrowser.typesUpdateAliasInputMod.UpdateAliasInput
    - typingsSlinky.awsSdkClientKmsBrowser.typesUpdateKeyDescriptionInputMod.UpdateKeyDescriptionInput
  */
  trait InputTypesUnion extends StObject
  object InputTypesUnion {
    
    @scala.inline
    def CancelKeyDeletionInput(KeyId: String): typingsSlinky.awsSdkClientKmsBrowser.typesCancelKeyDeletionInputMod.CancelKeyDeletionInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsBrowser.typesCancelKeyDeletionInputMod.CancelKeyDeletionInput]
    }
    
    @scala.inline
    def CreateAliasInput(AliasName: String, TargetKeyId: String): typingsSlinky.awsSdkClientKmsBrowser.typesCreateAliasInputMod.CreateAliasInput = {
      val __obj = js.Dynamic.literal(AliasName = AliasName.asInstanceOf[js.Any], TargetKeyId = TargetKeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsBrowser.typesCreateAliasInputMod.CreateAliasInput]
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
    ): typingsSlinky.awsSdkClientKmsBrowser.typesCreateGrantInputMod.CreateGrantInput = {
      val __obj = js.Dynamic.literal(GranteePrincipal = GranteePrincipal.asInstanceOf[js.Any], KeyId = KeyId.asInstanceOf[js.Any], Operations = Operations.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsBrowser.typesCreateGrantInputMod.CreateGrantInput]
    }
    
    @scala.inline
    def CreateKeyInput(): typingsSlinky.awsSdkClientKmsBrowser.typesCreateKeyInputMod.CreateKeyInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsBrowser.typesCreateKeyInputMod.CreateKeyInput]
    }
    
    @scala.inline
    def DecryptInput(CiphertextBlob: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String): typingsSlinky.awsSdkClientKmsBrowser.typesDecryptInputMod.DecryptInput = {
      val __obj = js.Dynamic.literal(CiphertextBlob = CiphertextBlob.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsBrowser.typesDecryptInputMod.DecryptInput]
    }
    
    @scala.inline
    def DeleteAliasInput(AliasName: String): typingsSlinky.awsSdkClientKmsBrowser.typesDeleteAliasInputMod.DeleteAliasInput = {
      val __obj = js.Dynamic.literal(AliasName = AliasName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsBrowser.typesDeleteAliasInputMod.DeleteAliasInput]
    }
    
    @scala.inline
    def DeleteImportedKeyMaterialInput(KeyId: String): typingsSlinky.awsSdkClientKmsBrowser.typesDeleteImportedKeyMaterialInputMod.DeleteImportedKeyMaterialInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsBrowser.typesDeleteImportedKeyMaterialInputMod.DeleteImportedKeyMaterialInput]
    }
    
    @scala.inline
    def DescribeKeyInput(KeyId: String): typingsSlinky.awsSdkClientKmsBrowser.typesDescribeKeyInputMod.DescribeKeyInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsBrowser.typesDescribeKeyInputMod.DescribeKeyInput]
    }
    
    @scala.inline
    def DisableKeyInput(KeyId: String): typingsSlinky.awsSdkClientKmsBrowser.typesDisableKeyInputMod.DisableKeyInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsBrowser.typesDisableKeyInputMod.DisableKeyInput]
    }
    
    @scala.inline
    def DisableKeyRotationInput(KeyId: String): typingsSlinky.awsSdkClientKmsBrowser.typesDisableKeyRotationInputMod.DisableKeyRotationInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsBrowser.typesDisableKeyRotationInputMod.DisableKeyRotationInput]
    }
    
    @scala.inline
    def EnableKeyInput(KeyId: String): typingsSlinky.awsSdkClientKmsBrowser.typesEnableKeyInputMod.EnableKeyInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsBrowser.typesEnableKeyInputMod.EnableKeyInput]
    }
    
    @scala.inline
    def EnableKeyRotationInput(KeyId: String): typingsSlinky.awsSdkClientKmsBrowser.typesEnableKeyRotationInputMod.EnableKeyRotationInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsBrowser.typesEnableKeyRotationInputMod.EnableKeyRotationInput]
    }
    
    @scala.inline
    def EncryptInput(KeyId: String, Plaintext: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String): typingsSlinky.awsSdkClientKmsBrowser.typesEncryptInputMod.EncryptInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], Plaintext = Plaintext.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsBrowser.typesEncryptInputMod.EncryptInput]
    }
    
    @scala.inline
    def GenerateDataKeyInput(KeyId: String): typingsSlinky.awsSdkClientKmsBrowser.typesGenerateDataKeyInputMod.GenerateDataKeyInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsBrowser.typesGenerateDataKeyInputMod.GenerateDataKeyInput]
    }
    
    @scala.inline
    def GenerateDataKeyWithoutPlaintextInput(KeyId: String): typingsSlinky.awsSdkClientKmsBrowser.typesGenerateDataKeyWithoutPlaintextInputMod.GenerateDataKeyWithoutPlaintextInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsBrowser.typesGenerateDataKeyWithoutPlaintextInputMod.GenerateDataKeyWithoutPlaintextInput]
    }
    
    @scala.inline
    def GenerateRandomInput(): typingsSlinky.awsSdkClientKmsBrowser.typesGenerateRandomInputMod.GenerateRandomInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsBrowser.typesGenerateRandomInputMod.GenerateRandomInput]
    }
    
    @scala.inline
    def GetKeyPolicyInput(KeyId: String, PolicyName: String): typingsSlinky.awsSdkClientKmsBrowser.typesGetKeyPolicyInputMod.GetKeyPolicyInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsBrowser.typesGetKeyPolicyInputMod.GetKeyPolicyInput]
    }
    
    @scala.inline
    def GetKeyRotationStatusInput(KeyId: String): typingsSlinky.awsSdkClientKmsBrowser.typesGetKeyRotationStatusInputMod.GetKeyRotationStatusInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsBrowser.typesGetKeyRotationStatusInputMod.GetKeyRotationStatusInput]
    }
    
    @scala.inline
    def GetParametersForImportInput(
      KeyId: String,
      WrappingAlgorithm: RSAES_PKCS1_V1_5 | RSAES_OAEP_SHA_1 | RSAES_OAEP_SHA_256 | String,
      WrappingKeySpec: RSA_2048 | String
    ): typingsSlinky.awsSdkClientKmsBrowser.typesGetParametersForImportInputMod.GetParametersForImportInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], WrappingAlgorithm = WrappingAlgorithm.asInstanceOf[js.Any], WrappingKeySpec = WrappingKeySpec.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsBrowser.typesGetParametersForImportInputMod.GetParametersForImportInput]
    }
    
    @scala.inline
    def ImportKeyMaterialInput(
      EncryptedKeyMaterial: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String,
      ImportToken: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String,
      KeyId: String
    ): typingsSlinky.awsSdkClientKmsBrowser.typesImportKeyMaterialInputMod.ImportKeyMaterialInput = {
      val __obj = js.Dynamic.literal(EncryptedKeyMaterial = EncryptedKeyMaterial.asInstanceOf[js.Any], ImportToken = ImportToken.asInstanceOf[js.Any], KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsBrowser.typesImportKeyMaterialInputMod.ImportKeyMaterialInput]
    }
    
    @scala.inline
    def ListAliasesInput(): typingsSlinky.awsSdkClientKmsBrowser.typesListAliasesInputMod.ListAliasesInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsBrowser.typesListAliasesInputMod.ListAliasesInput]
    }
    
    @scala.inline
    def ListGrantsInput(KeyId: String): typingsSlinky.awsSdkClientKmsBrowser.typesListGrantsInputMod.ListGrantsInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsBrowser.typesListGrantsInputMod.ListGrantsInput]
    }
    
    @scala.inline
    def ListKeyPoliciesInput(KeyId: String): typingsSlinky.awsSdkClientKmsBrowser.typesListKeyPoliciesInputMod.ListKeyPoliciesInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsBrowser.typesListKeyPoliciesInputMod.ListKeyPoliciesInput]
    }
    
    @scala.inline
    def ListKeysInput(): typingsSlinky.awsSdkClientKmsBrowser.typesListKeysInputMod.ListKeysInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsBrowser.typesListKeysInputMod.ListKeysInput]
    }
    
    @scala.inline
    def ListResourceTagsInput(KeyId: String): typingsSlinky.awsSdkClientKmsBrowser.typesListResourceTagsInputMod.ListResourceTagsInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsBrowser.typesListResourceTagsInputMod.ListResourceTagsInput]
    }
    
    @scala.inline
    def ListRetirableGrantsInput(RetiringPrincipal: String): typingsSlinky.awsSdkClientKmsBrowser.typesListRetirableGrantsInputMod.ListRetirableGrantsInput = {
      val __obj = js.Dynamic.literal(RetiringPrincipal = RetiringPrincipal.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsBrowser.typesListRetirableGrantsInputMod.ListRetirableGrantsInput]
    }
    
    @scala.inline
    def PutKeyPolicyInput(KeyId: String, Policy: String, PolicyName: String): typingsSlinky.awsSdkClientKmsBrowser.typesPutKeyPolicyInputMod.PutKeyPolicyInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], Policy = Policy.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsBrowser.typesPutKeyPolicyInputMod.PutKeyPolicyInput]
    }
    
    @scala.inline
    def ReEncryptInput(
      CiphertextBlob: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String,
      DestinationKeyId: String
    ): typingsSlinky.awsSdkClientKmsBrowser.typesReEncryptInputMod.ReEncryptInput = {
      val __obj = js.Dynamic.literal(CiphertextBlob = CiphertextBlob.asInstanceOf[js.Any], DestinationKeyId = DestinationKeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsBrowser.typesReEncryptInputMod.ReEncryptInput]
    }
    
    @scala.inline
    def RetireGrantInput(): typingsSlinky.awsSdkClientKmsBrowser.typesRetireGrantInputMod.RetireGrantInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsBrowser.typesRetireGrantInputMod.RetireGrantInput]
    }
    
    @scala.inline
    def RevokeGrantInput(GrantId: String, KeyId: String): typingsSlinky.awsSdkClientKmsBrowser.typesRevokeGrantInputMod.RevokeGrantInput = {
      val __obj = js.Dynamic.literal(GrantId = GrantId.asInstanceOf[js.Any], KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsBrowser.typesRevokeGrantInputMod.RevokeGrantInput]
    }
    
    @scala.inline
    def ScheduleKeyDeletionInput(KeyId: String): typingsSlinky.awsSdkClientKmsBrowser.typesScheduleKeyDeletionInputMod.ScheduleKeyDeletionInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsBrowser.typesScheduleKeyDeletionInputMod.ScheduleKeyDeletionInput]
    }
    
    @scala.inline
    def TagResourceInput(KeyId: String, Tags: js.Array[Tag] | js.Iterable[Tag]): typingsSlinky.awsSdkClientKmsBrowser.typesTagResourceInputMod.TagResourceInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsBrowser.typesTagResourceInputMod.TagResourceInput]
    }
    
    @scala.inline
    def UntagResourceInput(KeyId: String, TagKeys: js.Array[String] | js.Iterable[String]): typingsSlinky.awsSdkClientKmsBrowser.typesUntagResourceInputMod.UntagResourceInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsBrowser.typesUntagResourceInputMod.UntagResourceInput]
    }
    
    @scala.inline
    def UpdateAliasInput(AliasName: String, TargetKeyId: String): typingsSlinky.awsSdkClientKmsBrowser.typesUpdateAliasInputMod.UpdateAliasInput = {
      val __obj = js.Dynamic.literal(AliasName = AliasName.asInstanceOf[js.Any], TargetKeyId = TargetKeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsBrowser.typesUpdateAliasInputMod.UpdateAliasInput]
    }
    
    @scala.inline
    def UpdateKeyDescriptionInput(Description: String, KeyId: String): typingsSlinky.awsSdkClientKmsBrowser.typesUpdateKeyDescriptionInputMod.UpdateKeyDescriptionInput = {
      val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKmsBrowser.typesUpdateKeyDescriptionInputMod.UpdateKeyDescriptionInput]
    }
  }
}
