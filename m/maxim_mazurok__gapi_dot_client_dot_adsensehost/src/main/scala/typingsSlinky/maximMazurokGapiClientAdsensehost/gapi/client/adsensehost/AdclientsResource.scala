package typingsSlinky.maximMazurokGapiClientAdsensehost.gapi.client.adsensehost

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAdsensehost.anon.AccountId
import typingsSlinky.maximMazurokGapiClientAdsensehost.anon.AdClientId
import typingsSlinky.maximMazurokGapiClientAdsensehost.anon.Alt
import typingsSlinky.maximMazurokGapiClientAdsensehost.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdclientsResource extends js.Object {
  
  /** Get information about one of the ad clients in the specified publisher's AdSense account. */
  def get(): Request[AdClient] = js.native
  def get(request: AccountId): Request[AdClient] = js.native
  def get(request: AdClientId): Request[AdClient] = js.native
  
  /** List all hosted ad clients in the specified hosted account. */
  def list(): Request[AdClients] = js.native
  def list(request: Alt): Request[AdClients] = js.native
  def list(request: Fields): Request[AdClients] = js.native
}
