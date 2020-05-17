package typingsSlinky.gapiClientAndroidenterprise.gapi.client.androidenterprise

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAndroidenterprise.anon.Alt
import typingsSlinky.gapiClientAndroidenterprise.anon.ManagedConfigurationForDeviceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedconfigurationsfordeviceResource extends js.Object {
  /** Removes a per-device managed configuration for an app for the specified device. */
  def delete(request: ManagedConfigurationForDeviceId): Request[Unit] = js.native
  /** Retrieves details of a per-device managed configuration. */
  def get(request: ManagedConfigurationForDeviceId): Request[ManagedConfiguration] = js.native
  /** Lists all the per-device managed configurations for the specified device. Only the ID is set. */
  def list(request: Alt): Request[ManagedConfigurationsForDeviceListResponse] = js.native
  /** Adds or updates a per-device managed configuration for an app for the specified device. This method supports patch semantics. */
  def patch(request: ManagedConfigurationForDeviceId): Request[ManagedConfiguration] = js.native
  /** Adds or updates a per-device managed configuration for an app for the specified device. */
  def update(request: ManagedConfigurationForDeviceId): Request[ManagedConfiguration] = js.native
}

object ManagedconfigurationsfordeviceResource {
  @scala.inline
  def apply(
    delete: ManagedConfigurationForDeviceId => Request[Unit],
    get: ManagedConfigurationForDeviceId => Request[ManagedConfiguration],
    list: Alt => Request[ManagedConfigurationsForDeviceListResponse],
    patch: ManagedConfigurationForDeviceId => Request[ManagedConfiguration],
    update: ManagedConfigurationForDeviceId => Request[ManagedConfiguration]
  ): ManagedconfigurationsfordeviceResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[ManagedconfigurationsfordeviceResource]
  }
  @scala.inline
  implicit class ManagedconfigurationsfordeviceResourceOps[Self <: ManagedconfigurationsfordeviceResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: ManagedConfigurationForDeviceId => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: ManagedConfigurationForDeviceId => Request[ManagedConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Alt => Request[ManagedConfigurationsForDeviceListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: ManagedConfigurationForDeviceId => Request[ManagedConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: ManagedConfigurationForDeviceId => Request[ManagedConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

