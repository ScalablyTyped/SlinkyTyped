package typingsSlinky.gitlab

import typingsSlinky.gitlab.infrastructureMod.BaseService
import typingsSlinky.gitlab.projectsMod.ProjectSchema
import typingsSlinky.gitlab.requestHelperMod.BaseRequestOptions
import typingsSlinky.gitlab.requestHelperMod.PaginatedRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitlab/dist/types/core/services/GroupProjects", JSImport.Namespace)
@js.native
object groupProjectsMod extends js.Object {
  
  @js.native
  class GroupProjects () extends BaseService {
    
    def add(groupId: String, projectId: String): js.Promise[js.Object] = js.native
    def add(groupId: String, projectId: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def add(groupId: String, projectId: Double): js.Promise[js.Object] = js.native
    def add(groupId: String, projectId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def add(groupId: Double, projectId: String): js.Promise[js.Object] = js.native
    def add(groupId: Double, projectId: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def add(groupId: Double, projectId: Double): js.Promise[js.Object] = js.native
    def add(groupId: Double, projectId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def all(groupId: String): js.Promise[js.Array[ProjectSchema]] = js.native
    def all(groupId: String, options: PaginatedRequestOptions): js.Promise[js.Array[ProjectSchema]] = js.native
    def all(groupId: Double): js.Promise[js.Array[ProjectSchema]] = js.native
    def all(groupId: Double, options: PaginatedRequestOptions): js.Promise[js.Array[ProjectSchema]] = js.native
  }
}
