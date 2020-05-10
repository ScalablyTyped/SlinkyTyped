package typingsSlinky.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DraggableOptions extends js.Object {
  var canDragInteractiveElements: Boolean = js.native
  var isEnabled: Boolean = js.native
  var shouldRespectForcePress: Boolean = js.native
}

object DraggableOptions {
  @scala.inline
  def apply(canDragInteractiveElements: Boolean, isEnabled: Boolean, shouldRespectForcePress: Boolean): DraggableOptions = {
    val __obj = js.Dynamic.literal(canDragInteractiveElements = canDragInteractiveElements.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], shouldRespectForcePress = shouldRespectForcePress.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableOptions]
  }
  @scala.inline
  implicit class DraggableOptionsOps[Self <: DraggableOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanDragInteractiveElements(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canDragInteractiveElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShouldRespectForcePress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldRespectForcePress")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

