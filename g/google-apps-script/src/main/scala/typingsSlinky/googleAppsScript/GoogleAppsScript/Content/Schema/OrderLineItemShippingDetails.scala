package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderLineItemShippingDetails extends js.Object {
  var deliverByDate: js.UndefOr[String] = js.native
  var method: js.UndefOr[OrderLineItemShippingDetailsMethod] = js.native
  var shipByDate: js.UndefOr[String] = js.native
}

object OrderLineItemShippingDetails {
  @scala.inline
  def apply(): OrderLineItemShippingDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderLineItemShippingDetails]
  }
  @scala.inline
  implicit class OrderLineItemShippingDetailsOps[Self <: OrderLineItemShippingDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeliverByDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliverByDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeliverByDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliverByDate")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: OrderLineItemShippingDetailsMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withShipByDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipByDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShipByDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipByDate")(js.undefined)
        ret
    }
  }
  
}

