package typingsSlinky.actionsOnGoogle.tableMod

import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsTableCardColumnProperties
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsTableCardColumnPropertiesHorizontalAlignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableColumn extends GoogleActionsV2UiElementsTableCardColumnProperties {
  /**
    * Alias for `horizontalAlignment`
    *
    * Horizontal alignment of content w.r.t column. If unspecified, content
    * will be aligned to the leading edge.
    * @public
    */
  var align: js.UndefOr[GoogleActionsV2UiElementsTableCardColumnPropertiesHorizontalAlignment] = js.native
}

object TableColumn {
  @scala.inline
  def apply(): TableColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableColumn]
  }
  @scala.inline
  implicit class TableColumnOps[Self <: TableColumn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: GoogleActionsV2UiElementsTableCardColumnPropertiesHorizontalAlignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
  }
  
}

