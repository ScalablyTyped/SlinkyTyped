package typingsSlinky.gapiClientAndroidenterprise.gapi.client.androidenterprise

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAndroidenterprise.anon.EnterpriseId
import typingsSlinky.gapiClientAndroidenterprise.anon.EntitlementId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntitlementsResource extends js.Object {
  /** Removes an entitlement to an app for a user. */
  def delete(request: EntitlementId): Request[Unit] = js.native
  /** Retrieves details of an entitlement. */
  def get(request: EntitlementId): Request[Entitlement] = js.native
  /** Lists all entitlements for the specified user. Only the ID is set. */
  def list(request: EnterpriseId): Request[EntitlementsListResponse] = js.native
  /** Adds or updates an entitlement to an app for a user. This method supports patch semantics. */
  def patch(request: typingsSlinky.gapiClientAndroidenterprise.anon.Install): Request[Entitlement] = js.native
  /** Adds or updates an entitlement to an app for a user. */
  def update(request: typingsSlinky.gapiClientAndroidenterprise.anon.Install): Request[Entitlement] = js.native
}

object EntitlementsResource {
  @scala.inline
  def apply(
    delete: EntitlementId => Request[Unit],
    get: EntitlementId => Request[Entitlement],
    list: EnterpriseId => Request[EntitlementsListResponse],
    patch: typingsSlinky.gapiClientAndroidenterprise.anon.Install => Request[Entitlement],
    update: typingsSlinky.gapiClientAndroidenterprise.anon.Install => Request[Entitlement]
  ): EntitlementsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[EntitlementsResource]
  }
  @scala.inline
  implicit class EntitlementsResourceOps[Self <: EntitlementsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: EntitlementId => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: EntitlementId => Request[Entitlement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: EnterpriseId => Request[EntitlementsListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: typingsSlinky.gapiClientAndroidenterprise.anon.Install => Request[Entitlement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: typingsSlinky.gapiClientAndroidenterprise.anon.Install => Request[Entitlement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

