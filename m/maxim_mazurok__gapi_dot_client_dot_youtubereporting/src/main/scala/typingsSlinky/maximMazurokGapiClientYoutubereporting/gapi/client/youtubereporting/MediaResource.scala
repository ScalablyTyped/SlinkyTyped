package typingsSlinky.maximMazurokGapiClientYoutubereporting.gapi.client.youtubereporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientYoutubereporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaResource extends js.Object {
  
  /** Method for media download. Download is supported on the URI `/v1/media/{+name}?alt=media`. */
  def download(): Request[GdataMedia] = js.native
  def download(request: Key): Request[GdataMedia] = js.native
}
