package typingsSlinky.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLiaOnDisplayToOrderSettings extends js.Object {
  /**
    * Shipping cost and policy URL.
    */
  var shippingCostPolicyUrl: js.UndefOr[String] = js.native
  /**
    * The status of the ?On display to order? feature.
    */
  var status: js.UndefOr[String] = js.native
}

object SchemaLiaOnDisplayToOrderSettings {
  @scala.inline
  def apply(): SchemaLiaOnDisplayToOrderSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiaOnDisplayToOrderSettings]
  }
  @scala.inline
  implicit class SchemaLiaOnDisplayToOrderSettingsOps[Self <: SchemaLiaOnDisplayToOrderSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShippingCostPolicyUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingCostPolicyUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShippingCostPolicyUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingCostPolicyUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

