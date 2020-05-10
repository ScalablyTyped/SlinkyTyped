package typingsSlinky.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeProperties extends js.Object {
  /**
    * Specifies the node index for the main node of a multi-node parallel job. This node index value must be fewer than the number of nodes.
    */
  var mainNode: Integer = js.native
  /**
    * A list of node ranges and their properties associated with a multi-node parallel job.
    */
  var nodeRangeProperties: NodeRangeProperties = js.native
  /**
    * The number of nodes associated with a multi-node parallel job.
    */
  var numNodes: Integer = js.native
}

object NodeProperties {
  @scala.inline
  def apply(mainNode: Integer, nodeRangeProperties: NodeRangeProperties, numNodes: Integer): NodeProperties = {
    val __obj = js.Dynamic.literal(mainNode = mainNode.asInstanceOf[js.Any], nodeRangeProperties = nodeRangeProperties.asInstanceOf[js.Any], numNodes = numNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeProperties]
  }
  @scala.inline
  implicit class NodePropertiesOps[Self <: NodeProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMainNode(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeRangeProperties(value: NodeRangeProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeRangeProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumNodes(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numNodes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

