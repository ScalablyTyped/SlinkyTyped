package typingsSlinky.paypalRestSdk.anon

import typingsSlinky.paypalRestSdk.mod.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Items extends js.Object {
  var items: js.Array[Item] = js.native
  var shipping_address: js.UndefOr[typingsSlinky.paypalRestSdk.mod.Address] = js.native
  var shipping_method: js.UndefOr[String] = js.native
  var shipping_phone_number: js.UndefOr[String] = js.native
}

object Items {
  @scala.inline
  def apply(items: js.Array[Item]): Items = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[Items]
  }
  @scala.inline
  implicit class ItemsOps[Self <: Items] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[Item]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShipping_address(value: typingsSlinky.paypalRestSdk.mod.Address): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping_address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShipping_address: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping_address")(js.undefined)
        ret
    }
    @scala.inline
    def withShipping_method(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping_method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShipping_method: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping_method")(js.undefined)
        ret
    }
    @scala.inline
    def withShipping_phone_number(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping_phone_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShipping_phone_number: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping_phone_number")(js.undefined)
        ret
    }
  }
  
}

