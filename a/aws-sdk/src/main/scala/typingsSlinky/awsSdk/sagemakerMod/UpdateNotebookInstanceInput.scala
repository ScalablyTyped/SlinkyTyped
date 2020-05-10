package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateNotebookInstanceInput extends js.Object {
  /**
    * A list of the Elastic Inference (EI) instance types to associate with this notebook instance. Currently only one EI instance type can be associated with a notebook instance. For more information, see Using Elastic Inference in Amazon SageMaker.
    */
  var AcceleratorTypes: js.UndefOr[NotebookInstanceAcceleratorTypes] = js.native
  /**
    * An array of up to three Git repositories to associate with the notebook instance. These can be either the names of Git repositories stored as resources in your account, or the URL of Git repositories in AWS CodeCommit or in any other Git repository. These repositories are cloned at the same level as the default repository of your notebook instance. For more information, see Associating Git Repositories with Amazon SageMaker Notebook Instances.
    */
  var AdditionalCodeRepositories: js.UndefOr[AdditionalCodeRepositoryNamesOrUrls] = js.native
  /**
    * The Git repository to associate with the notebook instance as its default code repository. This can be either the name of a Git repository stored as a resource in your account, or the URL of a Git repository in AWS CodeCommit or in any other Git repository. When you open a notebook instance, it opens in the directory that contains this repository. For more information, see Associating Git Repositories with Amazon SageMaker Notebook Instances.
    */
  var DefaultCodeRepository: js.UndefOr[CodeRepositoryNameOrUrl] = js.native
  /**
    * A list of the Elastic Inference (EI) instance types to remove from this notebook instance. This operation is idempotent. If you specify an accelerator type that is not associated with the notebook instance when you call this method, it does not throw an error.
    */
  var DisassociateAcceleratorTypes: js.UndefOr[DisassociateNotebookInstanceAcceleratorTypes] = js.native
  /**
    * A list of names or URLs of the default Git repositories to remove from this notebook instance. This operation is idempotent. If you specify a Git repository that is not associated with the notebook instance when you call this method, it does not throw an error.
    */
  var DisassociateAdditionalCodeRepositories: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.DisassociateAdditionalCodeRepositories] = js.native
  /**
    * The name or URL of the default Git repository to remove from this notebook instance. This operation is idempotent. If you specify a Git repository that is not associated with the notebook instance when you call this method, it does not throw an error.
    */
  var DisassociateDefaultCodeRepository: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.DisassociateDefaultCodeRepository] = js.native
  /**
    * Set to true to remove the notebook instance lifecycle configuration currently associated with the notebook instance. This operation is idempotent. If you specify a lifecycle configuration that is not associated with the notebook instance when you call this method, it does not throw an error.
    */
  var DisassociateLifecycleConfig: js.UndefOr[DisassociateNotebookInstanceLifecycleConfig] = js.native
  /**
    * The Amazon ML compute instance type.
    */
  var InstanceType: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.InstanceType] = js.native
  /**
    * The name of a lifecycle configuration to associate with the notebook instance. For information about lifestyle configurations, see Step 2.1: (Optional) Customize a Notebook Instance.
    */
  var LifecycleConfigName: js.UndefOr[NotebookInstanceLifecycleConfigName] = js.native
  /**
    * The name of the notebook instance to update.
    */
  var NotebookInstanceName: typingsSlinky.awsSdk.sagemakerMod.NotebookInstanceName = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker can assume to access the notebook instance. For more information, see Amazon SageMaker Roles.   To be able to pass this role to Amazon SageMaker, the caller of this API must have the iam:PassRole permission. 
    */
  var RoleArn: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.RoleArn] = js.native
  /**
    * Whether root access is enabled or disabled for users of the notebook instance. The default value is Enabled.  If you set this to Disabled, users don't have root access on the notebook instance, but lifecycle configuration scripts still run with root permissions. 
    */
  var RootAccess: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.RootAccess] = js.native
  /**
    * The size, in GB, of the ML storage volume to attach to the notebook instance. The default value is 5 GB. ML storage volumes are encrypted, so Amazon SageMaker can't determine the amount of available free space on the volume. Because of this, you can increase the volume size when you update a notebook instance, but you can't decrease the volume size. If you want to decrease the size of the ML storage volume in use, create a new notebook instance with the desired size.
    */
  var VolumeSizeInGB: js.UndefOr[NotebookInstanceVolumeSizeInGB] = js.native
}

object UpdateNotebookInstanceInput {
  @scala.inline
  def apply(NotebookInstanceName: NotebookInstanceName): UpdateNotebookInstanceInput = {
    val __obj = js.Dynamic.literal(NotebookInstanceName = NotebookInstanceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateNotebookInstanceInput]
  }
  @scala.inline
  implicit class UpdateNotebookInstanceInputOps[Self <: UpdateNotebookInstanceInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotebookInstanceName(value: NotebookInstanceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotebookInstanceName")(value.asInstanceOf[js.Any])
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
    def withDisassociateAcceleratorTypes(value: DisassociateNotebookInstanceAcceleratorTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisassociateAcceleratorTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisassociateAcceleratorTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisassociateAcceleratorTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withDisassociateAdditionalCodeRepositories(value: DisassociateAdditionalCodeRepositories): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisassociateAdditionalCodeRepositories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisassociateAdditionalCodeRepositories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisassociateAdditionalCodeRepositories")(js.undefined)
        ret
    }
    @scala.inline
    def withDisassociateDefaultCodeRepository(value: DisassociateDefaultCodeRepository): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisassociateDefaultCodeRepository")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisassociateDefaultCodeRepository: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisassociateDefaultCodeRepository")(js.undefined)
        ret
    }
    @scala.inline
    def withDisassociateLifecycleConfig(value: DisassociateNotebookInstanceLifecycleConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisassociateLifecycleConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisassociateLifecycleConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisassociateLifecycleConfig")(js.undefined)
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

