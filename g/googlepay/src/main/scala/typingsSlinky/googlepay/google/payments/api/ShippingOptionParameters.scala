package typingsSlinky.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Parameters of merchant provided shipping option. If
  * paymentDataRequest#shippingOptionRequired is set then the request must
  * also provide ShippingOptionParameters with at least one option.
  * Developer can set a shipping option labeled "PENDING" if there's
  * nothing to show at initial request time.
  */
@js.native
trait ShippingOptionParameters extends js.Object {
  /**
    * Identifier to the default selected shipping option. If this field is
    * not provided the first option will be the default option.
    *
    * This field is optional.
    */
  var defaultSelectedOptionId: js.UndefOr[String] = js.native
  /**
    * All the shipping options available for the current request. Will be
    * rendered in the UI with given order.
    *
    * This field is required.
    */
  var shippingOptions: js.Array[SelectionOption] = js.native
}

object ShippingOptionParameters {
  @scala.inline
  def apply(shippingOptions: js.Array[SelectionOption]): ShippingOptionParameters = {
    val __obj = js.Dynamic.literal(shippingOptions = shippingOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShippingOptionParameters]
  }
  @scala.inline
  implicit class ShippingOptionParametersOps[Self <: ShippingOptionParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShippingOptions(value: js.Array[SelectionOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultSelectedOptionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSelectedOptionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSelectedOptionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSelectedOptionId")(js.undefined)
        ret
    }
  }
  
}

