package typingsSlinky.escpos

import typingsSlinky.escpos.escposStrings.CENTER
import typingsSlinky.escpos.escposStrings.LEFT
import typingsSlinky.escpos.escposStrings.RIGHT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCols extends js.Object {
  var align: LEFT | CENTER | RIGHT = js.native
  var cols: Double = js.native
  var text: String = js.native
}

object AnonCols {
  @scala.inline
  def apply(align: LEFT | CENTER | RIGHT, cols: Double, text: String): AnonCols = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], cols = cols.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCols]
  }
  @scala.inline
  implicit class AnonColsOps[Self <: AnonCols] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: LEFT | CENTER | RIGHT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCols(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

