package typingsSlinky.googleapis.bloggerV3Mod.bloggerV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaBlogUserInfo extends js.Object {
  /**
    * The Blog resource.
    */
  var blog: js.UndefOr[SchemaBlog] = js.native
  /**
    * Information about a User for the Blog.
    */
  var blog_user_info: js.UndefOr[SchemaBlogPerUserInfo] = js.native
  /**
    * The kind of this entity. Always blogger#blogUserInfo
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaBlogUserInfo {
  @scala.inline
  def apply(): SchemaBlogUserInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBlogUserInfo]
  }
  @scala.inline
  implicit class SchemaBlogUserInfoOps[Self <: SchemaBlogUserInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlog(value: SchemaBlog): Self = {
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
    def withBlog_user_info(value: SchemaBlogPerUserInfo): Self = {
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

