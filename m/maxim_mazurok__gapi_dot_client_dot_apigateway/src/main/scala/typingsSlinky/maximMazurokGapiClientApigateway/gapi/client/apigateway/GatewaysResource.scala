package typingsSlinky.maximMazurokGapiClientApigateway.gapi.client.apigateway

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientApigateway.anon.Callback
import typingsSlinky.maximMazurokGapiClientApigateway.anon.Filter
import typingsSlinky.maximMazurokGapiClientApigateway.anon.GatewayId
import typingsSlinky.maximMazurokGapiClientApigateway.anon.Key
import typingsSlinky.maximMazurokGapiClientApigateway.anon.Oauthtoken
import typingsSlinky.maximMazurokGapiClientApigateway.anon.PrettyPrint
import typingsSlinky.maximMazurokGapiClientApigateway.anon.Resource
import typingsSlinky.maximMazurokGapiClientApigateway.anon.UploadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GatewaysResource extends js.Object {
  
  /** Creates a new Gateway in a given project and location. */
  def create(request: GatewayId): Request[ApigatewayOperation] = js.native
  def create(request: UploadType, body: ApigatewayGateway): Request[ApigatewayOperation] = js.native
  
  /** Deletes a single Gateway. */
  def delete(): Request[ApigatewayOperation] = js.native
  def delete(request: Callback): Request[ApigatewayOperation] = js.native
  
  /** Gets details of a single Gateway. */
  def get(): Request[ApigatewayGateway] = js.native
  def get(request: Callback): Request[ApigatewayGateway] = js.native
  
  /** Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set. */
  def getIamPolicy(): Request[ApigatewayPolicy] = js.native
  def getIamPolicy(request: Key): Request[ApigatewayPolicy] = js.native
  
  /** Lists Gateways in a given project and location. */
  def list(): Request[ApigatewayListGatewaysResponse] = js.native
  def list(request: Filter): Request[ApigatewayListGatewaysResponse] = js.native
  
  def patch(request: Oauthtoken, body: ApigatewayGateway): Request[ApigatewayOperation] = js.native
  /** Updates the parameters of a single Gateway. */
  def patch(request: Resource): Request[ApigatewayOperation] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors. */
  def setIamPolicy(request: PrettyPrint, body: ApigatewaySetIamPolicyRequest): Request[ApigatewayPolicy] = js.native
  
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This
    * operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    */
  def testIamPermissions(request: PrettyPrint, body: ApigatewayTestIamPermissionsRequest): Request[ApigatewayTestIamPermissionsResponse] = js.native
}
