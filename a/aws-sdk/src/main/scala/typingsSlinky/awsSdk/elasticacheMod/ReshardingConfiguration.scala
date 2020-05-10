package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReshardingConfiguration extends js.Object {
  /**
    * Either the ElastiCache for Redis supplied 4-digit id or a user supplied id for the node group these configuration values apply to.
    */
  var NodeGroupId: js.UndefOr[AllowedNodeGroupId] = js.native
  /**
    * A list of preferred availability zones for the nodes in this cluster.
    */
  var PreferredAvailabilityZones: js.UndefOr[AvailabilityZonesList] = js.native
}

object ReshardingConfiguration {
  @scala.inline
  def apply(): ReshardingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReshardingConfiguration]
  }
  @scala.inline
  implicit class ReshardingConfigurationOps[Self <: ReshardingConfiguration] (val x: Self) extends AnyVal {
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
    def withPreferredAvailabilityZones(value: AvailabilityZonesList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreferredAvailabilityZones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferredAvailabilityZones: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreferredAvailabilityZones")(js.undefined)
        ret
    }
  }
  
}

