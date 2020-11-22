package typingsSlinky.maximMazurokGapiClientAnalytics.gapi.client.analytics

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAnalytics.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountSummariesResource extends js.Object {
  
  /** Lists account summaries (lightweight tree comprised of accounts/properties/profiles) to which the user has access. */
  def list(): Request[AccountSummaries] = js.native
  def list(request: Key): Request[AccountSummaries] = js.native
}
