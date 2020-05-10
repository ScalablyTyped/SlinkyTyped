package typingsSlinky.gapiClientBlogger.gapi.client.blogger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlogUserInfo extends js.Object {
  /** The Blog resource. */
  var blog: js.UndefOr[Blog] = js.native
  /** Information about a User for the Blog. */
  var blog_user_info: js.UndefOr[BlogPerUserInfo] = js.native
  /** The kind of this entity. Always blogger#blogUserInfo */
  var kind: js.UndefOr[String] = js.native
}

object BlogUserInfo {
  @scala.inline
  def apply(): BlogUserInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlogUserInfo]
  }
  @scala.inline
  implicit class BlogUserInfoOps[Self <: BlogUserInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlog(value: Blog): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blog")(js.undefined)
        ret
    }
    @scala.inline
    def withBlog_user_info(value: BlogPerUserInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blog_user_info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlog_user_info: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blog_user_info")(js.undefined)
        ret
    }
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
  }
  
}

