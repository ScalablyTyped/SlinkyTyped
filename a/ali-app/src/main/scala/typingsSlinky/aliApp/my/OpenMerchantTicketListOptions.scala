package typingsSlinky.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenMerchantTicketListOptions
  extends BaseOptions[js.Any, js.Any] {
  var partnerId: String = js.native
}

object OpenMerchantTicketListOptions {
  @scala.inline
  def apply(partnerId: String): OpenMerchantTicketListOptions = {
    val __obj = js.Dynamic.literal(partnerId = partnerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenMerchantTicketListOptions]
  }
  @scala.inline
  implicit class OpenMerchantTicketListOptionsOps[Self <: OpenMerchantTicketListOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPartnerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partnerId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

