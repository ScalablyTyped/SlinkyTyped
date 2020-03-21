package typingsSlinky.builderUtil

import typingsSlinky.builderUtilRuntime.mod.HttpExecutor
import typingsSlinky.node.httpMod.ClientRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("builder-util/out/nodeHttpExecutor", JSImport.Namespace)
@js.native
object nodeHttpExecutorMod extends js.Object {
  @js.native
  class NodeHttpExecutor () extends HttpExecutor[ClientRequest]
  
  val httpExecutor: NodeHttpExecutor = js.native
}

