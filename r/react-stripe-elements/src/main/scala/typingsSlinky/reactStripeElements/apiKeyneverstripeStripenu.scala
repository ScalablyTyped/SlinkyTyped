package typingsSlinky.reactStripeElements

import typingsSlinky.reactStripeElements.mod.ReactStripeElements.StripeProviderProps
import typingsSlinky.stripeV3.stripe.Stripe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  apiKey ? :never,   stripe  :stripe-v3.stripe.Stripe | null} & react-stripe-elements.react-stripe-elements.ReactStripeElements.StripeProviderOptions */
@js.native
trait apiKeyneverstripeStripenu extends StripeProviderProps {
  var stripe: Stripe | Null = js.native
  var stripeAccount: js.UndefOr[String] = js.native
}

object apiKeyneverstripeStripenu {
  @scala.inline
  def apply(): apiKeyneverstripeStripenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[apiKeyneverstripeStripenu]
  }
  @scala.inline
  implicit class apiKeyneverstripeStripenuOps[Self <: apiKeyneverstripeStripenu] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStripe(value: Stripe): Self = {
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
    @scala.inline
    def withStripeAccount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripeAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStripeAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripeAccount")(js.undefined)
        ret
    }
  }
  
}

