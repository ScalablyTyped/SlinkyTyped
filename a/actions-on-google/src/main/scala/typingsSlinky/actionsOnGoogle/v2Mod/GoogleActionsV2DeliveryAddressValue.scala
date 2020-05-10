package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2DeliveryAddressValue extends js.Object {
  /**
    * Contains delivery address only when user agrees to share the delivery
    * address.
    */
  var location: js.UndefOr[GoogleActionsV2Location] = js.native
  /**
    * User's decision regarding the request.
    */
  var userDecision: js.UndefOr[GoogleActionsV2DeliveryAddressValueUserDecision] = js.native
}

object GoogleActionsV2DeliveryAddressValue {
  @scala.inline
  def apply(): GoogleActionsV2DeliveryAddressValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2DeliveryAddressValue]
  }
  @scala.inline
  implicit class GoogleActionsV2DeliveryAddressValueOps[Self <: GoogleActionsV2DeliveryAddressValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocation(value: GoogleActionsV2Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withUserDecision(value: GoogleActionsV2DeliveryAddressValueUserDecision): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userDecision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserDecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userDecision")(js.undefined)
        ret
    }
  }
  
}

