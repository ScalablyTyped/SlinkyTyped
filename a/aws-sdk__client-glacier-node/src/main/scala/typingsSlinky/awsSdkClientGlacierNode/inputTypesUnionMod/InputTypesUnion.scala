package typingsSlinky.awsSdkClientGlacierNode.inputTypesUnionMod

import typingsSlinky.awsSdkClientGlacierNode.typesAbortMultipartUploadInputMod.AbortMultipartUploadInput
import typingsSlinky.awsSdkClientGlacierNode.typesAbortVaultLockInputMod.AbortVaultLockInput
import typingsSlinky.awsSdkClientGlacierNode.typesAddTagsToVaultInputMod.AddTagsToVaultInput
import typingsSlinky.awsSdkClientGlacierNode.typesCompleteMultipartUploadInputMod.CompleteMultipartUploadInput
import typingsSlinky.awsSdkClientGlacierNode.typesCompleteVaultLockInputMod.CompleteVaultLockInput
import typingsSlinky.awsSdkClientGlacierNode.typesCreateVaultInputMod.CreateVaultInput
import typingsSlinky.awsSdkClientGlacierNode.typesDeleteArchiveInputMod.DeleteArchiveInput
import typingsSlinky.awsSdkClientGlacierNode.typesDeleteVaultAccessPolicyInputMod.DeleteVaultAccessPolicyInput
import typingsSlinky.awsSdkClientGlacierNode.typesDeleteVaultInputMod.DeleteVaultInput
import typingsSlinky.awsSdkClientGlacierNode.typesDeleteVaultNotificationsInputMod.DeleteVaultNotificationsInput
import typingsSlinky.awsSdkClientGlacierNode.typesDescribeJobInputMod.DescribeJobInput
import typingsSlinky.awsSdkClientGlacierNode.typesDescribeVaultInputMod.DescribeVaultInput
import typingsSlinky.awsSdkClientGlacierNode.typesGetDataRetrievalPolicyInputMod.GetDataRetrievalPolicyInput
import typingsSlinky.awsSdkClientGlacierNode.typesGetJobOutputInputMod.GetJobOutputInput
import typingsSlinky.awsSdkClientGlacierNode.typesGetVaultAccessPolicyInputMod.GetVaultAccessPolicyInput
import typingsSlinky.awsSdkClientGlacierNode.typesGetVaultLockInputMod.GetVaultLockInput
import typingsSlinky.awsSdkClientGlacierNode.typesGetVaultNotificationsInputMod.GetVaultNotificationsInput
import typingsSlinky.awsSdkClientGlacierNode.typesInitiateJobInputMod.InitiateJobInput
import typingsSlinky.awsSdkClientGlacierNode.typesInitiateMultipartUploadInputMod.InitiateMultipartUploadInput
import typingsSlinky.awsSdkClientGlacierNode.typesInitiateVaultLockInputMod.InitiateVaultLockInput
import typingsSlinky.awsSdkClientGlacierNode.typesListJobsInputMod.ListJobsInput
import typingsSlinky.awsSdkClientGlacierNode.typesListMultipartUploadsInputMod.ListMultipartUploadsInput
import typingsSlinky.awsSdkClientGlacierNode.typesListPartsInputMod.ListPartsInput
import typingsSlinky.awsSdkClientGlacierNode.typesListProvisionedCapacityInputMod.ListProvisionedCapacityInput
import typingsSlinky.awsSdkClientGlacierNode.typesListTagsForVaultInputMod.ListTagsForVaultInput
import typingsSlinky.awsSdkClientGlacierNode.typesListVaultsInputMod.ListVaultsInput
import typingsSlinky.awsSdkClientGlacierNode.typesPurchaseProvisionedCapacityInputMod.PurchaseProvisionedCapacityInput
import typingsSlinky.awsSdkClientGlacierNode.typesRemoveTagsFromVaultInputMod.RemoveTagsFromVaultInput
import typingsSlinky.awsSdkClientGlacierNode.typesSetDataRetrievalPolicyInputMod.SetDataRetrievalPolicyInput
import typingsSlinky.awsSdkClientGlacierNode.typesSetVaultAccessPolicyInputMod.SetVaultAccessPolicyInput
import typingsSlinky.awsSdkClientGlacierNode.typesSetVaultNotificationsInputMod.SetVaultNotificationsInput
import typingsSlinky.awsSdkClientGlacierNode.typesUploadArchiveInputMod.UploadArchiveInput
import typingsSlinky.awsSdkClientGlacierNode.typesUploadMultipartPartInputMod.UploadMultipartPartInput
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait InputTypesUnion extends js.Object

object InputTypesUnion {
  @scala.inline
  implicit def apply(value: AbortMultipartUploadInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: AbortVaultLockInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: AddTagsToVaultInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: CompleteMultipartUploadInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: CompleteVaultLockInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: CreateVaultInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: DeleteArchiveInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: DeleteVaultAccessPolicyInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: DeleteVaultInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: DeleteVaultNotificationsInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: DescribeJobInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: DescribeVaultInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: GetDataRetrievalPolicyInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: GetJobOutputInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: GetVaultAccessPolicyInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: GetVaultLockInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: GetVaultNotificationsInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: InitiateJobInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: InitiateMultipartUploadInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: InitiateVaultLockInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: ListJobsInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: ListMultipartUploadsInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: ListPartsInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: ListProvisionedCapacityInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: ListTagsForVaultInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: ListVaultsInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: PurchaseProvisionedCapacityInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: RemoveTagsFromVaultInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: SetDataRetrievalPolicyInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: SetVaultAccessPolicyInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: SetVaultNotificationsInput): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: UploadArchiveInput[Readable]): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
  @scala.inline
  implicit def apply(value: UploadMultipartPartInput[Readable]): InputTypesUnion = value.asInstanceOf[InputTypesUnion]
}

