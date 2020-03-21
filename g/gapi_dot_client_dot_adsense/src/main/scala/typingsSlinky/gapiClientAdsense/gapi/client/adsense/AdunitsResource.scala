package typingsSlinky.gapiClientAdsense.gapi.client.adsense

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAdsense.AnonIncludeInactive
import typingsSlinky.gapiClientAdsense.AnonOauthtoken
import typingsSlinky.gapiClientAdsense.AnonPageToken
import typingsSlinky.gapiClientAdsense.AnonPrettyPrint
import typingsSlinky.gapiClientAdsense.AnonQuotaUser
import typingsSlinky.gapiClientAdsense.AnonUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdunitsResource extends js.Object {
  var customchannels: CustomchannelsResource = js.native
  /** Gets the specified ad unit in the specified ad client for the specified account. */
  def get(request: AnonOauthtoken): Request_[AdUnit] = js.native
  /** Gets the specified ad unit in the specified ad client. */
  def get(request: AnonPrettyPrint): Request_[AdUnit] = js.native
  /** Get ad code for the specified ad unit. */
  def getAdCode(request: AnonOauthtoken): Request_[AdCode] = js.native
  /** Get ad code for the specified ad unit. */
  def getAdCode(request: AnonPrettyPrint): Request_[AdCode] = js.native
  /** List all ad units in the specified ad client for the specified account. */
  def list(request: AnonIncludeInactive): Request_[AdUnits] = js.native
  /** List all ad units in the specified custom channel. */
  def list(request: AnonPageToken): Request_[AdUnits] = js.native
  /** List all ad units in the specified ad client for this AdSense account. */
  def list(request: AnonQuotaUser): Request_[AdUnits] = js.native
  /** List all ad units in the specified custom channel. */
  def list(request: AnonUserIp): Request_[AdUnits] = js.native
}

