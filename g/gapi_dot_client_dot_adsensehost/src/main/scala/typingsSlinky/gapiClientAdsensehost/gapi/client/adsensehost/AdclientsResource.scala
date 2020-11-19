package typingsSlinky.gapiClientAdsensehost.gapi.client.adsensehost

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAdsensehost.anon.AccountId
import typingsSlinky.gapiClientAdsensehost.anon.AdClientId
import typingsSlinky.gapiClientAdsensehost.anon.Alt
import typingsSlinky.gapiClientAdsensehost.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdclientsResource extends js.Object {
  
  /** Get information about one of the ad clients in the specified publisher's AdSense account. */
  def get(request: AccountId): Request[AdClient] = js.native
  /** Get information about one of the ad clients in the Host AdSense account. */
  def get(request: AdClientId): Request[AdClient] = js.native
  
  /** List all hosted ad clients in the specified hosted account. */
  def list(request: Alt): Request[AdClients] = js.native
  /** List all host ad clients in this AdSense account. */
  def list(request: Fields): Request[AdClients] = js.native
}
