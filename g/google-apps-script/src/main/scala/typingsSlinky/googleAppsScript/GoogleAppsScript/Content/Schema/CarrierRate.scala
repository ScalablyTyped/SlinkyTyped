package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CarrierRate extends js.Object {
  var carrierName: js.UndefOr[String] = js.native
  var carrierService: js.UndefOr[String] = js.native
  var flatAdjustment: js.UndefOr[Price] = js.native
  var name: js.UndefOr[String] = js.native
  var originPostalCode: js.UndefOr[String] = js.native
  var percentageAdjustment: js.UndefOr[String] = js.native
}

object CarrierRate {
  @scala.inline
  def apply(): CarrierRate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CarrierRate]
  }
  @scala.inline
  implicit class CarrierRateOps[Self <: CarrierRate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCarrierName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carrierName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCarrierName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carrierName")(js.undefined)
        ret
    }
    @scala.inline
    def withCarrierService(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carrierService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCarrierService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carrierService")(js.undefined)
        ret
    }
    @scala.inline
    def withFlatAdjustment(value: Price): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flatAdjustment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlatAdjustment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flatAdjustment")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginPostalCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originPostalCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginPostalCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originPostalCode")(js.undefined)
        ret
    }
    @scala.inline
    def withPercentageAdjustment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentageAdjustment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPercentageAdjustment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentageAdjustment")(js.undefined)
        ret
    }
  }
  
}

