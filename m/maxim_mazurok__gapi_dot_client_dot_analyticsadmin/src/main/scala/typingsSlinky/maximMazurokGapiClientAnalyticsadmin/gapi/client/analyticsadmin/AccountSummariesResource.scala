package typingsSlinky.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAnalyticsadmin.anon.Uploadprotocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountSummariesResource extends js.Object {
  
  /** Returns summaries of all accounts accessible by the caller. */
  def list(): Request[GoogleAnalyticsAdminV1alphaListAccountSummariesResponse] = js.native
  def list(request: Uploadprotocol): Request[GoogleAnalyticsAdminV1alphaListAccountSummariesResponse] = js.native
}
