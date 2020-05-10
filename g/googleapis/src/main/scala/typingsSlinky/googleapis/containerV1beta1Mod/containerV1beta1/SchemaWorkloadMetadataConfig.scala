package typingsSlinky.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * WorkloadMetadataConfig defines the metadata configuration to expose to
  * workloads on the node pool.
  */
@js.native
trait SchemaWorkloadMetadataConfig extends js.Object {
  /**
    * NodeMetadata is the configuration for how to expose the node metadata to
    * the workload running on the node.
    */
  var nodeMetadata: js.UndefOr[String] = js.native
}

object SchemaWorkloadMetadataConfig {
  @scala.inline
  def apply(): SchemaWorkloadMetadataConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkloadMetadataConfig]
  }
  @scala.inline
  implicit class SchemaWorkloadMetadataConfigOps[Self <: SchemaWorkloadMetadataConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNodeMetadata(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeMetadata")(js.undefined)
        ret
    }
  }
  
}

