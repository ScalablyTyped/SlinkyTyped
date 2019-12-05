package typingsSlinky.gitlab

import typingsSlinky.gitlab.distTypesCoreInfrastructureMod.BaseService
import typingsSlinky.gitlab.distTypesCoreInfrastructureRequestHelperMod.BaseRequestOptions
import typingsSlinky.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import typingsSlinky.gitlab.distTypesCoreInfrastructureRequestHelperMod.PaginatedRequestOptions
import typingsSlinky.gitlab.distTypesCoreInfrastructureRequestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/EpicIssues", JSImport.Namespace)
@js.native
object distTypesCoreServicesEpicIssuesMod extends js.Object {
  @js.native
  class EpicIssues () extends BaseService {
    def all(groupId: String, epicId: Double): js.Promise[GetResponse] = js.native
    def all(groupId: String, epicId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def all(groupId: Double, epicId: Double): js.Promise[GetResponse] = js.native
    def all(groupId: Double, epicId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def assign(groupId: String, epicId: Double, issueId: Double): js.Promise[js.Object] = js.native
    def assign(groupId: String, epicId: Double, issueId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def assign(groupId: Double, epicId: Double, issueId: Double): js.Promise[js.Object] = js.native
    def assign(groupId: Double, epicId: Double, issueId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def edit(groupId: String, epicId: Double, issueId: Double): js.Promise[js.Object] = js.native
    def edit(groupId: String, epicId: Double, issueId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(groupId: Double, epicId: Double, issueId: Double): js.Promise[js.Object] = js.native
    def edit(groupId: Double, epicId: Double, issueId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def remove(groupId: String, epicId: Double, issueId: Double): js.Promise[js.Object] = js.native
    def remove(groupId: String, epicId: Double, issueId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def remove(groupId: Double, epicId: Double, issueId: Double): js.Promise[js.Object] = js.native
    def remove(groupId: Double, epicId: Double, issueId: Double, options: Sudo): js.Promise[js.Object] = js.native
  }
  
}

