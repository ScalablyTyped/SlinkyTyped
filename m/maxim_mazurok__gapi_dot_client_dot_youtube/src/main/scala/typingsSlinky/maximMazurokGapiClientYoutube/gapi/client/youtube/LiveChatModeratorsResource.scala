package typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientYoutube.anon.Alt
import typingsSlinky.maximMazurokGapiClientYoutube.anon.PageToken
import typingsSlinky.maximMazurokGapiClientYoutube.anon.PartPrettyPrint
import typingsSlinky.maximMazurokGapiClientYoutube.anon.Uploadprotocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiveChatModeratorsResource extends js.Object {
  
  /** Deletes a chat moderator. */
  def delete(): Request[Unit] = js.native
  def delete(request: Uploadprotocol): Request[Unit] = js.native
  
  def insert(request: Alt, body: LiveChatModerator): Request[LiveChatModerator] = js.native
  /** Inserts a new resource into this collection. */
  def insert(request: PartPrettyPrint): Request[LiveChatModerator] = js.native
  
  /** Retrieves a list of resources, possibly filtered. */
  def list(): Request[LiveChatModeratorListResponse] = js.native
  def list(request: PageToken): Request[LiveChatModeratorListResponse] = js.native
}
