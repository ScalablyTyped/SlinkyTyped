package typingsSlinky.gitlab

import typingsSlinky.gitlab.infrastructureMod.BaseService
import typingsSlinky.gitlab.requestHelperMod.BaseRequestOptions
import typingsSlinky.gitlab.requestHelperMod.GetResponse
import typingsSlinky.gitlab.requestHelperMod.PaginatedRequestOptions
import typingsSlinky.gitlab.requestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitlab/dist/types/core/services/ProjectHooks", JSImport.Namespace)
@js.native
object projectHooksMod extends js.Object {
  
  @js.native
  class ProjectHooks () extends BaseService {
    
    def add(projectId: String, url: String): js.Promise[js.Object] = js.native
    def add(projectId: String, url: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def add(projectId: Double, url: String): js.Promise[js.Object] = js.native
    def add(projectId: Double, url: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def all(projectId: String): js.Promise[GetResponse] = js.native
    def all(projectId: String, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def all(projectId: Double): js.Promise[GetResponse] = js.native
    def all(projectId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    
    def edit(projectId: String, hookId: Double, url: String): js.Promise[js.Object] = js.native
    def edit(projectId: String, hookId: Double, url: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(projectId: Double, hookId: Double, url: String): js.Promise[js.Object] = js.native
    def edit(projectId: Double, hookId: Double, url: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def remove(projectId: String, hookId: Double): js.Promise[js.Object] = js.native
    def remove(projectId: String, hookId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def remove(projectId: Double, hookId: Double): js.Promise[js.Object] = js.native
    def remove(projectId: Double, hookId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def show(projectId: String, hookId: Double): js.Promise[GetResponse] = js.native
    def show(projectId: String, hookId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def show(projectId: Double, hookId: Double): js.Promise[GetResponse] = js.native
    def show(projectId: Double, hookId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  }
}
