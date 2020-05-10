package typingsSlinky.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ClusterAutoscaling contains global, per-cluster information required by
  * Cluster Autoscaler to automatically adjust the size of the cluster and
  * create/delete node pools based on the current needs.
  */
@js.native
trait SchemaClusterAutoscaling extends js.Object {
  /**
    * Enables automatic node pool creation and deletion.
    */
  var enableNodeAutoprovisioning: js.UndefOr[Boolean] = js.native
  /**
    * Contains global constraints regarding minimum and maximum amount of
    * resources in the cluster.
    */
  var resourceLimits: js.UndefOr[js.Array[SchemaResourceLimit]] = js.native
}

object SchemaClusterAutoscaling {
  @scala.inline
  def apply(): SchemaClusterAutoscaling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClusterAutoscaling]
  }
  @scala.inline
  implicit class SchemaClusterAutoscalingOps[Self <: SchemaClusterAutoscaling] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnableNodeAutoprovisioning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableNodeAutoprovisioning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableNodeAutoprovisioning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableNodeAutoprovisioning")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceLimits(value: js.Array[SchemaResourceLimit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceLimits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceLimits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceLimits")(js.undefined)
        ret
    }
  }
  
}

