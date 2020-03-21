package typingsSlinky.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizationAdjustment extends js.Object {
  var amount: String
  var processorResponseCode: String
  var processorResponseText: String
  var processorResponseType: String
  var success: Boolean
  var timestamp: js.Date
}

object AuthorizationAdjustment {
  @scala.inline
  def apply(
    amount: String,
    processorResponseCode: String,
    processorResponseText: String,
    processorResponseType: String,
    success: Boolean,
    timestamp: js.Date
  ): AuthorizationAdjustment = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], processorResponseCode = processorResponseCode.asInstanceOf[js.Any], processorResponseText = processorResponseText.asInstanceOf[js.Any], processorResponseType = processorResponseType.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AuthorizationAdjustment]
  }
}

