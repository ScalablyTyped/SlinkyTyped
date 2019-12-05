package typingsSlinky.atFeathersjsAuthentication.atFeathersjsAuthenticationMod

import typingsSlinky.atFeathersjsAuthentication.Anon_AccessToken
import typingsSlinky.atFeathersjsFeathers.atFeathersjsFeathersMod.Params
import typingsSlinky.express.expressMod.Application
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@feathersjs/authentication", "service")
@js.native
object service extends js.Object {
  @js.native
  class Service[T] protected () extends js.Object {
    def this(app: Application) = this()
    def create(data: Partial[T], params: Params): js.Promise[Anon_AccessToken] = js.native
    def remove(id: String, params: Params): js.Promise[Anon_AccessToken] = js.native
    def remove(id: Null, params: Params): js.Promise[Anon_AccessToken] = js.native
  }
  
  def apply(options: FeathersAuthenticationOptions): js.Function1[/* app */ js.UndefOr[Application], Unit] = js.native
}

