package typingsSlinky.googleapis.containerV1Mod.containerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NodePoolAutoscaling contains information required by cluster autoscaler to
  * adjust the size of the node pool to the current cluster usage.
  */
@js.native
trait SchemaNodePoolAutoscaling extends js.Object {
  /**
    * Is autoscaling enabled for this node pool.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Maximum number of nodes in the NodePool. Must be &gt;= min_node_count.
    * There has to enough quota to scale up the cluster.
    */
  var maxNodeCount: js.UndefOr[Double] = js.native
  /**
    * Minimum number of nodes in the NodePool. Must be &gt;= 1 and &lt;=
    * max_node_count.
    */
  var minNodeCount: js.UndefOr[Double] = js.native
}

object SchemaNodePoolAutoscaling {
  @scala.inline
  def apply(): SchemaNodePoolAutoscaling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodePoolAutoscaling]
  }
  @scala.inline
  implicit class SchemaNodePoolAutoscalingOps[Self <: SchemaNodePoolAutoscaling] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxNodeCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxNodeCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxNodeCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxNodeCount")(js.undefined)
        ret
    }
    @scala.inline
    def withMinNodeCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minNodeCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinNodeCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minNodeCount")(js.undefined)
        ret
    }
  }
  
}

