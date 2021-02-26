package typingsSlinky.awsSdkClientGlacierNode

import typingsSlinky.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierConfiguration
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/client-glacier-node", "AbortMultipartUploadCommand")
  @js.native
  class AbortMultipartUploadCommand protected ()
    extends typingsSlinky.awsSdkClientGlacierNode.abortMultipartUploadCommandMod.AbortMultipartUploadCommand {
    def this(input: AbortMultipartUploadInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "AbortVaultLockCommand")
  @js.native
  class AbortVaultLockCommand protected ()
    extends typingsSlinky.awsSdkClientGlacierNode.abortVaultLockCommandMod.AbortVaultLockCommand {
    def this(input: AbortVaultLockInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "AddTagsToVaultCommand")
  @js.native
  class AddTagsToVaultCommand protected ()
    extends typingsSlinky.awsSdkClientGlacierNode.addTagsToVaultCommandMod.AddTagsToVaultCommand {
    def this(input: AddTagsToVaultInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "CompleteMultipartUploadCommand")
  @js.native
  class CompleteMultipartUploadCommand protected ()
    extends typingsSlinky.awsSdkClientGlacierNode.completeMultipartUploadCommandMod.CompleteMultipartUploadCommand {
    def this(input: CompleteMultipartUploadInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "CompleteVaultLockCommand")
  @js.native
  class CompleteVaultLockCommand protected ()
    extends typingsSlinky.awsSdkClientGlacierNode.completeVaultLockCommandMod.CompleteVaultLockCommand {
    def this(input: CompleteVaultLockInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "CreateVaultCommand")
  @js.native
  class CreateVaultCommand protected ()
    extends typingsSlinky.awsSdkClientGlacierNode.createVaultCommandMod.CreateVaultCommand {
    def this(input: CreateVaultInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "DeleteArchiveCommand")
  @js.native
  class DeleteArchiveCommand protected ()
    extends typingsSlinky.awsSdkClientGlacierNode.deleteArchiveCommandMod.DeleteArchiveCommand {
    def this(input: DeleteArchiveInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "DeleteVaultAccessPolicyCommand")
  @js.native
  class DeleteVaultAccessPolicyCommand protected ()
    extends typingsSlinky.awsSdkClientGlacierNode.deleteVaultAccessPolicyCommandMod.DeleteVaultAccessPolicyCommand {
    def this(input: DeleteVaultAccessPolicyInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "DeleteVaultCommand")
  @js.native
  class DeleteVaultCommand protected ()
    extends typingsSlinky.awsSdkClientGlacierNode.deleteVaultCommandMod.DeleteVaultCommand {
    def this(input: DeleteVaultInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "DeleteVaultNotificationsCommand")
  @js.native
  class DeleteVaultNotificationsCommand protected ()
    extends typingsSlinky.awsSdkClientGlacierNode.deleteVaultNotificationsCommandMod.DeleteVaultNotificationsCommand {
    def this(input: DeleteVaultNotificationsInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "DescribeJobCommand")
  @js.native
  class DescribeJobCommand protected ()
    extends typingsSlinky.awsSdkClientGlacierNode.describeJobCommandMod.DescribeJobCommand {
    def this(input: DescribeJobInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "DescribeVaultCommand")
  @js.native
  class DescribeVaultCommand protected ()
    extends typingsSlinky.awsSdkClientGlacierNode.describeVaultCommandMod.DescribeVaultCommand {
    def this(input: DescribeVaultInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "GetDataRetrievalPolicyCommand")
  @js.native
  class GetDataRetrievalPolicyCommand protected ()
    extends typingsSlinky.awsSdkClientGlacierNode.getDataRetrievalPolicyCommandMod.GetDataRetrievalPolicyCommand {
    def this(input: GetDataRetrievalPolicyInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "GetJobOutputCommand")
  @js.native
  class GetJobOutputCommand protected ()
    extends typingsSlinky.awsSdkClientGlacierNode.getJobOutputCommandMod.GetJobOutputCommand {
    def this(input: GetJobOutputInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "GetVaultAccessPolicyCommand")
  @js.native
  class GetVaultAccessPolicyCommand protected ()
    extends typingsSlinky.awsSdkClientGlacierNode.getVaultAccessPolicyCommandMod.GetVaultAccessPolicyCommand {
    def this(input: GetVaultAccessPolicyInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "GetVaultLockCommand")
  @js.native
  class GetVaultLockCommand protected ()
    extends typingsSlinky.awsSdkClientGlacierNode.getVaultLockCommandMod.GetVaultLockCommand {
    def this(input: GetVaultLockInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "GetVaultNotificationsCommand")
  @js.native
  class GetVaultNotificationsCommand protected ()
    extends typingsSlinky.awsSdkClientGlacierNode.getVaultNotificationsCommandMod.GetVaultNotificationsCommand {
    def this(input: GetVaultNotificationsInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "Glacier")
  @js.native
  class Glacier protected ()
    extends typingsSlinky.awsSdkClientGlacierNode.glacierMod.Glacier {
    def this(configuration: GlacierConfiguration) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "GlacierClient")
  @js.native
  class GlacierClient protected ()
    extends typingsSlinky.awsSdkClientGlacierNode.glacierClientMod.GlacierClient {
    def this(configuration: GlacierConfiguration) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "InitiateJobCommand")
  @js.native
  class InitiateJobCommand protected ()
    extends typingsSlinky.awsSdkClientGlacierNode.initiateJobCommandMod.InitiateJobCommand {
    def this(input: InitiateJobInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "InitiateMultipartUploadCommand")
  @js.native
  class InitiateMultipartUploadCommand protected ()
    extends typingsSlinky.awsSdkClientGlacierNode.initiateMultipartUploadCommandMod.InitiateMultipartUploadCommand {
    def this(input: InitiateMultipartUploadInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "InitiateVaultLockCommand")
  @js.native
  class InitiateVaultLockCommand protected ()
    extends typingsSlinky.awsSdkClientGlacierNode.initiateVaultLockCommandMod.InitiateVaultLockCommand {
    def this(input: InitiateVaultLockInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "ListJobsCommand")
  @js.native
  class ListJobsCommand protected ()
    extends typingsSlinky.awsSdkClientGlacierNode.listJobsCommandMod.ListJobsCommand {
    def this(input: ListJobsInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "ListMultipartUploadsCommand")
  @js.native
  class ListMultipartUploadsCommand protected ()
    extends typingsSlinky.awsSdkClientGlacierNode.listMultipartUploadsCommandMod.ListMultipartUploadsCommand {
    def this(input: ListMultipartUploadsInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "ListPartsCommand")
  @js.native
  class ListPartsCommand protected ()
    extends typingsSlinky.awsSdkClientGlacierNode.listPartsCommandMod.ListPartsCommand {
    def this(input: ListPartsInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "ListProvisionedCapacityCommand")
  @js.native
  class ListProvisionedCapacityCommand protected ()
    extends typingsSlinky.awsSdkClientGlacierNode.listProvisionedCapacityCommandMod.ListProvisionedCapacityCommand {
    def this(input: ListProvisionedCapacityInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "ListTagsForVaultCommand")
  @js.native
  class ListTagsForVaultCommand protected ()
    extends typingsSlinky.awsSdkClientGlacierNode.listTagsForVaultCommandMod.ListTagsForVaultCommand {
    def this(input: ListTagsForVaultInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "ListVaultsCommand")
  @js.native
  class ListVaultsCommand protected ()
    extends typingsSlinky.awsSdkClientGlacierNode.listVaultsCommandMod.ListVaultsCommand {
    def this(input: ListVaultsInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "PurchaseProvisionedCapacityCommand")
  @js.native
  class PurchaseProvisionedCapacityCommand protected ()
    extends typingsSlinky.awsSdkClientGlacierNode.purchaseProvisionedCapacityCommandMod.PurchaseProvisionedCapacityCommand {
    def this(input: PurchaseProvisionedCapacityInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "RemoveTagsFromVaultCommand")
  @js.native
  class RemoveTagsFromVaultCommand protected ()
    extends typingsSlinky.awsSdkClientGlacierNode.removeTagsFromVaultCommandMod.RemoveTagsFromVaultCommand {
    def this(input: RemoveTagsFromVaultInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "SetDataRetrievalPolicyCommand")
  @js.native
  class SetDataRetrievalPolicyCommand protected ()
    extends typingsSlinky.awsSdkClientGlacierNode.setDataRetrievalPolicyCommandMod.SetDataRetrievalPolicyCommand {
    def this(input: SetDataRetrievalPolicyInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "SetVaultAccessPolicyCommand")
  @js.native
  class SetVaultAccessPolicyCommand protected ()
    extends typingsSlinky.awsSdkClientGlacierNode.setVaultAccessPolicyCommandMod.SetVaultAccessPolicyCommand {
    def this(input: SetVaultAccessPolicyInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "SetVaultNotificationsCommand")
  @js.native
  class SetVaultNotificationsCommand protected ()
    extends typingsSlinky.awsSdkClientGlacierNode.setVaultNotificationsCommandMod.SetVaultNotificationsCommand {
    def this(input: SetVaultNotificationsInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "UploadArchiveCommand")
  @js.native
  class UploadArchiveCommand protected ()
    extends typingsSlinky.awsSdkClientGlacierNode.uploadArchiveCommandMod.UploadArchiveCommand {
    def this(input: UploadArchiveInput[Readable]) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "UploadMultipartPartCommand")
  @js.native
  class UploadMultipartPartCommand protected ()
    extends typingsSlinky.awsSdkClientGlacierNode.uploadMultipartPartCommandMod.UploadMultipartPartCommand {
    def this(input: UploadMultipartPartInput[Readable]) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "configurationProperties")
  @js.native
  val configurationProperties: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.ConfigurationDefinition<GlacierResolvableConfiguration, GlacierResolvedConfiguration> */ js.Any = js.native
}
