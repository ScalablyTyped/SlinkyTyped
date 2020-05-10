package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2UiElementsTableCardRow extends js.Object {
  /**
    * Cells in this row. The first 3 cells are guaranteed to be shown but
    * others might be cut on certain surfaces. Please test with the simulator
    * to see which cells will be shown for a given surface.
    */
  var cells: js.UndefOr[js.Array[GoogleActionsV2UiElementsTableCardCell]] = js.native
  /**
    * Indicates whether there should be a divider after each row.
    */
  var dividerAfter: js.UndefOr[Boolean] = js.native
}

object GoogleActionsV2UiElementsTableCardRow {
  @scala.inline
  def apply(): GoogleActionsV2UiElementsTableCardRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2UiElementsTableCardRow]
  }
  @scala.inline
  implicit class GoogleActionsV2UiElementsTableCardRowOps[Self <: GoogleActionsV2UiElementsTableCardRow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCells(value: js.Array[GoogleActionsV2UiElementsTableCardCell]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCells: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cells")(js.undefined)
        ret
    }
    @scala.inline
    def withDividerAfter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dividerAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDividerAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dividerAfter")(js.undefined)
        ret
    }
  }
  
}

