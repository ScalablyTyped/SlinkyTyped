package typingsSlinky.gapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PartnersResource extends js.Object {
  var customers: CustomersResource = js.native
  var devices: DevicesResource = js.native
}

object PartnersResource {
  @scala.inline
  def apply(customers: CustomersResource, devices: DevicesResource): PartnersResource = {
    val __obj = js.Dynamic.literal(customers = customers.asInstanceOf[js.Any], devices = devices.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartnersResource]
  }
  @scala.inline
  implicit class PartnersResourceOps[Self <: PartnersResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomers(value: CustomersResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDevices(value: DevicesResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devices")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

