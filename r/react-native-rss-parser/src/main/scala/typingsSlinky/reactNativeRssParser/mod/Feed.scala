package typingsSlinky.reactNativeRssParser.mod

import typingsSlinky.reactNativeRssParser.AnonBlock
import typingsSlinky.reactNativeRssParser.AnonDescription
import typingsSlinky.reactNativeRssParser.AnonName
import typingsSlinky.reactNativeRssParser.AnonRel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Feed extends js.Object {
  var authors: js.Array[Maybe[AnonName]] = js.native
  var categories: js.Array[Maybe[AnonName]] = js.native
  var copyright: Maybe[String] = js.native
  var description: String = js.native
  var image: AnonDescription = js.native
  var items: js.Array[FeedItem] = js.native
  var itunes: AnonBlock = js.native
  var language: String = js.native
  var lastPublished: String = js.native
  var lastUpdated: String = js.native
  var links: js.Array[AnonRel] = js.native
  var title: String = js.native
  var `type`: String = js.native
}

object Feed {
  @scala.inline
  def apply(
    authors: js.Array[Maybe[AnonName]],
    categories: js.Array[Maybe[AnonName]],
    description: String,
    image: AnonDescription,
    items: js.Array[FeedItem],
    itunes: AnonBlock,
    language: String,
    lastPublished: String,
    lastUpdated: String,
    links: js.Array[AnonRel],
    title: String,
    `type`: String
  ): Feed = {
    val __obj = js.Dynamic.literal(authors = authors.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], itunes = itunes.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], lastPublished = lastPublished.asInstanceOf[js.Any], lastUpdated = lastUpdated.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Feed]
  }
  @scala.inline
  implicit class FeedOps[Self <: Feed] (val x: Self) extends AnyVal {
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
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage(value: AnonDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: js.Array[FeedItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItunes(value: AnonBlock): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itunes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastPublished(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastPublished")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastUpdated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinks(value: js.Array[AnonRel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCopyright(value: Maybe[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyright: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyright")(js.undefined)
        ret
    }
  }
  
}

