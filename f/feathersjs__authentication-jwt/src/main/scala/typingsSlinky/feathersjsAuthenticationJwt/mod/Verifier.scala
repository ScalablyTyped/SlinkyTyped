package typingsSlinky.feathersjsAuthenticationJwt.mod

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.feathersjsFeathers.mod.Application
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@feathersjs/authentication-jwt", "Verifier")
@js.native
class Verifier protected () extends js.Object {
  def this(app: Application[js.Object], options: js.Any) = this()
   // the class constructor
  def verify(
    req: Request_[ParamsDictionary, _, _, Query],
    payload: js.Any,
    done: js.Function3[/* error */ js.Any, /* user */ js.UndefOr[js.Any], /* info */ js.UndefOr[js.Any], Unit]
  ): Unit = js.native
}

