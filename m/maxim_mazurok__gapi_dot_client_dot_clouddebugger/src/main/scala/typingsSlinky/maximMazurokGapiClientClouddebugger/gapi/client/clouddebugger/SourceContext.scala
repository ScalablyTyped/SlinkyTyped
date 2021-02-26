package typingsSlinky.maximMazurokGapiClientClouddebugger.gapi.client.clouddebugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceContext extends StObject {
  
  /** A SourceContext referring to a revision in a cloud repo. */
  var cloudRepo: js.UndefOr[CloudRepoSourceContext] = js.native
  
  /** A SourceContext referring to a snapshot in a cloud workspace. */
  var cloudWorkspace: js.UndefOr[CloudWorkspaceSourceContext] = js.native
  
  /** A SourceContext referring to a Gerrit project. */
  var gerrit: js.UndefOr[GerritSourceContext] = js.native
  
  /** A SourceContext referring to any third party Git repo (e.g. GitHub). */
  var git: js.UndefOr[GitSourceContext] = js.native
}
object SourceContext {
  
  @scala.inline
  def apply(): SourceContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceContext]
  }
  
  @scala.inline
  implicit class SourceContextMutableBuilder[Self <: SourceContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudRepo(value: CloudRepoSourceContext): Self = StObject.set(x, "cloudRepo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudRepoUndefined: Self = StObject.set(x, "cloudRepo", js.undefined)
    
    @scala.inline
    def setCloudWorkspace(value: CloudWorkspaceSourceContext): Self = StObject.set(x, "cloudWorkspace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudWorkspaceUndefined: Self = StObject.set(x, "cloudWorkspace", js.undefined)
    
    @scala.inline
    def setGerrit(value: GerritSourceContext): Self = StObject.set(x, "gerrit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGerritUndefined: Self = StObject.set(x, "gerrit", js.undefined)
    
    @scala.inline
    def setGit(value: GitSourceContext): Self = StObject.set(x, "git", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGitUndefined: Self = StObject.set(x, "git", js.undefined)
  }
}
