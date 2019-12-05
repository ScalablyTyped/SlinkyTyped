package typingsSlinky.gitlab

import typingsSlinky.gitlab.distTypesCoreInfrastructureMod.BaseService
import typingsSlinky.gitlab.distTypesCoreInfrastructureRequestHelperMod.BaseRequestOptions
import typingsSlinky.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/Search", JSImport.Namespace)
@js.native
object distTypesCoreServicesSearchMod extends js.Object {
  @js.native
  class Search () extends BaseService {
    def all(
      scope: String,
      search: String,
      hasProjectIdGroupIdOptions: Anon_GroupIdProjectId with BaseRequestOptions
    ): js.Promise[GetResponse] = js.native
  }
  
}

