package typingsSlinky.gapiClientCloudiot.gapi.client.cloudiot

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCloudiot.AnonBearertoken
import typingsSlinky.gapiClientCloudiot.AnonCallback
import typingsSlinky.gapiClientCloudiot.AnonFields
import typingsSlinky.gapiClientCloudiot.AnonKey
import typingsSlinky.gapiClientCloudiot.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegistriesResource extends js.Object {
  var devices: DevicesResource = js.native
  /** Creates a device registry that contains devices. */
  def create(request: AnonBearertoken): Request_[DeviceRegistry] = js.native
  /** Deletes a device registry configuration. */
  def delete(request: AnonCallback): Request_[js.Object] = js.native
  /** Gets a device registry configuration. */
  def get(request: AnonCallback): Request_[DeviceRegistry] = js.native
  /**
    * Gets the access control policy for a resource.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    */
  def getIamPolicy(request: AnonKey): Request_[Policy] = js.native
  /** Lists device registries. */
  def list(request: AnonOauthtoken): Request_[ListDeviceRegistriesResponse] = js.native
  /** Updates a device registry configuration. */
  def patch(request: AnonFields): Request_[DeviceRegistry] = js.native
  /**
    * Sets the access control policy on the specified resource. Replaces any
    * existing policy.
    */
  def setIamPolicy(request: AnonKey): Request_[Policy] = js.native
  /**
    * Returns permissions that a caller has on the specified resource.
    * If the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.
    */
  def testIamPermissions(request: AnonKey): Request_[TestIamPermissionsResponse] = js.native
}

object RegistriesResource {
  @scala.inline
  def apply(
    create: AnonBearertoken => Request_[DeviceRegistry],
    delete: AnonCallback => Request_[js.Object],
    devices: DevicesResource,
    get: AnonCallback => Request_[DeviceRegistry],
    getIamPolicy: AnonKey => Request_[Policy],
    list: AnonOauthtoken => Request_[ListDeviceRegistriesResponse],
    patch: AnonFields => Request_[DeviceRegistry],
    setIamPolicy: AnonKey => Request_[Policy],
    testIamPermissions: AnonKey => Request_[TestIamPermissionsResponse]
  ): RegistriesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), devices = devices.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), setIamPolicy = js.Any.fromFunction1(setIamPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions))
    __obj.asInstanceOf[RegistriesResource]
  }
  @scala.inline
  implicit class RegistriesResourceOps[Self <: RegistriesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: AnonBearertoken => Request_[DeviceRegistry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonCallback => Request_[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDevices(value: DevicesResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGet(value: AnonCallback => Request_[DeviceRegistry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetIamPolicy(value: AnonKey => Request_[Policy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIamPolicy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonOauthtoken => Request_[ListDeviceRegistriesResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonFields => Request_[DeviceRegistry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetIamPolicy(value: AnonKey => Request_[Policy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIamPolicy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTestIamPermissions(value: AnonKey => Request_[TestIamPermissionsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testIamPermissions")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

