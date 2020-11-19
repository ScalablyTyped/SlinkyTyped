package typingsSlinky.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeDetails extends js.Object {
  
  /**
    * Specifies whether the current node is the main node for a multi-node parallel job.
    */
  var isMainNode: js.UndefOr[Boolean] = js.native
  
  /**
    * The node index for the node. Node index numbering begins at zero. This index is also available on the node with the AWS_BATCH_JOB_NODE_INDEX environment variable.
    */
  var nodeIndex: js.UndefOr[Integer] = js.native
}
object NodeDetails {
  
  @scala.inline
  def apply(): NodeDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeDetails]
  }
  
  @scala.inline
  implicit class NodeDetailsOps[Self <: NodeDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIsMainNode(value: Boolean): Self = this.set("isMainNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsMainNode: Self = this.set("isMainNode", js.undefined)
    
    @scala.inline
    def setNodeIndex(value: Integer): Self = this.set("nodeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeIndex: Self = this.set("nodeIndex", js.undefined)
  }
}
