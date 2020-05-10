package typingsSlinky.reactVirtualized

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonContainerSize extends js.Object {
  var align: String = js.native
  var containerSize: Double = js.native
  var currentOffset: Double = js.native
  var targetIndex: Double = js.native
}

object AnonContainerSize {
  @scala.inline
  def apply(align: String, containerSize: Double, currentOffset: Double, targetIndex: Double): AnonContainerSize = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], containerSize = containerSize.asInstanceOf[js.Any], currentOffset = currentOffset.asInstanceOf[js.Any], targetIndex = targetIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContainerSize]
  }
  @scala.inline
  implicit class AnonContainerSizeOps[Self <: AnonContainerSize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainerSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

