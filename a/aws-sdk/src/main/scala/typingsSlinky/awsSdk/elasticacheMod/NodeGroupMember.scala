package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeGroupMember extends js.Object {
  /**
    * The ID of the cluster to which the node belongs.
    */
  var CacheClusterId: js.UndefOr[String] = js.native
  /**
    * The ID of the node within its cluster. A node ID is a numeric identifier (0001, 0002, etc.).
    */
  var CacheNodeId: js.UndefOr[String] = js.native
  /**
    * The role that is currently assigned to the node - primary or replica. This member is only applicable for Redis (cluster mode disabled) replication groups.
    */
  var CurrentRole: js.UndefOr[String] = js.native
  /**
    * The name of the Availability Zone in which the node is located.
    */
  var PreferredAvailabilityZone: js.UndefOr[String] = js.native
  /**
    * The information required for client programs to connect to a node for read operations. The read endpoint is only applicable on Redis (cluster mode disabled) clusters.
    */
  var ReadEndpoint: js.UndefOr[Endpoint] = js.native
}

object NodeGroupMember {
  @scala.inline
  def apply(): NodeGroupMember = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeGroupMember]
  }
  @scala.inline
  implicit class NodeGroupMemberOps[Self <: NodeGroupMember] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheClusterId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheClusterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheClusterId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheClusterId")(js.undefined)
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
    def withCurrentRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentRole")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferredAvailabilityZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreferredAvailabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferredAvailabilityZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreferredAvailabilityZone")(js.undefined)
        ret
    }
    @scala.inline
    def withReadEndpoint(value: Endpoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReadEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReadEndpoint")(js.undefined)
        ret
    }
  }
  
}

