package typingsSlinky.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuickPreviewResponse extends StObject {
  
  /** Were there compiler errors or not. */
  var compilerError: js.UndefOr[Boolean] = js.native
  
  /** The quick previewed container version. */
  var containerVersion: js.UndefOr[ContainerVersion] = js.native
  
  /** Whether quick previewing failed when syncing the workspace to the latest container version. */
  var syncStatus: js.UndefOr[SyncStatus] = js.native
}
object QuickPreviewResponse {
  
  @scala.inline
  def apply(): QuickPreviewResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuickPreviewResponse]
  }
  
  @scala.inline
  implicit class QuickPreviewResponseMutableBuilder[Self <: QuickPreviewResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompilerError(value: Boolean): Self = StObject.set(x, "compilerError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompilerErrorUndefined: Self = StObject.set(x, "compilerError", js.undefined)
    
    @scala.inline
    def setContainerVersion(value: ContainerVersion): Self = StObject.set(x, "containerVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerVersionUndefined: Self = StObject.set(x, "containerVersion", js.undefined)
    
    @scala.inline
    def setSyncStatus(value: SyncStatus): Self = StObject.set(x, "syncStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncStatusUndefined: Self = StObject.set(x, "syncStatus", js.undefined)
  }
}
