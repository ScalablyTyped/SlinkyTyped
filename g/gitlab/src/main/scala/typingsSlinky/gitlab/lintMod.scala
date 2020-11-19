package typingsSlinky.gitlab

import typingsSlinky.gitlab.infrastructureMod.BaseService
import typingsSlinky.gitlab.requestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitlab/dist/types/core/services/Lint", JSImport.Namespace)
@js.native
object lintMod extends js.Object {
  
  @js.native
  class Lint () extends BaseService {
    
    def lint(content: String): js.Promise[js.Object] = js.native
    def lint(content: String, options: Sudo): js.Promise[js.Object] = js.native
  }
}
