package typingsSlinky.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdWordsManagerAccountInfo extends js.Object {
  /** Name of the customer this account represents. */
  var customerName: js.UndefOr[String] = js.native
  /** The AdWords Manager Account id. */
  var id: js.UndefOr[String] = js.native
}

object AdWordsManagerAccountInfo {
  @scala.inline
  def apply(): AdWordsManagerAccountInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdWordsManagerAccountInfo]
  }
  @scala.inline
  implicit class AdWordsManagerAccountInfoOps[Self <: AdWordsManagerAccountInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerName")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
  }
  
}

