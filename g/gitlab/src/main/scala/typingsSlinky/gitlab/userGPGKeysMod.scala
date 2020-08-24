package typingsSlinky.gitlab

import typingsSlinky.gitlab.anon.userIdnumberundefinedBase
import typingsSlinky.gitlab.anon.userIdnumberundefinedPagi
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
    def add(key: String): js.Promise[js.Object] = js.native
    def add(key: String, hasUserIdOptions: userIdnumberundefinedBase): js.Promise[js.Object] = js.native
    def all(): js.Promise[GetResponse] = js.native
    def all(hasUserIdOptions: userIdnumberundefinedPagi): js.Promise[GetResponse] = js.native
    def remove(keyId: Double): js.Promise[js.Object] = js.native
    def remove(keyId: Double, hasUserIdOptions: userIdnumberundefinedBase): js.Promise[js.Object] = js.native
    def show(keyId: Double): js.Promise[GetResponse] = js.native
    def show(keyId: Double, hasUserIdOptions: userIdnumberundefinedBase): js.Promise[GetResponse] = js.native
  }
  
}

