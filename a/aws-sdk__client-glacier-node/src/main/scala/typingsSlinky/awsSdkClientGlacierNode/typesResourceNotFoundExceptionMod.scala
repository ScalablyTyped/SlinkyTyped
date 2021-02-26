package typingsSlinky.awsSdkClientGlacierNode

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesResourceNotFoundExceptionMod {
  
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
    implicit class ResourceNotFoundExceptionMutableBuilder[Self <: ResourceNotFoundException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typingsSlinky.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.ResourceNotFoundException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ResourceNotFoundExceptionDetails extends StObject {
    
    /**
      * <p>404 Not Found</p>
      */
    var code: js.UndefOr[String] = js.native
    
    /**
      * <p>Returned if the specified resource (such as a vault, upload ID, or job ID) doesn't exist.</p>
      */
    var message: js.UndefOr[String] = js.native
    
    /**
      * <p>Client</p>
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object ResourceNotFoundExceptionDetails {
    
    @scala.inline
    def apply(): ResourceNotFoundExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResourceNotFoundExceptionDetails]
    }
    
    @scala.inline
    implicit class ResourceNotFoundExceptionDetailsMutableBuilder[Self <: ResourceNotFoundExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
