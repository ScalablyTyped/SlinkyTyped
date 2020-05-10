package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PurchaseReservedInstancesOfferingResult extends js.Object {
  /**
    * The IDs of the purchased Reserved Instances.
    */
  var ReservedInstancesId: js.UndefOr[String] = js.native
}

object PurchaseReservedInstancesOfferingResult {
  @scala.inline
  def apply(): PurchaseReservedInstancesOfferingResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PurchaseReservedInstancesOfferingResult]
  }
  @scala.inline
  implicit class PurchaseReservedInstancesOfferingResultOps[Self <: PurchaseReservedInstancesOfferingResult] (val x: Self) extends AnyVal {
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
  }
  
}

