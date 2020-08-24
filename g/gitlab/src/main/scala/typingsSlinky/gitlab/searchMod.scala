package typingsSlinky.gitlab

import typingsSlinky.gitlab.anon.projectIdstringnumberundeDictkey
import typingsSlinky.gitlab.infrastructureMod.BaseService
import typingsSlinky.gitlab.requestHelperMod.GetResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/Search", JSImport.Namespace)
@js.native
object searchMod extends js.Object {
  @js.native
  class Search () extends BaseService {
    def all(scope: String, search: String, hasProjectIdGroupIdOptions: projectIdstringnumberundeDictkey): js.Promise[GetResponse] = js.native
  }
  
}

