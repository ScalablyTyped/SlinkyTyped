package typingsSlinky.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAndroidmanagement.anon.Alt
import typingsSlinky.maximMazurokGapiClientAndroidmanagement.anon.EnterpriseToken
import typingsSlinky.maximMazurokGapiClientAndroidmanagement.anon.PrettyPrint
import typingsSlinky.maximMazurokGapiClientAndroidmanagement.anon.ProjectId
import typingsSlinky.maximMazurokGapiClientAndroidmanagement.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnterprisesResource extends StObject {
  
  var applications: ApplicationsResource = js.native
  
  /** Creates an enterprise. This is the last step in the enterprise signup flow. */
  def create(request: EnterpriseToken): Request[Enterprise] = js.native
  def create(request: ProjectId, body: Enterprise): Request[Enterprise] = js.native
  
  var devices: DevicesResource = js.native
  
  var enrollmentTokens: EnrollmentTokensResource = js.native
  
  /** Gets an enterprise. */
  def get(): Request[Enterprise] = js.native
  def get(request: Alt): Request[Enterprise] = js.native
  
  def patch(request: PrettyPrint, body: Enterprise): Request[Enterprise] = js.native
  /** Updates an enterprise. */
  def patch(request: Xgafv): Request[Enterprise] = js.native
  
  var policies: PoliciesResource = js.native
  
  var webApps: WebAppsResource = js.native
  
  var webTokens: WebTokensResource = js.native
}
