package typingsSlinky.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChosenInlineResult extends js.Object {
  var from: User = js.native
  var inline_message_id: js.UndefOr[String] = js.native
  var location: js.UndefOr[Location] = js.native
  var query: String = js.native
  var result_id: String = js.native
}

object ChosenInlineResult {
  @scala.inline
  def apply(from: User, query: String, result_id: String): ChosenInlineResult = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], result_id = result_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChosenInlineResult]
  }
  @scala.inline
  implicit class ChosenInlineResultOps[Self <: ChosenInlineResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrom(value: User): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInline_message_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline_message_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInline_message_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline_message_id")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
  }
  
}

