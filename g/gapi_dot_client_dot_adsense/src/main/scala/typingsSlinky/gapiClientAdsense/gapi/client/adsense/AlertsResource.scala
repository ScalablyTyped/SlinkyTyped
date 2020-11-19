package typingsSlinky.gapiClientAdsense.gapi.client.adsense

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAdsense.anon.AlertId
import typingsSlinky.gapiClientAdsense.anon.AlertIdAlt
import typingsSlinky.gapiClientAdsense.anon.AltFields
import typingsSlinky.gapiClientAdsense.anon.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlertsResource extends js.Object {
  
  /** Dismiss (delete) the specified alert from the specified publisher AdSense account. */
  def delete(request: AlertId): Request[Unit] = js.native
  /** Dismiss (delete) the specified alert from the publisher's AdSense account. */
  def delete(request: AlertIdAlt): Request[Unit] = js.native
  
  /** List the alerts for this AdSense account. */
  def list(request: AltFields): Request[Alerts] = js.native
  /** List the alerts for the specified AdSense account. */
  def list(request: Locale): Request[Alerts] = js.native
}
