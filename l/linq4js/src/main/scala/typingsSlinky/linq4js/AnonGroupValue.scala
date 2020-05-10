package typingsSlinky.linq4js

import typingsSlinky.linq4js.Linq4JS.OrderEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGroupValue extends js.Object {
  var GroupValue: js.Any = js.native
  var Order: Array[OrderEntry] = js.native
}

object AnonGroupValue {
  @scala.inline
  def apply(GroupValue: js.Any, Order: Array[OrderEntry]): AnonGroupValue = {
    val __obj = js.Dynamic.literal(GroupValue = GroupValue.asInstanceOf[js.Any], Order = Order.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGroupValue]
  }
  @scala.inline
  implicit class AnonGroupValueOps[Self <: AnonGroupValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrder(value: Array[OrderEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Order")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

