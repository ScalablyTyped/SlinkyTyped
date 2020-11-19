package typingsSlinky.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod

import typingsSlinky.awsSdkClientKmsNode.cancelKeyDeletionExceptionsUnionMod.CancelKeyDeletionExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.createAliasExceptionsUnionMod.CreateAliasExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.createGrantExceptionsUnionMod.CreateGrantExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.createKeyExceptionsUnionMod.CreateKeyExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.decryptExceptionsUnionMod.DecryptExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.deleteAliasExceptionsUnionMod.DeleteAliasExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.deleteImportedKeyMaterialExceptionsUnionMod.DeleteImportedKeyMaterialExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.describeKeyExceptionsUnionMod.DescribeKeyExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.disableKeyExceptionsUnionMod.DisableKeyExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.disableKeyRotationExceptionsUnionMod.DisableKeyRotationExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.enableKeyExceptionsUnionMod.EnableKeyExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.enableKeyRotationExceptionsUnionMod.EnableKeyRotationExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.encryptExceptionsUnionMod.EncryptExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.generateDataKeyExceptionsUnionMod.GenerateDataKeyExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.generateDataKeyWithoutPlaintextExceptionsUnionMod.GenerateDataKeyWithoutPlaintextExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.generateRandomExceptionsUnionMod.GenerateRandomExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.getKeyPolicyExceptionsUnionMod.GetKeyPolicyExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.getKeyRotationStatusExceptionsUnionMod.GetKeyRotationStatusExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.getParametersForImportExceptionsUnionMod.GetParametersForImportExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.importKeyMaterialExceptionsUnionMod.ImportKeyMaterialExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.listAliasesExceptionsUnionMod.ListAliasesExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.listGrantsExceptionsUnionMod.ListGrantsExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.listKeyPoliciesExceptionsUnionMod.ListKeyPoliciesExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.listKeysExceptionsUnionMod.ListKeysExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.listRetirableGrantsExceptionsUnionMod.ListRetirableGrantsExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.putKeyPolicyExceptionsUnionMod.PutKeyPolicyExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.reEncryptExceptionsUnionMod.ReEncryptExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.retireGrantExceptionsUnionMod.RetireGrantExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.revokeGrantExceptionsUnionMod.RevokeGrantExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.scheduleKeyDeletionExceptionsUnionMod.ScheduleKeyDeletionExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.updateAliasExceptionsUnionMod.UpdateAliasExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.updateKeyDescriptionExceptionsUnionMod.UpdateKeyDescriptionExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DependencyTimeoutException
  extends ServiceException[DependencyTimeoutExceptionDetails]
     with CancelKeyDeletionExceptionsUnion
     with CreateAliasExceptionsUnion
     with CreateGrantExceptionsUnion
     with CreateKeyExceptionsUnion
     with DecryptExceptionsUnion
     with DeleteAliasExceptionsUnion
     with DeleteImportedKeyMaterialExceptionsUnion
     with DescribeKeyExceptionsUnion
     with DisableKeyExceptionsUnion
     with DisableKeyRotationExceptionsUnion
     with EnableKeyExceptionsUnion
     with EnableKeyRotationExceptionsUnion
     with EncryptExceptionsUnion
     with GenerateDataKeyExceptionsUnion
     with GenerateDataKeyWithoutPlaintextExceptionsUnion
     with GenerateRandomExceptionsUnion
     with GetKeyPolicyExceptionsUnion
     with GetKeyRotationStatusExceptionsUnion
     with GetParametersForImportExceptionsUnion
     with ImportKeyMaterialExceptionsUnion
     with ListAliasesExceptionsUnion
     with ListGrantsExceptionsUnion
     with ListKeyPoliciesExceptionsUnion
     with ListKeysExceptionsUnion
     with ListRetirableGrantsExceptionsUnion
     with PutKeyPolicyExceptionsUnion
     with ReEncryptExceptionsUnion
     with RetireGrantExceptionsUnion
     with RevokeGrantExceptionsUnion
     with ScheduleKeyDeletionExceptionsUnion
     with UpdateAliasExceptionsUnion
     with UpdateKeyDescriptionExceptionsUnion {
  
  @JSName("name")
  var name_DependencyTimeoutException: typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.DependencyTimeoutException = js.native
}
object DependencyTimeoutException {
  
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: DependencyTimeoutExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.DependencyTimeoutException
  ): DependencyTimeoutException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DependencyTimeoutException]
  }
  
  @scala.inline
  implicit class DependencyTimeoutExceptionOps[Self <: DependencyTimeoutException] (val x: Self) extends AnyVal {
    
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
    def setName(value: typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.DependencyTimeoutException): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
