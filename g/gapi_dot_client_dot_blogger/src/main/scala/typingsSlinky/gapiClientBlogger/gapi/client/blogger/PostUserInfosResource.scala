package typingsSlinky.gapiClientBlogger.gapi.client.blogger

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientBlogger.AnonLabels
import typingsSlinky.gapiClientBlogger.AnonMaxComments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostUserInfosResource extends js.Object {
  /**
    * Gets one post and user info pair, by post ID and user ID. The post user info contains per-user information about the post, such as access rights,
    * specific to the user.
    */
  def get(request: AnonMaxComments): Request_[PostUserInfo] = js.native
  /**
    * Retrieves a list of post and post user info pairs, possibly filtered. The post user info contains per-user information about the post, such as access
    * rights, specific to the user.
    */
  def list(request: AnonLabels): Request_[PostUserInfosList] = js.native
}

object PostUserInfosResource {
  @scala.inline
  def apply(get: AnonMaxComments => Request_[PostUserInfo], list: AnonLabels => Request_[PostUserInfosList]): PostUserInfosResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[PostUserInfosResource]
  }
  @scala.inline
  implicit class PostUserInfosResourceOps[Self <: PostUserInfosResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: AnonMaxComments => Request_[PostUserInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonLabels => Request_[PostUserInfosList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

