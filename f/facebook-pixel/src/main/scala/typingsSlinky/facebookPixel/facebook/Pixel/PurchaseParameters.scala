package typingsSlinky.facebookPixel.facebook.Pixel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PurchaseParameters extends js.Object {
  var content_ids: js.UndefOr[js.Array[String]] = js.native
  var content_name: js.UndefOr[String] = js.native
  var content_type: js.UndefOr[String] = js.native
  var currency: String = js.native
  var num_items: js.UndefOr[Double] = js.native
  var order_id: js.UndefOr[String] = js.native
  var value: Double = js.native
}

object PurchaseParameters {
  @scala.inline
  def apply(currency: String, value: Double): PurchaseParameters = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseParameters]
  }
  @scala.inline
  implicit class PurchaseParametersOps[Self <: PurchaseParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent_ids(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent_ids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_ids")(js.undefined)
        ret
    }
    @scala.inline
    def withContent_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_name")(js.undefined)
        ret
    }
    @scala.inline
    def withContent_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_type")(js.undefined)
        ret
    }
    @scala.inline
    def withNum_items(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("num_items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNum_items: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("num_items")(js.undefined)
        ret
    }
    @scala.inline
    def withOrder_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order_id")(js.undefined)
        ret
    }
  }
  
}

