package typingsSlinky.googleapis.dataprocV1Mod.dataprocV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The workflow graph.
  */
@js.native
trait SchemaWorkflowGraph extends js.Object {
  /**
    * Output only. The workflow nodes.
    */
  var nodes: js.UndefOr[js.Array[SchemaWorkflowNode]] = js.native
}

object SchemaWorkflowGraph {
  @scala.inline
  def apply(): SchemaWorkflowGraph = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkflowGraph]
  }
  @scala.inline
  implicit class SchemaWorkflowGraphOps[Self <: SchemaWorkflowGraph] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNodes(value: js.Array[SchemaWorkflowNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodes")(js.undefined)
        ret
    }
  }
  
}

