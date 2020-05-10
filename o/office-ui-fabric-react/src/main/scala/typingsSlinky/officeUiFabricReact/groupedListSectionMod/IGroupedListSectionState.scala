package typingsSlinky.officeUiFabricReact.groupedListSectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGroupedListSectionState extends js.Object {
  var isDropping: js.UndefOr[Boolean] = js.native
  var isSelected: js.UndefOr[Boolean] = js.native
}

object IGroupedListSectionState {
  @scala.inline
  def apply(): IGroupedListSectionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGroupedListSectionState]
  }
  @scala.inline
  implicit class IGroupedListSectionStateOps[Self <: IGroupedListSectionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsDropping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDropping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDropping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDropping")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSelected")(js.undefined)
        ret
    }
  }
  
}

