package typingsSlinky.gitlab

import typingsSlinky.gitlab.anon.projectIdstringnumberunde
import typingsSlinky.gitlab.infrastructureMod.BaseService
import typingsSlinky.gitlab.requestHelperMod.BaseRequestOptions
import typingsSlinky.gitlab.requestHelperMod.GetResponse
import typingsSlinky.gitlab.requestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitlab/dist/types/core/services/PagesDomains", JSImport.Namespace)
@js.native
object pagesDomainsMod extends js.Object {
  
  @js.native
  class PagesDomains () extends BaseService {
    
    def all(): js.Promise[GetResponse] = js.native
    def all(hasProjectIdOptions: projectIdstringnumberunde): js.Promise[GetResponse] = js.native
    
    def create(projectId: String, domain: String): js.Promise[js.Object] = js.native
    def create(projectId: String, domain: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def create(projectId: Double, domain: String): js.Promise[js.Object] = js.native
    def create(projectId: Double, domain: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def edit(projectId: String, domain: String): js.Promise[js.Object] = js.native
    def edit(projectId: String, domain: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(projectId: Double, domain: String): js.Promise[js.Object] = js.native
    def edit(projectId: Double, domain: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def remove(projectId: String, domain: String): js.Promise[js.Object] = js.native
    def remove(projectId: String, domain: String, options: Sudo): js.Promise[js.Object] = js.native
    def remove(projectId: Double, domain: String): js.Promise[js.Object] = js.native
    def remove(projectId: Double, domain: String, options: Sudo): js.Promise[js.Object] = js.native
    
    def show(projectId: String, domain: String): js.Promise[GetResponse] = js.native
    def show(projectId: String, domain: String, options: Sudo): js.Promise[GetResponse] = js.native
    def show(projectId: Double, domain: String): js.Promise[GetResponse] = js.native
    def show(projectId: Double, domain: String, options: Sudo): js.Promise[GetResponse] = js.native
  }
}
