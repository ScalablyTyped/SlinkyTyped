package typingsSlinky.gapiClientContent.gapi.client.content

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientContent.AnonDryRun
import typingsSlinky.gapiClientContent.AnonKey
import typingsSlinky.gapiClientContent.AnonMaxResults
import typingsSlinky.gapiClientContent.AnonOauthtoken
import typingsSlinky.gapiClientContent.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShippingsettingsResource extends js.Object {
  /** Retrieves and updates the shipping settings of multiple accounts in a single request. */
  def custombatch(request: AnonDryRun): Request_[ShippingsettingsCustomBatchResponse] = js.native
  /**
    * Retrieves the shipping settings of the account. This method can only be called for accounts to which the managing account has access: either the
    * managing account itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account.
    */
  def get(request: AnonKey): Request_[ShippingSettings] = js.native
  /** Retrieves supported carriers and carrier services for an account. */
  def getsupportedcarriers(request: AnonQuotaUser): Request_[ShippingsettingsGetSupportedCarriersResponse] = js.native
  /** Lists the shipping settings of the sub-accounts in your Merchant Center account. This method can only be called for multi-client accounts. */
  def list(request: AnonMaxResults): Request_[ShippingsettingsListResponse] = js.native
  /**
    * Updates the shipping settings of the account. This method can only be called for accounts to which the managing account has access: either the managing
    * account itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account. This method supports patch
    * semantics.
    */
  def patch(request: AnonOauthtoken): Request_[ShippingSettings] = js.native
  /**
    * Updates the shipping settings of the account. This method can only be called for accounts to which the managing account has access: either the managing
    * account itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account.
    */
  def update(request: AnonOauthtoken): Request_[ShippingSettings] = js.native
}

object ShippingsettingsResource {
  @scala.inline
  def apply(
    custombatch: AnonDryRun => Request_[ShippingsettingsCustomBatchResponse],
    get: AnonKey => Request_[ShippingSettings],
    getsupportedcarriers: AnonQuotaUser => Request_[ShippingsettingsGetSupportedCarriersResponse],
    list: AnonMaxResults => Request_[ShippingsettingsListResponse],
    patch: AnonOauthtoken => Request_[ShippingSettings],
    update: AnonOauthtoken => Request_[ShippingSettings]
  ): ShippingsettingsResource = {
    val __obj = js.Dynamic.literal(custombatch = js.Any.fromFunction1(custombatch), get = js.Any.fromFunction1(get), getsupportedcarriers = js.Any.fromFunction1(getsupportedcarriers), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[ShippingsettingsResource]
  }
  @scala.inline
  implicit class ShippingsettingsResourceOps[Self <: ShippingsettingsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustombatch(value: AnonDryRun => Request_[ShippingsettingsCustomBatchResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custombatch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonKey => Request_[ShippingSettings]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetsupportedcarriers(value: AnonQuotaUser => Request_[ShippingsettingsGetSupportedCarriersResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getsupportedcarriers")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonMaxResults => Request_[ShippingsettingsListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonOauthtoken => Request_[ShippingSettings]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonOauthtoken => Request_[ShippingSettings]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

