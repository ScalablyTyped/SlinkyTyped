package typingsSlinky.gitlab

import typingsSlinky.gitlab.baseServiceMod.BaseServiceOptions
import typingsSlinky.gitlab.infrastructureMod.BaseService
import typingsSlinky.gitlab.requestHelperMod.BaseRequestOptions
import typingsSlinky.gitlab.requestHelperMod.GetResponse
import typingsSlinky.gitlab.requestHelperMod.PaginatedRequestOptions
import typingsSlinky.gitlab.requestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitlab/dist/types/core/templates/ResourceMilestones", JSImport.Namespace)
@js.native
object resourceMilestonesMod extends js.Object {
  
  @js.native
  class ResourceMilestones protected () extends BaseService {
    def this(resourceType: String, options: BaseServiceOptions) = this()
    
    def all(resourceId: String): js.Promise[GetResponse] = js.native
    def all(resourceId: String, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def all(resourceId: Double): js.Promise[GetResponse] = js.native
    def all(resourceId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    
    def create(resourceId: String, title: String): js.Promise[js.Object] = js.native
    def create(resourceId: String, title: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def create(resourceId: Double, title: String): js.Promise[js.Object] = js.native
    def create(resourceId: Double, title: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def edit(resourceId: String, milestoneId: Double): js.Promise[js.Object] = js.native
    def edit(resourceId: String, milestoneId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(resourceId: Double, milestoneId: Double): js.Promise[js.Object] = js.native
    def edit(resourceId: Double, milestoneId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def issues(resourceId: String, milestoneId: Double): js.Promise[GetResponse] = js.native
    def issues(resourceId: String, milestoneId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def issues(resourceId: Double, milestoneId: Double): js.Promise[GetResponse] = js.native
    def issues(resourceId: Double, milestoneId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    
    def mergeRequests(resourceId: String, milestoneId: Double): js.Promise[GetResponse] = js.native
    def mergeRequests(resourceId: String, milestoneId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def mergeRequests(resourceId: Double, milestoneId: Double): js.Promise[GetResponse] = js.native
    def mergeRequests(resourceId: Double, milestoneId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    
    def show(resourceId: String, milestoneId: Double): js.Promise[GetResponse] = js.native
    def show(resourceId: String, milestoneId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def show(resourceId: Double, milestoneId: Double): js.Promise[GetResponse] = js.native
    def show(resourceId: Double, milestoneId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  }
}
