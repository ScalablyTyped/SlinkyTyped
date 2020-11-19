package typingsSlinky.builderUtil

import typingsSlinky.builderUtilRuntime.mod.HttpExecutor
import typingsSlinky.node.httpMod.ClientRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("builder-util/out/nodeHttpExecutor", JSImport.Namespace)
@js.native
object nodeHttpExecutorMod extends js.Object {
  
  val httpExecutor: NodeHttpExecutor = js.native
  
  @js.native
  class NodeHttpExecutor () extends HttpExecutor[ClientRequest]
}
