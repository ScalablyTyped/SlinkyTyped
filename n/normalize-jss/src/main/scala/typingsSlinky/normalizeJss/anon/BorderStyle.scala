package typingsSlinky.normalizeJss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BorderStyle extends js.Object {
  var borderStyle: String = js.native
  var padding: Double = js.native
}

object BorderStyle {
  @scala.inline
  def apply(borderStyle: String, padding: Double): BorderStyle = {
    val __obj = js.Dynamic.literal(borderStyle = borderStyle.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderStyle]
  }
  @scala.inline
  implicit class BorderStyleOps[Self <: BorderStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorderStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

