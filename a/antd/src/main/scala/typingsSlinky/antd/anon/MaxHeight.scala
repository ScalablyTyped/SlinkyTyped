package typingsSlinky.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaxHeight extends js.Object {
  var height: Double = js.native
  var maxHeight: Double = js.native
  var minHeight: Double = js.native
  var overflowY: js.Any = js.native
}

object MaxHeight {
  @scala.inline
  def apply(height: Double, maxHeight: Double, minHeight: Double, overflowY: js.Any): MaxHeight = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any], overflowY = overflowY.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxHeight]
  }
  @scala.inline
  implicit class MaxHeightOps[Self <: MaxHeight] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverflowY(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowY")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

