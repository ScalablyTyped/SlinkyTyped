package typingsSlinky.maximMazurokGapiClientBlogger.gapi.client.blogger

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientBlogger.anon.UserId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsersResource extends StObject {
  
  /** Gets one user by user_id. */
  def get(): Request[User] = js.native
  def get(request: UserId): Request[User] = js.native
}
