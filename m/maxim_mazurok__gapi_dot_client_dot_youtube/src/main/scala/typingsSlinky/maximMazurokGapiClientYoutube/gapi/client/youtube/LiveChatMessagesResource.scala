package typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientYoutube.anon.Alt
import typingsSlinky.maximMazurokGapiClientYoutube.anon.LiveChatId
import typingsSlinky.maximMazurokGapiClientYoutube.anon.OauthtokenPart
import typingsSlinky.maximMazurokGapiClientYoutube.anon.Uploadprotocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiveChatMessagesResource extends js.Object {
  
  /** Deletes a chat message. */
  def delete(): Request[Unit] = js.native
  def delete(request: Uploadprotocol): Request[Unit] = js.native
  
  def insert(request: Alt, body: LiveChatMessage): Request[LiveChatMessage] = js.native
  /** Inserts a new resource into this collection. */
  def insert(request: OauthtokenPart): Request[LiveChatMessage] = js.native
  
  /** Retrieves a list of resources, possibly filtered. */
  def list(): Request[LiveChatMessageListResponse] = js.native
  def list(request: LiveChatId): Request[LiveChatMessageListResponse] = js.native
}
