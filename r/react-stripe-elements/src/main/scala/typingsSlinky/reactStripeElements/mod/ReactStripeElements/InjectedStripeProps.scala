package typingsSlinky.reactStripeElements.mod.ReactStripeElements

import typingsSlinky.stripeV3.stripe.elements.Elements
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InjectedStripeProps extends js.Object {
  var elements: Elements | Null = js.native
  var stripe: StripeProps | Null = js.native
}

object InjectedStripeProps {
  @scala.inline
  def apply(): InjectedStripeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InjectedStripeProps]
  }
  @scala.inline
  implicit class InjectedStripePropsOps[Self <: InjectedStripeProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElements(value: Elements): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElementsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elements")(null)
        ret
    }
    @scala.inline
    def withStripe(value: StripeProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStripeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripe")(null)
        ret
    }
  }
  
}

