package typingsSlinky.gitlab

import typingsSlinky.gitlab.anon.GroupId
import typingsSlinky.gitlab.anon.ProjectId
import typingsSlinky.gitlab.infrastructureMod.BaseService
import typingsSlinky.gitlab.requestHelperMod.BaseRequestOptions
import typingsSlinky.gitlab.requestHelperMod.GetResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitlab/dist/types/core/services/IssuesStatistics", JSImport.Namespace)
@js.native
object issuesStatisticsMod extends js.Object {
  
  @js.native
  class IssuesStatistics () extends BaseService {
    
    def all(): js.Promise[GetResponse] = js.native
    def all(hasProjectIdGroupIdOptions: (ProjectId | GroupId | js.Object) with BaseRequestOptions): js.Promise[GetResponse] = js.native
  }
}
