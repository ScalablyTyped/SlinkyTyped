package typingsSlinky.playcanvas.anon

import typingsSlinky.playcanvas.pc.Vec2
import typingsSlinky.playcanvas.pc.Vec4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Border extends js.Object {
  var border: Vec4 = js.native
  var pivot: Vec2 = js.native
  var rect: Vec4 = js.native
}

object Border {
  @scala.inline
  def apply(border: Vec4, pivot: Vec2, rect: Vec4): Border = {
    val __obj = js.Dynamic.literal(border = border.asInstanceOf[js.Any], pivot = pivot.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any])
    __obj.asInstanceOf[Border]
  }
  @scala.inline
  implicit class BorderOps[Self <: Border] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorder(value: Vec4): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPivot(value: Vec2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRect(value: Vec4): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rect")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

