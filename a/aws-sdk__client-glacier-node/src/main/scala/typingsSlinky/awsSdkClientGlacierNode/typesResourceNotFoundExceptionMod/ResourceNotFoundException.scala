package typingsSlinky.awsSdkClientGlacierNode.typesResourceNotFoundExceptionMod

import typingsSlinky.awsSdkClientGlacierNode.abortMultipartUploadExceptionsUnionMod.AbortMultipartUploadExceptionsUnion
import typingsSlinky.awsSdkClientGlacierNode.abortVaultLockExceptionsUnionMod.AbortVaultLockExceptionsUnion
import typingsSlinky.awsSdkClientGlacierNode.addTagsToVaultExceptionsUnionMod.AddTagsToVaultExceptionsUnion
import typingsSlinky.awsSdkClientGlacierNode.completeMultipartUploadExceptionsUnionMod.CompleteMultipartUploadExceptionsUnion
import typingsSlinky.awsSdkClientGlacierNode.completeVaultLockExceptionsUnionMod.CompleteVaultLockExceptionsUnion
import typingsSlinky.awsSdkClientGlacierNode.deleteArchiveExceptionsUnionMod.DeleteArchiveExceptionsUnion
import typingsSlinky.awsSdkClientGlacierNode.deleteVaultAccessPolicyExceptionsUnionMod.DeleteVaultAccessPolicyExceptionsUnion
import typingsSlinky.awsSdkClientGlacierNode.deleteVaultExceptionsUnionMod.DeleteVaultExceptionsUnion
import typingsSlinky.awsSdkClientGlacierNode.deleteVaultNotificationsExceptionsUnionMod.DeleteVaultNotificationsExceptionsUnion
import typingsSlinky.awsSdkClientGlacierNode.describeJobExceptionsUnionMod.DescribeJobExceptionsUnion
import typingsSlinky.awsSdkClientGlacierNode.describeVaultExceptionsUnionMod.DescribeVaultExceptionsUnion
import typingsSlinky.awsSdkClientGlacierNode.getJobOutputExceptionsUnionMod.GetJobOutputExceptionsUnion
import typingsSlinky.awsSdkClientGlacierNode.getVaultAccessPolicyExceptionsUnionMod.GetVaultAccessPolicyExceptionsUnion
import typingsSlinky.awsSdkClientGlacierNode.getVaultLockExceptionsUnionMod.GetVaultLockExceptionsUnion
import typingsSlinky.awsSdkClientGlacierNode.getVaultNotificationsExceptionsUnionMod.GetVaultNotificationsExceptionsUnion
import typingsSlinky.awsSdkClientGlacierNode.initiateJobExceptionsUnionMod.InitiateJobExceptionsUnion
import typingsSlinky.awsSdkClientGlacierNode.initiateMultipartUploadExceptionsUnionMod.InitiateMultipartUploadExceptionsUnion
import typingsSlinky.awsSdkClientGlacierNode.initiateVaultLockExceptionsUnionMod.InitiateVaultLockExceptionsUnion
import typingsSlinky.awsSdkClientGlacierNode.listJobsExceptionsUnionMod.ListJobsExceptionsUnion
import typingsSlinky.awsSdkClientGlacierNode.listMultipartUploadsExceptionsUnionMod.ListMultipartUploadsExceptionsUnion
import typingsSlinky.awsSdkClientGlacierNode.listPartsExceptionsUnionMod.ListPartsExceptionsUnion
import typingsSlinky.awsSdkClientGlacierNode.listTagsForVaultExceptionsUnionMod.ListTagsForVaultExceptionsUnion
import typingsSlinky.awsSdkClientGlacierNode.listVaultsExceptionsUnionMod.ListVaultsExceptionsUnion
import typingsSlinky.awsSdkClientGlacierNode.removeTagsFromVaultExceptionsUnionMod.RemoveTagsFromVaultExceptionsUnion
import typingsSlinky.awsSdkClientGlacierNode.setVaultAccessPolicyExceptionsUnionMod.SetVaultAccessPolicyExceptionsUnion
import typingsSlinky.awsSdkClientGlacierNode.setVaultNotificationsExceptionsUnionMod.SetVaultNotificationsExceptionsUnion
import typingsSlinky.awsSdkClientGlacierNode.uploadArchiveExceptionsUnionMod.UploadArchiveExceptionsUnion
import typingsSlinky.awsSdkClientGlacierNode.uploadMultipartPartExceptionsUnionMod.UploadMultipartPartExceptionsUnion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_ResourceNotFoundExceptionDetails> * / any */ @js.native
trait ResourceNotFoundException
  extends AbortMultipartUploadExceptionsUnion
     with AbortVaultLockExceptionsUnion
     with AddTagsToVaultExceptionsUnion
     with CompleteMultipartUploadExceptionsUnion
     with CompleteVaultLockExceptionsUnion
     with DeleteArchiveExceptionsUnion
     with DeleteVaultAccessPolicyExceptionsUnion
     with DeleteVaultExceptionsUnion
     with DeleteVaultNotificationsExceptionsUnion
     with DescribeJobExceptionsUnion
     with DescribeVaultExceptionsUnion
     with GetJobOutputExceptionsUnion
     with GetVaultAccessPolicyExceptionsUnion
     with GetVaultLockExceptionsUnion
     with GetVaultNotificationsExceptionsUnion
     with InitiateJobExceptionsUnion
     with InitiateMultipartUploadExceptionsUnion
     with InitiateVaultLockExceptionsUnion
     with ListJobsExceptionsUnion
     with ListMultipartUploadsExceptionsUnion
     with ListPartsExceptionsUnion
     with ListTagsForVaultExceptionsUnion
     with ListVaultsExceptionsUnion
     with RemoveTagsFromVaultExceptionsUnion
     with SetVaultAccessPolicyExceptionsUnion
     with SetVaultNotificationsExceptionsUnion
     with UploadArchiveExceptionsUnion
     with UploadMultipartPartExceptionsUnion {
  
  var name: typingsSlinky.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.ResourceNotFoundException = js.native
}
object ResourceNotFoundException {
  
  @scala.inline
  def apply(
    name: typingsSlinky.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.ResourceNotFoundException
  ): ResourceNotFoundException = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceNotFoundException]
  }
  
  @scala.inline
  implicit class ResourceNotFoundExceptionOps[Self <: ResourceNotFoundException] (val x: Self) extends AnyVal {
    
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
    def setName(
      value: typingsSlinky.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.ResourceNotFoundException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
