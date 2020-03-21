package typingsSlinky.gapiClientAdsensehost.gapi.client.adsensehost

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAdsensehost.AnonAccountId
import typingsSlinky.gapiClientAdsensehost.AnonAdClientId
import typingsSlinky.gapiClientAdsensehost.AnonAlt
import typingsSlinky.gapiClientAdsensehost.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdclientsResource extends js.Object {
  /** Get information about one of the ad clients in the specified publisher's AdSense account. */
  def get(request: AnonAccountId): Request_[AdClient] = js.native
  /** Get information about one of the ad clients in the Host AdSense account. */
  def get(request: AnonAdClientId): Request_[AdClient] = js.native
  /** List all hosted ad clients in the specified hosted account. */
  def list(request: AnonAlt): Request_[AdClients] = js.native
  /** List all host ad clients in this AdSense account. */
  def list(request: AnonFields): Request_[AdClients] = js.native
}

