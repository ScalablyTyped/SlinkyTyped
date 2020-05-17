package typingsSlinky.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemUnit extends js.Object {
  var itemUnit: String = js.native
  var itemsUnit: String = js.native
  var searchPlaceholder: String = js.native
}

object ItemUnit {
  @scala.inline
  def apply(itemUnit: String, itemsUnit: String, searchPlaceholder: String): ItemUnit = {
    val __obj = js.Dynamic.literal(itemUnit = itemUnit.asInstanceOf[js.Any], itemsUnit = itemsUnit.asInstanceOf[js.Any], searchPlaceholder = searchPlaceholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemUnit]
  }
  @scala.inline
  implicit class ItemUnitOps[Self <: ItemUnit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItemUnit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemsUnit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchPlaceholder")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

