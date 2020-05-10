package typingsSlinky.antdMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNextText extends js.Object {
  var nextText: String = js.native
  var prevText: String = js.native
}

object AnonNextText {
  @scala.inline
  def apply(nextText: String, prevText: String): AnonNextText = {
    val __obj = js.Dynamic.literal(nextText = nextText.asInstanceOf[js.Any], prevText = prevText.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNextText]
  }
  @scala.inline
  implicit class AnonNextTextOps[Self <: AnonNextText] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevText")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

