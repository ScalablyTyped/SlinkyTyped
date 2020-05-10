package typingsSlinky.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateNodegroupConfigRequest extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientRequestToken: js.UndefOr[String] = js.native
  /**
    * The name of the Amazon EKS cluster that the managed node group resides in.
    */
  var clusterName: String = js.native
  /**
    * The Kubernetes labels to be applied to the nodes in the node group after the update.
    */
  var labels: js.UndefOr[UpdateLabelsPayload] = js.native
  /**
    * The name of the managed node group to update.
    */
  var nodegroupName: String = js.native
  /**
    * The scaling configuration details for the Auto Scaling group after the update.
    */
  var scalingConfig: js.UndefOr[NodegroupScalingConfig] = js.native
}

object UpdateNodegroupConfigRequest {
  @scala.inline
  def apply(clusterName: String, nodegroupName: String): UpdateNodegroupConfigRequest = {
    val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any], nodegroupName = nodegroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateNodegroupConfigRequest]
  }
  @scala.inline
  implicit class UpdateNodegroupConfigRequestOps[Self <: UpdateNodegroupConfigRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodegroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodegroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientRequestToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientRequestToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientRequestToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientRequestToken")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: UpdateLabelsPayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withScalingConfig(value: NodegroupScalingConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scalingConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScalingConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scalingConfig")(js.undefined)
        ret
    }
  }
  
}

