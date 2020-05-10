package typingsSlinky.officeUiFabricReact

import typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIsSelectedOnFocus extends js.Object {
  var isSelectedOnFocus: Boolean = js.native
  var selectionMode: SelectionMode = js.native
}

object AnonIsSelectedOnFocus {
  @scala.inline
  def apply(isSelectedOnFocus: Boolean, selectionMode: SelectionMode): AnonIsSelectedOnFocus = {
    val __obj = js.Dynamic.literal(isSelectedOnFocus = isSelectedOnFocus.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsSelectedOnFocus]
  }
  @scala.inline
  implicit class AnonIsSelectedOnFocusOps[Self <: AnonIsSelectedOnFocus] (val x: Self) extends AnyVal {
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

