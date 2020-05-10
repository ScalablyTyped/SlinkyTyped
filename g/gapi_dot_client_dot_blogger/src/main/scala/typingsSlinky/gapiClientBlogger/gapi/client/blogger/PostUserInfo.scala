package typingsSlinky.gapiClientBlogger.gapi.client.blogger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostUserInfo extends js.Object {
  /** The kind of this entity. Always blogger#postUserInfo */
  var kind: js.UndefOr[String] = js.native
  /** The Post resource. */
  var post: js.UndefOr[Post] = js.native
  /** Information about a User for the Post. */
  var post_user_info: js.UndefOr[PostPerUserInfo] = js.native
}

object PostUserInfo {
  @scala.inline
  def apply(): PostUserInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostUserInfo]
  }
  @scala.inline
  implicit class PostUserInfoOps[Self <: PostUserInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withPost(value: Post): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post")(js.undefined)
        ret
    }
    @scala.inline
    def withPost_user_info(value: PostPerUserInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post_user_info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPost_user_info: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post_user_info")(js.undefined)
        ret
    }
  }
  
}

