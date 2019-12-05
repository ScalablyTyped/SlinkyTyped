package typingsSlinky.gremlin.gremlinMod.process

import typingsSlinky.gremlin.gremlinMod.driver.RemoteConnection
import typingsSlinky.gremlin.gremlinMod.structure.Graph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gremlin", "process.AnonymousTraversalSource")
@js.native
class AnonymousTraversalSource () extends js.Object {
  def withGraph(graph: Graph): GraphTraversalSource = js.native
  def withRemote(remoteConnection: RemoteConnection): GraphTraversalSource = js.native
}

/* static members */
@JSImport("gremlin", "process.AnonymousTraversalSource")
@js.native
object AnonymousTraversalSource extends js.Object {
  def traversal(): AnonymousTraversalSource = js.native
}

