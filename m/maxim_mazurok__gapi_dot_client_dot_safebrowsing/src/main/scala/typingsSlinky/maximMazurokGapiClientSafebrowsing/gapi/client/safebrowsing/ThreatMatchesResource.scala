package typingsSlinky.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientSafebrowsing.anon.Callback
import typingsSlinky.maximMazurokGapiClientSafebrowsing.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThreatMatchesResource extends js.Object {
  
  def find(request: Callback, body: FindThreatMatchesRequest): Request[FindThreatMatchesResponse] = js.native
  /** Finds the threat entries that match the Safe Browsing lists. */
  def find(request: Oauthtoken): Request[FindThreatMatchesResponse] = js.native
}
