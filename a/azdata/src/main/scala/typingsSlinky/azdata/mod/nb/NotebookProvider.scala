package typingsSlinky.azdata.mod.nb

import typingsSlinky.vscode.Thenable
import typingsSlinky.vscode.mod.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotebookProvider extends StObject {
  
  def getNotebookManager(notebookUri: Uri): Thenable[NotebookManager] = js.native
  
  def handleNotebookClosed(notebookUri: Uri): Unit = js.native
  
  val providerId: String = js.native
  
  /**
    * @deprecated standardKernels will be removed in an upcoming release. Standard kernel contribution
    * should happen via JSON for extensions. Until this is removed, notebook providers can safely return an empty array.
    */
  val standardKernels: js.Array[IStandardKernel] = js.native
}
object NotebookProvider {
  
  @scala.inline
  def apply(
    getNotebookManager: Uri => Thenable[NotebookManager],
    handleNotebookClosed: Uri => Unit,
    providerId: String,
    standardKernels: js.Array[IStandardKernel]
  ): NotebookProvider = {
    val __obj = js.Dynamic.literal(getNotebookManager = js.Any.fromFunction1(getNotebookManager), handleNotebookClosed = js.Any.fromFunction1(handleNotebookClosed), providerId = providerId.asInstanceOf[js.Any], standardKernels = standardKernels.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotebookProvider]
  }
  
  @scala.inline
  implicit class NotebookProviderMutableBuilder[Self <: NotebookProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetNotebookManager(value: Uri => Thenable[NotebookManager]): Self = StObject.set(x, "getNotebookManager", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHandleNotebookClosed(value: Uri => Unit): Self = StObject.set(x, "handleNotebookClosed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setProviderId(value: String): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardKernels(value: js.Array[IStandardKernel]): Self = StObject.set(x, "standardKernels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardKernelsVarargs(value: IStandardKernel*): Self = StObject.set(x, "standardKernels", js.Array(value :_*))
  }
}
