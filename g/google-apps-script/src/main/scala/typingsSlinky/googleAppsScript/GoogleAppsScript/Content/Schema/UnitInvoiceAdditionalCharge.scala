package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnitInvoiceAdditionalCharge extends js.Object {
  var additionalChargeAmount: js.UndefOr[Amount] = js.native
  var additionalChargePromotions: js.UndefOr[js.Array[Promotion]] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object UnitInvoiceAdditionalCharge {
  @scala.inline
  def apply(): UnitInvoiceAdditionalCharge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnitInvoiceAdditionalCharge]
  }
  @scala.inline
  implicit class UnitInvoiceAdditionalChargeOps[Self <: UnitInvoiceAdditionalCharge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalChargeAmount(value: Amount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalChargeAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalChargeAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalChargeAmount")(js.undefined)
        ret
    }
    @scala.inline
    def withAdditionalChargePromotions(value: js.Array[Promotion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalChargePromotions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalChargePromotions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalChargePromotions")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
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

