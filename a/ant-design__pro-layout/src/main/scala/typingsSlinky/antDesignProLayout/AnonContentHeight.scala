package typingsSlinky.antDesignProLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonContentHeight extends js.Object {
  var contentHeight: js.UndefOr[Double] = js.native
}

object AnonContentHeight {
  @scala.inline
  def apply(): AnonContentHeight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonContentHeight]
  }
  @scala.inline
  implicit class AnonContentHeightOps[Self <: AnonContentHeight] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentHeight")(js.undefined)
        ret
    }
  }
  
}

