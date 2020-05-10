package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegionalConfiguration extends js.Object {
  /**
    * The name of the secondary cluster
    */
  var ReplicationGroupId: String = js.native
  /**
    * The AWS region where the cluster is stored
    */
  var ReplicationGroupRegion: String = js.native
  /**
    * A list of PreferredAvailabilityZones objects that specifies the configuration of a node group in the resharded cluster. 
    */
  var ReshardingConfiguration: ReshardingConfigurationList = js.native
}

object RegionalConfiguration {
  @scala.inline
  def apply(
    ReplicationGroupId: String,
    ReplicationGroupRegion: String,
    ReshardingConfiguration: ReshardingConfigurationList
  ): RegionalConfiguration = {
    val __obj = js.Dynamic.literal(ReplicationGroupId = ReplicationGroupId.asInstanceOf[js.Any], ReplicationGroupRegion = ReplicationGroupRegion.asInstanceOf[js.Any], ReshardingConfiguration = ReshardingConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegionalConfiguration]
  }
  @scala.inline
  implicit class RegionalConfigurationOps[Self <: RegionalConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReplicationGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplicationGroupRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationGroupRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReshardingConfiguration(value: ReshardingConfigurationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReshardingConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

