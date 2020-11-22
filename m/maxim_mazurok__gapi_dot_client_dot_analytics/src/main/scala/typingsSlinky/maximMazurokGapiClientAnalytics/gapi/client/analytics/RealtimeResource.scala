package typingsSlinky.maximMazurokGapiClientAnalytics.gapi.client.analytics

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAnalytics.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RealtimeResource extends js.Object {
  
  /** Returns real time data for a view (profile). */
  def get(): Request[RealtimeData] = js.native
  def get(request: Fields): Request[RealtimeData] = js.native
}
