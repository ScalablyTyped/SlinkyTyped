package typingsSlinky.jquerymobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuerySupport extends js.Object {
  var touchOverflow: js.Any = js.native
}

object JQuerySupport {
  @scala.inline
  def apply(touchOverflow: js.Any): JQuerySupport = {
    val __obj = js.Dynamic.literal(touchOverflow = touchOverflow.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuerySupport]
  }
  @scala.inline
  implicit class JQuerySupportOps[Self <: JQuerySupport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTouchOverflow(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchOverflow")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

