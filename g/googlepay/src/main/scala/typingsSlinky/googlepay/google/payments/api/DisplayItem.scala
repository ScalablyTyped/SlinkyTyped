package typingsSlinky.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Definition of a cart item.
  */
@js.native
trait DisplayItem extends js.Object {
  /**
    * The label to be displayed for the item.
    *
    * This field is required.
    */
  var label: String = js.native
  /**
    * Price of this item.
    *
    * The format of this string should follow the regular expression
    * format:
    * `^[0-9]+(\.[0-9][0-9])?$` (e.g., `"10.45"`)
    */
  var price: String = js.native
  /**
    * The status of a DisplayItem.
    *
    * This field is optional and default value is
    * [[DisplayItemStatus|`FINAL`]] if absent.
    */
  var status: js.UndefOr[DisplayItemStatus] = js.native
  /**
    * Type of displayed line item, this is going to be used for analysis
    * purpose.
    *
    * This field is required.
    */
  var `type`: DisplayItemType = js.native
}

object DisplayItem {
  @scala.inline
  def apply(label: String, price: String, `type`: DisplayItemType): DisplayItem = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayItem]
  }
  @scala.inline
  implicit class DisplayItemOps[Self <: DisplayItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("price")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: DisplayItemType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: DisplayItemStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

