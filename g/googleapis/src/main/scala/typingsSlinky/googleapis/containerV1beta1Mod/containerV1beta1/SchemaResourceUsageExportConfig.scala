package typingsSlinky.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration for exporting cluster resource usages.
  */
@js.native
trait SchemaResourceUsageExportConfig extends js.Object {
  /**
    * Configuration to use BigQuery as usage export destination.
    */
  var bigqueryDestination: js.UndefOr[SchemaBigQueryDestination] = js.native
  /**
    * Whether to enable network egress metering for this cluster. If enabled, a
    * daemonset will be created in the cluster to meter network egress traffic.
    */
  var enableNetworkEgressMetering: js.UndefOr[Boolean] = js.native
}

object SchemaResourceUsageExportConfig {
  @scala.inline
  def apply(): SchemaResourceUsageExportConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceUsageExportConfig]
  }
  @scala.inline
  implicit class SchemaResourceUsageExportConfigOps[Self <: SchemaResourceUsageExportConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBigqueryDestination(value: SchemaBigQueryDestination): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bigqueryDestination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBigqueryDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bigqueryDestination")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableNetworkEgressMetering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableNetworkEgressMetering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableNetworkEgressMetering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableNetworkEgressMetering")(js.undefined)
        ret
    }
  }
  
}

