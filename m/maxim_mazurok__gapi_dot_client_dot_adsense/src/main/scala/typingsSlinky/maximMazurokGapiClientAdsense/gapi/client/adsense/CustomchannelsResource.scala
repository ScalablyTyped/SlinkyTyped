package typingsSlinky.maximMazurokGapiClientAdsense.gapi.client.adsense

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAdsense.anon.AdClientId
import typingsSlinky.maximMazurokGapiClientAdsense.anon.AdUnitId
import typingsSlinky.maximMazurokGapiClientAdsense.anon.CustomChannelId
import typingsSlinky.maximMazurokGapiClientAdsense.anon.Key
import typingsSlinky.maximMazurokGapiClientAdsense.anon.MaxResults
import typingsSlinky.maximMazurokGapiClientAdsense.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomchannelsResource extends js.Object {
  
  var adunits: AdunitsResource = js.native
  
  /** Get the specified custom channel from the specified ad client for the specified account. */
  def get(): Request[CustomChannel] = js.native
  def get(request: CustomChannelId): Request[CustomChannel] = js.native
  def get(request: Oauthtoken): Request[CustomChannel] = js.native
  
  /** List all custom channels which the specified ad unit belongs to. */
  def list(): Request[CustomChannels] = js.native
  def list(request: AdClientId): Request[CustomChannels] = js.native
  def list(request: AdUnitId): Request[CustomChannels] = js.native
  def list(request: Key): Request[CustomChannels] = js.native
  def list(request: MaxResults): Request[CustomChannels] = js.native
}
