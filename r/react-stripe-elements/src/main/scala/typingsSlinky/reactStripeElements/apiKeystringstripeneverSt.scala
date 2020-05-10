package typingsSlinky.reactStripeElements

import typingsSlinky.reactStripeElements.mod.ReactStripeElements.StripeProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  apiKey  :string,   stripe ? :never} & react-stripe-elements.react-stripe-elements.ReactStripeElements.StripeProviderOptions */
@js.native
trait apiKeystringstripeneverSt extends StripeProviderProps {
  var apiKey: String = js.native
  var stripeAccount: js.UndefOr[String] = js.native
}

object apiKeystringstripeneverSt {
  @scala.inline
  def apply(apiKey: String): apiKeystringstripeneverSt = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[apiKeystringstripeneverSt]
  }
  @scala.inline
  implicit class apiKeystringstripeneverStOps[Self <: apiKeystringstripeneverSt] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiKey")(value.asInstanceOf[js.Any])
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

