package typingsSlinky.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeliveryControl extends js.Object {
  var creativeBlockingLevel: js.UndefOr[String] = js.native
  var deliveryRateType: js.UndefOr[String] = js.native
  var frequencyCaps: js.UndefOr[js.Array[DeliveryControlFrequencyCap]] = js.native
}

object DeliveryControl {
  @scala.inline
  def apply(): DeliveryControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeliveryControl]
  }
  @scala.inline
  implicit class DeliveryControlOps[Self <: DeliveryControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreativeBlockingLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeBlockingLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreativeBlockingLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeBlockingLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withDeliveryRateType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliveryRateType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeliveryRateType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliveryRateType")(js.undefined)
        ret
    }
    @scala.inline
    def withFrequencyCaps(value: js.Array[DeliveryControlFrequencyCap]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frequencyCaps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrequencyCaps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frequencyCaps")(js.undefined)
        ret
    }
  }
  
}

