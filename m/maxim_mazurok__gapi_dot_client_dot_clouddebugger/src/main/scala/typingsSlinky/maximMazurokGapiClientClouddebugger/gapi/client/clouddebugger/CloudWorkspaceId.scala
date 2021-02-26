package typingsSlinky.maximMazurokGapiClientClouddebugger.gapi.client.clouddebugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudWorkspaceId extends StObject {
  
  /** The unique name of the workspace within the repo. This is the name chosen by the client in the Source API's CreateWorkspace method. */
  var name: js.UndefOr[String] = js.native
  
  /** The ID of the repo containing the workspace. */
  var repoId: js.UndefOr[RepoId] = js.native
}
object CloudWorkspaceId {
  
  @scala.inline
  def apply(): CloudWorkspaceId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudWorkspaceId]
  }
  
  @scala.inline
  implicit class CloudWorkspaceIdMutableBuilder[Self <: CloudWorkspaceId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRepoId(value: RepoId): Self = StObject.set(x, "repoId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepoIdUndefined: Self = StObject.set(x, "repoId", js.undefined)
  }
}
