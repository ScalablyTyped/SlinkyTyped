package typingsSlinky.reactCalendarTimeline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCollisionLeft extends js.Object {
  var collisionLeft: Double = js.native
  var collisionWidth: Double = js.native
  var height: Double = js.native
  var isDragging: Boolean = js.native
  var left: Double = js.native
  var order: AnonGroup = js.native
  var originalLeft: Double = js.native
  var stack: Boolean = js.native
  var top: Double | Null = js.native
  var width: Double = js.native
}

object AnonCollisionLeft {
  @scala.inline
  def apply(
    collisionLeft: Double,
    collisionWidth: Double,
    height: Double,
    isDragging: Boolean,
    left: Double,
    order: AnonGroup,
    originalLeft: Double,
    stack: Boolean,
    width: Double
  ): AnonCollisionLeft = {
    val __obj = js.Dynamic.literal(collisionLeft = collisionLeft.asInstanceOf[js.Any], collisionWidth = collisionWidth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], isDragging = isDragging.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], originalLeft = originalLeft.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCollisionLeft]
  }
  @scala.inline
  implicit class AnonCollisionLeftOps[Self <: AnonCollisionLeft] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollisionLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collisionLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCollisionWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collisionWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDragging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDragging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrder(value: AnonGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStack(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(null)
        ret
    }
  }
  
}

