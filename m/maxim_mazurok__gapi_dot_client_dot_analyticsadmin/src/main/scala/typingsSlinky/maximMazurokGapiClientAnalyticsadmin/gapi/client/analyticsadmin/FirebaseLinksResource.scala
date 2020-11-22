package typingsSlinky.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAnalyticsadmin.anon.Alt
import typingsSlinky.maximMazurokGapiClientAnalyticsadmin.anon.AltCallback
import typingsSlinky.maximMazurokGapiClientAnalyticsadmin.anon.CallbackFields
import typingsSlinky.maximMazurokGapiClientAnalyticsadmin.anon.Name
import typingsSlinky.maximMazurokGapiClientAnalyticsadmin.anon.UpdateMask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirebaseLinksResource extends js.Object {
  
  /** Creates a FirebaseLink. Properties can have at most one FirebaseLink. */
  def create(request: AltCallback): Request[GoogleAnalyticsAdminV1alphaFirebaseLink] = js.native
  def create(request: Alt, body: GoogleAnalyticsAdminV1alphaFirebaseLink): Request[GoogleAnalyticsAdminV1alphaFirebaseLink] = js.native
  
  /** Deletes a FirebaseLink on a property */
  def delete(): Request[js.Object] = js.native
  def delete(request: Name): Request[js.Object] = js.native
  
  /** Lists FirebaseLinks on a property. Properties can have at most one FirebaseLink. */
  def list(): Request[GoogleAnalyticsAdminV1alphaListFirebaseLinksResponse] = js.native
  def list(request: Alt): Request[GoogleAnalyticsAdminV1alphaListFirebaseLinksResponse] = js.native
  
  /** Updates a FirebaseLink on a property */
  def patch(request: CallbackFields): Request[GoogleAnalyticsAdminV1alphaFirebaseLink] = js.native
  def patch(request: UpdateMask, body: GoogleAnalyticsAdminV1alphaFirebaseLink): Request[GoogleAnalyticsAdminV1alphaFirebaseLink] = js.native
}
