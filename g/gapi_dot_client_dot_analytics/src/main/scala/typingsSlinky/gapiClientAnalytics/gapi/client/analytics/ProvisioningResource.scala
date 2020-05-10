package typingsSlinky.gapiClientAnalytics.gapi.client.analytics

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAnalytics.AnonFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisioningResource extends js.Object {
  /** Creates an account ticket. */
  def createAccountTicket(request: AnonFieldsKey): Request_[AccountTicket] = js.native
}

object ProvisioningResource {
  @scala.inline
  def apply(createAccountTicket: AnonFieldsKey => Request_[AccountTicket]): ProvisioningResource = {
    val __obj = js.Dynamic.literal(createAccountTicket = js.Any.fromFunction1(createAccountTicket))
    __obj.asInstanceOf[ProvisioningResource]
  }
  @scala.inline
  implicit class ProvisioningResourceOps[Self <: ProvisioningResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateAccountTicket(value: AnonFieldsKey => Request_[AccountTicket]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createAccountTicket")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

