package typingsSlinky.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAdexchangebuyer.AnonAccountId
import typingsSlinky.gapiClientAdexchangebuyer.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BillingInfoResource extends js.Object {
  /** Returns the billing information for one account specified by account ID. */
  def get(request: AnonAccountId): Request_[BillingInfo] = js.native
  /** Retrieves a list of billing information for all accounts of the authenticated user. */
  def list(request: AnonFields): Request_[BillingInfoList] = js.native
}

object BillingInfoResource {
  @scala.inline
  def apply(get: AnonAccountId => Request_[BillingInfo], list: AnonFields => Request_[BillingInfoList]): BillingInfoResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[BillingInfoResource]
  }
  @scala.inline
  implicit class BillingInfoResourceOps[Self <: BillingInfoResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: AnonAccountId => Request_[BillingInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonFields => Request_[BillingInfoList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

