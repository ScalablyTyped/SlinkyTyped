package typingsSlinky.escpos

import typingsSlinky.escpos.escposStrings.CENTER
import typingsSlinky.escpos.escposStrings.LEFT
import typingsSlinky.escpos.escposStrings.RIGHT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAlign extends js.Object {
  var align: LEFT | CENTER | RIGHT = js.native
  var text: String = js.native
  var width: Double = js.native
}

object AnonAlign {
  @scala.inline
  def apply(align: LEFT | CENTER | RIGHT, text: String, width: Double): AnonAlign = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlign]
  }
  @scala.inline
  implicit class AnonAlignOps[Self <: AnonAlign] (val x: Self) extends AnyVal {
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
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

