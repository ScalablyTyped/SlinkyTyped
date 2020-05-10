package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeGroupConfiguration extends js.Object {
  /**
    * Either the ElastiCache for Redis supplied 4-digit id or a user supplied id for the node group these configuration values apply to.
    */
  var NodeGroupId: js.UndefOr[AllowedNodeGroupId] = js.native
  /**
    * The Availability Zone where the primary node of this node group (shard) is launched.
    */
  var PrimaryAvailabilityZone: js.UndefOr[String] = js.native
  /**
    * A list of Availability Zones to be used for the read replicas. The number of Availability Zones in this list must match the value of ReplicaCount or ReplicasPerNodeGroup if not specified.
    */
  var ReplicaAvailabilityZones: js.UndefOr[AvailabilityZonesList] = js.native
  /**
    * The number of read replica nodes in this node group (shard).
    */
  var ReplicaCount: js.UndefOr[IntegerOptional] = js.native
  /**
    * A string that specifies the keyspace for a particular node group. Keyspaces range from 0 to 16,383. The string is in the format startkey-endkey. Example: "0-3999" 
    */
  var Slots: js.UndefOr[String] = js.native
}

object NodeGroupConfiguration {
  @scala.inline
  def apply(): NodeGroupConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeGroupConfiguration]
  }
  @scala.inline
  implicit class NodeGroupConfigurationOps[Self <: NodeGroupConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNodeGroupId(value: AllowedNodeGroupId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeGroupId")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryAvailabilityZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrimaryAvailabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryAvailabilityZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrimaryAvailabilityZone")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicaAvailabilityZones(value: AvailabilityZonesList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicaAvailabilityZones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicaAvailabilityZones: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicaAvailabilityZones")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicaCount(value: IntegerOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicaCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicaCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicaCount")(js.undefined)
        ret
    }
    @scala.inline
    def withSlots(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Slots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Slots")(js.undefined)
        ret
    }
  }
  
}

