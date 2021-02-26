package typingsSlinky.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientSecuritycenter.anon.AccesstokenAlt
import typingsSlinky.maximMazurokGapiClientSecuritycenter.anon.Alt
import typingsSlinky.maximMazurokGapiClientSecuritycenter.anon.AltCallback
import typingsSlinky.maximMazurokGapiClientSecuritycenter.anon.PageSize
import typingsSlinky.maximMazurokGapiClientSecuritycenter.anon.PrettyPrint
import typingsSlinky.maximMazurokGapiClientSecuritycenter.anon.UpdateMask
import typingsSlinky.maximMazurokGapiClientSecuritycenter.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourcesResource extends StObject {
  
  def create(request: Alt, body: Source): Request[Source] = js.native
  /** Creates a source. */
  def create(request: Xgafv): Request[Source] = js.native
  
  var findings: FindingsResource = js.native
  
  /** Gets a source. */
  def get(): Request[Source] = js.native
  def get(request: PrettyPrint): Request[Source] = js.native
  
  /** Gets the access control policy on the specified Source. */
  def getIamPolicy(request: AccesstokenAlt, body: GetIamPolicyRequest): Request[Policy] = js.native
  
  /** Lists all sources belonging to an organization. */
  def list(): Request[ListSourcesResponse] = js.native
  def list(request: PageSize): Request[ListSourcesResponse] = js.native
  
  /** Updates a source. */
  def patch(request: AltCallback): Request[Source] = js.native
  def patch(request: UpdateMask, body: Source): Request[Source] = js.native
  
  /** Sets the access control policy on the specified Source. */
  def setIamPolicy(request: AccesstokenAlt, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /** Returns the permissions that a caller has on the specified source. */
  def testIamPermissions(request: AccesstokenAlt, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
