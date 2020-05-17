package typingsSlinky.braintree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DoNotInheritAddOnsOrDiscounts extends js.Object {
  var doNotInheritAddOnsOrDiscounts: js.UndefOr[Boolean] = js.native
  var paypal: js.UndefOr[Description] = js.native
  var startImmediately: js.UndefOr[Boolean] = js.native
}

object DoNotInheritAddOnsOrDiscounts {
  @scala.inline
  def apply(): DoNotInheritAddOnsOrDiscounts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DoNotInheritAddOnsOrDiscounts]
  }
  @scala.inline
  implicit class DoNotInheritAddOnsOrDiscountsOps[Self <: DoNotInheritAddOnsOrDiscounts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDoNotInheritAddOnsOrDiscounts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doNotInheritAddOnsOrDiscounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoNotInheritAddOnsOrDiscounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doNotInheritAddOnsOrDiscounts")(js.undefined)
        ret
    }
    @scala.inline
    def withPaypal(value: Description): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paypal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaypal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paypal")(js.undefined)
        ret
    }
    @scala.inline
    def withStartImmediately(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startImmediately")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartImmediately: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startImmediately")(js.undefined)
        ret
    }
  }
  
}

