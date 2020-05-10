package typingsSlinky.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizationAdjustment extends js.Object {
  var amount: String = js.native
  var processorResponseCode: String = js.native
  var processorResponseText: String = js.native
  var processorResponseType: String = js.native
  var success: Boolean = js.native
  var timestamp: js.Date = js.native
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
  @scala.inline
  implicit class AuthorizationAdjustmentOps[Self <: AuthorizationAdjustment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcessorResponseCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processorResponseCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcessorResponseText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processorResponseText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcessorResponseType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processorResponseType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

