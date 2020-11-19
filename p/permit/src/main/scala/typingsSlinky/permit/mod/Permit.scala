package typingsSlinky.permit.mod

import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("permit", "Permit")
@js.native
class Permit protected () extends js.Object {
  def this(options: PermitOptions) = this()
  
  def check(req: IncomingMessage): Unit = js.native
  
  def fail(res: ServerResponse): Unit = js.native
}
