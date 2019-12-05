package typingsSlinky.gapiDotClientDotAdsensehost.gapi.client.adsensehost

import typingsSlinky.gapiDotClient.gapi.client.Request
import typingsSlinky.gapiDotClientDotAdsensehost.Anon_AccountId
import typingsSlinky.gapiDotClientDotAdsensehost.Anon_AccountIdAlt
import typingsSlinky.gapiDotClientDotAdsensehost.Anon_AdClientId
import typingsSlinky.gapiDotClientDotAdsensehost.Anon_Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdclientsResource extends js.Object {
  /** Get information about one of the ad clients in the specified publisher's AdSense account. */
  def get(request: Anon_AccountId): Request[AdClient] = js.native
  /** Get information about one of the ad clients in the Host AdSense account. */
  def get(request: Anon_AdClientId): Request[AdClient] = js.native
  /** List all hosted ad clients in the specified hosted account. */
  def list(request: Anon_AccountIdAlt): Request[AdClients] = js.native
  /** List all host ad clients in this AdSense account. */
  def list(request: Anon_Alt): Request[AdClients] = js.native
}

