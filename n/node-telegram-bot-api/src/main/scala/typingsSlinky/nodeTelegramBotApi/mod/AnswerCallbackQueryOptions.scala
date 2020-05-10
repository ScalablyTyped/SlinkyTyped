package typingsSlinky.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnswerCallbackQueryOptions extends js.Object {
  var cache_time: js.UndefOr[Double] = js.native
  var callback_query_id: String = js.native
  var show_alert: js.UndefOr[Boolean] = js.native
  var text: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
}

object AnswerCallbackQueryOptions {
  @scala.inline
  def apply(callback_query_id: String): AnswerCallbackQueryOptions = {
    val __obj = js.Dynamic.literal(callback_query_id = callback_query_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnswerCallbackQueryOptions]
  }
  @scala.inline
  implicit class AnswerCallbackQueryOptionsOps[Self <: AnswerCallbackQueryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallback_query_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback_query_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCache_time(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCache_time: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache_time")(js.undefined)
        ret
    }
    @scala.inline
    def withShow_alert(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show_alert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShow_alert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show_alert")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
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

