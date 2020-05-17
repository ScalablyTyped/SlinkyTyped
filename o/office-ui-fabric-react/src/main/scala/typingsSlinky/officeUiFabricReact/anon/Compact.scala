package typingsSlinky.officeUiFabricReact.anon

import typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Compact extends js.Object {
  var compact: Boolean = js.native
  var isHeaderVisible: Boolean = js.native
  var selectionMode: SelectionMode = js.native
}

object Compact {
  @scala.inline
  def apply(compact: Boolean, isHeaderVisible: Boolean, selectionMode: SelectionMode): Compact = {
    val __obj = js.Dynamic.literal(compact = compact.asInstanceOf[js.Any], isHeaderVisible = isHeaderVisible.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compact]
  }
  @scala.inline
  implicit class CompactOps[Self <: Compact] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompact(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsHeaderVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHeaderVisible")(value.asInstanceOf[js.Any])
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

