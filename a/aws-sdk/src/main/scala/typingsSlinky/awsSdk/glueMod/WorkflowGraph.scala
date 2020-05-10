package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkflowGraph extends js.Object {
  /**
    * A list of all the directed connections between the nodes belonging to the workflow.
    */
  var Edges: js.UndefOr[EdgeList] = js.native
  /**
    * A list of the the AWS Glue components belong to the workflow represented as nodes.
    */
  var Nodes: js.UndefOr[NodeList] = js.native
}

object WorkflowGraph {
  @scala.inline
  def apply(): WorkflowGraph = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkflowGraph]
  }
  @scala.inline
  implicit class WorkflowGraphOps[Self <: WorkflowGraph] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEdges(value: EdgeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Edges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Edges")(js.undefined)
        ret
    }
    @scala.inline
    def withNodes(value: NodeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Nodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Nodes")(js.undefined)
        ret
    }
  }
  
}

