package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiaOnDisplayToOrderSettings extends js.Object {
  var shippingCostPolicyUrl: js.UndefOr[String] = js.native
  var status: js.UndefOr[String] = js.native
}

object LiaOnDisplayToOrderSettings {
  @scala.inline
  def apply(): LiaOnDisplayToOrderSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiaOnDisplayToOrderSettings]
  }
  @scala.inline
  implicit class LiaOnDisplayToOrderSettingsOps[Self <: LiaOnDisplayToOrderSettings] (val x: Self) extends AnyVal {
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

