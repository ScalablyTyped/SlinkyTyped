package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotebookInstanceSummary extends StObject {
  
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
  implicit class NotebookInstanceSummaryMutableBuilder[Self <: NotebookInstanceSummary] (val x: Self) extends AnyVal {
    
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
    def setInstanceType(value: InstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    @scala.inline
    def setNotebookInstanceArn(value: NotebookInstanceArn): Self = StObject.set(x, "NotebookInstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotebookInstanceLifecycleConfigName(value: NotebookInstanceLifecycleConfigName): Self = StObject.set(x, "NotebookInstanceLifecycleConfigName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotebookInstanceLifecycleConfigNameUndefined: Self = StObject.set(x, "NotebookInstanceLifecycleConfigName", js.undefined)
    
    @scala.inline
    def setNotebookInstanceName(value: NotebookInstanceName): Self = StObject.set(x, "NotebookInstanceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotebookInstanceStatus(value: NotebookInstanceStatus): Self = StObject.set(x, "NotebookInstanceStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotebookInstanceStatusUndefined: Self = StObject.set(x, "NotebookInstanceStatus", js.undefined)
    
    @scala.inline
    def setUrl(value: NotebookInstanceUrl): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
  }
}
