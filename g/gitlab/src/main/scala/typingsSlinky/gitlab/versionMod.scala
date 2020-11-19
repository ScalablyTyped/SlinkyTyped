package typingsSlinky.gitlab

import typingsSlinky.gitlab.infrastructureMod.BaseService
import typingsSlinky.gitlab.requestHelperMod.GetResponse
import typingsSlinky.gitlab.requestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitlab/dist/types/core/services/Version", JSImport.Namespace)
@js.native
object versionMod extends js.Object {
  
  @js.native
  class Version () extends BaseService {
    
    def show(): js.Promise[GetResponse] = js.native
    def show(options: Sudo): js.Promise[GetResponse] = js.native
  }
}
