package typingsSlinky.reactSketchapp.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResizeConstraints extends js.Object {
  var bottom: Boolean = js.native
  var fixedHeight: Boolean = js.native
  var fixedWidth: Boolean = js.native
  var left: Boolean = js.native
  var right: Boolean = js.native
  var top: Boolean = js.native
}

object ResizeConstraints {
  @scala.inline
  def apply(
    bottom: Boolean,
    fixedHeight: Boolean,
    fixedWidth: Boolean,
    left: Boolean,
    right: Boolean,
    top: Boolean
  ): ResizeConstraints = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], fixedHeight = fixedHeight.asInstanceOf[js.Any], fixedWidth = fixedWidth.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizeConstraints]
  }
  @scala.inline
  implicit class ResizeConstraintsOps[Self <: ResizeConstraints] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBottom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFixedHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFixedWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeft(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

