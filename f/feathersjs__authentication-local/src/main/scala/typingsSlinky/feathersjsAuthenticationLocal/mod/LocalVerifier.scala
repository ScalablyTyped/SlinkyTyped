package typingsSlinky.feathersjsAuthenticationLocal.mod

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.feathersjsAuthenticationLocal.anon.Message
import typingsSlinky.feathersjsFeathers.mod.Application
import typingsSlinky.feathersjsFeathers.mod.Paginated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@feathersjs/authentication-local", "LocalVerifier")
@js.native
class LocalVerifier protected () extends js.Object {
  def this(app: Application[js.Object], options: js.Any) = this()
  
  def _comparePassword[T](entity: T, password: String): js.Promise[T] = js.native
  
   // compares password using bcrypt
  def _normalizeResult[T](results: js.Array[T]): js.Promise[T] = js.native
  def _normalizeResult[T](results: Paginated[T]): js.Promise[T] = js.native
  
   // normalizes result from service to account for pagination
  def verify(
    req: Request_[ParamsDictionary, _, _, Query],
    username: String,
    password: String,
    done: js.Function3[
      /* error */ js.Any, 
      /* user */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[Message], 
      Unit
    ]
  ): Unit = js.native
}
