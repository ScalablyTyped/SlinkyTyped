package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PurchaseReservedNodeOfferingResult extends js.Object {
  var ReservedNode: js.UndefOr[typingsSlinky.awsSdk.redshiftMod.ReservedNode] = js.native
}

object PurchaseReservedNodeOfferingResult {
  @scala.inline
  def apply(): PurchaseReservedNodeOfferingResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PurchaseReservedNodeOfferingResult]
  }
  @scala.inline
  implicit class PurchaseReservedNodeOfferingResultOps[Self <: PurchaseReservedNodeOfferingResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReservedNode(value: ReservedNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservedNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedNode")(js.undefined)
        ret
    }
  }
  
}

