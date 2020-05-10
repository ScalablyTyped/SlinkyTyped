package typingsSlinky.remarkable.libMod

import typingsSlinky.remarkable.remarkableStrings.ordered_list_open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.remarkable.libMod._Token because Already inherited */ @js.native
trait OrderedListOpenToken extends TagToken {
  /**
    * Ordered list marker value.
    */
  var order: Double = js.native
  @JSName("type")
  var type_OrderedListOpenToken: ordered_list_open = js.native
}

object OrderedListOpenToken {
  @scala.inline
  def apply(level: Double, order: Double, `type`: ordered_list_open): OrderedListOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderedListOpenToken]
  }
  @scala.inline
  implicit class OrderedListOpenTokenOps[Self <: OrderedListOpenToken] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrder(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ordered_list_open): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

