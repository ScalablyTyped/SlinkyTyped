package typingsSlinky.pulumiAws.outputMod.elasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainClusterConfig extends js.Object {
  /**
    * Number of dedicated master nodes in the cluster
    */
  var dedicatedMasterCount: js.UndefOr[Double] = js.native
  /**
    * Indicates whether dedicated master nodes are enabled for the cluster.
    */
  var dedicatedMasterEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Instance type of the dedicated master nodes in the cluster.
    */
  var dedicatedMasterType: js.UndefOr[String] = js.native
  /**
    * Number of instances in the cluster.
    */
  var instanceCount: js.UndefOr[Double] = js.native
  /**
    * Instance type of data nodes in the cluster.
    */
  var instanceType: js.UndefOr[String] = js.native
  /**
    * Configuration block containing zone awareness settings. Documented below.
    */
  var zoneAwarenessConfig: js.UndefOr[DomainClusterConfigZoneAwarenessConfig] = js.native
  /**
    * Indicates whether zone awareness is enabled. To enable awareness with three Availability Zones, the `availabilityZoneCount` within the `zoneAwarenessConfig` must be set to `3`.
    */
  var zoneAwarenessEnabled: js.UndefOr[Boolean] = js.native
}

object DomainClusterConfig {
  @scala.inline
  def apply(): DomainClusterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainClusterConfig]
  }
  @scala.inline
  implicit class DomainClusterConfigOps[Self <: DomainClusterConfig] (val x: Self) extends AnyVal {
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
    def withoutDedicatedMasterCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dedicatedMasterCount")(js.undefined)
        ret
    }
    @scala.inline
    def withDedicatedMasterEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dedicatedMasterEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDedicatedMasterEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dedicatedMasterEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDedicatedMasterType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dedicatedMasterType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDedicatedMasterType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dedicatedMasterType")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceCount")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceType")(js.undefined)
        ret
    }
    @scala.inline
    def withZoneAwarenessConfig(value: DomainClusterConfigZoneAwarenessConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoneAwarenessConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoneAwarenessConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoneAwarenessConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withZoneAwarenessEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoneAwarenessEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoneAwarenessEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoneAwarenessEnabled")(js.undefined)
        ret
    }
  }
  
}

