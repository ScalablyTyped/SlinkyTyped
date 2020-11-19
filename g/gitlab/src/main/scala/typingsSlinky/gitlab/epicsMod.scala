package typingsSlinky.gitlab

import typingsSlinky.gitlab.infrastructureMod.BaseService
import typingsSlinky.gitlab.requestHelperMod.BaseRequestOptions
import typingsSlinky.gitlab.requestHelperMod.GetResponse
import typingsSlinky.gitlab.requestHelperMod.PaginatedRequestOptions
import typingsSlinky.gitlab.requestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitlab/dist/types/core/services/Epics", JSImport.Namespace)
@js.native
object epicsMod extends js.Object {
  
  @js.native
  class Epics () extends BaseService {
    
    def all(groupId: String): js.Promise[GetResponse] = js.native
    def all(groupId: String, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def all(groupId: Double): js.Promise[GetResponse] = js.native
    def all(groupId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    
    def create(groupId: String, title: String): js.Promise[js.Object] = js.native
    def create(groupId: String, title: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def create(groupId: Double, title: String): js.Promise[js.Object] = js.native
    def create(groupId: Double, title: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def edit(groupId: String, epicId: Double): js.Promise[js.Object] = js.native
    def edit(groupId: String, epicId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(groupId: Double, epicId: Double): js.Promise[js.Object] = js.native
    def edit(groupId: Double, epicId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def remove(groupId: String, epicId: Double): js.Promise[js.Object] = js.native
    def remove(groupId: String, epicId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def remove(groupId: Double, epicId: Double): js.Promise[js.Object] = js.native
    def remove(groupId: Double, epicId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def show(groupId: String, epicId: Double): js.Promise[GetResponse] = js.native
    def show(groupId: String, epicId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def show(groupId: Double, epicId: Double): js.Promise[GetResponse] = js.native
    def show(groupId: Double, epicId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  }
}
