package typingsSlinky.gapiClientAdsense.gapi.client.adsense

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAdsense.anon.Fields
import typingsSlinky.gapiClientAdsense.anon.MaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UrlchannelsResource extends js.Object {
  
  /** List all URL channels in the specified ad client for the specified account. */
  def list(request: Fields): Request[UrlChannels] = js.native
  /** List all URL channels in the specified ad client for this AdSense account. */
  def list(request: MaxResults): Request[UrlChannels] = js.native
}
