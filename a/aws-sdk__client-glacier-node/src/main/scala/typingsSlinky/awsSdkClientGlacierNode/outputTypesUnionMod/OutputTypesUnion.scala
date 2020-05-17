package typingsSlinky.awsSdkClientGlacierNode.outputTypesUnionMod

import typingsSlinky.awsSdkClientGlacierNode.typesAbortMultipartUploadOutputMod.AbortMultipartUploadOutput
import typingsSlinky.awsSdkClientGlacierNode.typesAbortVaultLockOutputMod.AbortVaultLockOutput
import typingsSlinky.awsSdkClientGlacierNode.typesAddTagsToVaultOutputMod.AddTagsToVaultOutput
import typingsSlinky.awsSdkClientGlacierNode.typesCompleteMultipartUploadOutputMod.CompleteMultipartUploadOutput
import typingsSlinky.awsSdkClientGlacierNode.typesCompleteVaultLockOutputMod.CompleteVaultLockOutput
import typingsSlinky.awsSdkClientGlacierNode.typesCreateVaultOutputMod.CreateVaultOutput
import typingsSlinky.awsSdkClientGlacierNode.typesDeleteArchiveOutputMod.DeleteArchiveOutput
import typingsSlinky.awsSdkClientGlacierNode.typesDeleteVaultAccessPolicyOutputMod.DeleteVaultAccessPolicyOutput
import typingsSlinky.awsSdkClientGlacierNode.typesDeleteVaultNotificationsOutputMod.DeleteVaultNotificationsOutput
import typingsSlinky.awsSdkClientGlacierNode.typesDeleteVaultOutputMod.DeleteVaultOutput
import typingsSlinky.awsSdkClientGlacierNode.typesDescribeJobOutputMod.DescribeJobOutput
import typingsSlinky.awsSdkClientGlacierNode.typesDescribeVaultOutputMod.DescribeVaultOutput
import typingsSlinky.awsSdkClientGlacierNode.typesGetDataRetrievalPolicyOutputMod.GetDataRetrievalPolicyOutput
import typingsSlinky.awsSdkClientGlacierNode.typesGetJobOutputOutputMod.GetJobOutputOutput
import typingsSlinky.awsSdkClientGlacierNode.typesGetVaultAccessPolicyOutputMod.GetVaultAccessPolicyOutput
import typingsSlinky.awsSdkClientGlacierNode.typesGetVaultLockOutputMod.GetVaultLockOutput
import typingsSlinky.awsSdkClientGlacierNode.typesGetVaultNotificationsOutputMod.GetVaultNotificationsOutput
import typingsSlinky.awsSdkClientGlacierNode.typesInitiateJobOutputMod.InitiateJobOutput
import typingsSlinky.awsSdkClientGlacierNode.typesInitiateMultipartUploadOutputMod.InitiateMultipartUploadOutput
import typingsSlinky.awsSdkClientGlacierNode.typesInitiateVaultLockOutputMod.InitiateVaultLockOutput
import typingsSlinky.awsSdkClientGlacierNode.typesListJobsOutputMod.ListJobsOutput
import typingsSlinky.awsSdkClientGlacierNode.typesListMultipartUploadsOutputMod.ListMultipartUploadsOutput
import typingsSlinky.awsSdkClientGlacierNode.typesListPartsOutputMod.ListPartsOutput
import typingsSlinky.awsSdkClientGlacierNode.typesListProvisionedCapacityOutputMod.ListProvisionedCapacityOutput
import typingsSlinky.awsSdkClientGlacierNode.typesListTagsForVaultOutputMod.ListTagsForVaultOutput
import typingsSlinky.awsSdkClientGlacierNode.typesListVaultsOutputMod.ListVaultsOutput
import typingsSlinky.awsSdkClientGlacierNode.typesPurchaseProvisionedCapacityOutputMod.PurchaseProvisionedCapacityOutput
import typingsSlinky.awsSdkClientGlacierNode.typesRemoveTagsFromVaultOutputMod.RemoveTagsFromVaultOutput
import typingsSlinky.awsSdkClientGlacierNode.typesSetDataRetrievalPolicyOutputMod.SetDataRetrievalPolicyOutput
import typingsSlinky.awsSdkClientGlacierNode.typesSetVaultAccessPolicyOutputMod.SetVaultAccessPolicyOutput
import typingsSlinky.awsSdkClientGlacierNode.typesSetVaultNotificationsOutputMod.SetVaultNotificationsOutput
import typingsSlinky.awsSdkClientGlacierNode.typesUploadArchiveOutputMod.UploadArchiveOutput
import typingsSlinky.awsSdkClientGlacierNode.typesUploadMultipartPartOutputMod.UploadMultipartPartOutput
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientGlacierNode.typesAbortMultipartUploadOutputMod.AbortMultipartUploadOutput
  - typingsSlinky.awsSdkClientGlacierNode.typesAbortVaultLockOutputMod.AbortVaultLockOutput
  - typingsSlinky.awsSdkClientGlacierNode.typesAddTagsToVaultOutputMod.AddTagsToVaultOutput
  - typingsSlinky.awsSdkClientGlacierNode.typesCompleteMultipartUploadOutputMod.CompleteMultipartUploadOutput
  - typingsSlinky.awsSdkClientGlacierNode.typesCompleteVaultLockOutputMod.CompleteVaultLockOutput
  - typingsSlinky.awsSdkClientGlacierNode.typesCreateVaultOutputMod.CreateVaultOutput
  - typingsSlinky.awsSdkClientGlacierNode.typesDeleteArchiveOutputMod.DeleteArchiveOutput
  - typingsSlinky.awsSdkClientGlacierNode.typesDeleteVaultOutputMod.DeleteVaultOutput
  - typingsSlinky.awsSdkClientGlacierNode.typesDeleteVaultAccessPolicyOutputMod.DeleteVaultAccessPolicyOutput
  - typingsSlinky.awsSdkClientGlacierNode.typesDeleteVaultNotificationsOutputMod.DeleteVaultNotificationsOutput
  - typingsSlinky.awsSdkClientGlacierNode.typesDescribeJobOutputMod.DescribeJobOutput
  - typingsSlinky.awsSdkClientGlacierNode.typesDescribeVaultOutputMod.DescribeVaultOutput
  - typingsSlinky.awsSdkClientGlacierNode.typesGetDataRetrievalPolicyOutputMod.GetDataRetrievalPolicyOutput
  - typingsSlinky.awsSdkClientGlacierNode.typesGetJobOutputOutputMod.GetJobOutputOutput[typingsSlinky.node.streamMod.Readable]
  - typingsSlinky.awsSdkClientGlacierNode.typesGetVaultAccessPolicyOutputMod.GetVaultAccessPolicyOutput
  - typingsSlinky.awsSdkClientGlacierNode.typesGetVaultLockOutputMod.GetVaultLockOutput
  - typingsSlinky.awsSdkClientGlacierNode.typesGetVaultNotificationsOutputMod.GetVaultNotificationsOutput
  - typingsSlinky.awsSdkClientGlacierNode.typesInitiateJobOutputMod.InitiateJobOutput
  - typingsSlinky.awsSdkClientGlacierNode.typesInitiateMultipartUploadOutputMod.InitiateMultipartUploadOutput
  - typingsSlinky.awsSdkClientGlacierNode.typesInitiateVaultLockOutputMod.InitiateVaultLockOutput
  - typingsSlinky.awsSdkClientGlacierNode.typesListJobsOutputMod.ListJobsOutput
  - typingsSlinky.awsSdkClientGlacierNode.typesListMultipartUploadsOutputMod.ListMultipartUploadsOutput
  - typingsSlinky.awsSdkClientGlacierNode.typesListPartsOutputMod.ListPartsOutput
  - typingsSlinky.awsSdkClientGlacierNode.typesListProvisionedCapacityOutputMod.ListProvisionedCapacityOutput
  - typingsSlinky.awsSdkClientGlacierNode.typesListTagsForVaultOutputMod.ListTagsForVaultOutput
  - typingsSlinky.awsSdkClientGlacierNode.typesListVaultsOutputMod.ListVaultsOutput
  - typingsSlinky.awsSdkClientGlacierNode.typesPurchaseProvisionedCapacityOutputMod.PurchaseProvisionedCapacityOutput
  - typingsSlinky.awsSdkClientGlacierNode.typesRemoveTagsFromVaultOutputMod.RemoveTagsFromVaultOutput
  - typingsSlinky.awsSdkClientGlacierNode.typesSetDataRetrievalPolicyOutputMod.SetDataRetrievalPolicyOutput
  - typingsSlinky.awsSdkClientGlacierNode.typesSetVaultAccessPolicyOutputMod.SetVaultAccessPolicyOutput
  - typingsSlinky.awsSdkClientGlacierNode.typesSetVaultNotificationsOutputMod.SetVaultNotificationsOutput
  - typingsSlinky.awsSdkClientGlacierNode.typesUploadArchiveOutputMod.UploadArchiveOutput
  - typingsSlinky.awsSdkClientGlacierNode.typesUploadMultipartPartOutputMod.UploadMultipartPartOutput
*/
trait OutputTypesUnion extends js.Object

object OutputTypesUnion {
  @scala.inline
  implicit def apply(value: AbortMultipartUploadOutput): OutputTypesUnion = value.asInstanceOf[OutputTypesUnion]
  @scala.inline
  implicit def apply(value: AbortVaultLockOutput): OutputTypesUnion = value.asInstanceOf[OutputTypesUnion]
  @scala.inline
  implicit def apply(value: AddTagsToVaultOutput): OutputTypesUnion = value.asInstanceOf[OutputTypesUnion]
  @scala.inline
  implicit def apply(value: CompleteMultipartUploadOutput): OutputTypesUnion = value.asInstanceOf[OutputTypesUnion]
  @scala.inline
  implicit def apply(value: CompleteVaultLockOutput): OutputTypesUnion = value.asInstanceOf[OutputTypesUnion]
  @scala.inline
  implicit def apply(value: CreateVaultOutput): OutputTypesUnion = value.asInstanceOf[OutputTypesUnion]
  @scala.inline
  implicit def apply(value: DeleteArchiveOutput): OutputTypesUnion = value.asInstanceOf[OutputTypesUnion]
  @scala.inline
  implicit def apply(value: DeleteVaultAccessPolicyOutput): OutputTypesUnion = value.asInstanceOf[OutputTypesUnion]
  @scala.inline
  implicit def apply(value: DeleteVaultNotificationsOutput): OutputTypesUnion = value.asInstanceOf[OutputTypesUnion]
  @scala.inline
  implicit def apply(value: DeleteVaultOutput): OutputTypesUnion = value.asInstanceOf[OutputTypesUnion]
  @scala.inline
  implicit def apply(value: DescribeJobOutput): OutputTypesUnion = value.asInstanceOf[OutputTypesUnion]
  @scala.inline
  implicit def apply(value: DescribeVaultOutput): OutputTypesUnion = value.asInstanceOf[OutputTypesUnion]
  @scala.inline
  implicit def apply(value: GetDataRetrievalPolicyOutput): OutputTypesUnion = value.asInstanceOf[OutputTypesUnion]
  @scala.inline
  implicit def apply(value: GetJobOutputOutput[Readable]): OutputTypesUnion = value.asInstanceOf[OutputTypesUnion]
  @scala.inline
  implicit def apply(value: GetVaultAccessPolicyOutput): OutputTypesUnion = value.asInstanceOf[OutputTypesUnion]
  @scala.inline
  implicit def apply(value: GetVaultLockOutput): OutputTypesUnion = value.asInstanceOf[OutputTypesUnion]
  @scala.inline
  implicit def apply(value: GetVaultNotificationsOutput): OutputTypesUnion = value.asInstanceOf[OutputTypesUnion]
  @scala.inline
  implicit def apply(value: InitiateJobOutput): OutputTypesUnion = value.asInstanceOf[OutputTypesUnion]
  @scala.inline
  implicit def apply(value: InitiateMultipartUploadOutput): OutputTypesUnion = value.asInstanceOf[OutputTypesUnion]
  @scala.inline
  implicit def apply(value: InitiateVaultLockOutput): OutputTypesUnion = value.asInstanceOf[OutputTypesUnion]
  @scala.inline
  implicit def apply(value: ListJobsOutput): OutputTypesUnion = value.asInstanceOf[OutputTypesUnion]
  @scala.inline
  implicit def apply(value: ListMultipartUploadsOutput): OutputTypesUnion = value.asInstanceOf[OutputTypesUnion]
  @scala.inline
  implicit def apply(value: ListPartsOutput): OutputTypesUnion = value.asInstanceOf[OutputTypesUnion]
  @scala.inline
  implicit def apply(value: ListProvisionedCapacityOutput): OutputTypesUnion = value.asInstanceOf[OutputTypesUnion]
  @scala.inline
  implicit def apply(value: ListTagsForVaultOutput): OutputTypesUnion = value.asInstanceOf[OutputTypesUnion]
  @scala.inline
  implicit def apply(value: ListVaultsOutput): OutputTypesUnion = value.asInstanceOf[OutputTypesUnion]
  @scala.inline
  implicit def apply(value: PurchaseProvisionedCapacityOutput): OutputTypesUnion = value.asInstanceOf[OutputTypesUnion]
  @scala.inline
  implicit def apply(value: RemoveTagsFromVaultOutput): OutputTypesUnion = value.asInstanceOf[OutputTypesUnion]
  @scala.inline
  implicit def apply(value: SetDataRetrievalPolicyOutput): OutputTypesUnion = value.asInstanceOf[OutputTypesUnion]
  @scala.inline
  implicit def apply(value: SetVaultAccessPolicyOutput): OutputTypesUnion = value.asInstanceOf[OutputTypesUnion]
  @scala.inline
  implicit def apply(value: SetVaultNotificationsOutput): OutputTypesUnion = value.asInstanceOf[OutputTypesUnion]
  @scala.inline
  implicit def apply(value: UploadArchiveOutput): OutputTypesUnion = value.asInstanceOf[OutputTypesUnion]
  @scala.inline
  implicit def apply(value: UploadMultipartPartOutput): OutputTypesUnion = value.asInstanceOf[OutputTypesUnion]
}

