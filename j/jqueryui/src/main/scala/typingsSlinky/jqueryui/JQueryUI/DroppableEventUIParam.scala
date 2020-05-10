package typingsSlinky.jqueryui.JQueryUI

import typingsSlinky.jqueryui.AnonLeft
import typingsSlinky.jqueryui.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Droppable //////////////////////////////////////////////////
@js.native
trait DroppableEventUIParam extends js.Object {
  var draggable: JQuery = js.native
  var helper: JQuery = js.native
  var offset: AnonLeft = js.native
  var position: AnonLeft = js.native
}

object DroppableEventUIParam {
  @scala.inline
  def apply(draggable: JQuery, helper: JQuery, offset: AnonLeft, position: AnonLeft): DroppableEventUIParam = {
    val __obj = js.Dynamic.literal(draggable = draggable.asInstanceOf[js.Any], helper = helper.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[DroppableEventUIParam]
  }
  @scala.inline
  implicit class DroppableEventUIParamOps[Self <: DroppableEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDraggable(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(value.asInstanceOf[js.Any])
        ret
    }
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

