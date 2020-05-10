package typingsSlinky.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectionChangedEvent extends js.Object {
  var newBufferRange: Range = js.native
  var newScreenRange: Range = js.native
  var oldBufferRange: Range = js.native
  var oldScreenRange: Range = js.native
  var selection: Selection = js.native
}

object SelectionChangedEvent {
  @scala.inline
  def apply(
    newBufferRange: Range,
    newScreenRange: Range,
    oldBufferRange: Range,
    oldScreenRange: Range,
    selection: Selection
  ): SelectionChangedEvent = {
    val __obj = js.Dynamic.literal(newBufferRange = newBufferRange.asInstanceOf[js.Any], newScreenRange = newScreenRange.asInstanceOf[js.Any], oldBufferRange = oldBufferRange.asInstanceOf[js.Any], oldScreenRange = oldScreenRange.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionChangedEvent]
  }
  @scala.inline
  implicit class SelectionChangedEventOps[Self <: SelectionChangedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewBufferRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newBufferRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewScreenRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newScreenRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldBufferRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldBufferRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldScreenRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldScreenRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelection(value: Selection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

