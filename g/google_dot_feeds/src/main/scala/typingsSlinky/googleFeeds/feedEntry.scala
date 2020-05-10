package typingsSlinky.googleFeeds

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait feedEntry extends js.Object {
  var categories: js.Array[String] = js.native
  var content: String = js.native
  var contentSnippet: String = js.native
  var link: String = js.native
  var mediaGroup: js.Array[MediaGroup] = js.native
  var publishedDate: String = js.native
  var title: String = js.native
}

object feedEntry {
  @scala.inline
  def apply(
    categories: js.Array[String],
    content: String,
    contentSnippet: String,
    link: String,
    mediaGroup: js.Array[MediaGroup],
    publishedDate: String,
    title: String
  ): feedEntry = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], contentSnippet = contentSnippet.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], mediaGroup = mediaGroup.asInstanceOf[js.Any], publishedDate = publishedDate.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[feedEntry]
  }
  @scala.inline
  implicit class feedEntryOps[Self <: feedEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategories(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentSnippet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentSnippet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMediaGroup(value: js.Array[MediaGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublishedDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

