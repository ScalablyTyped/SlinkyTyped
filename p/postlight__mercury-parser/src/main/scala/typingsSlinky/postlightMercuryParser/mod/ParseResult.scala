package typingsSlinky.postlightMercuryParser.mod

import typingsSlinky.postlightMercuryParser.postlightMercuryParserStrings.ltr
import typingsSlinky.postlightMercuryParser.postlightMercuryParserStrings.rtl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseResult extends js.Object {
  var author: String | Null = js.native
  var content: String | Null = js.native
  var date_published: String | Null = js.native
  var dek: String | Null = js.native
  var direction: ltr | rtl = js.native
  var domain: String = js.native
  var excerpt: String | Null = js.native
  var lead_image_url: String | Null = js.native
  var next_page_url: String | Null = js.native
  var rendered_pages: Double = js.native
  var title: String | Null = js.native
  var total_pages: Double = js.native
  var url: String = js.native
  var word_count: Double = js.native
}

object ParseResult {
  @scala.inline
  def apply(
    direction: ltr | rtl,
    domain: String,
    rendered_pages: Double,
    total_pages: Double,
    url: String,
    word_count: Double
  ): ParseResult = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], rendered_pages = rendered_pages.asInstanceOf[js.Any], total_pages = total_pages.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], word_count = word_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseResult]
  }
  @scala.inline
  implicit class ParseResultOps[Self <: ParseResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirection(value: ltr | rtl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRendered_pages(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendered_pages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_pages(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_pages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWord_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("word_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(null)
        ret
    }
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(null)
        ret
    }
    @scala.inline
    def withDate_published(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date_published")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDate_publishedNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date_published")(null)
        ret
    }
    @scala.inline
    def withDek(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDekNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dek")(null)
        ret
    }
    @scala.inline
    def withExcerpt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excerpt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcerptNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excerpt")(null)
        ret
    }
    @scala.inline
    def withLead_image_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lead_image_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLead_image_urlNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lead_image_url")(null)
        ret
    }
    @scala.inline
    def withNext_page_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next_page_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNext_page_urlNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next_page_url")(null)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(null)
        ret
    }
  }
  
}

