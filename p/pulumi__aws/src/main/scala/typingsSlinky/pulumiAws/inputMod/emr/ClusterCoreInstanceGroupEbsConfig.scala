package typingsSlinky.pulumiAws.inputMod.emr

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterCoreInstanceGroupEbsConfig extends js.Object {
  var iops: js.UndefOr[Input[Double]] = js.native
  var size: Input[Double] = js.native
  var `type`: Input[String] = js.native
  var volumesPerInstance: js.UndefOr[Input[Double]] = js.native
}

object ClusterCoreInstanceGroupEbsConfig {
  @scala.inline
  def apply(size: Input[Double], `type`: Input[String]): ClusterCoreInstanceGroupEbsConfig = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterCoreInstanceGroupEbsConfig]
  }
  @scala.inline
  implicit class ClusterCoreInstanceGroupEbsConfigOps[Self <: ClusterCoreInstanceGroupEbsConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSize(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIops(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIops: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iops")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumesPerInstance(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumesPerInstance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumesPerInstance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumesPerInstance")(js.undefined)
        ret
    }
  }
  
}

