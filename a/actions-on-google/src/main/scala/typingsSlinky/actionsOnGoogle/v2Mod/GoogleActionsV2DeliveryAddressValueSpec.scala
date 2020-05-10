package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2DeliveryAddressValueSpec extends js.Object {
  /**
    * Configuration for delivery address dialog.
    */
  var addressOptions: js.UndefOr[GoogleActionsV2DeliveryAddressValueSpecAddressOptions] = js.native
}

object GoogleActionsV2DeliveryAddressValueSpec {
  @scala.inline
  def apply(): GoogleActionsV2DeliveryAddressValueSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2DeliveryAddressValueSpec]
  }
  @scala.inline
  implicit class GoogleActionsV2DeliveryAddressValueSpecOps[Self <: GoogleActionsV2DeliveryAddressValueSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddressOptions(value: GoogleActionsV2DeliveryAddressValueSpecAddressOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddressOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressOptions")(js.undefined)
        ret
    }
  }
  
}

