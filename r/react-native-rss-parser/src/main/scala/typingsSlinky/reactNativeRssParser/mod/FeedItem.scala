package typingsSlinky.reactNativeRssParser.mod

import typingsSlinky.reactNativeRssParser.AnonAuthors
import typingsSlinky.reactNativeRssParser.AnonLength
import typingsSlinky.reactNativeRssParser.AnonName
import typingsSlinky.reactNativeRssParser.AnonRel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeedItem extends js.Object {
  var authors: js.Array[Maybe[AnonName]] = js.native
  var categories: js.Array[Maybe[AnonName]] = js.native
  var content: String = js.native
  var description: String = js.native
  var enclosures: js.Array[AnonLength] = js.native
  var id: String = js.native
  var itunes: AnonAuthors = js.native
  var links: js.Array[AnonRel] = js.native
  var published: String = js.native
  var title: String = js.native
}

object FeedItem {
  @scala.inline
  def apply(
    authors: js.Array[Maybe[AnonName]],
    categories: js.Array[Maybe[AnonName]],
    content: String,
    description: String,
    enclosures: js.Array[AnonLength],
    id: String,
    itunes: AnonAuthors,
    links: js.Array[AnonRel],
    published: String,
    title: String
  ): FeedItem = {
    val __obj = js.Dynamic.literal(authors = authors.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], enclosures = enclosures.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], itunes = itunes.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], published = published.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeedItem]
  }
  @scala.inline
  implicit class FeedItemOps[Self <: FeedItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthors(value: js.Array[Maybe[AnonName]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategories(value: js.Array[Maybe[AnonName]]): Self = {
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
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnclosures(value: js.Array[AnonLength]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enclosures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItunes(value: AnonAuthors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itunes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinks(value: js.Array[AnonRel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublished(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("published")(value.asInstanceOf[js.Any])
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

