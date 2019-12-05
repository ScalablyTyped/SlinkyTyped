package typingsSlinky.gitlab

import typingsSlinky.gitlab.distTypesCoreInfrastructureMod.BaseService
import typingsSlinky.gitlab.distTypesCoreInfrastructureRequestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/Markdown", JSImport.Namespace)
@js.native
object distTypesCoreServicesMarkdownMod extends js.Object {
  @js.native
  class Markdown () extends BaseService {
    def render(text: String, options: Anon_Gfm with Sudo): js.Promise[js.Object] = js.native
  }
  
}

