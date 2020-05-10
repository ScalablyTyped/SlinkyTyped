package typingsSlinky.pulumiAws.outputMod.emr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterCoreInstanceGroup extends js.Object {
  var autoscalingPolicy: js.UndefOr[String] = js.native
  var bidPrice: js.UndefOr[String] = js.native
  var ebsConfigs: js.Array[ClusterCoreInstanceGroupEbsConfig] = js.native
  /**
    * The ID of the EMR Cluster
    */
  var id: String = js.native
  var instanceCount: js.UndefOr[Double] = js.native
  var instanceType: String = js.native
  /**
    * The name of the job flow
    */
  var name: js.UndefOr[String] = js.native
}

object ClusterCoreInstanceGroup {
  @scala.inline
  def apply(ebsConfigs: js.Array[ClusterCoreInstanceGroupEbsConfig], id: String, instanceType: String): ClusterCoreInstanceGroup = {
    val __obj = js.Dynamic.literal(ebsConfigs = ebsConfigs.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterCoreInstanceGroup]
  }
  @scala.inline
  implicit class ClusterCoreInstanceGroupOps[Self <: ClusterCoreInstanceGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEbsConfigs(value: js.Array[ClusterCoreInstanceGroupEbsConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ebsConfigs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoscalingPolicy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoscalingPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoscalingPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoscalingPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withBidPrice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bidPrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBidPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bidPrice")(js.undefined)
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
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

