package typingsSlinky.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnswerInlineQueryOptions extends js.Object {
  var cache_time: js.UndefOr[Double] = js.native
  var is_personal: js.UndefOr[Boolean] = js.native
  var next_offset: js.UndefOr[String] = js.native
  var switch_pm_parameter: js.UndefOr[String] = js.native
  var switch_pm_text: js.UndefOr[String] = js.native
}

object AnswerInlineQueryOptions {
  @scala.inline
  def apply(): AnswerInlineQueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnswerInlineQueryOptions]
  }
  @scala.inline
  implicit class AnswerInlineQueryOptionsOps[Self <: AnswerInlineQueryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withIs_personal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_personal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIs_personal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_personal")(js.undefined)
        ret
    }
    @scala.inline
    def withNext_offset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next_offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNext_offset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next_offset")(js.undefined)
        ret
    }
    @scala.inline
    def withSwitch_pm_parameter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switch_pm_parameter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwitch_pm_parameter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switch_pm_parameter")(js.undefined)
        ret
    }
    @scala.inline
    def withSwitch_pm_text(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switch_pm_text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwitch_pm_text: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switch_pm_text")(js.undefined)
        ret
    }
  }
  
}

