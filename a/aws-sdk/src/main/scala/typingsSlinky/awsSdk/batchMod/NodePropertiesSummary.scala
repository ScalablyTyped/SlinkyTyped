package typingsSlinky.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodePropertiesSummary extends js.Object {
  /**
    * Specifies whether the current node is the main node for a multi-node parallel job.
    */
  var isMainNode: js.UndefOr[Boolean] = js.native
  /**
    * The node index for the node. Node index numbering begins at zero. This index is also available on the node with the AWS_BATCH_JOB_NODE_INDEX environment variable.
    */
  var nodeIndex: js.UndefOr[Integer] = js.native
  /**
    * The number of nodes associated with a multi-node parallel job.
    */
  var numNodes: js.UndefOr[Integer] = js.native
}

object NodePropertiesSummary {
  @scala.inline
  def apply(): NodePropertiesSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodePropertiesSummary]
  }
  @scala.inline
  implicit class NodePropertiesSummaryOps[Self <: NodePropertiesSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsMainNode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMainNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsMainNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMainNode")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeIndex(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withNumNodes(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numNodes")(js.undefined)
        ret
    }
  }
  
}

