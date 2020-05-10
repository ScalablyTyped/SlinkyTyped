package typingsSlinky.jsgraph.mod

import typingsSlinky.jsgraph.AnonDirgaph
import typingsSlinky.jsgraph.AnonError
import typingsSlinky.jsgraph.AnonResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Directed extends js.Object {
  var colors: typingsSlinky.jsgraph.mod.colors = js.native
  var directedGraph: DirectedGraph = js.native
  def breadthFirstTraverse(params: TraversalParams): TraversalResult = js.native
  def create(): AnonResult = js.native
  def createTraversalContext(req: AnonDirgaph): TraversalContext = js.native
  def depthFirstTraverse(params: TraversalParams): TraversalResult = js.native
  def transpose(graph: DirectedGraph): AnonError = js.native
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
  @scala.inline
  implicit class DirectedOps[Self <: Directed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBreadthFirstTraverse(value: TraversalParams => TraversalResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breadthFirstTraverse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withColors(value: colors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreate(value: () => AnonResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreateTraversalContext(value: AnonDirgaph => TraversalContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTraversalContext")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDepthFirstTraverse(value: TraversalParams => TraversalResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthFirstTraverse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDirectedGraph(value: DirectedGraph): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directedGraph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranspose(value: DirectedGraph => AnonError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transpose")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

