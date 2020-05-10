package typingsSlinky.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseParameters extends js.Object {
  var migrate_to_chat_id: js.UndefOr[Double] = js.native
  var retry_after: js.UndefOr[Double] = js.native
}

object ResponseParameters {
  @scala.inline
  def apply(): ResponseParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseParameters]
  }
  @scala.inline
  implicit class ResponseParametersOps[Self <: ResponseParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMigrate_to_chat_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("migrate_to_chat_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMigrate_to_chat_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("migrate_to_chat_id")(js.undefined)
        ret
    }
    @scala.inline
    def withRetry_after(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry_after")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetry_after: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry_after")(js.undefined)
        ret
    }
  }
  
}

