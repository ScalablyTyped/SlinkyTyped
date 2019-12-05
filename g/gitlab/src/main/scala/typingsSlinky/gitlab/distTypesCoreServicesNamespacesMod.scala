package typingsSlinky.gitlab

import typingsSlinky.gitlab.distTypesCoreInfrastructureMod.BaseService
import typingsSlinky.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import typingsSlinky.gitlab.distTypesCoreInfrastructureRequestHelperMod.PaginatedRequestOptions
import typingsSlinky.gitlab.distTypesCoreInfrastructureRequestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/Namespaces", JSImport.Namespace)
@js.native
object distTypesCoreServicesNamespacesMod extends js.Object {
  @js.native
  class Namespaces () extends BaseService {
    def all(): js.Promise[GetResponse] = js.native
    def all(options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def show(namespaceId: String, options: Anon_Search with Sudo): js.Promise[GetResponse] = js.native
    def show(namespaceId: Double, options: Anon_Search with Sudo): js.Promise[GetResponse] = js.native
  }
  
}

