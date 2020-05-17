package typingsSlinky.gapiClientReseller.gapi.client.reseller

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientReseller.anon.Alt
import typingsSlinky.gapiClientReseller.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResellernotifyResource extends js.Object {
  /** Topic name of the PubSub */
  var topicName: js.UndefOr[String] = js.native
  /** Returns all the details of the watch corresponding to the reseller. */
  def getwatchdetails(request: Alt): Request[ResellernotifyGetwatchdetailsResponse] = js.native
  /** Registers a Reseller for receiving notifications. */
  def register(request: Fields): Request[ResellernotifyResource] = js.native
  /** Unregisters a Reseller for receiving notifications. */
  def unregister(request: Fields): Request[ResellernotifyResource] = js.native
}

object ResellernotifyResource {
  @scala.inline
  def apply(
    getwatchdetails: Alt => Request[ResellernotifyGetwatchdetailsResponse],
    register: Fields => Request[ResellernotifyResource],
    unregister: Fields => Request[ResellernotifyResource]
  ): ResellernotifyResource = {
    val __obj = js.Dynamic.literal(getwatchdetails = js.Any.fromFunction1(getwatchdetails), register = js.Any.fromFunction1(register), unregister = js.Any.fromFunction1(unregister))
    __obj.asInstanceOf[ResellernotifyResource]
  }
  @scala.inline
  implicit class ResellernotifyResourceOps[Self <: ResellernotifyResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetwatchdetails(value: Alt => Request[ResellernotifyGetwatchdetailsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getwatchdetails")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegister(value: Fields => Request[ResellernotifyResource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("register")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnregister(value: Fields => Request[ResellernotifyResource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unregister")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTopicName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topicName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopicName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topicName")(js.undefined)
        ret
    }
  }
  
}

