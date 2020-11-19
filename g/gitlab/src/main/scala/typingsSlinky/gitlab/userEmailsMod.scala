package typingsSlinky.gitlab

import typingsSlinky.gitlab.anon.userIdnumberundefinedBase
import typingsSlinky.gitlab.anon.userIdnumberundefinedPagi
import typingsSlinky.gitlab.infrastructureMod.BaseService
import typingsSlinky.gitlab.requestHelperMod.BaseRequestOptions
import typingsSlinky.gitlab.requestHelperMod.GetResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitlab/dist/types/core/services/UserEmails", JSImport.Namespace)
@js.native
object userEmailsMod extends js.Object {
  
  @js.native
  class UserEmails () extends BaseService {
    
    def add(email: js.Any): js.Promise[js.Object] = js.native
    def add(email: js.Any, hasUserIdOptions: userIdnumberundefinedBase): js.Promise[js.Object] = js.native
    
    def all(): js.Promise[GetResponse] = js.native
    def all(hasUserIdOptions: userIdnumberundefinedPagi): js.Promise[GetResponse] = js.native
    
    def remove(emailId: js.Any): js.Promise[js.Object] = js.native
    def remove(emailId: js.Any, hasUserIdOptions: userIdnumberundefinedBase): js.Promise[js.Object] = js.native
    
    def show(emailId: js.Any): js.Promise[GetResponse] = js.native
    def show(emailId: js.Any, options: BaseRequestOptions): js.Promise[GetResponse] = js.native
  }
}
