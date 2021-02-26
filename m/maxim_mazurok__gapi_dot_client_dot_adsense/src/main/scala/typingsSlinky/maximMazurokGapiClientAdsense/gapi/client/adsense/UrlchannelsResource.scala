package typingsSlinky.maximMazurokGapiClientAdsense.gapi.client.adsense

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAdsense.anon.Key
import typingsSlinky.maximMazurokGapiClientAdsense.anon.MaxResults
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UrlchannelsResource extends StObject {
  
  /** List all URL channels in the specified ad client for the specified account. */
  def list(): Request[UrlChannels] = js.native
  def list(request: Key): Request[UrlChannels] = js.native
  def list(request: MaxResults): Request[UrlChannels] = js.native
}
