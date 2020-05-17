package typingsSlinky.gapiClientBlogger.gapi.client.blogger

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientBlogger.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlogUserInfosResource extends js.Object {
  /** Gets one blog and user info pair by blogId and userId. */
  def get(request: Alt): Request[BlogUserInfo] = js.native
}

object BlogUserInfosResource {
  @scala.inline
  def apply(get: Alt => Request[BlogUserInfo]): BlogUserInfosResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[BlogUserInfosResource]
  }
  @scala.inline
  implicit class BlogUserInfosResourceOps[Self <: BlogUserInfosResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: Alt => Request[BlogUserInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

