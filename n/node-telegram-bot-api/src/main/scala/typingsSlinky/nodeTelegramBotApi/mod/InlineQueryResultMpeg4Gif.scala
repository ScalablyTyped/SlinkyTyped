package typingsSlinky.nodeTelegramBotApi.mod

import typingsSlinky.nodeTelegramBotApi.nodeTelegramBotApiStrings.mpeg4_gif
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InlineQueryResultMpeg4Gif
  extends InlineQueryResultBase
     with InlineQueryResult {
  var caption: js.UndefOr[String] = js.native
  var input_message_content: js.UndefOr[InputMessageContent] = js.native
  var mpeg4_duration: js.UndefOr[Double] = js.native
  var mpeg4_height: js.UndefOr[Double] = js.native
  var mpeg4_url: String = js.native
  var mpeg4_width: js.UndefOr[Double] = js.native
  var thumb_url: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var `type`: mpeg4_gif = js.native
}

object InlineQueryResultMpeg4Gif {
  @scala.inline
  def apply(id: String, mpeg4_url: String, `type`: mpeg4_gif): InlineQueryResultMpeg4Gif = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], mpeg4_url = mpeg4_url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResultMpeg4Gif]
  }
  @scala.inline
  implicit class InlineQueryResultMpeg4GifOps[Self <: InlineQueryResultMpeg4Gif] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMpeg4_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mpeg4_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: mpeg4_gif): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(js.undefined)
        ret
    }
    @scala.inline
    def withInput_message_content(value: InputMessageContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input_message_content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput_message_content: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input_message_content")(js.undefined)
        ret
    }
    @scala.inline
    def withMpeg4_duration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mpeg4_duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMpeg4_duration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mpeg4_duration")(js.undefined)
        ret
    }
    @scala.inline
    def withMpeg4_height(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mpeg4_height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMpeg4_height: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mpeg4_height")(js.undefined)
        ret
    }
    @scala.inline
    def withMpeg4_width(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mpeg4_width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMpeg4_width: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mpeg4_width")(js.undefined)
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
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

