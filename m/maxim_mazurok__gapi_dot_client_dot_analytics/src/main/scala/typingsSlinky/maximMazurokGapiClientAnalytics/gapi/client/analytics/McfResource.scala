package typingsSlinky.maximMazurokGapiClientAnalytics.gapi.client.analytics

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAnalytics.anon.Enddate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait McfResource extends js.Object {
  
  /** Returns Analytics Multi-Channel Funnels data for a view (profile). */
  def get(): Request[McfData] = js.native
  def get(request: Enddate): Request[McfData] = js.native
}
