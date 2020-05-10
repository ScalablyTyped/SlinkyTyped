package typingsSlinky.recharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoxSize extends js.Object {
  var boxHeight: Double = js.native
  var boxWidth: Double = js.native
}

object BoxSize {
  @scala.inline
  def apply(boxHeight: Double, boxWidth: Double): BoxSize = {
    val __obj = js.Dynamic.literal(boxHeight = boxHeight.asInstanceOf[js.Any], boxWidth = boxWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxSize]
  }
  @scala.inline
  implicit class BoxSizeOps[Self <: BoxSize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoxHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBoxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxWidth")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

