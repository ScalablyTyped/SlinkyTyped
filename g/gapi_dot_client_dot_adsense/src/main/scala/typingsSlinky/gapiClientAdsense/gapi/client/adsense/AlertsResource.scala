package typingsSlinky.gapiClientAdsense.gapi.client.adsense

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAdsense.AnonAlertId
import typingsSlinky.gapiClientAdsense.AnonAlertIdAlt
import typingsSlinky.gapiClientAdsense.AnonAltFields
import typingsSlinky.gapiClientAdsense.AnonLocale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlertsResource extends js.Object {
  /** Dismiss (delete) the specified alert from the specified publisher AdSense account. */
  def delete(request: AnonAlertId): Request_[Unit] = js.native
  /** Dismiss (delete) the specified alert from the publisher's AdSense account. */
  def delete(request: AnonAlertIdAlt): Request_[Unit] = js.native
  /** List the alerts for this AdSense account. */
  def list(request: AnonAltFields): Request_[Alerts] = js.native
  /** List the alerts for the specified AdSense account. */
  def list(request: AnonLocale): Request_[Alerts] = js.native
}

