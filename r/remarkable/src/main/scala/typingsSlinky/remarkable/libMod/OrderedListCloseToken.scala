package typingsSlinky.remarkable.libMod

import typingsSlinky.remarkable.remarkableStrings.ordered_list_close
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.remarkable.libMod._Token because Already inherited */ @js.native
trait OrderedListCloseToken extends TagToken {
  @JSName("type")
  var type_OrderedListCloseToken: ordered_list_close = js.native
}

object OrderedListCloseToken {
  @scala.inline
  def apply(level: Double, `type`: ordered_list_close): OrderedListCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderedListCloseToken]
  }
  @scala.inline
  implicit class OrderedListCloseTokenOps[Self <: OrderedListCloseToken] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: ordered_list_close): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

