package typingsSlinky.reactVirtualized

import typingsSlinky.reactVirtualized.reactVirtualizedBooleans.`false`
import typingsSlinky.reactVirtualized.reactVirtualizedNumbers.`0`
import typingsSlinky.reactVirtualized.reactVirtualizedStrings.edges
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDisabled extends js.Object {
  var disabled: `false` = js.native
  var isControlled: `false` = js.native
  var mode: edges = js.native
  var scrollToColumn: `0` = js.native
  var scrollToRow: `0` = js.native
}

object AnonDisabled {
  @scala.inline
  def apply(disabled: `false`, isControlled: `false`, mode: edges, scrollToColumn: `0`, scrollToRow: `0`): AnonDisabled = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], isControlled = isControlled.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], scrollToColumn = scrollToColumn.asInstanceOf[js.Any], scrollToRow = scrollToRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDisabled]
  }
  @scala.inline
  implicit class AnonDisabledOps[Self <: AnonDisabled] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisabled(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsControlled(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isControlled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMode(value: edges): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollToColumn(value: `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollToRow(value: `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToRow")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

