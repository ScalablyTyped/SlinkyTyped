package typingsSlinky.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientSafebrowsing.anon.Callback
import typingsSlinky.maximMazurokGapiClientSafebrowsing.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThreatListUpdatesResource extends js.Object {
  
  def fetch(request: Callback, body: FetchThreatListUpdatesRequest): Request[FetchThreatListUpdatesResponse] = js.native
  /** Fetches the most recent threat list updates. A client can request updates for multiple lists at once. */
  def fetch(request: Key): Request[FetchThreatListUpdatesResponse] = js.native
}
