package typingsSlinky.gapiDotClientDotBlogger.gapi.client.blogger

import typingsSlinky.gapiDotClient.gapi.client.Request
import typingsSlinky.gapiDotClientDotBlogger.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersResource extends js.Object {
  /** Gets one user by ID. */
  def get(request: Anon_AltFieldsKey): Request[User]
}

object UsersResource {
  @scala.inline
  def apply(get: Anon_AltFieldsKey => Request[User]): UsersResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[UsersResource]
  }
}

