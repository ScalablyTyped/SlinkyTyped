package typingsSlinky.googleVisualization.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsHtml extends js.Object {
  var isHtml: Boolean = js.native
}

object IsHtml {
  @scala.inline
  def apply(isHtml: Boolean): IsHtml = {
    val __obj = js.Dynamic.literal(isHtml = isHtml.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsHtml]
  }
  @scala.inline
  implicit class IsHtmlOps[Self <: IsHtml] (val x: Self) extends AnyVal {
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

