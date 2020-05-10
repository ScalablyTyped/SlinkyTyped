package typingsSlinky.gapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAndroiddeviceprovisioning.AnonAlt
import typingsSlinky.gapiClientAndroiddeviceprovisioning.AnonBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomersResource extends js.Object {
  /**
    * Creates a customer for zero-touch enrollment. After the method returns
    * successfully, admin and owner roles can manage devices and EMM configs
    * by calling API methods or using their zero-touch enrollment portal. The API
    * doesn't notify the customer that they have access.
    */
  def create(request: AnonAlt): Request_[Company] = js.native
  /**
    * Lists the customers that are enrolled to the reseller identified by the
    * `partnerId` argument. This list includes customers that the reseller
    * created and customers that enrolled themselves using the portal.
    */
  def list(request: AnonBearertoken): Request_[ListCustomersResponse] = js.native
}

object CustomersResource {
  @scala.inline
  def apply(create: AnonAlt => Request_[Company], list: AnonBearertoken => Request_[ListCustomersResponse]): CustomersResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[CustomersResource]
  }
  @scala.inline
  implicit class CustomersResourceOps[Self <: CustomersResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: AnonAlt => Request_[Company]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonBearertoken => Request_[ListCustomersResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

