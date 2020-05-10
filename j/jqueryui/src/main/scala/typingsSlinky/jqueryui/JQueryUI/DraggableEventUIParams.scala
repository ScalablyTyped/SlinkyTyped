package typingsSlinky.jqueryui.JQueryUI

import typingsSlinky.jqueryui.AnonLeft
import typingsSlinky.jqueryui.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Draggable //////////////////////////////////////////////////
@js.native
trait DraggableEventUIParams extends js.Object {
  var helper: JQuery = js.native
  var offset: AnonLeft = js.native
  var position: AnonLeft = js.native
}

object DraggableEventUIParams {
  @scala.inline
  def apply(helper: JQuery, offset: AnonLeft, position: AnonLeft): DraggableEventUIParams = {
    val __obj = js.Dynamic.literal(helper = helper.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableEventUIParams]
  }
  @scala.inline
  implicit class DraggableEventUIParamsOps[Self <: DraggableEventUIParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHelper(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffset(value: AnonLeft): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: AnonLeft): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

