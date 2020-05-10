package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheNode extends js.Object {
  /**
    * The date and time when the cache node was created.
    */
  var CacheNodeCreateTime: js.UndefOr[js.Date] = js.native
  /**
    * The cache node identifier. A node ID is a numeric identifier (0001, 0002, etc.). The combination of cluster ID and node ID uniquely identifies every cache node used in a customer's AWS account.
    */
  var CacheNodeId: js.UndefOr[String] = js.native
  /**
    * The current state of this cache node, one of the following values: available, creating, rebooting, or deleting.
    */
  var CacheNodeStatus: js.UndefOr[String] = js.native
  /**
    * The Availability Zone where this node was created and now resides.
    */
  var CustomerAvailabilityZone: js.UndefOr[String] = js.native
  /**
    * The hostname for connecting to this cache node.
    */
  var Endpoint: js.UndefOr[typingsSlinky.awsSdk.elasticacheMod.Endpoint] = js.native
  /**
    * The status of the parameter group applied to this cache node.
    */
  var ParameterGroupStatus: js.UndefOr[String] = js.native
  /**
    * The ID of the primary node to which this read replica node is synchronized. If this field is empty, this node is not associated with a primary cluster.
    */
  var SourceCacheNodeId: js.UndefOr[String] = js.native
}

object CacheNode {
  @scala.inline
  def apply(): CacheNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheNode]
  }
  @scala.inline
  implicit class CacheNodeOps[Self <: CacheNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheNodeCreateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheNodeCreateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheNodeCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheNodeCreateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheNodeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheNodeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheNodeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheNodeId")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheNodeStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheNodeStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheNodeStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheNodeStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomerAvailabilityZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomerAvailabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomerAvailabilityZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomerAvailabilityZone")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpoint(value: Endpoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Endpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withParameterGroupStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterGroupStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterGroupStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterGroupStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceCacheNodeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceCacheNodeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceCacheNodeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceCacheNodeId")(js.undefined)
        ret
    }
  }
  
}

