package typingsSlinky.devextreme

import typingsSlinky.devextreme.mod.DevExpress.ui.dxTreeList
import typingsSlinky.devextreme.mod.DevExpress.ui.dxTreeListRowObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonComponentDxTreeList extends js.Object {
  var component: js.UndefOr[dxTreeList] = js.native
  var row: js.UndefOr[dxTreeListRowObject] = js.native
}

object AnonComponentDxTreeList {
  @scala.inline
  def apply(): AnonComponentDxTreeList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonComponentDxTreeList]
  }
  @scala.inline
  implicit class AnonComponentDxTreeListOps[Self <: AnonComponentDxTreeList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponent(value: dxTreeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(js.undefined)
        ret
    }
    @scala.inline
    def withRow(value: dxTreeListRowObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row")(js.undefined)
        ret
    }
  }
  
}

