package typingsSlinky.jsgraph.mod

import typingsSlinky.jsgraph.AnonDirgaph
import typingsSlinky.jsgraph.AnonError
import typingsSlinky.jsgraph.AnonResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Directed extends js.Object {
  var colors: typingsSlinky.jsgraph.mod.colors
  var directedGraph: DirectedGraph
  def breadthFirstTraverse(params: TraversalParams): TraversalResult
  def create(): AnonResult
  def createTraversalContext(req: AnonDirgaph): TraversalContext
  def depthFirstTraverse(params: TraversalParams): TraversalResult
  def transpose(graph: DirectedGraph): AnonError
}

object Directed {
  @scala.inline
  def apply(
    breadthFirstTraverse: TraversalParams => TraversalResult,
    colors: colors,
    create: () => AnonResult,
    createTraversalContext: AnonDirgaph => TraversalContext,
    depthFirstTraverse: TraversalParams => TraversalResult,
    directedGraph: DirectedGraph,
    transpose: DirectedGraph => AnonError
  ): Directed = {
    val __obj = js.Dynamic.literal(breadthFirstTraverse = js.Any.fromFunction1(breadthFirstTraverse), colors = colors.asInstanceOf[js.Any], create = js.Any.fromFunction0(create), createTraversalContext = js.Any.fromFunction1(createTraversalContext), depthFirstTraverse = js.Any.fromFunction1(depthFirstTraverse), directedGraph = directedGraph.asInstanceOf[js.Any], transpose = js.Any.fromFunction1(transpose))
  
    __obj.asInstanceOf[Directed]
  }
}

