package typingsSlinky.gapiClientAdsense.gapi.client.adsense

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAdsense.anon.AdClientId
import typingsSlinky.gapiClientAdsense.anon.AdUnitId
import typingsSlinky.gapiClientAdsense.anon.CustomChannelId
import typingsSlinky.gapiClientAdsense.anon.Fields
import typingsSlinky.gapiClientAdsense.anon.Key
import typingsSlinky.gapiClientAdsense.anon.MaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomchannelsResource extends js.Object {
  
  var adunits: AdunitsResource = js.native
  
  /** Get the specified custom channel from the specified ad client for the specified account. */
  def get(request: CustomChannelId): Request[CustomChannel] = js.native
  /** Get the specified custom channel from the specified ad client. */
  def get(request: Key): Request[CustomChannel] = js.native
  
  /** List all custom channels which the specified ad unit belongs to. */
  def list(request: AdClientId): Request[CustomChannels] = js.native
  /** List all custom channels which the specified ad unit belongs to. */
  def list(request: AdUnitId): Request[CustomChannels] = js.native
  /** List all custom channels in the specified ad client for the specified account. */
  def list(request: Fields): Request[CustomChannels] = js.native
  /** List all custom channels in the specified ad client for this AdSense account. */
  def list(request: MaxResults): Request[CustomChannels] = js.native
}
