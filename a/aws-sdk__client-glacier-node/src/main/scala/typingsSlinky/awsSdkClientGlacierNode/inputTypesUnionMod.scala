package typingsSlinky.awsSdkClientGlacierNode

import typingsSlinky.awsSdkClientGlacierNode.typesUploadArchiveInputMod.UploadArchiveInput
import typingsSlinky.awsSdkClientGlacierNode.typesUploadMultipartPartInputMod.UploadMultipartPartInput
import typingsSlinky.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputTypesUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdkClientGlacierNode.typesAbortMultipartUploadInputMod.AbortMultipartUploadInput
    - typingsSlinky.awsSdkClientGlacierNode.typesAbortVaultLockInputMod.AbortVaultLockInput
    - typingsSlinky.awsSdkClientGlacierNode.typesAddTagsToVaultInputMod.AddTagsToVaultInput
    - typingsSlinky.awsSdkClientGlacierNode.typesCompleteMultipartUploadInputMod.CompleteMultipartUploadInput
    - typingsSlinky.awsSdkClientGlacierNode.typesCompleteVaultLockInputMod.CompleteVaultLockInput
    - typingsSlinky.awsSdkClientGlacierNode.typesCreateVaultInputMod.CreateVaultInput
    - typingsSlinky.awsSdkClientGlacierNode.typesDeleteArchiveInputMod.DeleteArchiveInput
    - typingsSlinky.awsSdkClientGlacierNode.typesDeleteVaultInputMod.DeleteVaultInput
    - typingsSlinky.awsSdkClientGlacierNode.typesDeleteVaultAccessPolicyInputMod.DeleteVaultAccessPolicyInput
    - typingsSlinky.awsSdkClientGlacierNode.typesDeleteVaultNotificationsInputMod.DeleteVaultNotificationsInput
    - typingsSlinky.awsSdkClientGlacierNode.typesDescribeJobInputMod.DescribeJobInput
    - typingsSlinky.awsSdkClientGlacierNode.typesDescribeVaultInputMod.DescribeVaultInput
    - typingsSlinky.awsSdkClientGlacierNode.typesGetDataRetrievalPolicyInputMod.GetDataRetrievalPolicyInput
    - typingsSlinky.awsSdkClientGlacierNode.typesGetJobOutputInputMod.GetJobOutputInput
    - typingsSlinky.awsSdkClientGlacierNode.typesGetVaultAccessPolicyInputMod.GetVaultAccessPolicyInput
    - typingsSlinky.awsSdkClientGlacierNode.typesGetVaultLockInputMod.GetVaultLockInput
    - typingsSlinky.awsSdkClientGlacierNode.typesGetVaultNotificationsInputMod.GetVaultNotificationsInput
    - typingsSlinky.awsSdkClientGlacierNode.typesInitiateJobInputMod.InitiateJobInput
    - typingsSlinky.awsSdkClientGlacierNode.typesInitiateMultipartUploadInputMod.InitiateMultipartUploadInput
    - typingsSlinky.awsSdkClientGlacierNode.typesInitiateVaultLockInputMod.InitiateVaultLockInput
    - typingsSlinky.awsSdkClientGlacierNode.typesListJobsInputMod.ListJobsInput
    - typingsSlinky.awsSdkClientGlacierNode.typesListMultipartUploadsInputMod.ListMultipartUploadsInput
    - typingsSlinky.awsSdkClientGlacierNode.typesListPartsInputMod.ListPartsInput
    - typingsSlinky.awsSdkClientGlacierNode.typesListProvisionedCapacityInputMod.ListProvisionedCapacityInput
    - typingsSlinky.awsSdkClientGlacierNode.typesListTagsForVaultInputMod.ListTagsForVaultInput
    - typingsSlinky.awsSdkClientGlacierNode.typesListVaultsInputMod.ListVaultsInput
    - typingsSlinky.awsSdkClientGlacierNode.typesPurchaseProvisionedCapacityInputMod.PurchaseProvisionedCapacityInput
    - typingsSlinky.awsSdkClientGlacierNode.typesRemoveTagsFromVaultInputMod.RemoveTagsFromVaultInput
    - typingsSlinky.awsSdkClientGlacierNode.typesSetDataRetrievalPolicyInputMod.SetDataRetrievalPolicyInput
    - typingsSlinky.awsSdkClientGlacierNode.typesSetVaultAccessPolicyInputMod.SetVaultAccessPolicyInput
    - typingsSlinky.awsSdkClientGlacierNode.typesSetVaultNotificationsInputMod.SetVaultNotificationsInput
    - typingsSlinky.awsSdkClientGlacierNode.typesUploadArchiveInputMod.UploadArchiveInput[typingsSlinky.node.streamMod.Readable]
    - typingsSlinky.awsSdkClientGlacierNode.typesUploadMultipartPartInputMod.UploadMultipartPartInput[typingsSlinky.node.streamMod.Readable]
  */
  type InputTypesUnion = _InputTypesUnion | UploadArchiveInput[Readable] | UploadMultipartPartInput[Readable]
  
  trait _InputTypesUnion extends StObject
  object _InputTypesUnion {
    
    @scala.inline
    def AbortMultipartUploadInput(accountId: String, uploadId: String, vaultName: String): typingsSlinky.awsSdkClientGlacierNode.typesAbortMultipartUploadInputMod.AbortMultipartUploadInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], uploadId = uploadId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientGlacierNode.typesAbortMultipartUploadInputMod.AbortMultipartUploadInput]
    }
    
    @scala.inline
    def AbortVaultLockInput(accountId: String, vaultName: String): typingsSlinky.awsSdkClientGlacierNode.typesAbortVaultLockInputMod.AbortVaultLockInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientGlacierNode.typesAbortVaultLockInputMod.AbortVaultLockInput]
    }
    
    @scala.inline
    def AddTagsToVaultInput(accountId: String, vaultName: String): typingsSlinky.awsSdkClientGlacierNode.typesAddTagsToVaultInputMod.AddTagsToVaultInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientGlacierNode.typesAddTagsToVaultInputMod.AddTagsToVaultInput]
    }
    
    @scala.inline
    def CompleteMultipartUploadInput(accountId: String, uploadId: String, vaultName: String): typingsSlinky.awsSdkClientGlacierNode.typesCompleteMultipartUploadInputMod.CompleteMultipartUploadInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], uploadId = uploadId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientGlacierNode.typesCompleteMultipartUploadInputMod.CompleteMultipartUploadInput]
    }
    
    @scala.inline
    def CompleteVaultLockInput(accountId: String, lockId: String, vaultName: String): typingsSlinky.awsSdkClientGlacierNode.typesCompleteVaultLockInputMod.CompleteVaultLockInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], lockId = lockId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientGlacierNode.typesCompleteVaultLockInputMod.CompleteVaultLockInput]
    }
    
    @scala.inline
    def CreateVaultInput(accountId: String, vaultName: String): typingsSlinky.awsSdkClientGlacierNode.typesCreateVaultInputMod.CreateVaultInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientGlacierNode.typesCreateVaultInputMod.CreateVaultInput]
    }
    
    @scala.inline
    def DeleteArchiveInput(accountId: String, archiveId: String, vaultName: String): typingsSlinky.awsSdkClientGlacierNode.typesDeleteArchiveInputMod.DeleteArchiveInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], archiveId = archiveId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientGlacierNode.typesDeleteArchiveInputMod.DeleteArchiveInput]
    }
    
    @scala.inline
    def DeleteVaultAccessPolicyInput(accountId: String, vaultName: String): typingsSlinky.awsSdkClientGlacierNode.typesDeleteVaultAccessPolicyInputMod.DeleteVaultAccessPolicyInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientGlacierNode.typesDeleteVaultAccessPolicyInputMod.DeleteVaultAccessPolicyInput]
    }
    
    @scala.inline
    def DeleteVaultInput(accountId: String, vaultName: String): typingsSlinky.awsSdkClientGlacierNode.typesDeleteVaultInputMod.DeleteVaultInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientGlacierNode.typesDeleteVaultInputMod.DeleteVaultInput]
    }
    
    @scala.inline
    def DeleteVaultNotificationsInput(accountId: String, vaultName: String): typingsSlinky.awsSdkClientGlacierNode.typesDeleteVaultNotificationsInputMod.DeleteVaultNotificationsInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientGlacierNode.typesDeleteVaultNotificationsInputMod.DeleteVaultNotificationsInput]
    }
    
    @scala.inline
    def DescribeJobInput(accountId: String, jobId: String, vaultName: String): typingsSlinky.awsSdkClientGlacierNode.typesDescribeJobInputMod.DescribeJobInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientGlacierNode.typesDescribeJobInputMod.DescribeJobInput]
    }
    
    @scala.inline
    def DescribeVaultInput(accountId: String, vaultName: String): typingsSlinky.awsSdkClientGlacierNode.typesDescribeVaultInputMod.DescribeVaultInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientGlacierNode.typesDescribeVaultInputMod.DescribeVaultInput]
    }
    
    @scala.inline
    def GetDataRetrievalPolicyInput(accountId: String): typingsSlinky.awsSdkClientGlacierNode.typesGetDataRetrievalPolicyInputMod.GetDataRetrievalPolicyInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientGlacierNode.typesGetDataRetrievalPolicyInputMod.GetDataRetrievalPolicyInput]
    }
    
    @scala.inline
    def GetJobOutputInput(accountId: String, jobId: String, vaultName: String): typingsSlinky.awsSdkClientGlacierNode.typesGetJobOutputInputMod.GetJobOutputInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientGlacierNode.typesGetJobOutputInputMod.GetJobOutputInput]
    }
    
    @scala.inline
    def GetVaultAccessPolicyInput(accountId: String, vaultName: String): typingsSlinky.awsSdkClientGlacierNode.typesGetVaultAccessPolicyInputMod.GetVaultAccessPolicyInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientGlacierNode.typesGetVaultAccessPolicyInputMod.GetVaultAccessPolicyInput]
    }
    
    @scala.inline
    def GetVaultLockInput(accountId: String, vaultName: String): typingsSlinky.awsSdkClientGlacierNode.typesGetVaultLockInputMod.GetVaultLockInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientGlacierNode.typesGetVaultLockInputMod.GetVaultLockInput]
    }
    
    @scala.inline
    def GetVaultNotificationsInput(accountId: String, vaultName: String): typingsSlinky.awsSdkClientGlacierNode.typesGetVaultNotificationsInputMod.GetVaultNotificationsInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientGlacierNode.typesGetVaultNotificationsInputMod.GetVaultNotificationsInput]
    }
    
    @scala.inline
    def InitiateJobInput(accountId: String, vaultName: String): typingsSlinky.awsSdkClientGlacierNode.typesInitiateJobInputMod.InitiateJobInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientGlacierNode.typesInitiateJobInputMod.InitiateJobInput]
    }
    
    @scala.inline
    def InitiateMultipartUploadInput(accountId: String, vaultName: String): typingsSlinky.awsSdkClientGlacierNode.typesInitiateMultipartUploadInputMod.InitiateMultipartUploadInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientGlacierNode.typesInitiateMultipartUploadInputMod.InitiateMultipartUploadInput]
    }
    
    @scala.inline
    def InitiateVaultLockInput(accountId: String, vaultName: String): typingsSlinky.awsSdkClientGlacierNode.typesInitiateVaultLockInputMod.InitiateVaultLockInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientGlacierNode.typesInitiateVaultLockInputMod.InitiateVaultLockInput]
    }
    
    @scala.inline
    def ListJobsInput(accountId: String, vaultName: String): typingsSlinky.awsSdkClientGlacierNode.typesListJobsInputMod.ListJobsInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientGlacierNode.typesListJobsInputMod.ListJobsInput]
    }
    
    @scala.inline
    def ListMultipartUploadsInput(accountId: String, vaultName: String): typingsSlinky.awsSdkClientGlacierNode.typesListMultipartUploadsInputMod.ListMultipartUploadsInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientGlacierNode.typesListMultipartUploadsInputMod.ListMultipartUploadsInput]
    }
    
    @scala.inline
    def ListPartsInput(accountId: String, uploadId: String, vaultName: String): typingsSlinky.awsSdkClientGlacierNode.typesListPartsInputMod.ListPartsInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], uploadId = uploadId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientGlacierNode.typesListPartsInputMod.ListPartsInput]
    }
    
    @scala.inline
    def ListProvisionedCapacityInput(accountId: String): typingsSlinky.awsSdkClientGlacierNode.typesListProvisionedCapacityInputMod.ListProvisionedCapacityInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientGlacierNode.typesListProvisionedCapacityInputMod.ListProvisionedCapacityInput]
    }
    
    @scala.inline
    def ListTagsForVaultInput(accountId: String, vaultName: String): typingsSlinky.awsSdkClientGlacierNode.typesListTagsForVaultInputMod.ListTagsForVaultInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientGlacierNode.typesListTagsForVaultInputMod.ListTagsForVaultInput]
    }
    
    @scala.inline
    def ListVaultsInput(accountId: String): typingsSlinky.awsSdkClientGlacierNode.typesListVaultsInputMod.ListVaultsInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientGlacierNode.typesListVaultsInputMod.ListVaultsInput]
    }
    
    @scala.inline
    def PurchaseProvisionedCapacityInput(accountId: String): typingsSlinky.awsSdkClientGlacierNode.typesPurchaseProvisionedCapacityInputMod.PurchaseProvisionedCapacityInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientGlacierNode.typesPurchaseProvisionedCapacityInputMod.PurchaseProvisionedCapacityInput]
    }
    
    @scala.inline
    def RemoveTagsFromVaultInput(accountId: String, vaultName: String): typingsSlinky.awsSdkClientGlacierNode.typesRemoveTagsFromVaultInputMod.RemoveTagsFromVaultInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientGlacierNode.typesRemoveTagsFromVaultInputMod.RemoveTagsFromVaultInput]
    }
    
    @scala.inline
    def SetDataRetrievalPolicyInput(accountId: String): typingsSlinky.awsSdkClientGlacierNode.typesSetDataRetrievalPolicyInputMod.SetDataRetrievalPolicyInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientGlacierNode.typesSetDataRetrievalPolicyInputMod.SetDataRetrievalPolicyInput]
    }
    
    @scala.inline
    def SetVaultAccessPolicyInput(accountId: String, vaultName: String): typingsSlinky.awsSdkClientGlacierNode.typesSetVaultAccessPolicyInputMod.SetVaultAccessPolicyInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientGlacierNode.typesSetVaultAccessPolicyInputMod.SetVaultAccessPolicyInput]
    }
    
    @scala.inline
    def SetVaultNotificationsInput(accountId: String, vaultName: String): typingsSlinky.awsSdkClientGlacierNode.typesSetVaultNotificationsInputMod.SetVaultNotificationsInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientGlacierNode.typesSetVaultNotificationsInputMod.SetVaultNotificationsInput]
    }
  }
}
