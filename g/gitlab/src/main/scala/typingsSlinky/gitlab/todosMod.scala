package typingsSlinky.gitlab

import typingsSlinky.gitlab.anon.todoIdnumberundefinedSudo
import typingsSlinky.gitlab.baseServiceMod.BaseServiceOptions
import typingsSlinky.gitlab.infrastructureMod.BaseService
import typingsSlinky.gitlab.requestHelperMod.GetResponse
import typingsSlinky.gitlab.requestHelperMod.PaginatedRequestOptions
import typingsSlinky.gitlab.requestHelperMod.Sudo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object todosMod {
  
  @JSImport("gitlab/dist/types/core/services/Todos", "Todos")
  @js.native
  class Todos () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def all(): js.Promise[GetResponse] = js.native
    def all(options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    
    def create(projectId: String, mergerequestId: Double): js.Promise[js.Object] = js.native
    def create(projectId: String, mergerequestId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def create(projectId: Double, mergerequestId: Double): js.Promise[js.Object] = js.native
    def create(projectId: Double, mergerequestId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def done(hasTodoIdOptions: todoIdnumberundefinedSudo): js.Promise[js.Object] = js.native
  }
}
