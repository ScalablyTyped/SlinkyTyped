package typingsSlinky.maximMazurokGapiClientBlogger.gapi.client.blogger

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientBlogger.anon.PageToken
import typingsSlinky.maximMazurokGapiClientBlogger.anon.Uploadprotocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostUserInfosResource extends js.Object {
  
  /** Gets one post and user info pair, by post_id and user_id. */
  def get(): Request[PostUserInfo] = js.native
  def get(request: Uploadprotocol): Request[PostUserInfo] = js.native
  
  /** Lists post and user info pairs. */
  def list(): Request[PostUserInfosList] = js.native
  def list(request: PageToken): Request[PostUserInfosList] = js.native
}
