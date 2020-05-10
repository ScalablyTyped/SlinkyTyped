package typingsSlinky.hexo.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.hexo.mod.Locals.Category
import typingsSlinky.hexo.mod.Locals.Page
import typingsSlinky.hexo.mod.Locals.Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Site extends js.Object {
  var categories: Model[Category] = js.native
  var data: StringDictionary[js.Any] = js.native
  var pages: Model[Page] = js.native
  var posts: Model[typingsSlinky.hexo.mod.Locals.Post] = js.native
  var tags: Model[Tag] = js.native
}

object Site {
  @scala.inline
  def apply(
    categories: Model[Category],
    data: StringDictionary[js.Any],
    pages: Model[Page],
    posts: Model[typingsSlinky.hexo.mod.Locals.Post],
    tags: Model[Tag]
  ): Site = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], posts = posts.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Site]
  }
  @scala.inline
  implicit class SiteOps[Self <: Site] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategories(value: Model[Category]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPages(value: Model[Page]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosts(value: Model[typingsSlinky.hexo.mod.Locals.Post]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: Model[Tag]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

