package typingsSlinky.antd.tableInterfaceMod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnFilterItem extends js.Object {
  var children: js.UndefOr[js.Array[ColumnFilterItem]] = js.undefined
  var text: ReactElement
  var value: String | Double | Boolean
}

object ColumnFilterItem {
  @scala.inline
  def apply(value: String | Double | Boolean): ColumnFilterItem = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnFilterItem]
  }
  @scala.inline
  implicit class ColumnFilterItemOps[Self <: ColumnFilterItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setValue(value: String | Double | Boolean): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: js.Array[ColumnFilterItem]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setText(value: ReactElement): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

