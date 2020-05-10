package typingsSlinky.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonVisibilityHeight extends js.Object {
  var visibilityHeight: Double = js.native
}

object AnonVisibilityHeight {
  @scala.inline
  def apply(visibilityHeight: Double): AnonVisibilityHeight = {
    val __obj = js.Dynamic.literal(visibilityHeight = visibilityHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonVisibilityHeight]
  }
  @scala.inline
  implicit class AnonVisibilityHeightOps[Self <: AnonVisibilityHeight] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVisibilityHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibilityHeight")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

