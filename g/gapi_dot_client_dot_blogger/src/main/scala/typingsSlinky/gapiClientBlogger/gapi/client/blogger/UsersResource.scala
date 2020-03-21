package typingsSlinky.gapiClientBlogger.gapi.client.blogger

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientBlogger.AnonUserId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersResource extends js.Object {
  /** Gets one user by ID. */
  def get(request: AnonUserId): Request_[User]
}

object UsersResource {
  @scala.inline
  def apply(get: AnonUserId => Request_[User]): UsersResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[UsersResource]
  }
}

