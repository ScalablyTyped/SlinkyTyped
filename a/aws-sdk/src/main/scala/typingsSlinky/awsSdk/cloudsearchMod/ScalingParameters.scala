package typingsSlinky.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScalingParameters extends js.Object {
  /**
    * The instance type that you want to preconfigure for your domain. For example, search.m1.small.
    */
  var DesiredInstanceType: js.UndefOr[PartitionInstanceType] = js.native
  /**
    * The number of partitions you want to preconfigure for your domain. Only valid when you select m2.2xlarge as the desired instance type.
    */
  var DesiredPartitionCount: js.UndefOr[UIntValue] = js.native
  /**
    * The number of replicas you want to preconfigure for each index partition.
    */
  var DesiredReplicationCount: js.UndefOr[UIntValue] = js.native
}

object ScalingParameters {
  @scala.inline
  def apply(): ScalingParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScalingParameters]
  }
  @scala.inline
  implicit class ScalingParametersOps[Self <: ScalingParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDesiredInstanceType(value: PartitionInstanceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DesiredInstanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesiredInstanceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DesiredInstanceType")(js.undefined)
        ret
    }
    @scala.inline
    def withDesiredPartitionCount(value: UIntValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DesiredPartitionCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesiredPartitionCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DesiredPartitionCount")(js.undefined)
        ret
    }
    @scala.inline
    def withDesiredReplicationCount(value: UIntValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DesiredReplicationCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesiredReplicationCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DesiredReplicationCount")(js.undefined)
        ret
    }
  }
  
}

