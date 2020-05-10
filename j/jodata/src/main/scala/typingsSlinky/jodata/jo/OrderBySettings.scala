package typingsSlinky.jodata.jo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderBySettings extends ISettings {
  var DefaultOrder: String = js.native
  var DefaultProperty: String = js.native
  var Order: String = js.native
  var Property: String = js.native
}

object OrderBySettings {
  @scala.inline
  def apply(
    DefaultOrder: String,
    DefaultProperty: String,
    Order: String,
    Property: String,
    isSet: () => Boolean,
    reset: () => Unit
  ): OrderBySettings = {
    val __obj = js.Dynamic.literal(DefaultOrder = DefaultOrder.asInstanceOf[js.Any], DefaultProperty = DefaultProperty.asInstanceOf[js.Any], Order = Order.asInstanceOf[js.Any], Property = Property.asInstanceOf[js.Any], isSet = js.Any.fromFunction0(isSet), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[OrderBySettings]
  }
  @scala.inline
  implicit class OrderBySettingsOps[Self <: OrderBySettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultOrder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Property")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

