package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotebookInstanceSummary extends js.Object {
  /**
    * An array of up to three Git repositories associated with the notebook instance. These can be either the names of Git repositories stored as resources in your account, or the URL of Git repositories in AWS CodeCommit or in any other Git repository. These repositories are cloned at the same level as the default repository of your notebook instance. For more information, see Associating Git Repositories with Amazon SageMaker Notebook Instances.
    */
  var AdditionalCodeRepositories: js.UndefOr[AdditionalCodeRepositoryNamesOrUrls] = js.native
  /**
    * A timestamp that shows when the notebook instance was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  /**
    * The Git repository associated with the notebook instance as its default code repository. This can be either the name of a Git repository stored as a resource in your account, or the URL of a Git repository in AWS CodeCommit or in any other Git repository. When you open a notebook instance, it opens in the directory that contains this repository. For more information, see Associating Git Repositories with Amazon SageMaker Notebook Instances.
    */
  var DefaultCodeRepository: js.UndefOr[CodeRepositoryNameOrUrl] = js.native
  /**
    * The type of ML compute instance that the notebook instance is running on.
    */
  var InstanceType: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.InstanceType] = js.native
  /**
    * A timestamp that shows when the notebook instance was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.native
  /**
    * The Amazon Resource Name (ARN) of the notebook instance.
    */
  var NotebookInstanceArn: typingsSlinky.awsSdk.sagemakerMod.NotebookInstanceArn = js.native
  /**
    * The name of a notebook instance lifecycle configuration associated with this notebook instance. For information about notebook instance lifestyle configurations, see Step 2.1: (Optional) Customize a Notebook Instance.
    */
  var NotebookInstanceLifecycleConfigName: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.NotebookInstanceLifecycleConfigName] = js.native
  /**
    * The name of the notebook instance that you want a summary for.
    */
  var NotebookInstanceName: typingsSlinky.awsSdk.sagemakerMod.NotebookInstanceName = js.native
  /**
    * The status of the notebook instance.
    */
  var NotebookInstanceStatus: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.NotebookInstanceStatus] = js.native
  /**
    * The URL that you use to connect to the Jupyter instance running in your notebook instance. 
    */
  var Url: js.UndefOr[NotebookInstanceUrl] = js.native
}

object NotebookInstanceSummary {
  @scala.inline
  def apply(NotebookInstanceArn: NotebookInstanceArn, NotebookInstanceName: NotebookInstanceName): NotebookInstanceSummary = {
    val __obj = js.Dynamic.literal(NotebookInstanceArn = NotebookInstanceArn.asInstanceOf[js.Any], NotebookInstanceName = NotebookInstanceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotebookInstanceSummary]
  }
  @scala.inline
  implicit class NotebookInstanceSummaryOps[Self <: NotebookInstanceSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotebookInstanceArn(value: NotebookInstanceArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotebookInstanceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotebookInstanceName(value: NotebookInstanceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotebookInstanceName")(value.asInstanceOf[js.Any])
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
  }
  
}

