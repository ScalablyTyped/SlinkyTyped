package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowedNodeTypeModificationsMessage extends js.Object {
  /**
    * A string list, each element of which specifies a cache node type which you can use to scale your cluster or replication group. When scaling down a Redis cluster or replication group using ModifyCacheCluster or ModifyReplicationGroup, use a value from this list for the CacheNodeType parameter. 
    */
  var ScaleDownModifications: js.UndefOr[NodeTypeList] = js.native
  /**
    * A string list, each element of which specifies a cache node type which you can use to scale your cluster or replication group. When scaling up a Redis cluster or replication group using ModifyCacheCluster or ModifyReplicationGroup, use a value from this list for the CacheNodeType parameter.
    */
  var ScaleUpModifications: js.UndefOr[NodeTypeList] = js.native
}

object AllowedNodeTypeModificationsMessage {
  @scala.inline
  def apply(): AllowedNodeTypeModificationsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowedNodeTypeModificationsMessage]
  }
  @scala.inline
  implicit class AllowedNodeTypeModificationsMessageOps[Self <: AllowedNodeTypeModificationsMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScaleDownModifications(value: NodeTypeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScaleDownModifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleDownModifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScaleDownModifications")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleUpModifications(value: NodeTypeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScaleUpModifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleUpModifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScaleUpModifications")(js.undefined)
        ret
    }
  }
  
}

