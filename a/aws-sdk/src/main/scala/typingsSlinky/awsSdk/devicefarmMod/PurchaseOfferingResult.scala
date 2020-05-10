package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PurchaseOfferingResult extends js.Object {
  /**
    * Represents the offering transaction for the purchase result.
    */
  var offeringTransaction: js.UndefOr[OfferingTransaction] = js.native
}

object PurchaseOfferingResult {
  @scala.inline
  def apply(): PurchaseOfferingResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PurchaseOfferingResult]
  }
  @scala.inline
  implicit class PurchaseOfferingResultOps[Self <: PurchaseOfferingResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOfferingTransaction(value: OfferingTransaction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offeringTransaction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOfferingTransaction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offeringTransaction")(js.undefined)
        ret
    }
  }
  
}

