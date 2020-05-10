package typingsSlinky.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#collection/metadata
  */
@js.native
trait NodeSingularMetadata extends js.Object {
  /**
    * Get the degree of a node.
    * @param includeLoops A boolean, indicating whether loops are to be included in degree calculations.
    */
  def degree(includeLoops: Boolean): Double = js.native
  /**
    * Get the indegree of a node.
    * @param includeLoops A boolean, indicating whether loops are to be included in degree calculations.
    */
  def indegree(includeLoops: Boolean): Double = js.native
  /**
    * Get the outdegree of a node.
    * @param includeLoops A boolean, indicating whether loops are to be included in degree calculations.
    */
  def outdegree(includeLoops: Boolean): Double = js.native
}

object NodeSingularMetadata {
  @scala.inline
  def apply(degree: Boolean => Double, indegree: Boolean => Double, outdegree: Boolean => Double): NodeSingularMetadata = {
    val __obj = js.Dynamic.literal(degree = js.Any.fromFunction1(degree), indegree = js.Any.fromFunction1(indegree), outdegree = js.Any.fromFunction1(outdegree))
    __obj.asInstanceOf[NodeSingularMetadata]
  }
  @scala.inline
  implicit class NodeSingularMetadataOps[Self <: NodeSingularMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDegree(value: Boolean => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("degree")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIndegree(value: Boolean => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indegree")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOutdegree(value: Boolean => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outdegree")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

