package typingsSlinky.officeUiFabricReact.groupedListBaseMod

import typingsSlinky.officeUiFabricReact.groupedListTypesMod.IGroup
import typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGroupedListState extends js.Object {
  var groups: js.UndefOr[js.Array[IGroup]] = js.native
  var lastSelectionMode: js.UndefOr[SelectionMode] = js.native
  var lastWidth: js.UndefOr[Double] = js.native
}

object IGroupedListState {
  @scala.inline
  def apply(): IGroupedListState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGroupedListState]
  }
  @scala.inline
  implicit class IGroupedListStateOps[Self <: IGroupedListState] (val x: Self) extends AnyVal {
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
    def withoutGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(js.undefined)
        ret
    }
    @scala.inline
    def withLastSelectionMode(value: SelectionMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSelectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastSelectionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSelectionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withLastWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastWidth")(js.undefined)
        ret
    }
  }
  
}

