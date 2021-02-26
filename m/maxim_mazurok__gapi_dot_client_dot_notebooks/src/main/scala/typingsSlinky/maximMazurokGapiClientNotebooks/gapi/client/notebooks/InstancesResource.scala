package typingsSlinky.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientNotebooks.anon.AccesstokenAlt
import typingsSlinky.maximMazurokGapiClientNotebooks.anon.AltCallback
import typingsSlinky.maximMazurokGapiClientNotebooks.anon.Callback
import typingsSlinky.maximMazurokGapiClientNotebooks.anon.CallbackFields
import typingsSlinky.maximMazurokGapiClientNotebooks.anon.Fields
import typingsSlinky.maximMazurokGapiClientNotebooks.anon.FieldsKey
import typingsSlinky.maximMazurokGapiClientNotebooks.anon.InstanceId
import typingsSlinky.maximMazurokGapiClientNotebooks.anon.Key
import typingsSlinky.maximMazurokGapiClientNotebooks.anon.Name
import typingsSlinky.maximMazurokGapiClientNotebooks.anon.NotebookInstance
import typingsSlinky.maximMazurokGapiClientNotebooks.anon.Oauthtoken
import typingsSlinky.maximMazurokGapiClientNotebooks.anon.Parent
import typingsSlinky.maximMazurokGapiClientNotebooks.anon.PrettyPrint
import typingsSlinky.maximMazurokGapiClientNotebooks.anon.QuotaUser
import typingsSlinky.maximMazurokGapiClientNotebooks.anon.Resource
import typingsSlinky.maximMazurokGapiClientNotebooks.anon.UploadType
import typingsSlinky.maximMazurokGapiClientNotebooks.anon.Uploadprotocol
import typingsSlinky.maximMazurokGapiClientNotebooks.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstancesResource extends StObject {
  
  /** Creates a new Instance in a given project and location. */
  def create(request: InstanceId): Request[Operation] = js.native
  def create(request: Key, body: Instance): Request[Operation] = js.native
  
  /** Deletes a single Instance. */
  def delete(): Request[Operation] = js.native
  def delete(request: Callback): Request[Operation] = js.native
  
  /** Gets details of a single Instance. */
  def get(): Request[Instance] = js.native
  def get(request: Callback): Request[Instance] = js.native
  
  /** Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: Oauthtoken): Request[Policy] = js.native
  
  /** Check if a notebook instance is upgradable. */
  def isUpgradeable(): Request[IsInstanceUpgradeableResponse] = js.native
  def isUpgradeable(request: NotebookInstance): Request[IsInstanceUpgradeableResponse] = js.native
  
  /** Lists instances in a given project and location. */
  def list(): Request[ListInstancesResponse] = js.native
  def list(request: Fields): Request[ListInstancesResponse] = js.native
  
  /**
    * Registers an existing legacy notebook instance to the Notebooks API server. Legacy instances are instances created with the legacy Compute Engine calls. They are not manageable by
    * the Notebooks API out of the box. This call makes these instances manageable by the Notebooks API.
    */
  def register(request: Parent): Request[Operation] = js.native
  def register(request: PrettyPrint, body: RegisterInstanceRequest): Request[Operation] = js.native
  
  def report(request: Callback, body: ReportInstanceInfoRequest): Request[Operation] = js.native
  /**
    * Allows notebook instances to report their latest instance information to the Notebooks API server. The server will merge the reported information to the instance metadata store. Do
    * not use this method directly.
    */
  def report(request: Name): Request[Operation] = js.native
  
  def reset(request: Callback, body: ResetInstanceRequest): Request[Operation] = js.native
  /** Resets a notebook instance. */
  def reset(request: QuotaUser): Request[Operation] = js.native
  
  def setAccelerator(request: Callback, body: SetInstanceAcceleratorRequest): Request[Operation] = js.native
  /** Updates the guest accelerators of a single Instance. */
  def setAccelerator(request: Resource): Request[Operation] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors. */
  def setIamPolicy(request: UploadType, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  def setLabels(request: Callback, body: SetInstanceLabelsRequest): Request[Operation] = js.native
  /** Replaces all the labels of an Instance. */
  def setLabels(request: Uploadprotocol): Request[Operation] = js.native
  
  def setMachineType(request: Callback, body: SetInstanceMachineTypeRequest): Request[Operation] = js.native
  /** Updates the machine type of a single Instance. */
  def setMachineType(request: Xgafv): Request[Operation] = js.native
  
  /** Starts a notebook instance. */
  def start(request: AccesstokenAlt): Request[Operation] = js.native
  def start(request: Callback, body: StartInstanceRequest): Request[Operation] = js.native
  
  /** Stops a notebook instance. */
  def stop(request: AltCallback): Request[Operation] = js.native
  def stop(request: Callback, body: StopInstanceRequest): Request[Operation] = js.native
  
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This
    * operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    */
  def testIamPermissions(request: UploadType, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
  
  /** Upgrades a notebook instance to the latest version. */
  def upgrade(request: CallbackFields): Request[Operation] = js.native
  def upgrade(request: Callback, body: UpgradeInstanceRequest): Request[Operation] = js.native
  
  def upgradeInternal(request: Callback, body: UpgradeInstanceInternalRequest): Request[Operation] = js.native
  /** Allows notebook instances to call this endpoint to upgrade themselves. Do not use this method directly. */
  def upgradeInternal(request: FieldsKey): Request[Operation] = js.native
}
