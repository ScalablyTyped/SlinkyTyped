package typingsSlinky.oracleOraclejet.ojlistviewMod.ojListView

import org.scalajs.dom.raw.Element
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.after
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.before
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.inside
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
@js.native
trait ItemsDropContext extends js.Object {
  var item: Element = js.native
  var position: before | after | inside = js.native
  var reorder: Boolean = js.native
}

object ItemsDropContext {
  @scala.inline
  def apply(item: Element, position: before | after | inside, reorder: Boolean): ItemsDropContext = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], reorder = reorder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsDropContext]
  }
  @scala.inline
  implicit class ItemsDropContextOps[Self <: ItemsDropContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItem(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: before | after | inside): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReorder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reorder")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

