package typingsSlinky.maximMazurokGapiClientCloudiot.gapi.client.cloudiot

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientCloudiot.anon.Fields
import typingsSlinky.maximMazurokGapiClientCloudiot.anon.Key
import typingsSlinky.maximMazurokGapiClientCloudiot.anon.PageSize
import typingsSlinky.maximMazurokGapiClientCloudiot.anon.Parent
import typingsSlinky.maximMazurokGapiClientCloudiot.anon.PrettyPrint
import typingsSlinky.maximMazurokGapiClientCloudiot.anon.Resource
import typingsSlinky.maximMazurokGapiClientCloudiot.anon.UpdateMask
import typingsSlinky.maximMazurokGapiClientCloudiot.anon.UploadType
import typingsSlinky.maximMazurokGapiClientCloudiot.anon.Uploadprotocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegistriesResource extends js.Object {
  
  def bindDeviceToGateway(request: Fields, body: BindDeviceToGatewayRequest): Request[js.Object] = js.native
  /** Associates the device with the gateway. */
  def bindDeviceToGateway(request: Parent): Request[js.Object] = js.native
  
  def create(request: Fields, body: DeviceRegistry): Request[DeviceRegistry] = js.native
  /** Creates a device registry that contains devices. */
  def create(request: UploadType): Request[DeviceRegistry] = js.native
  
  /** Deletes a device registry configuration. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Key): Request[js.Object] = js.native
  
  var devices: DevicesResource = js.native
  
  /** Gets a device registry configuration. */
  def get(): Request[DeviceRegistry] = js.native
  def get(request: Key): Request[DeviceRegistry] = js.native
  
  /** Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set. */
  def getIamPolicy(request: Resource, body: GetIamPolicyRequest): Request[Policy] = js.native
  
  var groups: GroupsResource = js.native
  
  /** Lists device registries. */
  def list(): Request[ListDeviceRegistriesResponse] = js.native
  def list(request: PageSize): Request[ListDeviceRegistriesResponse] = js.native
  
  def patch(request: PrettyPrint, body: DeviceRegistry): Request[DeviceRegistry] = js.native
  /** Updates a device registry configuration. */
  def patch(request: UpdateMask): Request[DeviceRegistry] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. */
  def setIamPolicy(request: Resource, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /** Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a NOT_FOUND error. */
  def testIamPermissions(request: Resource, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
  
  def unbindDeviceFromGateway(request: Fields, body: UnbindDeviceFromGatewayRequest): Request[js.Object] = js.native
  /** Deletes the association between the device and the gateway. */
  def unbindDeviceFromGateway(request: Uploadprotocol): Request[js.Object] = js.native
}
