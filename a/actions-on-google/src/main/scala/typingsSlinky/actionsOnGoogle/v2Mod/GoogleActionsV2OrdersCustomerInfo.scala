package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2OrdersCustomerInfo extends js.Object {
  /**
    * Customer email will be included and returned to the app if
    * CustomerInfoProperty.EMAIL specified in CustomerInfoOptions.
    */
  var email: js.UndefOr[String] = js.native
}

object GoogleActionsV2OrdersCustomerInfo {
  @scala.inline
  def apply(): GoogleActionsV2OrdersCustomerInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersCustomerInfo]
  }
  @scala.inline
  implicit class GoogleActionsV2OrdersCustomerInfoOps[Self <: GoogleActionsV2OrdersCustomerInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
  }
  
}

