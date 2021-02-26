package typingsSlinky.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDatacatalog.anon.Key
import typingsSlinky.maximMazurokGapiClientDatacatalog.anon.KeyName
import typingsSlinky.maximMazurokGapiClientDatacatalog.anon.KeyOauthtoken
import typingsSlinky.maximMazurokGapiClientDatacatalog.anon.Oauthtoken
import typingsSlinky.maximMazurokGapiClientDatacatalog.anon.PageToken
import typingsSlinky.maximMazurokGapiClientDatacatalog.anon.PrettyPrint
import typingsSlinky.maximMazurokGapiClientDatacatalog.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyTagsResource extends StObject {
  
  /** Creates a policy tag in the specified taxonomy. */
  def create(request: KeyOauthtoken): Request[GoogleCloudDatacatalogV1beta1PolicyTag] = js.native
  def create(request: QuotaUser, body: GoogleCloudDatacatalogV1beta1PolicyTag): Request[GoogleCloudDatacatalogV1beta1PolicyTag] = js.native
  
  /** Deletes a policy tag. Also deletes all of its descendant policy tags. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Key): Request[js.Object] = js.native
  
  /** Gets a policy tag. */
  def get(): Request[GoogleCloudDatacatalogV1beta1PolicyTag] = js.native
  def get(request: Key): Request[GoogleCloudDatacatalogV1beta1PolicyTag] = js.native
  
  /** Gets the IAM policy for a taxonomy or a policy tag. */
  def getIamPolicy(request: Oauthtoken, body: GetIamPolicyRequest): Request[Policy] = js.native
  
  /** Lists all policy tags in a taxonomy. */
  def list(): Request[GoogleCloudDatacatalogV1beta1ListPolicyTagsResponse] = js.native
  def list(request: PageToken): Request[GoogleCloudDatacatalogV1beta1ListPolicyTagsResponse] = js.native
  
  /** Updates a policy tag. */
  def patch(request: KeyName): Request[GoogleCloudDatacatalogV1beta1PolicyTag] = js.native
  def patch(request: PrettyPrint, body: GoogleCloudDatacatalogV1beta1PolicyTag): Request[GoogleCloudDatacatalogV1beta1PolicyTag] = js.native
  
  /** Sets the IAM policy for a taxonomy or a policy tag. */
  def setIamPolicy(request: Oauthtoken, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /** Returns the permissions that a caller has on the specified taxonomy or policy tag. */
  def testIamPermissions(request: Oauthtoken, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
