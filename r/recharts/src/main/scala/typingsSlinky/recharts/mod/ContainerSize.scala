package typingsSlinky.recharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerSize extends js.Object {
  var containerHeight: Double = js.native
  var containerWidth: Double = js.native
}

object ContainerSize {
  @scala.inline
  def apply(containerHeight: Double, containerWidth: Double): ContainerSize = {
    val __obj = js.Dynamic.literal(containerHeight = containerHeight.asInstanceOf[js.Any], containerWidth = containerWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerSize]
  }
  @scala.inline
  implicit class ContainerSizeOps[Self <: ContainerSize] (val x: Self) extends AnyVal {
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
  }
  
}

