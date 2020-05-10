package typingsSlinky.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod

import typingsSlinky.awsSdkClientKmsBrowser.cancelKeyDeletionExceptionsUnionMod.CancelKeyDeletionExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.createAliasExceptionsUnionMod.CreateAliasExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.createGrantExceptionsUnionMod.CreateGrantExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.createKeyExceptionsUnionMod.CreateKeyExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.decryptExceptionsUnionMod.DecryptExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.deleteAliasExceptionsUnionMod.DeleteAliasExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.deleteImportedKeyMaterialExceptionsUnionMod.DeleteImportedKeyMaterialExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.describeKeyExceptionsUnionMod.DescribeKeyExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.disableKeyExceptionsUnionMod.DisableKeyExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.disableKeyRotationExceptionsUnionMod.DisableKeyRotationExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.enableKeyExceptionsUnionMod.EnableKeyExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.enableKeyRotationExceptionsUnionMod.EnableKeyRotationExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.encryptExceptionsUnionMod.EncryptExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.generateDataKeyExceptionsUnionMod.GenerateDataKeyExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.generateDataKeyWithoutPlaintextExceptionsUnionMod.GenerateDataKeyWithoutPlaintextExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.generateRandomExceptionsUnionMod.GenerateRandomExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.getKeyPolicyExceptionsUnionMod.GetKeyPolicyExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.getKeyRotationStatusExceptionsUnionMod.GetKeyRotationStatusExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.getParametersForImportExceptionsUnionMod.GetParametersForImportExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.importKeyMaterialExceptionsUnionMod.ImportKeyMaterialExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.listAliasesExceptionsUnionMod.ListAliasesExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.listGrantsExceptionsUnionMod.ListGrantsExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.listKeyPoliciesExceptionsUnionMod.ListKeyPoliciesExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.listKeysExceptionsUnionMod.ListKeysExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.listResourceTagsExceptionsUnionMod.ListResourceTagsExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.listRetirableGrantsExceptionsUnionMod.ListRetirableGrantsExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.putKeyPolicyExceptionsUnionMod.PutKeyPolicyExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.reEncryptExceptionsUnionMod.ReEncryptExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.retireGrantExceptionsUnionMod.RetireGrantExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.revokeGrantExceptionsUnionMod.RevokeGrantExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.scheduleKeyDeletionExceptionsUnionMod.ScheduleKeyDeletionExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.tagResourceExceptionsUnionMod.TagResourceExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.untagResourceExceptionsUnionMod.UntagResourceExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.updateAliasExceptionsUnionMod.UpdateAliasExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.updateKeyDescriptionExceptionsUnionMod.UpdateKeyDescriptionExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KMSInternalException
  extends ServiceException[KMSInternalExceptionDetails]
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
     with ListResourceTagsExceptionsUnion
     with ListRetirableGrantsExceptionsUnion
     with PutKeyPolicyExceptionsUnion
     with ReEncryptExceptionsUnion
     with RetireGrantExceptionsUnion
     with RevokeGrantExceptionsUnion
     with ScheduleKeyDeletionExceptionsUnion
     with TagResourceExceptionsUnion
     with UntagResourceExceptionsUnion
     with UpdateAliasExceptionsUnion
     with UpdateKeyDescriptionExceptionsUnion {
  @JSName("name")
  var name_KMSInternalException: typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.KMSInternalException = js.native
}

object KMSInternalException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: KMSInternalExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.KMSInternalException
  ): KMSInternalException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[KMSInternalException]
  }
  @scala.inline
  implicit class KMSInternalExceptionOps[Self <: KMSInternalException] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.KMSInternalException): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

