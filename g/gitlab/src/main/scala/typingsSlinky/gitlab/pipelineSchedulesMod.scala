package typingsSlinky.gitlab

import typingsSlinky.gitlab.infrastructureMod.BaseService
import typingsSlinky.gitlab.requestHelperMod.BaseRequestOptions
import typingsSlinky.gitlab.requestHelperMod.GetResponse
import typingsSlinky.gitlab.requestHelperMod.PaginatedRequestOptions
import typingsSlinky.gitlab.requestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitlab/dist/types/core/services/PipelineSchedules", JSImport.Namespace)
@js.native
object pipelineSchedulesMod extends js.Object {
  
  @js.native
  class PipelineSchedules () extends BaseService {
    
    def all(projectId: String): js.Promise[GetResponse] = js.native
    def all(projectId: String, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def all(projectId: Double): js.Promise[GetResponse] = js.native
    def all(projectId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    
    def create(projectId: String, description: String, ref: String, cron: String): js.Promise[js.Object] = js.native
    def create(projectId: String, description: String, ref: String, cron: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def create(projectId: Double, description: String, ref: String, cron: String): js.Promise[js.Object] = js.native
    def create(projectId: Double, description: String, ref: String, cron: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def edit(projectId: String, scheduleId: Double): js.Promise[js.Object] = js.native
    def edit(projectId: String, scheduleId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(projectId: Double, scheduleId: Double): js.Promise[js.Object] = js.native
    def edit(projectId: Double, scheduleId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def remove(projectId: String, scheduleId: Double): js.Promise[js.Object] = js.native
    def remove(projectId: String, scheduleId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def remove(projectId: Double, scheduleId: Double): js.Promise[js.Object] = js.native
    def remove(projectId: Double, scheduleId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def show(projectId: String, scheduleId: Double): js.Promise[GetResponse] = js.native
    def show(projectId: String, scheduleId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def show(projectId: Double, scheduleId: Double): js.Promise[GetResponse] = js.native
    def show(projectId: Double, scheduleId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    
    def takeOwnership(projectId: String, scheduleId: Double): js.Promise[js.Object] = js.native
    def takeOwnership(projectId: String, scheduleId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def takeOwnership(projectId: Double, scheduleId: Double): js.Promise[js.Object] = js.native
    def takeOwnership(projectId: Double, scheduleId: Double, options: Sudo): js.Promise[js.Object] = js.native
  }
}
