package typingsSlinky.leafletDraw.mod.Localization

import typingsSlinky.leafletDraw.AnonTooltipAnonText
import typingsSlinky.leafletDraw.AnonTooltipAnonTextString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditHandlers extends js.Object {
  var edit: AnonTooltipAnonText = js.native
  var remove: AnonTooltipAnonTextString = js.native
}

object EditHandlers {
  @scala.inline
  def apply(edit: AnonTooltipAnonText, remove: AnonTooltipAnonTextString): EditHandlers = {
    val __obj = js.Dynamic.literal(edit = edit.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditHandlers]
  }
  @scala.inline
  implicit class EditHandlersOps[Self <: EditHandlers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEdit(value: AnonTooltipAnonText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemove(value: AnonTooltipAnonTextString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

