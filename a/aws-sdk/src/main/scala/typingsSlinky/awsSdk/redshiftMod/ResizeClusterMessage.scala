package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResizeClusterMessage extends js.Object {
  /**
    * A boolean value indicating whether the resize operation is using the classic resize process. If you don't provide this parameter or set the value to false, the resize type is elastic. 
    */
  var Classic: js.UndefOr[BooleanOptional] = js.native
  /**
    * The unique identifier for the cluster to resize.
    */
  var ClusterIdentifier: String = js.native
  /**
    * The new cluster type for the specified cluster.
    */
  var ClusterType: js.UndefOr[String] = js.native
  /**
    * The new node type for the nodes you are adding. If not specified, the cluster's current node type is used.
    */
  var NodeType: js.UndefOr[String] = js.native
  /**
    * The new number of nodes for the cluster.
    */
  var NumberOfNodes: js.UndefOr[Integer] = js.native
}

object ResizeClusterMessage {
  @scala.inline
  def apply(ClusterIdentifier: String): ResizeClusterMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizeClusterMessage]
  }
  @scala.inline
  implicit class ResizeClusterMessageOps[Self <: ResizeClusterMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassic(value: BooleanOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Classic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Classic")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterType")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeType")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfNodes(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfNodes")(js.undefined)
        ret
    }
  }
  
}

