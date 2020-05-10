package typingsSlinky.braintreeWeb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @property {Function} close A handle to close the PayPal checkout flow.
  */
@js.native
trait PayPalTokenizeReturn extends js.Object {
  def close(): js.Any = js.native
}

object PayPalTokenizeReturn {
  @scala.inline
  def apply(close: () => js.Any): PayPalTokenizeReturn = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close))
    __obj.asInstanceOf[PayPalTokenizeReturn]
  }
  @scala.inline
  implicit class PayPalTokenizeReturnOps[Self <: PayPalTokenizeReturn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

