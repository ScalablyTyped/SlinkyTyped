package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotebookInstanceLifecycleConfigSummary extends StObject {
  
  /**
    * A timestamp that tells when the lifecycle configuration was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  
  /**
    * A timestamp that tells when the lifecycle configuration was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the lifecycle configuration.
    */
  var NotebookInstanceLifecycleConfigArn: typingsSlinky.awsSdk.sagemakerMod.NotebookInstanceLifecycleConfigArn = js.native
  
  /**
    * The name of the lifecycle configuration.
    */
  var NotebookInstanceLifecycleConfigName: typingsSlinky.awsSdk.sagemakerMod.NotebookInstanceLifecycleConfigName = js.native
}
object NotebookInstanceLifecycleConfigSummary {
  
  @scala.inline
  def apply(
    NotebookInstanceLifecycleConfigArn: NotebookInstanceLifecycleConfigArn,
    NotebookInstanceLifecycleConfigName: NotebookInstanceLifecycleConfigName
  ): NotebookInstanceLifecycleConfigSummary = {
    val __obj = js.Dynamic.literal(NotebookInstanceLifecycleConfigArn = NotebookInstanceLifecycleConfigArn.asInstanceOf[js.Any], NotebookInstanceLifecycleConfigName = NotebookInstanceLifecycleConfigName.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotebookInstanceLifecycleConfigSummary]
  }
  
  @scala.inline
  implicit class NotebookInstanceLifecycleConfigSummaryMutableBuilder[Self <: NotebookInstanceLifecycleConfigSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    @scala.inline
    def setNotebookInstanceLifecycleConfigArn(value: NotebookInstanceLifecycleConfigArn): Self = StObject.set(x, "NotebookInstanceLifecycleConfigArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotebookInstanceLifecycleConfigName(value: NotebookInstanceLifecycleConfigName): Self = StObject.set(x, "NotebookInstanceLifecycleConfigName", value.asInstanceOf[js.Any])
  }
}
