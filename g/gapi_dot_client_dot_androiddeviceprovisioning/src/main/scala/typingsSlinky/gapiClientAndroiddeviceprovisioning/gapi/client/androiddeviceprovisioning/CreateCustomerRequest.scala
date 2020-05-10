package typingsSlinky.gapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCustomerRequest extends js.Object {
  /**
    * Required. The company data to populate the new customer. Must contain a
    * value for `companyName` and at least one `owner_email` that's associated
    * with a Google Account. The values for `companyId` and `name` must be empty.
    */
  var customer: js.UndefOr[Company] = js.native
}

object CreateCustomerRequest {
  @scala.inline
  def apply(): CreateCustomerRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCustomerRequest]
  }
  @scala.inline
  implicit class CreateCustomerRequestOps[Self <: CreateCustomerRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomer(value: Company): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer")(js.undefined)
        ret
    }
  }
  
}

