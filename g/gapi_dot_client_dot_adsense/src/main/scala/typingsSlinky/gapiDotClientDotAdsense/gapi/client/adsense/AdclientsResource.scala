package typingsSlinky.gapiDotClientDotAdsense.gapi.client.adsense

import typingsSlinky.gapiDotClient.gapi.client.Request
import typingsSlinky.gapiDotClientDotAdsense.Anon_AccountId
import typingsSlinky.gapiDotClientDotAdsense.Anon_Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdclientsResource extends js.Object {
  /** List all ad clients in the specified account. */
  def list(request: Anon_AccountId): Request[AdClients] = js.native
  /** List all ad clients in this AdSense account. */
  def list(request: Anon_Alt): Request[AdClients] = js.native
}

