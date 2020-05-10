package typingsSlinky.exceljs.mod

import typingsSlinky.exceljs.PartialColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BorderDiagonal extends Border {
  var down: Boolean = js.native
  var up: Boolean = js.native
}

object BorderDiagonal {
  @scala.inline
  def apply(color: PartialColor, down: Boolean, style: BorderStyle, up: Boolean): BorderDiagonal = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], down = down.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], up = up.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderDiagonal]
  }
  @scala.inline
  implicit class BorderDiagonalOps[Self <: BorderDiagonal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("down")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("up")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

