package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OfferingStatus extends js.Object {
  /**
    * The date on which the offering is effective.
    */
  var effectiveOn: js.UndefOr[js.Date] = js.native
  /**
    * Represents the metadata of an offering status.
    */
  var offering: js.UndefOr[Offering] = js.native
  /**
    * The number of available devices in the offering.
    */
  var quantity: js.UndefOr[Integer] = js.native
  /**
    * The type specified for the offering status.
    */
  var `type`: js.UndefOr[OfferingTransactionType] = js.native
}

object OfferingStatus {
  @scala.inline
  def apply(): OfferingStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OfferingStatus]
  }
  @scala.inline
  implicit class OfferingStatusOps[Self <: OfferingStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEffectiveOn(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectiveOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffectiveOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectiveOn")(js.undefined)
        ret
    }
    @scala.inline
    def withOffering(value: Offering): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offering")(js.undefined)
        ret
    }
    @scala.inline
    def withQuantity(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuantity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: OfferingTransactionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

