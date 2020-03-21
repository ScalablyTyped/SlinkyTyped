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

trait AnonDisplaymessage extends js.Object {
  var display_message: String | Null
  var error_code: String
  var error_message: String
  var error_type: INVALID_REQUEST | INVALID_INPUT | INSTITUTION_ERROR | RATE_LIMIT_EXCEEDED | API_ERROR | ITEM_ERROR | ASSET_REPORT_ERROR
}

object AnonDisplaymessage {
  @scala.inline
  def apply(
    error_code: String,
    error_message: String,
    error_type: INVALID_REQUEST | INVALID_INPUT | INSTITUTION_ERROR | RATE_LIMIT_EXCEEDED | API_ERROR | ITEM_ERROR | ASSET_REPORT_ERROR,
    display_message: String = null
  ): AnonDisplaymessage = {
    val __obj = js.Dynamic.literal(error_code = error_code.asInstanceOf[js.Any], error_message = error_message.asInstanceOf[js.Any], error_type = error_type.asInstanceOf[js.Any])
    if (display_message != null) __obj.updateDynamic("display_message")(display_message.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDisplaymessage]
  }
}

