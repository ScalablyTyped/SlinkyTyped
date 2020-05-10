package typingsSlinky.officeUiFabricReact.detailsHeaderTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDetailsHeaderState extends js.Object {
  var columnResizeDetails: js.UndefOr[IColumnResizeDetails] = js.native
  var isAllCollapsed: js.UndefOr[Boolean] = js.native
  var isAllSelected: js.UndefOr[Boolean] = js.native
  var isSizing: js.UndefOr[Boolean] = js.native
}

object IDetailsHeaderState {
  @scala.inline
  def apply(): IDetailsHeaderState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDetailsHeaderState]
  }
  @scala.inline
  implicit class IDetailsHeaderStateOps[Self <: IDetailsHeaderState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnResizeDetails(value: IColumnResizeDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnResizeDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnResizeDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnResizeDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withIsAllCollapsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAllCollapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsAllCollapsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAllCollapsed")(js.undefined)
        ret
    }
    @scala.inline
    def withIsAllSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAllSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsAllSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAllSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSizing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSizing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSizing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSizing")(js.undefined)
        ret
    }
  }
  
}

