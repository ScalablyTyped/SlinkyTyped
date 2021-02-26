package typingsSlinky.maximMazurokGapiClientAdsensehost.gapi.client.adsensehost

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAdsensehost.anon.AdClientId
import typingsSlinky.maximMazurokGapiClientAdsensehost.anon.AdClientIdAlt
import typingsSlinky.maximMazurokGapiClientAdsensehost.anon.MaxResults
import typingsSlinky.maximMazurokGapiClientAdsensehost.anon.UrlChannelId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UrlchannelsResource extends StObject {
  
  /** Delete a URL channel from the host AdSense account. */
  def delete(): Request[UrlChannel] = js.native
  def delete(request: UrlChannelId): Request[UrlChannel] = js.native
  
  /** Add a new URL channel to the host AdSense account. */
  def insert(request: AdClientIdAlt): Request[UrlChannel] = js.native
  def insert(request: AdClientId, body: UrlChannel): Request[UrlChannel] = js.native
  
  /** List all host URL channels in the host AdSense account. */
  def list(): Request[UrlChannels] = js.native
  def list(request: MaxResults): Request[UrlChannels] = js.native
}
