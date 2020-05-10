package typingsSlinky.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomerRiskData extends js.Object {
  var customerBrowser: js.UndefOr[String] = js.native
  var customerIp: js.UndefOr[String] = js.native
}

object CustomerRiskData {
  @scala.inline
  def apply(): CustomerRiskData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerRiskData]
  }
  @scala.inline
  implicit class CustomerRiskDataOps[Self <: CustomerRiskData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomerBrowser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerBrowser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomerBrowser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerBrowser")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomerIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomerIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerIp")(js.undefined)
        ret
    }
  }
  
}

