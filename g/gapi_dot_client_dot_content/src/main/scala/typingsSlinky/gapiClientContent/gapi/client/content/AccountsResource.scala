package typingsSlinky.gapiClientContent.gapi.client.content

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientContent.AnonAccountId
import typingsSlinky.gapiClientContent.AnonAlt
import typingsSlinky.gapiClientContent.AnonDryRun
import typingsSlinky.gapiClientContent.AnonFields
import typingsSlinky.gapiClientContent.AnonKey
import typingsSlinky.gapiClientContent.AnonMaxResults
import typingsSlinky.gapiClientContent.AnonMerchantId
import typingsSlinky.gapiClientContent.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountsResource extends js.Object {
  /** Returns information about the authenticated user. */
  def authinfo(request: AnonAlt): Request_[AccountsAuthInfoResponse] = js.native
  /**
    * Claims the website of a Merchant Center sub-account. This method can only be called for accounts to which the managing account has access: either the
    * managing account itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account.
    */
  def claimwebsite(request: AnonAccountId): Request_[AccountsClaimWebsiteResponse] = js.native
  /** Retrieves, inserts, updates, and deletes multiple Merchant Center (sub-)accounts in a single request. */
  def custombatch(request: AnonDryRun): Request_[AccountsCustomBatchResponse] = js.native
  /** Deletes a Merchant Center sub-account. This method can only be called for multi-client accounts. */
  def delete(request: AnonFields): Request_[Unit] = js.native
  /**
    * Retrieves a Merchant Center account. This method can only be called for accounts to which the managing account has access: either the managing account
    * itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account.
    */
  def get(request: AnonKey): Request_[Account] = js.native
  /** Creates a Merchant Center sub-account. This method can only be called for multi-client accounts. */
  def insert(request: AnonMerchantId): Request_[Account] = js.native
  /** Lists the sub-accounts in your Merchant Center account. This method can only be called for multi-client accounts. */
  def list(request: AnonMaxResults): Request_[AccountsListResponse] = js.native
  /**
    * Updates a Merchant Center account. This method can only be called for accounts to which the managing account has access: either the managing account
    * itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account. This method supports patch semantics.
    */
  def patch(request: AnonOauthtoken): Request_[Account] = js.native
  /**
    * Updates a Merchant Center account. This method can only be called for accounts to which the managing account has access: either the managing account
    * itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account.
    */
  def update(request: AnonOauthtoken): Request_[Account] = js.native
}

object AccountsResource {
  @scala.inline
  def apply(
    authinfo: AnonAlt => Request_[AccountsAuthInfoResponse],
    claimwebsite: AnonAccountId => Request_[AccountsClaimWebsiteResponse],
    custombatch: AnonDryRun => Request_[AccountsCustomBatchResponse],
    delete: AnonFields => Request_[Unit],
    get: AnonKey => Request_[Account],
    insert: AnonMerchantId => Request_[Account],
    list: AnonMaxResults => Request_[AccountsListResponse],
    patch: AnonOauthtoken => Request_[Account],
    update: AnonOauthtoken => Request_[Account]
  ): AccountsResource = {
    val __obj = js.Dynamic.literal(authinfo = js.Any.fromFunction1(authinfo), claimwebsite = js.Any.fromFunction1(claimwebsite), custombatch = js.Any.fromFunction1(custombatch), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[AccountsResource]
  }
  @scala.inline
  implicit class AccountsResourceOps[Self <: AccountsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthinfo(value: AnonAlt => Request_[AccountsAuthInfoResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authinfo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClaimwebsite(value: AnonAccountId => Request_[AccountsClaimWebsiteResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claimwebsite")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCustombatch(value: AnonDryRun => Request_[AccountsCustomBatchResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custombatch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonFields => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonKey => Request_[Account]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonMerchantId => Request_[Account]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonMaxResults => Request_[AccountsListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonOauthtoken => Request_[Account]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonOauthtoken => Request_[Account]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

