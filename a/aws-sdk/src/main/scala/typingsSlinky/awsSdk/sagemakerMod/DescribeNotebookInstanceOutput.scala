package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeNotebookInstanceOutput extends StObject {
  
  /**
    * A list of the Elastic Inference (EI) instance types associated with this notebook instance. Currently only one EI instance type can be associated with a notebook instance. For more information, see Using Elastic Inference in Amazon SageMaker.
    */
  var AcceleratorTypes: js.UndefOr[NotebookInstanceAcceleratorTypes] = js.native
  
  /**
    * An array of up to three Git repositories associated with the notebook instance. These can be either the names of Git repositories stored as resources in your account, or the URL of Git repositories in AWS CodeCommit or in any other Git repository. These repositories are cloned at the same level as the default repository of your notebook instance. For more information, see Associating Git Repositories with Amazon SageMaker Notebook Instances.
    */
  var AdditionalCodeRepositories: js.UndefOr[AdditionalCodeRepositoryNamesOrUrls] = js.native
  
  /**
    * A timestamp. Use this parameter to return the time when the notebook instance was created
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The Git repository associated with the notebook instance as its default code repository. This can be either the name of a Git repository stored as a resource in your account, or the URL of a Git repository in AWS CodeCommit or in any other Git repository. When you open a notebook instance, it opens in the directory that contains this repository. For more information, see Associating Git Repositories with Amazon SageMaker Notebook Instances.
    */
  var DefaultCodeRepository: js.UndefOr[CodeRepositoryNameOrUrl] = js.native
  
  /**
    * Describes whether Amazon SageMaker provides internet access to the notebook instance. If this value is set to Disabled, the notebook instance does not have internet access, and cannot connect to Amazon SageMaker training and endpoint services. For more information, see Notebook Instances Are Internet-Enabled by Default.
    */
  var DirectInternetAccess: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.DirectInternetAccess] = js.native
  
  /**
    * If status is Failed, the reason it failed.
    */
  var FailureReason: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.FailureReason] = js.native
  
  /**
    * The type of ML compute instance running on the notebook instance.
    */
  var InstanceType: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.InstanceType] = js.native
  
  /**
    * The AWS KMS key ID Amazon SageMaker uses to encrypt data when storing it on the ML storage volume attached to the instance. 
    */
  var KmsKeyId: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.KmsKeyId] = js.native
  
  /**
    * A timestamp. Use this parameter to retrieve the time when the notebook instance was last modified. 
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The network interface IDs that Amazon SageMaker created at the time of creating the instance. 
    */
  var NetworkInterfaceId: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.NetworkInterfaceId] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the notebook instance.
    */
  var NotebookInstanceArn: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.NotebookInstanceArn] = js.native
  
  /**
    * Returns the name of a notebook instance lifecycle configuration. For information about notebook instance lifestyle configurations, see Step 2.1: (Optional) Customize a Notebook Instance 
    */
  var NotebookInstanceLifecycleConfigName: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.NotebookInstanceLifecycleConfigName] = js.native
  
  /**
    * The name of the Amazon SageMaker notebook instance. 
    */
  var NotebookInstanceName: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.NotebookInstanceName] = js.native
  
  /**
    * The status of the notebook instance.
    */
  var NotebookInstanceStatus: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.NotebookInstanceStatus] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role associated with the instance. 
    */
  var RoleArn: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.RoleArn] = js.native
  
  /**
    * Whether root access is enabled or disabled for users of the notebook instance.  Lifecycle configurations need root access to be able to set up a notebook instance. Because of this, lifecycle configurations associated with a notebook instance always run with root access even if you disable root access for users. 
    */
  var RootAccess: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.RootAccess] = js.native
  
  /**
    * The IDs of the VPC security groups.
    */
  var SecurityGroups: js.UndefOr[SecurityGroupIds] = js.native
  
  /**
    * The ID of the VPC subnet.
    */
  var SubnetId: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.SubnetId] = js.native
  
  /**
    * The URL that you use to connect to the Jupyter notebook that is running in your notebook instance. 
    */
  var Url: js.UndefOr[NotebookInstanceUrl] = js.native
  
  /**
    * The size, in GB, of the ML storage volume attached to the notebook instance.
    */
  var VolumeSizeInGB: js.UndefOr[NotebookInstanceVolumeSizeInGB] = js.native
}
object DescribeNotebookInstanceOutput {
  
  @scala.inline
  def apply(): DescribeNotebookInstanceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeNotebookInstanceOutput]
  }
  
  @scala.inline
  implicit class DescribeNotebookInstanceOutputMutableBuilder[Self <: DescribeNotebookInstanceOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceleratorTypes(value: NotebookInstanceAcceleratorTypes): Self = StObject.set(x, "AcceleratorTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceleratorTypesUndefined: Self = StObject.set(x, "AcceleratorTypes", js.undefined)
    
    @scala.inline
    def setAcceleratorTypesVarargs(value: NotebookInstanceAcceleratorType*): Self = StObject.set(x, "AcceleratorTypes", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalCodeRepositories(value: AdditionalCodeRepositoryNamesOrUrls): Self = StObject.set(x, "AdditionalCodeRepositories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalCodeRepositoriesUndefined: Self = StObject.set(x, "AdditionalCodeRepositories", js.undefined)
    
    @scala.inline
    def setAdditionalCodeRepositoriesVarargs(value: CodeRepositoryNameOrUrl*): Self = StObject.set(x, "AdditionalCodeRepositories", js.Array(value :_*))
    
    @scala.inline
    def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setDefaultCodeRepository(value: CodeRepositoryNameOrUrl): Self = StObject.set(x, "DefaultCodeRepository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultCodeRepositoryUndefined: Self = StObject.set(x, "DefaultCodeRepository", js.undefined)
    
    @scala.inline
    def setDirectInternetAccess(value: DirectInternetAccess): Self = StObject.set(x, "DirectInternetAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectInternetAccessUndefined: Self = StObject.set(x, "DirectInternetAccess", js.undefined)
    
    @scala.inline
    def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    @scala.inline
    def setInstanceType(value: InstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    @scala.inline
    def setNetworkInterfaceId(value: NetworkInterfaceId): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "NetworkInterfaceId", js.undefined)
    
    @scala.inline
    def setNotebookInstanceArn(value: NotebookInstanceArn): Self = StObject.set(x, "NotebookInstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotebookInstanceArnUndefined: Self = StObject.set(x, "NotebookInstanceArn", js.undefined)
    
    @scala.inline
    def setNotebookInstanceLifecycleConfigName(value: NotebookInstanceLifecycleConfigName): Self = StObject.set(x, "NotebookInstanceLifecycleConfigName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotebookInstanceLifecycleConfigNameUndefined: Self = StObject.set(x, "NotebookInstanceLifecycleConfigName", js.undefined)
    
    @scala.inline
    def setNotebookInstanceName(value: NotebookInstanceName): Self = StObject.set(x, "NotebookInstanceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotebookInstanceNameUndefined: Self = StObject.set(x, "NotebookInstanceName", js.undefined)
    
    @scala.inline
    def setNotebookInstanceStatus(value: NotebookInstanceStatus): Self = StObject.set(x, "NotebookInstanceStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotebookInstanceStatusUndefined: Self = StObject.set(x, "NotebookInstanceStatus", js.undefined)
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    @scala.inline
    def setRootAccess(value: RootAccess): Self = StObject.set(x, "RootAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootAccessUndefined: Self = StObject.set(x, "RootAccess", js.undefined)
    
    @scala.inline
    def setSecurityGroups(value: SecurityGroupIds): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupsUndefined: Self = StObject.set(x, "SecurityGroups", js.undefined)
    
    @scala.inline
    def setSecurityGroupsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "SecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setSubnetId(value: SubnetId): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
    
    @scala.inline
    def setUrl(value: NotebookInstanceUrl): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
    
    @scala.inline
    def setVolumeSizeInGB(value: NotebookInstanceVolumeSizeInGB): Self = StObject.set(x, "VolumeSizeInGB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeSizeInGBUndefined: Self = StObject.set(x, "VolumeSizeInGB", js.undefined)
  }
}
