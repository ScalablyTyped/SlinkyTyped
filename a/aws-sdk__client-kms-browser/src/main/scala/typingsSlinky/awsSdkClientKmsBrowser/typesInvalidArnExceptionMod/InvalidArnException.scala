package typingsSlinky.awsSdkClientKmsBrowser.typesInvalidArnExceptionMod

import typingsSlinky.awsSdkClientKmsBrowser.cancelKeyDeletionExceptionsUnionMod.CancelKeyDeletionExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.createGrantExceptionsUnionMod.CreateGrantExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.createKeyExceptionsUnionMod.CreateKeyExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.deleteImportedKeyMaterialExceptionsUnionMod.DeleteImportedKeyMaterialExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.describeKeyExceptionsUnionMod.DescribeKeyExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.disableKeyExceptionsUnionMod.DisableKeyExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.disableKeyRotationExceptionsUnionMod.DisableKeyRotationExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.enableKeyExceptionsUnionMod.EnableKeyExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.enableKeyRotationExceptionsUnionMod.EnableKeyRotationExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.getKeyPolicyExceptionsUnionMod.GetKeyPolicyExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.getKeyRotationStatusExceptionsUnionMod.GetKeyRotationStatusExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.getParametersForImportExceptionsUnionMod.GetParametersForImportExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.importKeyMaterialExceptionsUnionMod.ImportKeyMaterialExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.listGrantsExceptionsUnionMod.ListGrantsExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.listKeyPoliciesExceptionsUnionMod.ListKeyPoliciesExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.listResourceTagsExceptionsUnionMod.ListResourceTagsExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.listRetirableGrantsExceptionsUnionMod.ListRetirableGrantsExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.putKeyPolicyExceptionsUnionMod.PutKeyPolicyExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.retireGrantExceptionsUnionMod.RetireGrantExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.revokeGrantExceptionsUnionMod.RevokeGrantExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.scheduleKeyDeletionExceptionsUnionMod.ScheduleKeyDeletionExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.tagResourceExceptionsUnionMod.TagResourceExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.untagResourceExceptionsUnionMod.UntagResourceExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.updateKeyDescriptionExceptionsUnionMod.UpdateKeyDescriptionExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidArnException
  extends ServiceException[InvalidArnExceptionDetails]
     with CancelKeyDeletionExceptionsUnion
     with CreateGrantExceptionsUnion
     with CreateKeyExceptionsUnion
     with DeleteImportedKeyMaterialExceptionsUnion
     with DescribeKeyExceptionsUnion
     with DisableKeyExceptionsUnion
     with DisableKeyRotationExceptionsUnion
     with EnableKeyExceptionsUnion
     with EnableKeyRotationExceptionsUnion
     with GetKeyPolicyExceptionsUnion
     with GetKeyRotationStatusExceptionsUnion
     with GetParametersForImportExceptionsUnion
     with ImportKeyMaterialExceptionsUnion
     with ListGrantsExceptionsUnion
     with ListKeyPoliciesExceptionsUnion
     with ListResourceTagsExceptionsUnion
     with ListRetirableGrantsExceptionsUnion
     with PutKeyPolicyExceptionsUnion
     with RetireGrantExceptionsUnion
     with RevokeGrantExceptionsUnion
     with ScheduleKeyDeletionExceptionsUnion
     with TagResourceExceptionsUnion
     with UntagResourceExceptionsUnion
     with UpdateKeyDescriptionExceptionsUnion {
  @JSName("name")
  var name_InvalidArnException: typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.InvalidArnException = js.native
}

object InvalidArnException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidArnExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.InvalidArnException
  ): InvalidArnException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidArnException]
  }
  @scala.inline
  implicit class InvalidArnExceptionOps[Self <: InvalidArnException] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.InvalidArnException): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

