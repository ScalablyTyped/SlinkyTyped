package typingsSlinky.feathersjsAuthentication.mod

import typingsSlinky.express.mod.Application_
import typingsSlinky.feathersjsAuthentication.anon.AccessToken
import typingsSlinky.feathersjsFeathers.mod.Params
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@feathersjs/authentication", "service")
@js.native
object service extends js.Object {
  
  def apply(options: FeathersAuthenticationOptions): js.Function1[/* app */ js.UndefOr[Application_], Unit] = js.native
  
  @js.native
  class Service[T] protected () extends js.Object {
    def this(app: Application_) = this()
    
    def create(data: Partial[T], params: Params): js.Promise[AccessToken] = js.native
    
    def remove(id: String, params: Params): js.Promise[AccessToken] = js.native
    def remove(id: Null, params: Params): js.Promise[AccessToken] = js.native
  }
}
