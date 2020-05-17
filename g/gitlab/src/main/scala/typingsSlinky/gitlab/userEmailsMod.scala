package typingsSlinky.gitlab

import typingsSlinky.gitlab.anon.userIdnumberBaseRequestOp
import typingsSlinky.gitlab.anon.userIdnumberPaginatedRequ
import typingsSlinky.gitlab.infrastructureMod.BaseService
import typingsSlinky.gitlab.requestHelperMod.BaseRequestOptions
import typingsSlinky.gitlab.requestHelperMod.GetResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/UserEmails", JSImport.Namespace)
@js.native
object userEmailsMod extends js.Object {
  @js.native
  class UserEmails () extends BaseService {
    def add(email: js.Any): js.Promise[js.Object] = js.native
    def add(email: js.Any, hasUserIdOptions: userIdnumberBaseRequestOp): js.Promise[js.Object] = js.native
    def all(): js.Promise[GetResponse] = js.native
    def all(hasUserIdOptions: userIdnumberPaginatedRequ): js.Promise[GetResponse] = js.native
    def remove(emailId: js.Any): js.Promise[js.Object] = js.native
    def remove(emailId: js.Any, hasUserIdOptions: userIdnumberBaseRequestOp): js.Promise[js.Object] = js.native
    def show(emailId: js.Any): js.Promise[GetResponse] = js.native
    def show(emailId: js.Any, options: BaseRequestOptions): js.Promise[GetResponse] = js.native
  }
  
}

