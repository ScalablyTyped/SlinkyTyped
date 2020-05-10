package typingsSlinky.gapiClientBlogger.gapi.client.blogger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlogList extends js.Object {
  /** Admin level list of blog per-user information */
  var blogUserInfos: js.UndefOr[js.Array[BlogUserInfo]] = js.native
  /** The list of Blogs this user has Authorship or Admin rights over. */
  var items: js.UndefOr[js.Array[Blog]] = js.native
  /** The kind of this entity. Always blogger#blogList */
  var kind: js.UndefOr[String] = js.native
}

object BlogList {
  @scala.inline
  def apply(): BlogList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlogList]
  }
  @scala.inline
  implicit class BlogListOps[Self <: BlogList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlogUserInfos(value: js.Array[BlogUserInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blogUserInfos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlogUserInfos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blogUserInfos")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Array[Blog]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
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

