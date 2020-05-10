package typingsSlinky.officeUiFabricReact.detailsListGroupedExampleMod

import typingsSlinky.officeUiFabricReact.groupedListTypesMod.IGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDetailsListGroupedExampleState extends js.Object {
  var groups: js.Array[IGroup] = js.native
  var isCompactMode: Boolean = js.native
  var items: js.Array[IDetailsListGroupedExampleItem] = js.native
  var showItemIndexInView: Boolean = js.native
}

object IDetailsListGroupedExampleState {
  @scala.inline
  def apply(
    groups: js.Array[IGroup],
    isCompactMode: Boolean,
    items: js.Array[IDetailsListGroupedExampleItem],
    showItemIndexInView: Boolean
  ): IDetailsListGroupedExampleState = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], isCompactMode = isCompactMode.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], showItemIndexInView = showItemIndexInView.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsListGroupedExampleState]
  }
  @scala.inline
  implicit class IDetailsListGroupedExampleStateOps[Self <: IDetailsListGroupedExampleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroups(value: js.Array[IGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCompactMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCompactMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: js.Array[IDetailsListGroupedExampleItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowItemIndexInView(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showItemIndexInView")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

