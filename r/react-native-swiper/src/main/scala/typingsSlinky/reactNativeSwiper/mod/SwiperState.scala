package typingsSlinky.reactNativeSwiper.mod

import typingsSlinky.reactNativeSwiper.anon.X
import typingsSlinky.reactNativeSwiper.reactNativeSwiperStrings.x
import typingsSlinky.reactNativeSwiper.reactNativeSwiperStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwiperState extends js.Object {
  var autoplayEnd: Boolean = js.native
  var dir: x | y = js.native
  var height: Double = js.native
  var index: Double = js.native
  var isScrolling: Boolean = js.native
  var loopJump: Boolean = js.native
  var offset: X = js.native
  var total: Double = js.native
  var width: Double = js.native
}

object SwiperState {
  @scala.inline
  def apply(
    autoplayEnd: Boolean,
    dir: x | y,
    height: Double,
    index: Double,
    isScrolling: Boolean,
    loopJump: Boolean,
    offset: X,
    total: Double,
    width: Double
  ): SwiperState = {
    val __obj = js.Dynamic.literal(autoplayEnd = autoplayEnd.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isScrolling = isScrolling.asInstanceOf[js.Any], loopJump = loopJump.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwiperState]
  }
  @scala.inline
  implicit class SwiperStateOps[Self <: SwiperState] (val x: Self) extends AnyVal {
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
    def withDir(value: typingsSlinky.reactNativeSwiper.reactNativeSwiperStrings.x | y): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
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
    def withOffset(value: X): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
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

