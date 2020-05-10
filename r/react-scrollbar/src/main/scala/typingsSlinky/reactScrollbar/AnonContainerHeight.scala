package typingsSlinky.reactScrollbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonContainerHeight extends js.Object {
  var containerHeight: Double = js.native
  var containerWidth: Double = js.native
  var leftPosition: Double = js.native
  var realHeight: Double = js.native
  var realWidth: Double = js.native
  var topPosition: Double = js.native
}

object AnonContainerHeight {
  @scala.inline
  def apply(
    containerHeight: Double,
    containerWidth: Double,
    leftPosition: Double,
    realHeight: Double,
    realWidth: Double,
    topPosition: Double
  ): AnonContainerHeight = {
    val __obj = js.Dynamic.literal(containerHeight = containerHeight.asInstanceOf[js.Any], containerWidth = containerWidth.asInstanceOf[js.Any], leftPosition = leftPosition.asInstanceOf[js.Any], realHeight = realHeight.asInstanceOf[js.Any], realWidth = realWidth.asInstanceOf[js.Any], topPosition = topPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContainerHeight]
  }
  @scala.inline
  implicit class AnonContainerHeightOps[Self <: AnonContainerHeight] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainerWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeftPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRealHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRealWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topPosition")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

