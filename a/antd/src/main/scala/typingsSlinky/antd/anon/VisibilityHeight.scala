package typingsSlinky.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VisibilityHeight extends js.Object {
  var visibilityHeight: Double = js.native
}

object VisibilityHeight {
  @scala.inline
  def apply(visibilityHeight: Double): VisibilityHeight = {
    val __obj = js.Dynamic.literal(visibilityHeight = visibilityHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisibilityHeight]
  }
  @scala.inline
  implicit class VisibilityHeightOps[Self <: VisibilityHeight] (val x: Self) extends AnyVal {
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

