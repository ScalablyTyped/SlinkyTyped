package typingsSlinky.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnswerShippingQueryOptions extends js.Object {
  var error_message: js.UndefOr[String] = js.native
  var shipping_options: js.UndefOr[js.Array[ShippingOption]] = js.native
}

object AnswerShippingQueryOptions {
  @scala.inline
  def apply(): AnswerShippingQueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnswerShippingQueryOptions]
  }
  @scala.inline
  implicit class AnswerShippingQueryOptionsOps[Self <: AnswerShippingQueryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError_message(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error_message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError_message: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error_message")(js.undefined)
        ret
    }
    @scala.inline
    def withShipping_options(value: js.Array[ShippingOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping_options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShipping_options: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping_options")(js.undefined)
        ret
    }
  }
  
}

