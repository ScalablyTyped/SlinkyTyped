package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2OrdersCustomerInfoOptions extends js.Object {
  /**
    * List of customer info properties.
    */
  var customerInfoProperties: js.UndefOr[js.Array[GoogleActionsV2OrdersCustomerInfoOptionsCustomerInfoProperties]] = js.native
}

object GoogleActionsV2OrdersCustomerInfoOptions {
  @scala.inline
  def apply(): GoogleActionsV2OrdersCustomerInfoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersCustomerInfoOptions]
  }
  @scala.inline
  implicit class GoogleActionsV2OrdersCustomerInfoOptionsOps[Self <: GoogleActionsV2OrdersCustomerInfoOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomerInfoProperties(value: js.Array[GoogleActionsV2OrdersCustomerInfoOptionsCustomerInfoProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerInfoProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomerInfoProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerInfoProperties")(js.undefined)
        ret
    }
  }
  
}

