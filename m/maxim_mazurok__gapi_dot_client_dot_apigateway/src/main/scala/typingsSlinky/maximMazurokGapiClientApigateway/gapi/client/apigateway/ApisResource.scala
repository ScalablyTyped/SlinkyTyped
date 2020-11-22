package typingsSlinky.maximMazurokGapiClientApigateway.gapi.client.apigateway

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientApigateway.anon.ApiId
import typingsSlinky.maximMazurokGapiClientApigateway.anon.Callback
import typingsSlinky.maximMazurokGapiClientApigateway.anon.Filter
import typingsSlinky.maximMazurokGapiClientApigateway.anon.Key
import typingsSlinky.maximMazurokGapiClientApigateway.anon.Oauthtoken
import typingsSlinky.maximMazurokGapiClientApigateway.anon.Parent
import typingsSlinky.maximMazurokGapiClientApigateway.anon.PrettyPrint
import typingsSlinky.maximMazurokGapiClientApigateway.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApisResource extends js.Object {
  
  var configs: ConfigsResource = js.native
  
  /** Creates a new Api in a given project and location. */
  def create(request: ApiId): Request[ApigatewayOperation] = js.native
  def create(request: Parent, body: ApigatewayApi): Request[ApigatewayOperation] = js.native
  
  /** Deletes a single Api. */
  def delete(): Request[ApigatewayOperation] = js.native
  def delete(request: Callback): Request[ApigatewayOperation] = js.native
  
  /** Gets details of a single Api. */
  def get(): Request[ApigatewayApi] = js.native
  def get(request: Callback): Request[ApigatewayApi] = js.native
  
  /** Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set. */
  def getIamPolicy(): Request[ApigatewayPolicy] = js.native
  def getIamPolicy(request: Key): Request[ApigatewayPolicy] = js.native
  
  /** Lists Apis in a given project and location. */
  def list(): Request[ApigatewayListApisResponse] = js.native
  def list(request: Filter): Request[ApigatewayListApisResponse] = js.native
  
  def patch(request: Oauthtoken, body: ApigatewayApi): Request[ApigatewayOperation] = js.native
  /** Updates the parameters of a single Api. */
  def patch(request: QuotaUser): Request[ApigatewayOperation] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors. */
  def setIamPolicy(request: PrettyPrint, body: ApigatewaySetIamPolicyRequest): Request[ApigatewayPolicy] = js.native
  
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This
    * operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    */
  def testIamPermissions(request: PrettyPrint, body: ApigatewayTestIamPermissionsRequest): Request[ApigatewayTestIamPermissionsResponse] = js.native
}
