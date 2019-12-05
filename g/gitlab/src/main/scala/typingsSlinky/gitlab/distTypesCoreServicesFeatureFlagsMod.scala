package typingsSlinky.gitlab

import typingsSlinky.gitlab.distTypesCoreInfrastructureMod.BaseService
import typingsSlinky.gitlab.distTypesCoreInfrastructureRequestHelperMod.BaseRequestOptions
import typingsSlinky.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import typingsSlinky.gitlab.distTypesCoreInfrastructureRequestHelperMod.PaginatedRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/FeatureFlags", JSImport.Namespace)
@js.native
object distTypesCoreServicesFeatureFlagsMod extends js.Object {
  @js.native
  class FeatureFlags () extends BaseService {
    def all(): js.Promise[GetResponse] = js.native
    def all(options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def set(name: String): js.Promise[js.Object] = js.native
    def set(name: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  }
  
}

