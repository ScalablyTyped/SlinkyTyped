package typingsSlinky.reactPlaidLink

import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.API_ERROR
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.ASSET_REPORT_ERROR
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.INSTITUTION_ERROR
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.INVALID_INPUT
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.INVALID_REQUEST
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.ITEM_ERROR
import typingsSlinky.reactPlaidLink.reactPlaidLinkStrings.RATE_LIMIT_EXCEEDED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDisplaymessage extends js.Object {
  var display_message: String | Null = js.native
  var error_code: String = js.native
  var error_message: String = js.native
  var error_type: INVALID_REQUEST | INVALID_INPUT | INSTITUTION_ERROR | RATE_LIMIT_EXCEEDED | API_ERROR | ITEM_ERROR | ASSET_REPORT_ERROR = js.native
}

object AnonDisplaymessage {
  @scala.inline
  def apply(
    error_code: String,
    error_message: String,
    error_type: INVALID_REQUEST | INVALID_INPUT | INSTITUTION_ERROR | RATE_LIMIT_EXCEEDED | API_ERROR | ITEM_ERROR | ASSET_REPORT_ERROR
  ): AnonDisplaymessage = {
    val __obj = js.Dynamic.literal(error_code = error_code.asInstanceOf[js.Any], error_message = error_message.asInstanceOf[js.Any], error_type = error_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDisplaymessage]
  }
  @scala.inline
  implicit class AnonDisplaymessageOps[Self <: AnonDisplaymessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError_message(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error_message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError_type(
      value: INVALID_REQUEST | INVALID_INPUT | INSTITUTION_ERROR | RATE_LIMIT_EXCEEDED | API_ERROR | ITEM_ERROR | ASSET_REPORT_ERROR
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplay_message(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display_message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplay_messageNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display_message")(null)
        ret
    }
  }
  
}

