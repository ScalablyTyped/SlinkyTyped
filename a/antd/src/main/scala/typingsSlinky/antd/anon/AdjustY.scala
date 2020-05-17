package typingsSlinky.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdjustY extends js.Object {
  var adjustX: Boolean = js.native
  var adjustY: Boolean = js.native
}

object AdjustY {
  @scala.inline
  def apply(adjustX: Boolean, adjustY: Boolean): AdjustY = {
    val __obj = js.Dynamic.literal(adjustX = adjustX.asInstanceOf[js.Any], adjustY = adjustY.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdjustY]
  }
  @scala.inline
  implicit class AdjustYOps[Self <: AdjustY] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdjustX(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjustX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdjustY(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjustY")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

