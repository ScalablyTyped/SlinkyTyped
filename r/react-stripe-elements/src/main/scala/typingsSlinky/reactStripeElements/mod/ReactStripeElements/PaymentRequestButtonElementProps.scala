package typingsSlinky.reactStripeElements.mod.ReactStripeElements

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentRequestButtonElementProps extends ElementProps {
  var onClick: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.native
}

object PaymentRequestButtonElementProps {
  @scala.inline
  def apply(): PaymentRequestButtonElementProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentRequestButtonElementProps]
  }
  @scala.inline
  implicit class PaymentRequestButtonElementPropsOps[Self <: PaymentRequestButtonElementProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnClick(value: /* event */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
  }
  
}

