package typingsSlinky.nodeTelegramBotApi.mod

import typingsSlinky.nodeTelegramBotApi.nodeTelegramBotApiStrings.article
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InlineQueryResultArticle
  extends InlineQueryResultBase
     with InlineQueryResult {
  var description: js.UndefOr[String] = js.native
  var hide_url: js.UndefOr[Boolean] = js.native
  var input_message_content: InputMessageContent = js.native
  var thumb_height: js.UndefOr[Double] = js.native
  var thumb_url: js.UndefOr[String] = js.native
  var thumb_width: js.UndefOr[Double] = js.native
  var title: String = js.native
  var `type`: article = js.native
  var url: js.UndefOr[String] = js.native
}

object InlineQueryResultArticle {
  @scala.inline
  def apply(id: String, input_message_content: InputMessageContent, title: String, `type`: article): InlineQueryResultArticle = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], input_message_content = input_message_content.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResultArticle]
  }
  @scala.inline
  implicit class InlineQueryResultArticleOps[Self <: InlineQueryResultArticle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInput_message_content(value: InputMessageContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input_message_content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: article): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withHide_url(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHide_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide_url")(js.undefined)
        ret
    }
    @scala.inline
    def withThumb_height(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumb_height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumb_height: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumb_height")(js.undefined)
        ret
    }
    @scala.inline
    def withThumb_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumb_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumb_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumb_url")(js.undefined)
        ret
    }
    @scala.inline
    def withThumb_width(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumb_width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumb_width: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumb_width")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

