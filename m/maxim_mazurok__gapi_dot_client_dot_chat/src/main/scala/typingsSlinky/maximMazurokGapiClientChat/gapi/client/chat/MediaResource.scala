package typingsSlinky.maximMazurokGapiClientChat.gapi.client.chat

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientChat.anon.Accesstoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaResource extends StObject {
  
  /** Downloads media. Download is supported on the URI `/v1/media/{+name}?alt=media`. */
  def download(): Request[Media] = js.native
  def download(request: Accesstoken): Request[Media] = js.native
}
