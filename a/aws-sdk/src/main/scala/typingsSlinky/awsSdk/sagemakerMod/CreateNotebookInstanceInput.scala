package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateNotebookInstanceInput extends js.Object {
  /**
    * A list of Elastic Inference (EI) instance types to associate with this notebook instance. Currently, only one instance type can be associated with a notebook instance. For more information, see Using Elastic Inference in Amazon SageMaker.
    */
  var AcceleratorTypes: js.UndefOr[NotebookInstanceAcceleratorTypes] = js.native
  /**
    * An array of up to three Git repositories to associate with the notebook instance. These can be either the names of Git repositories stored as resources in your account, or the URL of Git repositories in AWS CodeCommit or in any other Git repository. These repositories are cloned at the same level as the default repository of your notebook instance. For more information, see Associating Git Repositories with Amazon SageMaker Notebook Instances.
    */
  var AdditionalCodeRepositories: js.UndefOr[AdditionalCodeRepositoryNamesOrUrls] = js.native
  /**
    * A Git repository to associate with the notebook instance as its default code repository. This can be either the name of a Git repository stored as a resource in your account, or the URL of a Git repository in AWS CodeCommit or in any other Git repository. When you open a notebook instance, it opens in the directory that contains this repository. For more information, see Associating Git Repositories with Amazon SageMaker Notebook Instances.
    */
  var DefaultCodeRepository: js.UndefOr[CodeRepositoryNameOrUrl] = js.native
  /**
    * Sets whether Amazon SageMaker provides internet access to the notebook instance. If you set this to Disabled this notebook instance will be able to access resources only in your VPC, and will not be able to connect to Amazon SageMaker training and endpoint services unless your configure a NAT Gateway in your VPC. For more information, see Notebook Instances Are Internet-Enabled by Default. You can set the value of this parameter to Disabled only if you set a value for the SubnetId parameter.
    */
  var DirectInternetAccess: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.DirectInternetAccess] = js.native
  /**
    * The type of ML compute instance to launch for the notebook instance.
    */
  var InstanceType: typingsSlinky.awsSdk.sagemakerMod.InstanceType = js.native
  /**
    * The Amazon Resource Name (ARN) of a AWS Key Management Service key that Amazon SageMaker uses to encrypt data on the storage volume attached to your notebook instance. The KMS key you provide must be enabled. For information, see Enabling and Disabling Keys in the AWS Key Management Service Developer Guide.
    */
  var KmsKeyId: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.KmsKeyId] = js.native
  /**
    * The name of a lifecycle configuration to associate with the notebook instance. For information about lifestyle configurations, see Step 2.1: (Optional) Customize a Notebook Instance.
    */
  var LifecycleConfigName: js.UndefOr[NotebookInstanceLifecycleConfigName] = js.native
  /**
    * The name of the new notebook instance.
    */
  var NotebookInstanceName: typingsSlinky.awsSdk.sagemakerMod.NotebookInstanceName = js.native
  /**
    *  When you send any requests to AWS resources from the notebook instance, Amazon SageMaker assumes this role to perform tasks on your behalf. You must grant this role necessary permissions so Amazon SageMaker can perform these tasks. The policy must allow the Amazon SageMaker service principal (sagemaker.amazonaws.com) permissions to assume this role. For more information, see Amazon SageMaker Roles.   To be able to pass this role to Amazon SageMaker, the caller of this API must have the iam:PassRole permission. 
    */
  var RoleArn: typingsSlinky.awsSdk.sagemakerMod.RoleArn = js.native
  /**
    * Whether root access is enabled or disabled for users of the notebook instance. The default value is Enabled.  Lifecycle configurations need root access to be able to set up a notebook instance. Because of this, lifecycle configurations associated with a notebook instance always run with root access even if you disable root access for users. 
    */
  var RootAccess: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.RootAccess] = js.native
  /**
    * The VPC security group IDs, in the form sg-xxxxxxxx. The security groups must be for the same VPC as specified in the subnet. 
    */
  var SecurityGroupIds: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.SecurityGroupIds] = js.native
  /**
    * The ID of the subnet in a VPC to which you would like to have a connectivity from your ML compute instance. 
    */
  var SubnetId: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.SubnetId] = js.native
  /**
    * A list of tags to associate with the notebook instance. You can add tags later by using the CreateTags API.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The size, in GB, of the ML storage volume to attach to the notebook instance. The default value is 5 GB.
    */
  var VolumeSizeInGB: js.UndefOr[NotebookInstanceVolumeSizeInGB] = js.native
}

object CreateNotebookInstanceInput {
  @scala.inline
  def apply(InstanceType: InstanceType, NotebookInstanceName: NotebookInstanceName, RoleArn: RoleArn): CreateNotebookInstanceInput = {
    val __obj = js.Dynamic.literal(InstanceType = InstanceType.asInstanceOf[js.Any], NotebookInstanceName = NotebookInstanceName.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNotebookInstanceInput]
  }
  @scala.inline
  implicit class CreateNotebookInstanceInputOps[Self <: CreateNotebookInstanceInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceType(value: InstanceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotebookInstanceName(value: NotebookInstanceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotebookInstanceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleArn(value: RoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withLifecycleConfigName(value: NotebookInstanceLifecycleConfigName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LifecycleConfigName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLifecycleConfigName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LifecycleConfigName")(js.undefined)
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
    def withSecurityGroupIds(value: SecurityGroupIds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroupIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityGroupIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroupIds")(js.undefined)
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
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
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

