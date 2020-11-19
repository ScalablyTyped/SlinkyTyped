package typingsSlinky.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("p2", "IslandManager")
@js.native
class IslandManager () extends Solver {
  def this(options: IslandManagerOptions) = this()
  
  def bfs(root: IslandNode, bds: js.Array[Body], eqs: js.Array[Equation]): Unit = js.native
  
  var islands: js.Array[Island] = js.native
  
  var nodes: js.Array[IslandNode] = js.native
  
  def split(world: World): js.Array[Island] = js.native
  
  def visit(node: IslandNode, bds: js.Array[Body], eqs: js.Array[Equation]): Unit = js.native
}
/* static members */
@JSImport("p2", "IslandManager")
@js.native
object IslandManager extends js.Object {
  
  def getUnvisitedNode(nodes: js.Array[IslandNode]): IslandNode | Boolean = js.native
}
