package typingsSlinky.gapiClientAdsense.gapi.client.adsense

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAdsense.anon.IncludeInactive
import typingsSlinky.gapiClientAdsense.anon.Oauthtoken
import typingsSlinky.gapiClientAdsense.anon.PageToken
import typingsSlinky.gapiClientAdsense.anon.PrettyPrint
import typingsSlinky.gapiClientAdsense.anon.QuotaUser
import typingsSlinky.gapiClientAdsense.anon.UserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdunitsResource extends js.Object {
  var customchannels: CustomchannelsResource = js.native
  /** Gets the specified ad unit in the specified ad client for the specified account. */
  def get(request: Oauthtoken): Request[AdUnit] = js.native
  /** Gets the specified ad unit in the specified ad client. */
  def get(request: PrettyPrint): Request[AdUnit] = js.native
  /** Get ad code for the specified ad unit. */
  def getAdCode(request: Oauthtoken): Request[AdCode] = js.native
  /** Get ad code for the specified ad unit. */
  def getAdCode(request: PrettyPrint): Request[AdCode] = js.native
  /** List all ad units in the specified ad client for the specified account. */
  def list(request: IncludeInactive): Request[AdUnits] = js.native
  /** List all ad units in the specified custom channel. */
  def list(request: PageToken): Request[AdUnits] = js.native
  /** List all ad units in the specified ad client for this AdSense account. */
  def list(request: QuotaUser): Request[AdUnits] = js.native
  /** List all ad units in the specified custom channel. */
  def list(request: UserIp): Request[AdUnits] = js.native
}

