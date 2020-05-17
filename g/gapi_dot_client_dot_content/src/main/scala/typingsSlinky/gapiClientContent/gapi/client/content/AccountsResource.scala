package typingsSlinky.gapiClientContent.gapi.client.content

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientContent.anon.AccountId
import typingsSlinky.gapiClientContent.anon.Alt
import typingsSlinky.gapiClientContent.anon.DryRun
import typingsSlinky.gapiClientContent.anon.Fields
import typingsSlinky.gapiClientContent.anon.Key
import typingsSlinky.gapiClientContent.anon.MaxResults
import typingsSlinky.gapiClientContent.anon.MerchantId
import typingsSlinky.gapiClientContent.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountsResource extends js.Object {
  /** Returns information about the authenticated user. */
  def authinfo(request: Alt): Request[AccountsAuthInfoResponse] = js.native
  /**
    * Claims the website of a Merchant Center sub-account. This method can only be called for accounts to which the managing account has access: either the
    * managing account itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account.
    */
  def claimwebsite(request: AccountId): Request[AccountsClaimWebsiteResponse] = js.native
  /** Retrieves, inserts, updates, and deletes multiple Merchant Center (sub-)accounts in a single request. */
  def custombatch(request: DryRun): Request[AccountsCustomBatchResponse] = js.native
  /** Deletes a Merchant Center sub-account. This method can only be called for multi-client accounts. */
  def delete(request: Fields): Request[Unit] = js.native
  /**
    * Retrieves a Merchant Center account. This method can only be called for accounts to which the managing account has access: either the managing account
    * itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account.
    */
  def get(request: Key): Request[Account] = js.native
  /** Creates a Merchant Center sub-account. This method can only be called for multi-client accounts. */
  def insert(request: MerchantId): Request[Account] = js.native
  /** Lists the sub-accounts in your Merchant Center account. This method can only be called for multi-client accounts. */
  def list(request: MaxResults): Request[AccountsListResponse] = js.native
  /**
    * Updates a Merchant Center account. This method can only be called for accounts to which the managing account has access: either the managing account
    * itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account. This method supports patch semantics.
    */
  def patch(request: Oauthtoken): Request[Account] = js.native
  /**
    * Updates a Merchant Center account. This method can only be called for accounts to which the managing account has access: either the managing account
    * itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account.
    */
  def update(request: Oauthtoken): Request[Account] = js.native
}

object AccountsResource {
  @scala.inline
  def apply(
    authinfo: Alt => Request[AccountsAuthInfoResponse],
    claimwebsite: AccountId => Request[AccountsClaimWebsiteResponse],
    custombatch: DryRun => Request[AccountsCustomBatchResponse],
    delete: Fields => Request[Unit],
    get: Key => Request[Account],
    insert: MerchantId => Request[Account],
    list: MaxResults => Request[AccountsListResponse],
    patch: Oauthtoken => Request[Account],
    update: Oauthtoken => Request[Account]
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
    def withAuthinfo(value: Alt => Request[AccountsAuthInfoResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authinfo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClaimwebsite(value: AccountId => Request[AccountsClaimWebsiteResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claimwebsite")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCustombatch(value: DryRun => Request[AccountsCustomBatchResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custombatch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: Fields => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: Key => Request[Account]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: MerchantId => Request[Account]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: MaxResults => Request[AccountsListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: Oauthtoken => Request[Account]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: Oauthtoken => Request[Account]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

