package typingsSlinky.normalizeJss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BorderBottom extends js.Object {
  var borderBottom: String = js.native
  var textDecoration: String = js.native
}

object BorderBottom {
  @scala.inline
  def apply(borderBottom: String, textDecoration: String): BorderBottom = {
    val __obj = js.Dynamic.literal(borderBottom = borderBottom.asInstanceOf[js.Any], textDecoration = textDecoration.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderBottom]
  }
  @scala.inline
  implicit class BorderBottomOps[Self <: BorderBottom] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorderBottom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextDecoration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDecoration")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

