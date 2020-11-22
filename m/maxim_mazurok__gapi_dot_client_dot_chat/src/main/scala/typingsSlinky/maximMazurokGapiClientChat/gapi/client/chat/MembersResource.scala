package typingsSlinky.maximMazurokGapiClientChat.gapi.client.chat

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientChat.anon.Alt
import typingsSlinky.maximMazurokGapiClientChat.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MembersResource extends js.Object {
  
  /** Returns a membership. */
  def get(): Request[Membership] = js.native
  def get(request: Alt): Request[Membership] = js.native
  
  /** Lists human memberships in a space. */
  def list(): Request[ListMembershipsResponse] = js.native
  def list(request: Callback): Request[ListMembershipsResponse] = js.native
}
