package typingsSlinky.maximMazurokGapiClientChat.gapi.client.chat

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientChat.anon.Alt
import typingsSlinky.maximMazurokGapiClientChat.anon.Fields
import typingsSlinky.maximMazurokGapiClientChat.anon.Key
import typingsSlinky.maximMazurokGapiClientChat.anon.Name
import typingsSlinky.maximMazurokGapiClientChat.anon.Oauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessagesResource extends StObject {
  
  var attachments: AttachmentsResource = js.native
  
  /** Creates a message. */
  def create(request: Fields): Request[Message] = js.native
  def create(request: Key, body: Message): Request[Message] = js.native
  
  /** Deletes a message. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Alt): Request[js.Object] = js.native
  
  /** Returns a message. */
  def get(): Request[Message] = js.native
  def get(request: Alt): Request[Message] = js.native
  
  /** Updates a message. */
  def update(request: Name): Request[Message] = js.native
  def update(request: Oauthtoken, body: Message): Request[Message] = js.native
}
