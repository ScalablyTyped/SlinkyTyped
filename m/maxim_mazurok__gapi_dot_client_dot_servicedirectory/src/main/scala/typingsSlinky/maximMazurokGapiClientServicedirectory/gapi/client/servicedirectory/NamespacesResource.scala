package typingsSlinky.maximMazurokGapiClientServicedirectory.gapi.client.servicedirectory

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientServicedirectory.anon.Callback
import typingsSlinky.maximMazurokGapiClientServicedirectory.anon.Fields
import typingsSlinky.maximMazurokGapiClientServicedirectory.anon.Name
import typingsSlinky.maximMazurokGapiClientServicedirectory.anon.NamespaceId
import typingsSlinky.maximMazurokGapiClientServicedirectory.anon.PrettyPrint
import typingsSlinky.maximMazurokGapiClientServicedirectory.anon.UpdateMask
import typingsSlinky.maximMazurokGapiClientServicedirectory.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NamespacesResource extends StObject {
  
  /** Creates a namespace, and returns the new Namespace. */
  def create(request: NamespaceId): Request[Namespace] = js.native
  def create(request: UploadType, body: Namespace): Request[Namespace] = js.native
  
  /** Deletes a namespace. This also deletes all services and endpoints in the namespace. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  /** Gets a namespace. */
  def get(): Request[Namespace] = js.native
  def get(request: Callback): Request[Namespace] = js.native
  
  /** Gets the IAM Policy for a resource (namespace or service only). */
  def getIamPolicy(request: PrettyPrint, body: GetIamPolicyRequest): Request[Policy] = js.native
  
  /** Lists all namespaces. */
  def list(): Request[ListNamespacesResponse] = js.native
  def list(request: Fields): Request[ListNamespacesResponse] = js.native
  
  def patch(request: Name, body: Namespace): Request[Namespace] = js.native
  /** Updates a namespace. */
  def patch(request: UpdateMask): Request[Namespace] = js.native
  
  var services: ServicesResource = js.native
  
  /** Sets the IAM Policy for a resource (namespace or service only). */
  def setIamPolicy(request: PrettyPrint, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /** Tests IAM permissions for a resource (namespace or service only). */
  def testIamPermissions(request: PrettyPrint, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
