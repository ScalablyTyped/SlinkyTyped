package typingsSlinky.pulumiAws.outputMod.elasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDomainClusterConfig extends js.Object {
  /**
    * Number of dedicated master nodes in the cluster.
    */
  var dedicatedMasterCount: Double = js.native
  /**
    * Indicates whether dedicated master nodes are enabled for the cluster.
    */
  var dedicatedMasterEnabled: Boolean = js.native
  /**
    * Instance type of the dedicated master nodes in the cluster.
    */
  var dedicatedMasterType: String = js.native
  /**
    * Number of instances in the cluster.
    */
  var instanceCount: Double = js.native
  /**
    * Instance type of data nodes in the cluster.
    */
  var instanceType: String = js.native
  /**
    * Configuration block containing zone awareness settings.
    */
  var zoneAwarenessConfigs: js.Array[GetDomainClusterConfigZoneAwarenessConfig] = js.native
  /**
    * Indicates whether zone awareness is enabled.
    */
  var zoneAwarenessEnabled: Boolean = js.native
}

object GetDomainClusterConfig {
  @scala.inline
  def apply(
    dedicatedMasterCount: Double,
    dedicatedMasterEnabled: Boolean,
    dedicatedMasterType: String,
    instanceCount: Double,
    instanceType: String,
    zoneAwarenessConfigs: js.Array[GetDomainClusterConfigZoneAwarenessConfig],
    zoneAwarenessEnabled: Boolean
  ): GetDomainClusterConfig = {
    val __obj = js.Dynamic.literal(dedicatedMasterCount = dedicatedMasterCount.asInstanceOf[js.Any], dedicatedMasterEnabled = dedicatedMasterEnabled.asInstanceOf[js.Any], dedicatedMasterType = dedicatedMasterType.asInstanceOf[js.Any], instanceCount = instanceCount.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any], zoneAwarenessConfigs = zoneAwarenessConfigs.asInstanceOf[js.Any], zoneAwarenessEnabled = zoneAwarenessEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainClusterConfig]
  }
  @scala.inline
  implicit class GetDomainClusterConfigOps[Self <: GetDomainClusterConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDedicatedMasterCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dedicatedMasterCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDedicatedMasterEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dedicatedMasterEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDedicatedMasterType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dedicatedMasterType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoneAwarenessConfigs(value: js.Array[GetDomainClusterConfigZoneAwarenessConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoneAwarenessConfigs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoneAwarenessEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoneAwarenessEnabled")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

