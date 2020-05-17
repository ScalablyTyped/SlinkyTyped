package typingsSlinky.normalizeJss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisplayVerticalAlign extends js.Object {
  var display: String = js.native
  var verticalAlign: String = js.native
}

object DisplayVerticalAlign {
  @scala.inline
  def apply(display: String, verticalAlign: String): DisplayVerticalAlign = {
    val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any], verticalAlign = verticalAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayVerticalAlign]
  }
  @scala.inline
  implicit class DisplayVerticalAlignOps[Self <: DisplayVerticalAlign] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplay(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerticalAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlign")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

