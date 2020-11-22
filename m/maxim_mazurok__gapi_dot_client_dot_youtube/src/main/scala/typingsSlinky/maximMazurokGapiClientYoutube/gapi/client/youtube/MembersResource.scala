package typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientYoutube.anon.FilterByMemberChannelId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MembersResource extends js.Object {
  
  /** Retrieves a list of members that match the request criteria for a channel. */
  def list(): Request[MemberListResponse] = js.native
  def list(request: FilterByMemberChannelId): Request[MemberListResponse] = js.native
}
