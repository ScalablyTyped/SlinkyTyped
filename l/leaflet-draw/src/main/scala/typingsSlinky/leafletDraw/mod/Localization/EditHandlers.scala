package typingsSlinky.leafletDraw.mod.Localization

import typingsSlinky.leafletDraw.anon.TooltipText
import typingsSlinky.leafletDraw.anon.TooltipTextString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditHandlers extends js.Object {
  var edit: TooltipText = js.native
  var remove: TooltipTextString = js.native
}

object EditHandlers {
  @scala.inline
  def apply(edit: TooltipText, remove: TooltipTextString): EditHandlers = {
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
    def withEdit(value: TooltipText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemove(value: TooltipTextString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

