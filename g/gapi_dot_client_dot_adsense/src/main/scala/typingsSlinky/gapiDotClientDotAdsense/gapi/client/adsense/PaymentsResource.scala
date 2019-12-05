package typingsSlinky.gapiDotClientDotAdsense.gapi.client.adsense

import typingsSlinky.gapiDotClient.gapi.client.Request
import typingsSlinky.gapiDotClientDotAdsense.Anon_AccountIdAltFields
import typingsSlinky.gapiDotClientDotAdsense.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentsResource extends js.Object {
  /** List the payments for the specified AdSense account. */
  def list(request: Anon_AccountIdAltFields): Request[Payments] = js.native
  /** List the payments for this AdSense account. */
  def list(request: Anon_AltFieldsKey): Request[Payments] = js.native
}

