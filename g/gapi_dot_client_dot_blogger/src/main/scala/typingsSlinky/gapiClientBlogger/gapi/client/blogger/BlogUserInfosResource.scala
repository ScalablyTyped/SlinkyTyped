package typingsSlinky.gapiClientBlogger.gapi.client.blogger

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientBlogger.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlogUserInfosResource extends js.Object {
  /** Gets one blog and user info pair by blogId and userId. */
  def get(request: AnonAlt): Request_[BlogUserInfo]
}

object BlogUserInfosResource {
  @scala.inline
  def apply(get: AnonAlt => Request_[BlogUserInfo]): BlogUserInfosResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[BlogUserInfosResource]
  }
}

