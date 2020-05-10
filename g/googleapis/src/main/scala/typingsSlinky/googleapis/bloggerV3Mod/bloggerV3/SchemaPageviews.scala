package typingsSlinky.googleapis.bloggerV3Mod.bloggerV3

import typingsSlinky.googleapis.AnonCount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPageviews extends js.Object {
  /**
    * Blog Id
    */
  var blogId: js.UndefOr[String] = js.native
  /**
    * The container of posts in this blog.
    */
  var counts: js.UndefOr[js.Array[AnonCount]] = js.native
  /**
    * The kind of this entry. Always blogger#page_views
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaPageviews {
  @scala.inline
  def apply(): SchemaPageviews = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPageviews]
  }
  @scala.inline
  implicit class SchemaPageviewsOps[Self <: SchemaPageviews] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlogId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blogId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlogId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blogId")(js.undefined)
        ret
    }
    @scala.inline
    def withCounts(value: js.Array[AnonCount]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counts")(js.undefined)
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

