package typingsSlinky.gapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCustomersResponse extends js.Object {
  /** List of customers related to this partner. */
  var customers: js.UndefOr[js.Array[Company]] = js.native
}

object ListCustomersResponse {
  @scala.inline
  def apply(): ListCustomersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCustomersResponse]
  }
  @scala.inline
  implicit class ListCustomersResponseOps[Self <: ListCustomersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomers(value: js.Array[Company]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customers")(js.undefined)
        ret
    }
  }
  
}

