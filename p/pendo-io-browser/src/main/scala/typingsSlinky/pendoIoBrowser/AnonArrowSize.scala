package typingsSlinky.pendoIoBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonArrowSize extends js.Object {
  var arrowSize: js.UndefOr[Double] = js.native
}

object AnonArrowSize {
  @scala.inline
  def apply(): AnonArrowSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonArrowSize]
  }
  @scala.inline
  implicit class AnonArrowSizeOps[Self <: AnonArrowSize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrowSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowSize")(js.undefined)
        ret
    }
  }
  
}

