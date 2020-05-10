package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message contains details about how the deals will be paced.
  */
@js.native
trait SchemaDeliveryControl extends js.Object {
  /**
    * Specified the creative blocking levels to be applied. @OutputOnly
    */
  var creativeBlockingLevel: js.UndefOr[String] = js.native
  /**
    * Specifies how the impression delivery will be paced. @OutputOnly
    */
  var deliveryRateType: js.UndefOr[String] = js.native
  /**
    * Specifies any frequency caps. @OutputOnly
    */
  var frequencyCaps: js.UndefOr[js.Array[SchemaFrequencyCap]] = js.native
}

object SchemaDeliveryControl {
  @scala.inline
  def apply(): SchemaDeliveryControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeliveryControl]
  }
  @scala.inline
  implicit class SchemaDeliveryControlOps[Self <: SchemaDeliveryControl] (val x: Self) extends AnyVal {
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
    def withFrequencyCaps(value: js.Array[SchemaFrequencyCap]): Self = {
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

