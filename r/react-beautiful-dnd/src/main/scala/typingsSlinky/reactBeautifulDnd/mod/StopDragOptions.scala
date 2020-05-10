package typingsSlinky.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopDragOptions extends js.Object {
  var shouldBlockNextClick: Boolean = js.native
}

object StopDragOptions {
  @scala.inline
  def apply(shouldBlockNextClick: Boolean): StopDragOptions = {
    val __obj = js.Dynamic.literal(shouldBlockNextClick = shouldBlockNextClick.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopDragOptions]
  }
  @scala.inline
  implicit class StopDragOptionsOps[Self <: StopDragOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShouldBlockNextClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldBlockNextClick")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

