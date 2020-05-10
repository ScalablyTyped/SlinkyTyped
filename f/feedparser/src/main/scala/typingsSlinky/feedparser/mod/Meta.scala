package typingsSlinky.feedparser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Meta extends js.Object {
  @JSName("#ns")
  var Numbersignns: js.Array[NS] = js.native
  @JSName("#type")
  var Numbersigntype: Type = js.native
  @JSName("#version")
  var Numbersignversion: String = js.native
  var author: String = js.native
  var categories: js.Array[String] = js.native
  var copyright: String = js.native
  var date: js.Date | Null = js.native
  var description: String = js.native
  var favicon: String = js.native
  var generator: String = js.native
  var image: Image = js.native
  var language: String = js.native
  var link: String = js.native
  var pubdate: js.Date | Null = js.native
  var title: String = js.native
  var xmlurl: String = js.native
}

object Meta {
  @scala.inline
  def apply(
    Numbersignns: js.Array[NS],
    Numbersigntype: Type,
    Numbersignversion: String,
    author: String,
    categories: js.Array[String],
    copyright: String,
    description: String,
    favicon: String,
    generator: String,
    image: Image,
    language: String,
    link: String,
    title: String,
    xmlurl: String
  ): Meta = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], copyright = copyright.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], favicon = favicon.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], xmlurl = xmlurl.asInstanceOf[js.Any])
    __obj.updateDynamic("#ns")(Numbersignns.asInstanceOf[js.Any])
    __obj.updateDynamic("#type")(Numbersigntype.asInstanceOf[js.Any])
    __obj.updateDynamic("#version")(Numbersignversion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Meta]
  }
  @scala.inline
  implicit class MetaOps[Self <: Meta] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNumbersignns(value: js.Array[NS]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("#ns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumbersigntype(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("#type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumbersignversion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("#version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategories(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCopyright(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFavicon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("favicon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGenerator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage(value: Image): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXmlurl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlurl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(null)
        ret
    }
    @scala.inline
    def withPubdate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pubdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPubdateNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pubdate")(null)
        ret
    }
  }
  
}

