package typingsSlinky.maximMazurokGapiClientChat.gapi.client.chat

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientChat.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachmentsResource extends js.Object {
  
  /** Gets the metadata of a message attachment. The attachment data is fetched using the media API. */
  def get(): Request[Attachment] = js.native
  def get(request: Alt): Request[Attachment] = js.native
}
