package typingsSlinky.antDesignReactNative.carouselMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CarouselState extends js.Object {
  var autoplayEnd: Boolean = js.native
  var height: Double = js.native
  var isScrolling: Boolean = js.native
  var loopJump: Boolean = js.native
  var offset: CarouselOffset = js.native
  var selectedIndex: Double = js.native
  var width: Double = js.native
}

object CarouselState {
  @scala.inline
  def apply(
    autoplayEnd: Boolean,
    height: Double,
    isScrolling: Boolean,
    loopJump: Boolean,
    offset: CarouselOffset,
    selectedIndex: Double,
    width: Double
  ): CarouselState = {
    val __obj = js.Dynamic.literal(autoplayEnd = autoplayEnd.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], isScrolling = isScrolling.asInstanceOf[js.Any], loopJump = loopJump.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], selectedIndex = selectedIndex.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarouselState]
  }
  @scala.inline
  implicit class CarouselStateOps[Self <: CarouselState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoplayEnd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplayEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsScrolling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isScrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoopJump(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loopJump")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffset(value: CarouselOffset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedIndex")(value.asInstanceOf[js.Any])
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

