package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReservedInstancesModificationResult extends js.Object {
  /**
    * The ID for the Reserved Instances that were created as part of the modification request. This field is only available when the modification is fulfilled.
    */
  var ReservedInstancesId: js.UndefOr[String] = js.native
  /**
    * The target Reserved Instances configurations supplied as part of the modification request.
    */
  var TargetConfiguration: js.UndefOr[ReservedInstancesConfiguration] = js.native
}

object ReservedInstancesModificationResult {
  @scala.inline
  def apply(): ReservedInstancesModificationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedInstancesModificationResult]
  }
  @scala.inline
  implicit class ReservedInstancesModificationResultOps[Self <: ReservedInstancesModificationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReservedInstancesId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedInstancesId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservedInstancesId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedInstancesId")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetConfiguration(value: ReservedInstancesConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetConfiguration")(js.undefined)
        ret
    }
  }
  
}

