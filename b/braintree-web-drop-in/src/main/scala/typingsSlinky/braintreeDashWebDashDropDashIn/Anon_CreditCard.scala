package typingsSlinky.braintreeDashWebDashDropDashIn

import typingsSlinky.braintreeDashWebDashDropDashIn.braintreeDashWebDashDropDashInStrings.CreditCard
import typingsSlinky.braintreeDashWebDashDropDashIn.braintreeDashWebDashDropDashInStrings.PayPalAccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CreditCard extends js.Object {
  var paymentMethodIsSelected: Boolean
  var `type`: CreditCard | PayPalAccount
}

object Anon_CreditCard {
  @scala.inline
  def apply(paymentMethodIsSelected: Boolean, `type`: CreditCard | PayPalAccount): Anon_CreditCard = {
    val __obj = js.Dynamic.literal(paymentMethodIsSelected = paymentMethodIsSelected.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CreditCard]
  }
}

