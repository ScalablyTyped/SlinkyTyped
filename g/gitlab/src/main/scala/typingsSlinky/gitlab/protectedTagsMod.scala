package typingsSlinky.gitlab

import typingsSlinky.gitlab.infrastructureMod.BaseService
import typingsSlinky.gitlab.requestHelperMod.BaseRequestOptions
import typingsSlinky.gitlab.requestHelperMod.GetResponse
import typingsSlinky.gitlab.requestHelperMod.PaginatedRequestOptions
import typingsSlinky.gitlab.requestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitlab/dist/types/core/services/ProtectedTags", JSImport.Namespace)
@js.native
object protectedTagsMod extends js.Object {
  
  @js.native
  class ProtectedTags () extends BaseService {
    
    def all(projectId: String): js.Promise[GetResponse] = js.native
    def all(projectId: String, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def all(projectId: Double): js.Promise[GetResponse] = js.native
    def all(projectId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    
    def protect(projectId: String, tagName: String): js.Promise[js.Object] = js.native
    def protect(projectId: String, tagName: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def protect(projectId: Double, tagName: String): js.Promise[js.Object] = js.native
    def protect(projectId: Double, tagName: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def show(projectId: String, tagName: String): js.Promise[GetResponse] = js.native
    def show(projectId: String, tagName: String, options: Sudo): js.Promise[GetResponse] = js.native
    def show(projectId: Double, tagName: String): js.Promise[GetResponse] = js.native
    def show(projectId: Double, tagName: String, options: Sudo): js.Promise[GetResponse] = js.native
    
    def unprotect(projectId: String, tagName: String): js.Promise[js.Object] = js.native
    def unprotect(projectId: String, tagName: String, options: Sudo): js.Promise[js.Object] = js.native
    def unprotect(projectId: Double, tagName: String): js.Promise[js.Object] = js.native
    def unprotect(projectId: Double, tagName: String, options: Sudo): js.Promise[js.Object] = js.native
  }
}
