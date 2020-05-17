package typingsSlinky.officeUiFabricReact.anon

import typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsSelectedOnFocus extends js.Object {
  var isSelectedOnFocus: Boolean = js.native
  var selectionMode: SelectionMode = js.native
}

object IsSelectedOnFocus {
  @scala.inline
  def apply(isSelectedOnFocus: Boolean, selectionMode: SelectionMode): IsSelectedOnFocus = {
    val __obj = js.Dynamic.literal(isSelectedOnFocus = isSelectedOnFocus.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsSelectedOnFocus]
  }
  @scala.inline
  implicit class IsSelectedOnFocusOps[Self <: IsSelectedOnFocus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsSelectedOnFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSelectedOnFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionMode(value: SelectionMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

