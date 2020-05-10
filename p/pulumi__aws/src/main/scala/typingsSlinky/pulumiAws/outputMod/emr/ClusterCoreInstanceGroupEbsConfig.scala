package typingsSlinky.pulumiAws.outputMod.emr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterCoreInstanceGroupEbsConfig extends js.Object {
  var iops: js.UndefOr[Double] = js.native
  var size: Double = js.native
  var `type`: String = js.native
  var volumesPerInstance: js.UndefOr[Double] = js.native
}

object ClusterCoreInstanceGroupEbsConfig {
  @scala.inline
  def apply(size: Double, `type`: String): ClusterCoreInstanceGroupEbsConfig = {
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
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIops(value: Double): Self = {
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
    def withVolumesPerInstance(value: Double): Self = {
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

