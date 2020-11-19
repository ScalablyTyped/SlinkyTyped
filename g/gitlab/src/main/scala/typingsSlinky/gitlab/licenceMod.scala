package typingsSlinky.gitlab

import typingsSlinky.gitlab.infrastructureMod.BaseService
import typingsSlinky.gitlab.requestHelperMod.GetResponse
import typingsSlinky.gitlab.requestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitlab/dist/types/core/services/Licence", JSImport.Namespace)
@js.native
object licenceMod extends js.Object {
  
  @js.native
  class Licence () extends BaseService {
    
    def all(): js.Promise[GetResponse] = js.native
    def all(options: Sudo): js.Promise[GetResponse] = js.native
    
    def create(): js.Promise[js.Object] = js.native
    def create(options: Sudo): js.Promise[js.Object] = js.native
  }
}
