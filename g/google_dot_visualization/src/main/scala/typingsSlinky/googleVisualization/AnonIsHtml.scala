package typingsSlinky.googleVisualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIsHtml extends js.Object {
  var isHtml: Boolean = js.native
}

object AnonIsHtml {
  @scala.inline
  def apply(isHtml: Boolean): AnonIsHtml = {
    val __obj = js.Dynamic.literal(isHtml = isHtml.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsHtml]
  }
  @scala.inline
  implicit class AnonIsHtmlOps[Self <: AnonIsHtml] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsHtml(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHtml")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

