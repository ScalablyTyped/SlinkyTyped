package typingsSlinky.normalizeJss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBorderBottom extends js.Object {
  var borderBottom: String = js.native
  var textDecoration: String = js.native
}

object AnonBorderBottom {
  @scala.inline
  def apply(borderBottom: String, textDecoration: String): AnonBorderBottom = {
    val __obj = js.Dynamic.literal(borderBottom = borderBottom.asInstanceOf[js.Any], textDecoration = textDecoration.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBorderBottom]
  }
  @scala.inline
  implicit class AnonBorderBottomOps[Self <: AnonBorderBottom] (val x: Self) extends AnyVal {
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

