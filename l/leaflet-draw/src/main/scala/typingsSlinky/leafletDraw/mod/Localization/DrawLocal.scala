package typingsSlinky.leafletDraw.mod.Localization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawLocal extends js.Object {
  var draw: Draw = js.native
  var edit: Edit = js.native
}

object DrawLocal {
  @scala.inline
  def apply(draw: Draw, edit: Edit): DrawLocal = {
    val __obj = js.Dynamic.literal(draw = draw.asInstanceOf[js.Any], edit = edit.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawLocal]
  }
  @scala.inline
  implicit class DrawLocalOps[Self <: DrawLocal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDraw(value: Draw): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEdit(value: Edit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edit")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

