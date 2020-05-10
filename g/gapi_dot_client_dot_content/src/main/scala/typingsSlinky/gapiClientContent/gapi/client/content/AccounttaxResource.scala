package typingsSlinky.gapiClientContent.gapi.client.content

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientContent.AnonDryRun
import typingsSlinky.gapiClientContent.AnonKey
import typingsSlinky.gapiClientContent.AnonMaxResults
import typingsSlinky.gapiClientContent.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccounttaxResource extends js.Object {
  /** Retrieves and updates tax settings of multiple accounts in a single request. */
  def custombatch(request: AnonDryRun): Request_[AccounttaxCustomBatchResponse] = js.native
  /**
    * Retrieves the tax settings of the account. This method can only be called for accounts to which the managing account has access: either the managing
    * account itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account.
    */
  def get(request: AnonKey): Request_[AccountTax] = js.native
  /** Lists the tax settings of the sub-accounts in your Merchant Center account. This method can only be called for multi-client accounts. */
  def list(request: AnonMaxResults): Request_[AccounttaxListResponse] = js.native
  /**
    * Updates the tax settings of the account. This method can only be called for accounts to which the managing account has access: either the managing
    * account itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account. This method supports patch
    * semantics.
    */
  def patch(request: AnonOauthtoken): Request_[AccountTax] = js.native
  /**
    * Updates the tax settings of the account. This method can only be called for accounts to which the managing account has access: either the managing
    * account itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account.
    */
  def update(request: AnonOauthtoken): Request_[AccountTax] = js.native
}

object AccounttaxResource {
  @scala.inline
  def apply(
    custombatch: AnonDryRun => Request_[AccounttaxCustomBatchResponse],
    get: AnonKey => Request_[AccountTax],
    list: AnonMaxResults => Request_[AccounttaxListResponse],
    patch: AnonOauthtoken => Request_[AccountTax],
    update: AnonOauthtoken => Request_[AccountTax]
  ): AccounttaxResource = {
    val __obj = js.Dynamic.literal(custombatch = js.Any.fromFunction1(custombatch), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[AccounttaxResource]
  }
  @scala.inline
  implicit class AccounttaxResourceOps[Self <: AccounttaxResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustombatch(value: AnonDryRun => Request_[AccounttaxCustomBatchResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custombatch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonKey => Request_[AccountTax]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonMaxResults => Request_[AccounttaxListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonOauthtoken => Request_[AccountTax]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonOauthtoken => Request_[AccountTax]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

