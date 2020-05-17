package typingsSlinky.gapiClientCloudiot.gapi.client.cloudiot

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientCloudiot.anon.Bearertoken
import typingsSlinky.gapiClientCloudiot.anon.Callback
import typingsSlinky.gapiClientCloudiot.anon.DeviceIds
import typingsSlinky.gapiClientCloudiot.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DevicesResource extends js.Object {
  var configVersions: ConfigVersionsResource = js.native
  var states: StatesResource = js.native
  /** Creates a device in a device registry. */
  def create(request: Bearertoken): Request[Device] = js.native
  /** Deletes a device. */
  def delete(request: Callback): Request[js.Object] = js.native
  /** Gets details about a device. */
  def get(request: Callback): Request[Device] = js.native
  /** List devices in a device registry. */
  def list(request: DeviceIds): Request[ListDevicesResponse] = js.native
  /**
    * Modifies the configuration for the device, which is eventually sent from
    * the Cloud IoT Core servers. Returns the modified configuration version and
    * its metadata.
    */
  def modifyCloudToDeviceConfig(request: Callback): Request[DeviceConfig] = js.native
  /** Updates a device. */
  def patch(request: Fields): Request[Device] = js.native
}

object DevicesResource {
  @scala.inline
  def apply(
    configVersions: ConfigVersionsResource,
    create: Bearertoken => Request[Device],
    delete: Callback => Request[js.Object],
    get: Callback => Request[Device],
    list: DeviceIds => Request[ListDevicesResponse],
    modifyCloudToDeviceConfig: Callback => Request[DeviceConfig],
    patch: Fields => Request[Device],
    states: StatesResource
  ): DevicesResource = {
    val __obj = js.Dynamic.literal(configVersions = configVersions.asInstanceOf[js.Any], create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), modifyCloudToDeviceConfig = js.Any.fromFunction1(modifyCloudToDeviceConfig), patch = js.Any.fromFunction1(patch), states = states.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevicesResource]
  }
  @scala.inline
  implicit class DevicesResourceOps[Self <: DevicesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigVersions(value: ConfigVersionsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreate(value: Bearertoken => Request[Device]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: Callback => Request[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: Callback => Request[Device]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: DeviceIds => Request[ListDevicesResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withModifyCloudToDeviceConfig(value: Callback => Request[DeviceConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyCloudToDeviceConfig")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: Fields => Request[Device]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStates(value: StatesResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("states")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

