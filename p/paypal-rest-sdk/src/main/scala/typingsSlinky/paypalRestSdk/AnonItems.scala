package typingsSlinky.paypalRestSdk

import typingsSlinky.paypalRestSdk.mod.Address
import typingsSlinky.paypalRestSdk.mod.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonItems extends js.Object {
  var items: js.Array[Item] = js.native
  var shipping_address: js.UndefOr[Address] = js.native
  var shipping_method: js.UndefOr[String] = js.native
  var shipping_phone_number: js.UndefOr[String] = js.native
}

object AnonItems {
  @scala.inline
  def apply(items: js.Array[Item]): AnonItems = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItems]
  }
  @scala.inline
  implicit class AnonItemsOps[Self <: AnonItems] (val x: Self) extends AnyVal {
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
    def withShipping_address(value: Address): Self = {
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

