package typingsSlinky.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElasticsearchClusterConfig extends js.Object {
  /**
    * Total number of dedicated master nodes, active and on standby, for the cluster.
    */
  var DedicatedMasterCount: js.UndefOr[IntegerClass] = js.native
  /**
    * A boolean value to indicate whether a dedicated master node is enabled. See About Dedicated Master Nodes for more information.
    */
  var DedicatedMasterEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The instance type for a dedicated master node.
    */
  var DedicatedMasterType: js.UndefOr[ESPartitionInstanceType] = js.native
  /**
    * The number of instances in the specified domain cluster.
    */
  var InstanceCount: js.UndefOr[IntegerClass] = js.native
  /**
    * The instance type for an Elasticsearch cluster. UltraWarm instance types are not supported for data instances.
    */
  var InstanceType: js.UndefOr[ESPartitionInstanceType] = js.native
  /**
    * The number of warm nodes in the cluster.
    */
  var WarmCount: js.UndefOr[IntegerClass] = js.native
  /**
    * True to enable warm storage.
    */
  var WarmEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The instance type for the Elasticsearch cluster's warm nodes.
    */
  var WarmType: js.UndefOr[ESWarmPartitionInstanceType] = js.native
  /**
    * Specifies the zone awareness configuration for a domain when zone awareness is enabled.
    */
  var ZoneAwarenessConfig: js.UndefOr[typingsSlinky.awsSdk.esMod.ZoneAwarenessConfig] = js.native
  /**
    * A boolean value to indicate whether zone awareness is enabled. See About Zone Awareness for more information.
    */
  var ZoneAwarenessEnabled: js.UndefOr[Boolean] = js.native
}

object ElasticsearchClusterConfig {
  @scala.inline
  def apply(): ElasticsearchClusterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElasticsearchClusterConfig]
  }
  @scala.inline
  implicit class ElasticsearchClusterConfigOps[Self <: ElasticsearchClusterConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDedicatedMasterCount(value: IntegerClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DedicatedMasterCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDedicatedMasterCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DedicatedMasterCount")(js.undefined)
        ret
    }
    @scala.inline
    def withDedicatedMasterEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DedicatedMasterEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDedicatedMasterEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DedicatedMasterEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDedicatedMasterType(value: ESPartitionInstanceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DedicatedMasterType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDedicatedMasterType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DedicatedMasterType")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceCount(value: IntegerClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceCount")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceType(value: ESPartitionInstanceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(js.undefined)
        ret
    }
    @scala.inline
    def withWarmCount(value: IntegerClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WarmCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarmCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WarmCount")(js.undefined)
        ret
    }
    @scala.inline
    def withWarmEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WarmEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarmEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WarmEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withWarmType(value: ESWarmPartitionInstanceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WarmType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarmType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WarmType")(js.undefined)
        ret
    }
    @scala.inline
    def withZoneAwarenessConfig(value: ZoneAwarenessConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZoneAwarenessConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoneAwarenessConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZoneAwarenessConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withZoneAwarenessEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZoneAwarenessEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoneAwarenessEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZoneAwarenessEnabled")(js.undefined)
        ret
    }
  }
  
}

