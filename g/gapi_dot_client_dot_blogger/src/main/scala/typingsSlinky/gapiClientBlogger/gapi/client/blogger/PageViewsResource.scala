package typingsSlinky.gapiClientBlogger.gapi.client.blogger

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientBlogger.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageViewsResource extends js.Object {
  /** Retrieve pageview stats for a Blog. */
  def get(request: AnonOauthtoken): Request_[Pageviews]
}

object PageViewsResource {
  @scala.inline
  def apply(get: AnonOauthtoken => Request_[Pageviews]): PageViewsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[PageViewsResource]
  }
}

