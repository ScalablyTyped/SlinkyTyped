package typingsSlinky.gitlab

import typingsSlinky.gitlab.anon.userIdnumberBaseRequestOp
import typingsSlinky.gitlab.anon.userIdnumberPaginatedRequ
import typingsSlinky.gitlab.infrastructureMod.BaseService
import typingsSlinky.gitlab.requestHelperMod.GetResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/UserGPGKeys", JSImport.Namespace)
@js.native
object userGPGKeysMod extends js.Object {
  @js.native
  class UserGPGKeys () extends BaseService {
    def add(title: js.Any, key: js.Any): js.Promise[js.Object] = js.native
    def add(title: js.Any, key: js.Any, hasUserIdOptions: userIdnumberBaseRequestOp): js.Promise[js.Object] = js.native
    def all(): js.Promise[GetResponse] = js.native
    def all(hasUserIdOptions: userIdnumberPaginatedRequ): js.Promise[GetResponse] = js.native
    def remove(keyId: js.Any): js.Promise[js.Object] = js.native
    def remove(keyId: js.Any, hasUserIdOptions: userIdnumberBaseRequestOp): js.Promise[js.Object] = js.native
    def show(keyId: js.Any): js.Promise[GetResponse] = js.native
    def show(keyId: js.Any, hasUserIdOptions: userIdnumberBaseRequestOp): js.Promise[GetResponse] = js.native
  }
  
}

