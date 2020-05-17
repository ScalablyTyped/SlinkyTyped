package typingsSlinky.linq4js.Linq4JS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderEntry extends js.Object {
  var Direction: OrderDirection = js.native
  def ValueSelector(item: js.Any): js.Any = js.native
}

object OrderEntry {
  @scala.inline
  def apply(Direction: OrderDirection, ValueSelector: js.Any => js.Any): OrderEntry = {
    val __obj = js.Dynamic.literal(Direction = Direction.asInstanceOf[js.Any], ValueSelector = js.Any.fromFunction1(ValueSelector))
    __obj.asInstanceOf[OrderEntry]
  }
  @scala.inline
  implicit class OrderEntryOps[Self <: OrderEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirection(value: OrderDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueSelector(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValueSelector")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

