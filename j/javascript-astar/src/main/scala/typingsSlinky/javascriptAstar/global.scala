package typingsSlinky.javascriptAstar

import typingsSlinky.javascriptAstar.anon.Closest
import typingsSlinky.javascriptAstar.anon.Diagonal
import typingsSlinky.javascriptAstar.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class Graph protected ()
    extends typingsSlinky.javascriptAstar.Graph {
    def this(grid: js.Array[js.Array[Double]]) = this()
    def this(grid: js.Array[js.Array[Double]], options: Diagonal) = this()
    /* CompleteClass */
    override var grid: js.Array[js.Array[typingsSlinky.javascriptAstar.GridNode]] = js.native
  }
  
  @js.native
  class GridNode ()
    extends typingsSlinky.javascriptAstar.GridNode {
    /* CompleteClass */
    override var x: Double = js.native
    /* CompleteClass */
    override var y: Double = js.native
  }
  
  @js.native
  object astar extends js.Object {
    var heuristics: Heuristics = js.native
    def search(graph: typingsSlinky.javascriptAstar.Graph, start: X, end: X): js.Array[typingsSlinky.javascriptAstar.GridNode] = js.native
    def search(graph: typingsSlinky.javascriptAstar.Graph, start: X, end: X, options: Closest): js.Array[typingsSlinky.javascriptAstar.GridNode] = js.native
  }
  
}

