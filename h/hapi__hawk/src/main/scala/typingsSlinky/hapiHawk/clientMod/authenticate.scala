package typingsSlinky.hapiHawk.clientMod

import typingsSlinky.hapiHawk.cryptoMod.Artifacts
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.request.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hapi/hawk/lib/client", "authenticate")
@js.native
object authenticate extends js.Object {
  def apply(res: IncomingMessage, credentials: Credentials, artifacts: Artifacts): Authentication = js.native
  def apply(res: IncomingMessage, credentials: Credentials, artifacts: Artifacts, options: AuthenticateOptions): Authentication = js.native
  def apply(res: Response, credentials: Credentials, artifacts: Artifacts): Authentication = js.native
  def apply(res: Response, credentials: Credentials, artifacts: Artifacts, options: AuthenticateOptions): Authentication = js.native
}

