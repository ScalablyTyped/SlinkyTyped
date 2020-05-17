package typingsSlinky.jspdf.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetHeight extends js.Object {
  var height: Double = js.native
  var width: Double = js.native
  def getHeight(): Double = js.native
  def getWidth(): Double = js.native
}

object GetHeight {
  @scala.inline
  def apply(getHeight: () => Double, getWidth: () => Double, height: Double, width: Double): GetHeight = {
    val __obj = js.Dynamic.literal(getHeight = js.Any.fromFunction0(getHeight), getWidth = js.Any.fromFunction0(getWidth), height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHeight]
  }
  @scala.inline
  implicit class GetHeightOps[Self <: GetHeight] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetHeight(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetWidth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

