package typingsSlinky.hapiHawk.serverMod

import typingsSlinky.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hapi/hawk/lib/server", "authenticate")
@js.native
object authenticate extends js.Object {
  def apply(req: IncomingMessage, credentialsFunc: CredentialsFunc): js.Promise[Authentication] = js.native
  def apply(req: IncomingMessage, credentialsFunc: CredentialsFunc, options: AuthenticateOptions): js.Promise[Authentication] = js.native
}

