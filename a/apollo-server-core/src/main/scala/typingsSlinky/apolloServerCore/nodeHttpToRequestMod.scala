package typingsSlinky.apolloServerCore

import typingsSlinky.apolloServerEnv.mod.Request
import typingsSlinky.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server-core/dist/nodeHttpToRequest", JSImport.Namespace)
@js.native
object nodeHttpToRequestMod extends js.Object {
  
  def convertNodeHttpToRequest(req: IncomingMessage): Request = js.native
}
