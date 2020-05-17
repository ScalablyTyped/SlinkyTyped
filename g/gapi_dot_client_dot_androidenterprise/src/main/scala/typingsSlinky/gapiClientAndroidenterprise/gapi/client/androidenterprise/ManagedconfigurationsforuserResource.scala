package typingsSlinky.gapiClientAndroidenterprise.gapi.client.androidenterprise

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAndroidenterprise.anon.EnterpriseId
import typingsSlinky.gapiClientAndroidenterprise.anon.ManagedConfigurationForUserId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedconfigurationsforuserResource extends js.Object {
  /** Removes a per-user managed configuration for an app for the specified user. */
  def delete(request: ManagedConfigurationForUserId): Request[Unit] = js.native
  /** Retrieves details of a per-user managed configuration for an app for the specified user. */
  def get(request: ManagedConfigurationForUserId): Request[ManagedConfiguration] = js.native
  /** Lists all the per-user managed configurations for the specified user. Only the ID is set. */
  def list(request: EnterpriseId): Request[ManagedConfigurationsForUserListResponse] = js.native
  /** Adds or updates a per-user managed configuration for an app for the specified user. This method supports patch semantics. */
  def patch(request: ManagedConfigurationForUserId): Request[ManagedConfiguration] = js.native
  /** Adds or updates a per-user managed configuration for an app for the specified user. */
  def update(request: ManagedConfigurationForUserId): Request[ManagedConfiguration] = js.native
}

object ManagedconfigurationsforuserResource {
  @scala.inline
  def apply(
    delete: ManagedConfigurationForUserId => Request[Unit],
    get: ManagedConfigurationForUserId => Request[ManagedConfiguration],
    list: EnterpriseId => Request[ManagedConfigurationsForUserListResponse],
    patch: ManagedConfigurationForUserId => Request[ManagedConfiguration],
    update: ManagedConfigurationForUserId => Request[ManagedConfiguration]
  ): ManagedconfigurationsforuserResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[ManagedconfigurationsforuserResource]
  }
  @scala.inline
  implicit class ManagedconfigurationsforuserResourceOps[Self <: ManagedconfigurationsforuserResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: ManagedConfigurationForUserId => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: ManagedConfigurationForUserId => Request[ManagedConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: EnterpriseId => Request[ManagedConfigurationsForUserListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: ManagedConfigurationForUserId => Request[ManagedConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: ManagedConfigurationForUserId => Request[ManagedConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

