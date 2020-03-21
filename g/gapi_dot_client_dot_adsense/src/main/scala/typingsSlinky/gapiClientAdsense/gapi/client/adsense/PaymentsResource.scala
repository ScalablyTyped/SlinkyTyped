package typingsSlinky.gapiClientAdsense.gapi.client.adsense

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAdsense.AnonAccountIdAlt
import typingsSlinky.gapiClientAdsense.AnonFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentsResource extends js.Object {
  /** List the payments for the specified AdSense account. */
  def list(request: AnonAccountIdAlt): Request_[Payments] = js.native
  /** List the payments for this AdSense account. */
  def list(request: AnonFieldsKey): Request_[Payments] = js.native
}

