package typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientYoutube.anon.Alt
import typingsSlinky.maximMazurokGapiClientYoutube.anon.KeyOauthtoken
import typingsSlinky.maximMazurokGapiClientYoutube.anon.Uploadprotocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiveChatBansResource extends StObject {
  
  /** Deletes a chat ban. */
  def delete(): Request[Unit] = js.native
  def delete(request: Uploadprotocol): Request[Unit] = js.native
  
  def insert(request: Alt, body: LiveChatBan): Request[LiveChatBan] = js.native
  /** Inserts a new resource into this collection. */
  def insert(request: KeyOauthtoken): Request[LiveChatBan] = js.native
}
