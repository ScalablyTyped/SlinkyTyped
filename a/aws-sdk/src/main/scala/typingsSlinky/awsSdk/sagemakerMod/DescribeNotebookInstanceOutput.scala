package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeNotebookInstanceOutput extends js.Object {
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
  implicit class DescribeNotebookInstanceOutputOps[Self <: DescribeNotebookInstanceOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceleratorTypes(value: NotebookInstanceAcceleratorTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AcceleratorTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceleratorTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AcceleratorTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withAdditionalCodeRepositories(value: AdditionalCodeRepositoryNamesOrUrls): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdditionalCodeRepositories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalCodeRepositories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdditionalCodeRepositories")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultCodeRepository(value: CodeRepositoryNameOrUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultCodeRepository")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultCodeRepository: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultCodeRepository")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectInternetAccess(value: DirectInternetAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectInternetAccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectInternetAccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectInternetAccess")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureReason(value: FailureReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureReason")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceType(value: InstanceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(js.undefined)
        ret
    }
    @scala.inline
    def withKmsKeyId(value: KmsKeyId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKmsKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsKeyId")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkInterfaceId(value: NetworkInterfaceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkInterfaceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkInterfaceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkInterfaceId")(js.undefined)
        ret
    }
    @scala.inline
    def withNotebookInstanceArn(value: NotebookInstanceArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotebookInstanceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotebookInstanceArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotebookInstanceArn")(js.undefined)
        ret
    }
    @scala.inline
    def withNotebookInstanceLifecycleConfigName(value: NotebookInstanceLifecycleConfigName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotebookInstanceLifecycleConfigName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotebookInstanceLifecycleConfigName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotebookInstanceLifecycleConfigName")(js.undefined)
        ret
    }
    @scala.inline
    def withNotebookInstanceName(value: NotebookInstanceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotebookInstanceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotebookInstanceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotebookInstanceName")(js.undefined)
        ret
    }
    @scala.inline
    def withNotebookInstanceStatus(value: NotebookInstanceStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotebookInstanceStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotebookInstanceStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotebookInstanceStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleArn(value: RoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withRootAccess(value: RootAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RootAccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootAccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RootAccess")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityGroups(value: SecurityGroupIds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnetId(value: SubnetId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetId")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: NotebookInstanceUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Url")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumeSizeInGB(value: NotebookInstanceVolumeSizeInGB): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeSizeInGB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeSizeInGB: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeSizeInGB")(js.undefined)
        ret
    }
  }
  
}

