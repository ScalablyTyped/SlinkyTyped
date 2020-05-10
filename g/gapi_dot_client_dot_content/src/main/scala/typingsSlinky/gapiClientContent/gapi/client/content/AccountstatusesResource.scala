package typingsSlinky.gapiClientContent.gapi.client.content

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientContent.AnonAlt
import typingsSlinky.gapiClientContent.AnonKey
import typingsSlinky.gapiClientContent.AnonMaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountstatusesResource extends js.Object {
  def custombatch(request: AnonAlt): Request_[AccountstatusesCustomBatchResponse] = js.native
  /**
    * Retrieves the status of a Merchant Center account. This method can only be called for accounts to which the managing account has access: either the
    * managing account itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account.
    */
  def get(request: AnonKey): Request_[AccountStatus] = js.native
  /** Lists the statuses of the sub-accounts in your Merchant Center account. This method can only be called for multi-client accounts. */
  def list(request: AnonMaxResults): Request_[AccountstatusesListResponse] = js.native
}

object AccountstatusesResource {
  @scala.inline
  def apply(
    custombatch: AnonAlt => Request_[AccountstatusesCustomBatchResponse],
    get: AnonKey => Request_[AccountStatus],
    list: AnonMaxResults => Request_[AccountstatusesListResponse]
  ): AccountstatusesResource = {
    val __obj = js.Dynamic.literal(custombatch = js.Any.fromFunction1(custombatch), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[AccountstatusesResource]
  }
  @scala.inline
  implicit class AccountstatusesResourceOps[Self <: AccountstatusesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustombatch(value: AnonAlt => Request_[AccountstatusesCustomBatchResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custombatch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonKey => Request_[AccountStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonMaxResults => Request_[AccountstatusesListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

