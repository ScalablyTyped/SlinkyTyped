package typingsSlinky.gitlab

import typingsSlinky.gitlab.infrastructureMod.BaseService
import typingsSlinky.gitlab.requestHelperMod.BaseRequestOptions
import typingsSlinky.gitlab.requestHelperMod.GetResponse
import typingsSlinky.gitlab.requestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitlab/dist/types/core/services/PushRules", JSImport.Namespace)
@js.native
object pushRulesMod extends js.Object {
  
  @js.native
  class PushRules () extends BaseService {
    
    def create(projectId: String): js.Promise[js.Object] = js.native
    def create(projectId: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def create(projectId: Double): js.Promise[js.Object] = js.native
    def create(projectId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def edit(projectId: String): js.Promise[js.Object] = js.native
    def edit(projectId: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(projectId: Double): js.Promise[js.Object] = js.native
    def edit(projectId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def remove(projectId: String): js.Promise[js.Object] = js.native
    def remove(projectId: String, options: Sudo): js.Promise[js.Object] = js.native
    def remove(projectId: Double): js.Promise[js.Object] = js.native
    def remove(projectId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def show(projectId: String): js.Promise[GetResponse] = js.native
    def show(projectId: String, options: Sudo): js.Promise[GetResponse] = js.native
    def show(projectId: Double): js.Promise[GetResponse] = js.native
    def show(projectId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  }
}
