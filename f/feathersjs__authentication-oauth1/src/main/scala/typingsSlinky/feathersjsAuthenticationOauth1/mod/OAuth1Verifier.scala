package typingsSlinky.feathersjsAuthenticationOauth1.mod

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.feathersjsAuthenticationOauth1.anon.AccessToken
import typingsSlinky.feathersjsFeathers.mod.Application
import typingsSlinky.feathersjsFeathers.mod.Paginated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@feathersjs/authentication-oauth1", "OAuth1Verifier")
@js.native
class OAuth1Verifier protected () extends js.Object {
  def this(app: Application[js.Object], options: js.Any) = this()
  
   // updates an existing entity
  def _createEntity(data: AccessToken): js.Promise[_] = js.native
  
   // creates an entity if they didn't exist already
  def _normalizeResult[T](results: js.Array[T]): js.Promise[T] = js.native
  def _normalizeResult[T](results: Paginated[T]): js.Promise[T] = js.native
  
  def _updateEntity(entity: js.Any, data: AccessToken): js.Promise[_] = js.native
  
   // normalizes result from service to account for pagination
  def verify(
    req: Request_[ParamsDictionary, _, _, Query],
    accessToken: String,
    refreshToken: String,
    profile: js.Any,
    done: js.Function3[/* err */ js.Error | Null, /* user */ js.Object, /* info */ js.Object, Unit]
  ): Unit = js.native
}
