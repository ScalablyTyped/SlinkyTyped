package typingsSlinky.googleapis.bloggerV3Mod.bloggerV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaBlogList extends js.Object {
  /**
    * Admin level list of blog per-user information
    */
  var blogUserInfos: js.UndefOr[js.Array[SchemaBlogUserInfo]] = js.native
  /**
    * The list of Blogs this user has Authorship or Admin rights over.
    */
  var items: js.UndefOr[js.Array[SchemaBlog]] = js.native
  /**
    * The kind of this entity. Always blogger#blogList
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaBlogList {
  @scala.inline
  def apply(): SchemaBlogList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBlogList]
  }
  @scala.inline
  implicit class SchemaBlogListOps[Self <: SchemaBlogList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlogUserInfos(value: js.Array[SchemaBlogUserInfo]): Self = {
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
    def withItems(value: js.Array[SchemaBlog]): Self = {
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

