package typingsSlinky.gapiClientAdsense.gapi.client.adsense

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAdsense.AnonAccountId
import typingsSlinky.gapiClientAdsense.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdclientsResource extends js.Object {
  /** List all ad clients in the specified account. */
  def list(request: AnonAccountId): Request_[AdClients] = js.native
  /** List all ad clients in this AdSense account. */
  def list(request: AnonAlt): Request_[AdClients] = js.native
}

