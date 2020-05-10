package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenewOfferingResult extends js.Object {
  /**
    * Represents the status of the offering transaction for the renewal.
    */
  var offeringTransaction: js.UndefOr[OfferingTransaction] = js.native
}

object RenewOfferingResult {
  @scala.inline
  def apply(): RenewOfferingResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenewOfferingResult]
  }
  @scala.inline
  implicit class RenewOfferingResultOps[Self <: RenewOfferingResult] (val x: Self) extends AnyVal {
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

